import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext()) {
			Double n = input.nextDouble();
			System.out.println(String.format("%.2f",Math.abs(n)));
		}
	}
}
