package Day2;
import java.util.Scanner;

/**
 * @author Versha mishra
 *
 */
public class ProblemOne {
	public static void main(String[] args) {
		float priceOfOne , priceOfTwo , priceOfThree , tax ;
		Scanner sc = new Scanner(System.in);
		System.out.print("Price 1 :");
		priceOfOne = sc.nextFloat();
		System.out.print("Price 2 :");
		priceOfTwo = sc.nextFloat();
		System.out.print("Price 3 :");
		priceOfThree = sc.nextFloat();
		System.out.print("Tax % :");
		tax = sc.nextFloat();
		if((priceOfOne > 0) && (priceOfTwo > 0) && (priceOfThree > 0) && (tax > 0)) {
			float priceOfProducts = priceOfOne + priceOfTwo + priceOfThree;
			float taxAmount = (tax/100) * priceOfProducts;
			float finalPrice = priceOfProducts + taxAmount;
			System.out.printf("Final Amount: %.1f",finalPrice);
		} else {
			System.out.println("Prices/tax can't be 0 or negative ");
		}
		sc.close();
	}
}
