import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int dd[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		while (s.hasNext()) {
			int days = 0;
			String str = s.nextLine();
			String[] date = str.split("/");
			int y = Integer.parseInt(date[0]);
			int m = Integer.parseInt(date[1]);
			int d = Integer.parseInt(date[2]);
			if ((y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)) && m > 2)
				days++;
			days += d;
			for (int i = 0; i < m; i++) {
				days += dd[i];
			}
			System.out.println(days);
		}
		s.close();
	}

}
