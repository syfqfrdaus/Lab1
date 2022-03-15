package Exercise7;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please Enter You Weight In KG : ");
		double weight = input.nextDouble();
		
		Calculate calculate = new Calculate();
		
		double MarsWeight = calculate.getMars(weight);
		
		System.out.println("The Weight On Earth is "+weight+"Kg\n");
		System.out.println("The Weight On Mars is :"+MarsWeight+"Kg\n");
		

	}

}

