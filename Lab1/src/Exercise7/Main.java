package Exercise7;
import java.util.Scanner;
import Exercise8.WeightList;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	
		
		Calculate calculate = new Calculate();
		WeightList weightlist = new WeightList();
			
		double[] newArr1 = weightlist.retEarth();
		double[] newArr2 = weightlist.retMars();
		for (int i=0; i<5; i++)
		{
			System.out.println("Please Enter You Weight In KG : ");
			double weight = input.nextDouble();	
			double MarsWeight = calculate.getMars(weight);		
			
			newArr1[i] = MarsWeight;
			newArr2[i] = weight;
			
			System.out.println("The Weight On Earth is "+newArr2[i]+"Kg\n");
			System.out.println("The Weight On Mars is :"+newArr1[i]+"Kg\n");
		}

	}

}

