import java.util.Scanner;


public class Aquarium {
    public static void main(String[] input) {
		int ph;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter ph value between 1 to 14");
		ph= sc.nextInt();
  if (ph<7) {
	  System.out.println("ph value is low, partial water change required");
  }
		else if (ph>7&&ph<=8){
System.out.println("ph value is fine " );
		} else if(ph>8){
System.out.println("ph value is high, partial water change required" );
		} 
		else{
System.out.println("ph value have error");
		}
		}
	}
