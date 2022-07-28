import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class ExceptionTest3 {
 
public static void main(String[] args) {
		
	System.out.println("Begin main...");
	
	DishWasher dis = new DishWasher();
	try {
		dis.switchOn();
		dis.selectProgram();
		dis.selectProgram1();
	} catch (DishWasherIsNotSwitchedOnException e) {
		System.out.println("Problem : "+e);
	}
	
	System.out.println("End of main...");
}
}

class DishWasherIsNotSwitchedOnException extends Exception
{
	DishWasherIsNotSwitchedOnException(String msg) {
		super(msg);
	}
}
class DishWasher
{
	boolean current;
	int choice;
	
	DishWasher() 	{
		System.out.println("Dish Washer is created....but is it ready with electricity....");
	}
	
	void switchOn() 
	{	
		if(current==false)
		{
			current = true;
		}
		System.out.println("Dish Washer is switched on....");
	}
	
	void selectProgram() throws DishWasherIsNotSwitchedOnException
	{
		if(current == false ) 
		{
			DishWasherIsNotSwitchedOnException washSwitchNotOnEx = new DishWasherIsNotSwitchedOnException("The Dish Washer is not yet switched on.....");
			throw washSwitchNotOnEx;
		}
	}
		
	void selectProgram1() 
	{
		Scanner s1 = new Scanner(System.in);
		int choice = s1.nextInt();
		if(current == true) 
		{
			System.out.println("Program started.... Please enter your choice");
			switch(choice)
			{
			  case 1:  System.out.println("Normal");
			  normal();
			  break;
			  case 2:  System.out.println("Intensive");
			  intensive();
			  break;
			  case 3:  System.out.println("Delicate");
			  delicate();
			  break;
			  default: System.out.println("Program finished...");
			  return;
			}
		
		}
	
	}
	
	void normal()
	{
			for(int i=1;i<=5;i++) {
				System.out.println("Normal Dish Washing...."+i);
			}
			dry();
	}
	
	void delicate()
	{
			for(int i=1;i<=5;i++) {
				System.out.println("\tdelicate Dish Washing...."+i);
			}
			dry();
	}
	
	void intensive() {
		for(int i=1;i<=5;i++) {
			System.out.println("\t\tIntensive Dish Washing......."+i);
		}
		dry();
	}
	
	void dry()
	{
		for(int i=1;i<=5;i++) {
			System.out.println("\t\tDrying the Dishes......."+i);
		}
	}
		
	void switchOff() {
		if(current==true) {
			current = false;
		}
		System.out.println("Dish Washer is switched off...");
	}
}

