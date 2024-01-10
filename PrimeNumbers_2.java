
import java.util.*;
public class PrimeNumbers_2
{
	static boolean isPrime(int num)
	{
		for(int i=2; i<=Math.sqrt(num);i++)
			
			{
				if(num %i ==0 )
				{
					return false;
				}
			}
		
				return true;
			

	}


	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");

		int n = sc.nextInt();

		System.out.println(isPrime(n));
	}

}