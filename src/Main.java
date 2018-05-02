import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext()) {
			Double a = input.nextDouble();
			Double b = input.nextDouble();
			Double c = input.nextDouble();
			Double d = input.nextDouble();
			Double end = Math.sqrt((a - c) * (a - c) + (b - d) * (b - d));
			System.out.println(String.format("%.2f",end));
		}
	}
}
