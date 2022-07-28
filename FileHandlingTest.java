import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandlingTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
	
		try
		{
			System.out.println("Trying to open the file");
			FileInputStream fin = new FileInputStream("D:\\Myworkspace\\BankingProject\\src\\Guru1.txt");
			System.out.println("File is open");
			
			byte b = (byte)fin.read();
			while(b!=-1)
			{
				System.out.print((char)b);
				b = (byte) fin.read();
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
