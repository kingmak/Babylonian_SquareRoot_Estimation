import java.lang.Math;
import java.util.Scanner;
import java.text.DecimalFormat;

public class BabylonianSqrtEstimate {
	
	public static void main(String[] args) {
		
		DecimalFormat Decimal = new DecimalFormat("#.0000000000");
		Scanner Input = new Scanner(System.in);
		double Guess, Num, Perfect;
		int Count = 0;
		
		System.out.print("The Number to Square Root: ");
		Num = Double.parseDouble(Input.nextLine());
		if (Num < 0) {
			System.out.println("Your Number Cannot be Less Then Zero");
			System.exit(-1);	
		}
		
		System.out.print("\nInitial Guess: ");
		Guess = Double.parseDouble(Input.nextLine());
		if (Guess <= 0) {
			System.out.println("Your Guess Cannot be Less Then or Equal Zero");
			System.exit(-1);
		}
		
		Perfect = Math.sqrt(Num);
		while (Guess != Perfect) {
			Guess = (((Num / Guess) + Guess) / 2);
			Count += 1;
		}
		
		System.out.printf("According to the Babylonians Sqrt(%s) = %s (%d cycles)", 
				          Decimal.format(Num), Decimal.format(Guess), Count);
		Input.close();
	}
}
