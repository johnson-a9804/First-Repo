/**
 * 
 */
package myJavaProject;

import java.util.Scanner;

/**
 * @author anjuj
 *
 */
public class myAppTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to Software Engineering");
		System.out.println("Please enter a number: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int result = n * n;
		System.out.println("The square of " + n + " is " + result + ".");

	}

}
