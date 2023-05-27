import java.util.Scanner;

public class AreaCalculator{
	public static void main(String[] input){
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		double area;
		System.out.println("enter a");
	    a=sc.nextInt();
		System.out.println("enter b");
		b=sc.nextInt();
		System.out.println("enter the shape to calculate area ");
		String shape=sc.next();
		switch (shape){
			case "square":{
				area=a*a;
				System.out.println("area of square" +area);
			}
			break;
			case "circle":{
				area=3.14*a*a;
				System.out.println("area of circle" +area);
			}
			break;
			case "rectangle":{
			area=a*b;
				System.out.println("area of rectangle" +area);
			}
			
			break;
			
        default:
		System.out.println("wrong choice entered");
		}
		
	}
}