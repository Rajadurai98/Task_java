package final_interview;

public class Print_prime_number {
	public static void main(String[] args) {
		for (int i = 2; i <= 100; i++) {
			Boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}

			}
			if (isPrime) {
				System.out.println(i);
			}
		}
	}
}