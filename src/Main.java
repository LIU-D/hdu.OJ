import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int n = input.nextInt();
			int[] p = new int[n];
			int count = 0;
			int temp = 1;
			for (int i = 0; i < n; i++) {
				int a = input.nextInt();
				if ((a % 2) != 0)
					p[count++] = a;
			}
			for (int j = 0; j < count; j++) {
				temp *= p[j];
			}
			System.out.println(temp);
		}
	}
}
