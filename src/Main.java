import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			String s = input.nextLine();
			if (s.equals("START")) {
				String line = input.nextLine();
				StringBuilder sb = new StringBuilder();
				for (int i = 0; i < line.length(); i++) {
					if (line.charAt(i) >= 70 && line.charAt(i) <= 90) {
						char a = (char) (line.charAt(i) - 5);
						sb.append(a);
					} else if (line.charAt(i) >= 65 && line.charAt(i) < 70) {
						char a = (char) (line.charAt(i) + 26 - 5);
						sb.append(a);
					} else
						sb.append(line.charAt(i));
				}
				System.out.println(sb);
			} else if (s.equals("END")) {
				continue;
			} else if (s.equals("ENDOFINPUT")) {
				break;
			}
		}
	}
}
