import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m = input.nextInt();
		for (int i = 0; i < m; i++) {
			int x = input.nextInt();
			Double num = (double) 0;
			if (x < 1000) {
				for (int j = 1; j <= x; j++) {
					if (j % 2 == 0)
						num -= 1.0 / j;
					else
						num += 1.0 / j;
				}
				System.out.println(String.format("%.2f", num));
			}
		}

	}
}
