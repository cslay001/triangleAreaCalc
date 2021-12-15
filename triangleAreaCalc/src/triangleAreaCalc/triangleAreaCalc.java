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
		System.out.println("let's calculate the area of a triangle!");
		
		Scanner input = new Scanner(System.in);
		System.out.println("                                        ");
		
		System.out.println("*********************************************************");
		System.out.println("                                        ");
		
		System.out.println("please input the base of the triangle (in inches)");
		double base = input.nextDouble();
		
			while (base <=0) {
				System.out.println("That's invalid. Please input the base of the triangle (in inches)");
			}
		
		System.out.println("Please input the height of the triangle (in inches)");
		double height = input.nextDouble();
		
			while (height <=0) {
				System.out.println("That's invalid. Please input the height of the triangle (in inches)");
			}
		
		double area = (base * height) / 2;
		
		System.out.println(" ");
		System.out.println("*********************************************************");
		System.out.println(" ");
		System.out.println("the area of this triangle is " + area);
		

	}

}
