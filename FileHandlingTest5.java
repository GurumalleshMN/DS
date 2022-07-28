import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class FileHandlingTest5 {

	public static void main(String[] args) {
		
		FileOutputStream fout;
		{
			try
			{
				fout = new FileOutputStream("D:\\\\Myworkspace\\\\BankingProject\\\\src\\\\Guru2.txt");
				System.out.println("File is ready ");
				
				PrintStream ps = new PrintStream(fout);
			//  PrintStream ps = new PrintStream(System.out);
				System.out.println("Print Stream is ready ");
				
				ps.println("Hello file1");
				ps.println("Hello file2");
				ps.println("Hello file3");
				ps.println("Hello file4");
				
				ps.close();
				fout.close();
				
			}
			catch (FileNotFoundException e)
			{
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
			
		}
	}

}
