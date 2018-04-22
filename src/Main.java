import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		for (int i = 0; i < N; i++) {
			int M = input.nextInt();
			int num = 0;
			for (int j = 0; j < M; j++) {
				int n = input.nextInt();
				num += n;
			}
			System.out.println(num);
		}
	}
}
