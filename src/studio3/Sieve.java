package studio3;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Find prime number up to: ");
		int n = in.nextInt();
		/*
		int count = 0;
		boolean status = true;
		int index = 0;
		*/
		
		boolean[] prime = new boolean[n+1];
		for(int i = 0; i < prime.length; i++) {
			prime[i] = true;
		}
		
		for (int i = 2; i <= n; i++) {
			if (prime[i]) {
				for (int j = (int)Math.pow(i,2); j <= n; j = j+i) {
					prime[j] = false;
				}
			}
		}
		
		for(int i = 2; i <= n; i++) {
			if (prime[i]) {
				System.out.print(i + " ");
			}
		}
		
		
		
		
		
		
	}

}

/*
for(int i = 2; i <= n; i++) {
	for(int j = 2; i <= j; j++) {
		if (i % j == 0 && i != j) {
			count++;
		}
	}
}
System.out.println(count);

int[] prime = new int[n-count];

for(int i = 2; i <= n; i++) {
	for(int j = 2; i <= j; j++) {
		if (i % j == 0 && i != j) {
			status = false;
		}
	}
	if (status) {
		prime[index] = i;
		index++;
	}
	status = true;
}

for(int number: prime) {
	System.out.print(number + " ");
}
*/