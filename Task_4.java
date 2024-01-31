import java.util.Scanner;

public class Task_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("*****Current Exchange Rates of different Countrys*****");
		System.out.println("1 INR = 0.0120302 USD");
		System.out.println("1 USD = 83.1245 INR");
		System.out.println("1 INR = 0.00948047 GBP");
		System.out.println("1 AUD = 97.0386 JPY");
		System.out.println("1 INR = 0.019633 NZD");
		System.out.println("1 CHF =	1.55209 SGD");
		System.out.println("1 INR = 1.08675 RUB");
		System.out.println("1 HKD =	0.914899 CNY");
		System.out.println("1 INR = 3.36239 PKR");
		System.out.println("1 EUR =	1.45037 CAD");
		
		System.out.println();
		System.out.println("Enter the Base Currency:");
		String base=obj.nextLine();
		System.out.println("Enter the Target Currency:");
		String target=obj.nextLine();
		double Amount,price; 
		if(base.equals("INR") && target.equals("USD"))
		{
			System.out.println("Enter the Amount they want to Convert :");
			 Amount=obj.nextDouble();
			 price=Amount*0.0120302;
			System.out.println("Convert "+ Amount+" INR "+" to  "+ price+" USD");
		}
		else if(base.equals("USD") && target.equals("INR"))
		{
		System.out.println("Enter the Amount they want to Convert :");
		Amount=obj.nextDouble();
		price=Amount*83.1245;
		System.out.println("Convert "+ Amount+" INR "+" to  "+ price+" INR");
		}
		else if(base.equals("INR") && target.equals("GBP"))
		{
		System.out.println("Enter the Amount they want to Convert :");
		Amount=obj.nextDouble();
		price =Amount*0.00948047;
		System.out.println("Convert "+ Amount+" INR "+" to  "+ price+" GBP");
		
		}
		else if(base.equals("AUD") && target.equals("JPY"))
		{
		System.out.println("Enter the Amount they want to Convert :");
		Amount=obj.nextDouble();
		price=Amount*83.1245;
		System.out.println("Convert "+ Amount+" AUD "+" to  "+ price+" JPY");
		}
		else if(base.equals("INR") && target.equals("NZD"))
		{
		System.out.println("Enter the Amount they want to Convert :");
		Amount=obj.nextDouble();
		price =Amount*0.019633;
		System.out.println("Convert "+ Amount+" INR "+" to  "+ price+" NZD");
		}
		else if(base.equals("CHF") && target.equals("SZD"))
		{
		System.out.println("Enter the Amount they want to Convert :");
		Amount=obj.nextDouble();
		price =Amount*1.55209;
		System.out.println("Convert "+ Amount+" CHF "+" to  "+ price+" SZD");
		}
	
		else if(base.equals("INR") && target.equals("RUB"))
		{
	    System.out.println("Enter the Amount they want to Convert :");
		Amount=obj.nextDouble();
		price=Amount*1.08675;
		System.out.println("Convert "+ Amount+" INR "+" to  "+ price+" RUB");
		}
		else if(base.equals("HKD") && target.equals("SNY"))
		{
	    System.out.println("Enter the Amount they want to Convert :");
		Amount=obj.nextDouble();
		price=Amount*0.914899;
		System.out.println("Convert "+ Amount+" HKD "+" to  "+ price+" SNY");
		}
		else if(base.equals("INR") && target.equals("PKR"))
		{
		System.out.println("Enter the base Currency in India:");
		Amount=obj.nextDouble();
		price=Amount*3.36239;
		System.out.println("Convert "+ Amount+" INR "+" to  "+ price+" PKR");
		}
		else if(base.equals("EUR") && target.equals("CAD"))
		{
		System.out.println("Enter the Amount they want to Convert :");
		Amount=obj.nextDouble();
		price=Amount*1.45037;
		System.out.println("Convert "+ Amount+" EUR "+" to  "+ price+" CAD");
		}
		else
			System.out.println("Your Input is INVALID!!!!!!"); 

	}

}
