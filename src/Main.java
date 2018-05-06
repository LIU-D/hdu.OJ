import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int x = input.nextInt();
			int a = 0, b = 0, c = 0;
			if(x == 0) break;
			for (int i = 0; i < x; i++) {
				Double y = input.nextDouble();
				if (y < 0)
					++a;
				else if (y == 0)
					++b;
				else if (y > 0)
					++c;
			}
			System.out.println(a + " " + b + " " + c);

		}
	}
}
