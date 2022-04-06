import java.util.Scanner;

public class Lista_2
{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int R = teclado.nextInt(), S = teclado.nextInt(), T = teclado.nextInt();
		int maior = R;
		if (S > R && S > T){
			System.out.println("S");
			System.exit(0);
		}
		if (T > R && T > S){
			System.out.println("T");
			System.exit(0);
		}
		if (R > S && R > T){
			System.out.println("R");
			System.exit(0);
		}
	}
}