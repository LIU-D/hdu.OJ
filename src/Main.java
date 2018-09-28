import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner index = new Scanner(System.in);
		while (index.hasNext()) {
			int n = index.nextInt();
			int m = index.nextInt();
			int x;
			int[] num = new int[n];
			num[0] = 2;
			for (int i = 1; i < n; i++) {
				num[i] = num[i - 1] + 2;
			}
			if (m > n) {
				int sum = 0;
				for (int i : num) {
					sum += i;
				}
				System.out.println(sum / n);
			} else {
				int i, j, y, z = 0;
				for (i = 0; i < n - n % m; i += m) {
					int sum = 0;
					y = i;
					for (j = 0; j < m; j++) {
						sum += num[y];
						y++;
					}
					x = sum / m;
					z++;
					if (z == 1) {
						System.out.print(x);
					} else {
						System.out.print(" " + x);
					}
				}
				if (n % m != 0) {
					int sum = 0;
					for (i = n % m; i > 0; i--) {
						sum += num[i + n - m];
					}
					x = sum / (n % m);
					System.out.println(" " + x);
				} else {
					System.out.println();
				}
			}
		}
	}
}
