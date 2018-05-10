import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int n = input.nextInt();
			int sum = 1;
			for (int i = 2; i <= n; i++) {
				sum = (sum + 1) * 2;
			}
			System.out.println(sum);
		}
	}
}
