import java.util.Scanner;

public class BMICategories {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double bmi;
		
		System.out.print( "Enter your BMI: " );
		bmi = keyboard.nextDouble();
		
		System.out.print( "BMI category: " );
		if (bmi < 15.0 ) {
			System.out.println( "very severly underweight" );
		}
		else if (bmi <=16.0 ) {
			System.out.println( "severly underweight" );
		}
		else if (bmi < 18.5 ) {
			System.out.println( "underweight");
		}
		else if (bmi < 30 ) {
			System.out.println( "fatass" );
		}
	}
}
