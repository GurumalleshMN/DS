import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingTest4 {

	public static void main(String[] args) {
		try
		{
			System.out.println("Trying to open the file");
			FileReader fin = new FileReader("D:\\Myworkspace\\BankingProject\\src\\Guru2.txt");
			System.out.println("File is open");
			
			char i =(char) fin.read();
			while(i!=-1)
			{
				System.out.print((char)i);
				int b = fin.read();
				Thread.sleep(10);
			}	
				System.out.println("trying to close the File ");
				fin.close();
				System.out.println("File is closed");
			}
			
		catch(FileNotFoundException e)
		{
			System.out.println("Problem1: " +e);
		}
		catch(IOException e)
		{
			System.out.println("Problem2: " +e);
		}
		catch(InterruptedException e)
		{
			System.out.println("Problem3: " +e);
		}
	}
	

	}


