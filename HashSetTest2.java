import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest2 {

	public static void main(String[] args){
	
		book b1 = new book("Playing It My Way", "Sachin Tendulkar", 3, 123, 368, 566);
		book b2 = new book("A Century is not Enough", "Sourav Ganguly", 2, 321, 267, 406);
		
		System.out.println("Book 1 is " +b1);
		System.out.println("Book 2 is " +b2);
		
		HashSet<book> bookShelf = new HashSet<book>();
		System.out.println("Adding book1 ");
		bookShelf.add(b1);
		
		System.out.println("Adding book2 ");
		bookShelf.add(b2);
		

		FileOutputStream fout;
		try {
			fout = new FileOutputStream("\"D:\\\\\\\\Myworkspace\\\\\\\\BankingProject\\\\\\\\src\\\\\\\\Guru2.txt");
			ObjectOutputStream objOut = new ObjectOutputStream(fout);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/*		
				for(book bo : book)
	}
	*/

}

class book
{
	String title;
	String bookAuth;
	int edition;
	int bookNo;
	int noOfPages;
	int bookPrize;
	
	public book(String title, String bookAuth, int edition, int bookNo, int noOfPages, int bookPrize) {
		super();
		this.title = title;
		this.bookAuth = bookAuth;
		this.edition = edition;
		this.bookNo = bookNo;
		this.noOfPages = noOfPages;
		this.bookPrize = bookPrize;
	}

	@Override
	public String toString() {
		return "book [title=" + title + ", bookAuth=" + bookAuth + ", edition=" + edition + ", bookNo=" + bookNo
				+ ", noOfPages=" + noOfPages + ", bookPrize=" + bookPrize + "]";
	}
	
	
	
}	
}
