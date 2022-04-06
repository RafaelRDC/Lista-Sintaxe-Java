import java.util.Scanner;

public class Lista_8
{
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Qual o tamanho da matriz: ");
        int i, j, n = teclado.nextInt();;
        int  matriz[][]= new int [n][n];

        for (i =0;i<n;i++){
        	for (j=0;j<n;j++){
				System.out.println((i+1)+", "+(j+1)+":");
				matriz[i][j] = teclado.nextInt();
        	}
        }
        boolean magico = true;
    	int Linha = 0, Coluna = 0;
        
        for (i=0;i<n;i++){
        	int numLinhas = 0;
        	int numColunas = 0;
        	for (j=0; j<n; j++){
        		if(i==0){
        			Linha += matriz[i][j];
        			Coluna += matriz[j][i];
        		}
        		numLinhas += matriz[i][j];
        		numColunas += matriz[j][i];
        	}
    		if(numLinhas != Linha || numLinhas != Coluna || numColunas != Coluna || Coluna != Linha){
    			magico = false;
    		}
        }
        if(magico){
        	System.out.println("A matriz é um quadrado mágico");
        }else{
        	System.out.println("A matriz não é um quadrado mágico");
        }
	}
}