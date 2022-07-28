import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandlingTest2 {

	public static void main(String[] args) throws FileNotFoundException {
		myFileReader mfr1 = new myFileReader("\"D:\\\\\\\\Myworkspace\\\\\\\\BankingProject\\\\\\\\src\\\\\\\\Guru1.txt");
		myFileReader mfr2 = new myFileReader("\"D:\\\\\\\\Myworkspace\\\\\\\\BankingProject\\\\\\\\src\\\\\\\\Guru2.txt");
		myFileReader mfr3 = new myFileReader("\"D:\\\\\\\\Myworkspace\\\\\\\\BankingProject\\\\\\\\src\\\\\\\\Guru3.txt");
		
		mfr1.readFileData();
		mfr2.readFileData();
		mfr3.readFileData();
		
		mfr1.closeTheFile();
		mfr2.closeTheFile();
		mfr3.closeTheFile();
	}	
	}



class myFileReader
{
	FileInputStream fin;
	
	myFileReader (String filename) throws FileNotFoundException
	{
		System.out.println("Trying to open the file...");
	 	
			fin = new FileInputStream(filename);
			System.out.println("file is open...");
		}
		
	void readFileData()
	{
	try {	
			byte b = (byte)fin.read();
			while(b!=-1)
			{
				System.out.print((char)b);
				b = (byte) fin.read();
				Thread.sleep(10);
			}
		}
		
		catch(IOException e)
		{
			System.out.println("Problem2: " +e);
		} 
	     catch (InterruptedException e) 
		{
	
	    	 System.out.println("Problem3: " +e);
		}


	}
	
	void closeTheFile() {
		System.out.println("trying to close the File ");
		try {
			fin.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("File is closed");
	}
}
	
	
