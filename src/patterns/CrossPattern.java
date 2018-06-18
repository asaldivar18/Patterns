/**
 * CrossPattern
 * @author Adrian
 * @date 6/17/2018
 * @version 1.0
 * Draws a Cross pattern. Has default constructor to start console program, 
 * or  1-param constructor that takes an integer for the size of the cross
 */
package patterns;

/**
 * Imports
 */
//used for reading input
import java.util.Scanner;

/**
 * 
 * CrossPattern
 */
public class CrossPattern {
	//Variables used in loops
	private static int i, j;

	/**
	 * CrossPattern()
	 * Default Constructor, starts console program.
	 */
	CrossPattern(){
		run();
	}
	
	/**
	 * CrossPattern
	 * 1 Parameter constructor that outputs the size
	 * @param size integer that represents size of the cross
	 */
	CrossPattern(final int size){
		draw(size);
	}
	
	/**
	 * Draw
	 * @param size integer that represents size of the cross
	 * Draws a cross
	 */
	private static void draw(final int size){
		for(i = 1; i <=size;i++){
			for(j =1; j <=size; j++){
				if (j == i){
					System.out.print("*");
				}
				else if ( j == size - (i -1 )){
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	/**
	 * Run
	 * Starts console program.
	 */
	private static void run(){
		final Scanner scan = new Scanner(System.in);
		System.out.print("Enter size: ");
		final int input = scan.nextInt();
		scan.close();
		draw(input);
	}
	
	/**
	 * Main Entry Point of Java program
	 * Simple tests of the two parameters
	 * @param args command line arguments
	 */
	public static void main(final String[] args){
		//print title
		System.out.println("Cross Pattern");
		try{
			//print cross of size 5
			final CrossPattern a = new CrossPattern(5);
			System.out.println();
			//start console program
			CrossPattern.run();			
		}
		catch(final Exception e){
			//error checking
			System.err.println("Please enter an integer");
			CrossPattern.run();
		}
	}
}
