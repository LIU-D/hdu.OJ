import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			String str = input.nextLine();
			char[] c = new char[3];
			char max = 0, mid = 0, min = 0;
			for (int i = 0; i < str.length(); i++) {
				c[i] = str.charAt(i);
			}
			if (Integer.valueOf(c[0]) > Integer.valueOf(c[1])) {
				if (Integer.valueOf(c[0]) > Integer.valueOf(c[2])) {
					max = c[0];
					if (Integer.valueOf(c[2]) > Integer.valueOf(c[1])) {
						mid = c[2];
						min = c[1];
					} else {
						mid = c[1];
						min = c[2];
					}
				} else {
					max = c[2];
					mid = c[0];
					min = c[1];
				}
			} else if (Integer.valueOf(c[1]) > Integer.valueOf(c[0])) {
				if (Integer.valueOf(c[1]) > Integer.valueOf(c[2])) {
					max = c[1];
					if (Integer.valueOf(c[2]) > Integer.valueOf(c[0])) {
						mid = c[2];
						min = c[0];
					} else {
						mid = c[0];
						min = c[2];
					}
				} else {
					max = c[2];
					mid = c[1];
					min = c[0];
				}
			}

			System.out.println(min + " " + mid + " " + max);
		}
	}
}
