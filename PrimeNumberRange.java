import java.util.Scanner;

public class PrimeNumberRange{
	public static void primeNumberRange(int n){
		for (int number = 2; number <= n; number++) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(number + " ");
            }
        }
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Range: ");
		int range = scanner.nextInt();
		scanner.close();
		
		primeNumberRange(range);
	}
}