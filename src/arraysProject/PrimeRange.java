package StringPackage;

public class PrimeRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 10;
		boolean b = isPrime(number);

		if (b)
			System.out.println("Number is prime");
		else
			System.out.println("Not a prime number");
		
		for(int i=0;i<=100;i++)
		{
			if(isPrime(i))
				System.out.print(i+" ");
		}

	}

	private static boolean isPrime(int number) {

		if (number < 2)
			return false;
		else {
			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0)

				{
					return false;
				}
			}
		}
		return true;
	}

}
