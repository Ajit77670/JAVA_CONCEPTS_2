
// Prime nos. are the no which have exactly 2 factors or we can say the no which is divisible by 1 and itself.

import java.util.Scanner;

public class PrimeNumbers {
    
    static boolean isPrime(int n) 
	{
		
		for(int i=2; i<=Math.sqrt(n); i++) // we initialize i=2 bcuz all prime nos. are divisible by 1 and itself.
			// Using Math.sqrt(n) , Will reduce the no. of iterations and the code will be more optimized.
			// n is the no. which we want to check if it is prime or not , sqrt(n) gives the result in less no of iteration.
			{
				if(n%i == 0) {
				
				return false;
				}
			}
		
				return true;   
		
	}

	public static void main(String[] args) {
	
		try (Scanner sc = new Scanner(System.in)) {
            
            System.out.println("Enter the Number");
            
            int n = sc.nextInt(); 
            
            System.out.println(isPrime(n));
        }
		
	}

}
