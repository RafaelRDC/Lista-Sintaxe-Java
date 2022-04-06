import java.util.Scanner;

public class Lista_5
{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int N = teclado.nextInt(), fat = 1;
		if (N > 0){
			while (N > 1){
				fat *= N;
				N--;
			}
			System.out.println(fat);
		}else{
			System.out.println(-1);
		}
	}
}