package final_interview;

public class Check_Perfect_Number {
	public static void main(String[] args) {
		int n = 28, sum = 0;
		for (int i = 1; i < 28; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		if(sum==n) {
			System.out.println("its a perfect number");
		}
		else {
			System.out.println("its not a perfect number");
		}
	}

}
