import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int a = input.nextInt();
			int b = input.nextInt();
			if(a > b) {
				int temp = a;
				a = b;
				b = temp;
			}
			int temp_a = 0;
			int temp_b = 0;
			for (int i = a; i <= b; i++) {
				if (i % 2 == 0)
					temp_a += i * i;
				else
					temp_b += i * i * i;
			}

			System.out.println(temp_a + " " + temp_b);
		}
	}
}
