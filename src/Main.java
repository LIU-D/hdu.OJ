import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext()) {
			int a, b=0,N;
			N = input.nextInt();
			if(N == 0) 
				break;
			for(int i = 0; i < N; i++) {
				a = input.nextInt();
				b += a;		
			}
			System.out.println(b);
		}
	}
}
