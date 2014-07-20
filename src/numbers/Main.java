/** Create a program that reads an unspecified number of float arguments 
 * from the command line and adds them together with exactly two digits to the 
 * right of the decimal point.
 */

package numbers;

public class Main {
	public static void main(String[] args) {
		if(args.length >= 2){
			float sum = 0;
			
			for(String numAsString: args){
				sum += Double.parseDouble(numAsString);
			}
			
			System.out.format("Sum of args: %.2f", sum);
		}
		else {
			System.out.println("Arguments must be more that one");
		}
	}
}
