/**
 * 
 */
package triangleAreaCalc;

import java.util.Scanner;
/**
 * @author corey
 *
 */
public class triangleAreaCalc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("What is the triangle height?");
		Scanner scannerZero = new Scanner(System.in);
		
		String triangleHeight = scannerZero.next();
		
		System.out.println("What is the triangle base?");
		Scanner scannerOne = new Scanner(System.in);
		
		String triangleBase = scannerOne.next();
		
		String triangleArea = triangleHeight + " x (1/2 x " + triangleBase + ")";
		
		System.out.println("------------------------");
		System.out.println("the area of this triangle is " + triangleArea);
		

	}

}
