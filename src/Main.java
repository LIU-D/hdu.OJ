import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext()) {
			int a = input.nextInt();
			int b = input.nextInt();
			int c;
			if(a == 0 && b == 0) break;
			boolean flag = true;
			
			for(int i = a; i <= b; i++) {
				c = i * i + i + 41;
				for(int j = 2; j < c; j++) {
					if(c % j == 0) {
						flag = false;
						break;
					}
				}
				if(!flag) break;
			}	
			if(flag) System.out.println("OK");
			else System.out.println("Sorry");
		}
	}
}
