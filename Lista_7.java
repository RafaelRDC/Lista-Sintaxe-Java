import java.util.Scanner;

public class Lista_7 {
    public static void main(String[] args) {
    	Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt(), pess = 0, ruim = 0, boa = 0, otima = 0, contador = 0;

        while (n >= 0 && n <= 100){
        	if (n >= 0 && n <= 25){
        		pess += 1;
        	}
        	if (n >= 26 && n <= 50){
        		ruim += 1;
        	}
        	if (n >= 51 && n <= 75){
        		boa += 1;
        	}
        	if (n >= 76 && n <= 100){
        		otima += 1;
        	}
        	contador += 1;
        	n = teclado.nextInt();
        }
        System.out.println(pess);
        int pessC = (pess*100)/contador, ruimC = (ruim*100)/contador, boaC = (boa*100)/contador, otimaC = (otima*100)/contador;
        System.out.println("Pessimas: " + pessC + "%\n" + "Ruins: " + ruimC + "%\n" + "Boas: " + boaC + "%\n" + "Otimas: " + otimaC + "%\n");
    }
}