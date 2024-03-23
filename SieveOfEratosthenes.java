import java.util.Scanner;
import java.util.Arrays;

public class SieveOfEratosthenes{
	public static void sieveOfEratosthenes(int n){
		boolean prime[] = new boolean[n+1];
		Arrays.fill(prime, true);
		
		for(int p=2; p*p<=n; p++){
			if(prime[p]==true){
				for(int i=p*p; i<=n; i+=p)
					prime[i]=false;
			}
		}
		
		for(int i=2; i<=n; i++){
			if(prime[i] == true)
				System.out.println(i + " ");
		}
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Range: ");
		int range = scanner.nextInt();
		scanner.close();
		
		sieveOfEratosthenes(range);
	}
}