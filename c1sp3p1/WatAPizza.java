import java.util.Scanner;

public class WatAPizza {
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the details");
		System.out.println("customername");
		String customername= sc.next();
		System.out.println("customeremail");
		String customeremail= sc.next();
		System.out.println("phonenumber");
	    long phonenumber= sc.nextLong();
		System.out.println("address");
		String address= sc.next();
//TASK2
		int pizzaordered;
		float  priceofpizza= 12.99f;
		char pizzasize='M';
		int garlicbreadordered;
      	float  priceofgarlicbreadordered=5.99f;
		 int beveragesordered;
      	float priceofbeverages=1.99f;
		 int totalbill;
		  int choice;
		  
		 

		 System.out.println("1. Pizza");
		 System.out.println("2. garlicbread");
		System.out.println("3. beverages");
		System.out.println(" enter 1. Pizza , 2.garlicbread, 3.bevereges");
		 choice= sc.nextInt();
		switch(choice){
			case 1:
				{
				System.out.println("number of pizzaordered");
					 pizzaordered=sc.nextInt();
	           float pizzatotalbill= pizzaordered*priceofpizza;
			  
				System.out.println("your pizzatotalbill is:"+pizzatotalbill);	
						}
			break;
			case 2:
					{
						System.out.println("number of garlicbreadordered");
					 garlicbreadordered=sc.nextInt();
	           float garlicbreadtotalbill= garlicbreadordered*priceofgarlicbreadordered;
			  
				System.out.println("your garlicbreadtotalbill is:"+garlicbreadtotalbill);	
						}
			break;
			case 3:
				{
					System.out.println("number of beveragesordered");
					 beveragesordered=sc.nextInt();
	           float beveragestotalbill= beveragesordered*priceofbeverages;
			  
				System.out.println("your beveragestotalbill is:"+beveragestotalbill);	
						}
			break;
			default:
			System.out.println("wrong choice entered");
		
	
		  }
	}
}
