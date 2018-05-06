import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			Double x = input.nextDouble();
			int y = input.nextInt();
			Double num = (double) 0;
			for(int i = 0; i < y; i++) {
				num += x;
				x = Math.sqrt(x);
			}
			System.out.println(String.format("%.2f", num));
		}
	}
}
