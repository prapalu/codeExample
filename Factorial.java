public class Factorial {
	public static void main(String[] args) {
		int number = -1;
		try {
			int result = factorial(number);
			System.out.printf("The factorial of %d is %d", number, result);
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
	}

	/**
	 * The function returns the factorial of a number. Given a non-negative integer n, factorial is defined as the product of all the integer number from 1 to n 
	 * @param number the number for the factorial calculation
	 * @return the factorial of number
	 * @throws IllegalArgumentException if the number is negative
	 */
	public static int factorial(int number) throws IllegalArgumentException {
		// throw an exception if the argument is not what expected
		if(number < 0) {
			throw new IllegalArgumentException("The number must be a non-negative integer");
		}
		// base case, factorial(0) = factorial (1) = 1;
		if(number <= 1) {
			return 1;
		}
		return number * factorial(number-1);
	}
}
