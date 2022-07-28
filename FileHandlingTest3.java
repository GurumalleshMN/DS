import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingTest3 {

	public static void main(String[] args) {

	
		System.out.println("trying to create a file...");
		FileOutputStream fout;
		try {
			fout = new FileOutputStream("D:\\\\Myworkspace\\\\BankingProject\\\\src\\\\Guru2.txt");
			System.out.println(" file is created...");
			
			Scanner s1 = new Scanner(System.in);
			System.out.println(" Enter your data");
			String str = s1.nextLine();
			
			Byte b[] = {10,20,30,40};
			
			byte byteArray [] = str.getBytes();
			System.out.println(" Converted the string into the Byte array");
				fout.write(byteArray);
			System.out.println(" Byte array is written to the file");
				fout.close();
			System.out.println("File is closed");
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		
		

	}

}

