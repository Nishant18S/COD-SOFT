import java.util.Scanner;
class ATM 
{
	static Scanner obj=new Scanner(System.in);
	double withdraw;
	double deposit;
	double balance;
	double Amount;
	double Input()
	{
		System.out.println("Enter the Amount:");
		Amount=obj.nextDouble();
		System.out.println("Your Balance is:" +Amount);
		return Amount;
	}
	double WithDraw()
	{
		
			System.out.println("Enter the Amount to withdraw:");
			withdraw=obj.nextDouble();
			
				Amount=Amount-withdraw;
				if(Amount>0)
				{
				System.out.println("After withdraw of Rs."+withdraw+" balance:"+ Amount);
			    }
			 else
				System.out.println("You cannot withdraw the Amount!!!!!");
			
		
		return Amount;
	}
	double Deposit()
	{
		System.out.println("Enter the Amount to Deposit:");
		deposit=obj.nextInt();
		Amount=Amount+deposit;
		System.out.println("After Deposit of Rs."+deposit+" balance:"+ Amount);
		return Amount;
	}
	void CheckBalance()
	{
		System.out.println("Remaining Balance is: " +Amount);
	}
}
class User extends ATM
{
	
	void Balance()
	{
		System.out.println("User Balance is:"+ super.Amount);
	}
	void WithDraw1()
	{
		System.out.println("Enter the money withdraw by the User:");
		withdraw=obj.nextDouble();
		if(withdraw<Amount)
		{
			Amount=Amount-withdraw;
			System.out.println("After withdraw of Rs."+withdraw+" balance:"+ Amount);
		}
		else
			System.out.println("You do not have enough balance to withdraw!!!!!");
		
		
	}
	void Deposit1()
	{
		System.out.println("Enter the Amount by User to Deposit:");
		deposit=obj.nextInt();
		Amount=Amount+deposit;
		System.out.println("After User Deposit of Rs."+deposit+" balance:"+ Amount);
	}
	void Balance1()
	{
		System.out.println("Remaining Balance of User is: " +Amount);
	}
	
}
public class Task_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		User Money=new User();
		Money.Input();
		Money.WithDraw();
		Money.Deposit();
		Money.CheckBalance();
		Money.Balance();
		System.out.println("Dear User you want to Modify your Money in Account(Y/N)");
		char ch=obj.next().charAt(0);
		if(ch=='Y')
		{
			System.out.println("Your Transaction is Sucessfull ......");
			Money.WithDraw1();
			Money.Deposit1();
			//Money.Balance1();
		}
		else
			System.out.println("Your Transaction is Failure......");
			Money.Balance1();
		

	}

}
