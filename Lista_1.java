import java.util.Scanner;

public class Lista_1
{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n;
		n = teclado.nextInt();
		int[] Valores = new int[n];
		for (int i = 0; i < n; i++){
			Valores[i] = teclado.nextInt();
		}
		int contador = 0;
		for (int i = 0; i < Valores.length; i++){
			if (Valores[i] < 0){
				contador += 1;
			}
		}
		System.out.println("Negativos: " + contador);
	}
}