import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int a = input.nextInt();
			int b = input.nextInt();
			if (b == 0)
				System.out.println(1);
			else {
				int aa = a % 10;
				int bb = b % 4;
				if (bb == 0) {
					int count = 1;
					while (count < 4) {
						aa *= aa;
						count++;
					}

				} else {
					int count = 1;
					int aaa = aa;
					while (count < bb) {
						aa *= aaa;
						count++;
					}
				}
				System.out.println(aa % 10);
			}
		}
	}
}
