import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b;
		while(input.hasNext()) {
			a = input.nextInt();
			b = input.nextInt();
			if(a == 0 && b == 0)
				break;
			else
				System.out.println(a + b);
		}
	}
}
