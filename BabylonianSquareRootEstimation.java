import java.util.Scanner;
import java.text.DecimalFormat;

public class BabylonianSquareRootEstimation {
	
	public static void main(String[] args) {
		
		DecimalFormat Decimal = new DecimalFormat("#.00");
		Scanner Input = new Scanner(System.in);
		double Guess, Num;
		
		System.out.print("The Number to Square Root: ");
		Num = Double.parseDouble(Input.nextLine());
		
		System.out.print("\nInitial Guess: ");
		Guess = Double.parseDouble(Input.nextLine());
		
		/// below is exactly why we use loops (cant use loops exercise restriction)
		Guess = (((Num / Guess) + Guess) / 2);
		Guess = (((Num / Guess) + Guess) / 2);
		Guess = (((Num / Guess) + Guess) / 2);
		Guess = (((Num / Guess) + Guess) / 2);
		Guess = (((Num / Guess) + Guess) / 2);
		
		System.out.printf("According to the Babylonians Sqrt(%s) = %s (5 cycles)", 
				          Decimal.format(Num), Decimal.format(Guess));
		Input.close();
	}
}
