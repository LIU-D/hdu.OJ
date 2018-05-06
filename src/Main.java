import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int x = input.nextInt();
			int y = input.nextInt();
			if (x >= 100 && x <= 999 && y >= 100 && y <= 999 && x <= y) {
				Boolean flag = false;
				String result = "";
				for (int i = x; i <= y; i++) {
					int thi = i / 100;
					int sec = i / 10 % 10;
					int fir = i % 10;
					if (thi * thi * thi + sec * sec * sec + fir * fir * fir == i) {
						if (flag)
							result += " ";
						result += i;
						flag = true;
					}
				}
				if (!flag)
					System.out.println("no");
				else
					System.out.println(result);
			}
		}
	}
}
