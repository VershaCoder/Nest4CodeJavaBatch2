package Day2;
import java.util.Scanner;

/**
 * @author Versha mishra
 *
 */
public class ProblemTwo {
	public static void main(String[] args) {
		float heightInFeet , heightInInch , weigtInKg , heightInCm , weightInPounds;
		System.out.print("Feet :");
		Scanner sc = new Scanner(System.in);
		heightInFeet = sc.nextFloat();
		System.out.print("Inch :");
		heightInInch = sc.nextFloat();
		System.out.print("Weight :");
		weigtInKg = sc.nextFloat();
		if((heightInFeet > 0) && (heightInInch > 0) && (weigtInKg > 0)){
			heightInCm = heightInFeet*12f*2.54f + heightInInch*2.54f;
			weightInPounds = weigtInKg*2.2f ;
			System.out.printf("Height in cm: %.2f \n",heightInCm);
			System.out.printf("Weight in pounds: %d",(int)weightInPounds);	
		} else if((heightInFeet >=0) && (heightInInch >=0) && (weigtInKg >=0) ){
				heightInCm = heightInFeet*12f*2.54f + heightInInch*2.54f;
				weightInPounds = weigtInKg*2.2f ;
				System.out.printf("Height in cm: %.1f \n",heightInCm);
				System.out.printf("Weight in pounds: %.1f ",weightInPounds);			
		} else {
			System.out.println("Height and Weight can't be negative");
		}
		sc.close();
	}
}
