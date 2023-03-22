package final_interview;

public class Armstrong {
	public static void main(String[] args) {
		int num = 153, r, sum = 0,temp;
		temp=num;
		while (num > 0) {
			r = num % 10;//3,
			sum = sum + r * r * r;
			num = num / 10;
		}
		
		if (sum == temp) {
			System.out.println("given number is a Armstrong");

		} else {
			System.out.println("given number is not armstrong");
		}
	}

}
