
public class Bank {

	public static void main(String[] args) {

		System.out.println(" Banking started....");
	
		BankAccount ba = new BankAccount();
		ba.setBankAccount(123456789, "Guru", 5600 );
		ba.calculateSI(5, 5);
		ba.AmountWithdraw(2000);
		ba.AmountDeposit(3000);
		
	}
	
}

class BankAccount
{
	int AccountNo;
	double balance;
	double bankAccount;
	char CustName;

	
	void setBankAccount(int x, String y, double z)
	{

		bankAccount = x;
		balance = z;		
		System.out.println(" Set Bank account no. " +bankAccount);
	}
	

	double calculateSI(float RateOfInterest, int period)
	{
		double SI = balance =  (RateOfInterest*period)/100.0f;
		return SI;
		
	}
	
	void AmountWithdraw(double withdraw)
	{
		System.out.println("withdrawing..." +withdraw);
		balance = balance - withdraw;

	}
	
	void AmountDeposit(double deposit)
	{
		System.out.println("depositing..." +deposit);
		balance = balance + deposit;
		
	}
	
	double getBalance()
	{
		return balance;
	}

	void printBankAccount()
	{
		System.out.println("A/C No.: " +AccountNo);
		System.out.println("A/C Name: " +CustName);
		System.out.println("A/C BAL: " +balance);
	}
}