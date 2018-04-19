import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b,N;
		N = input.nextInt();
		for(int i = 0; i <N; i++) {
			a = input.nextInt();
			b = input.nextInt();
			System.out.println(a + b);
		}
	}
}
