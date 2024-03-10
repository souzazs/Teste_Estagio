package teste_lista;

import java.util.Scanner;

public class ex05 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite uma palavra para que ela seja invertida: ");
		String palavra = teclado.nextLine();
		
		String palavraInv = inverterString(palavra);
		
		 System.out.println("Palavra informada: " + palavra);
	     System.out.println("Palavra invertida: " + palavraInv);
	}
	
	static String inverterString(String str) {
        char[] catactere = str.toCharArray();
        int palavraSize = catactere.length;

        for (int i = 0; i < palavraSize / 2; i++) {
            char temp = catactere[i];
            catactere[i] = catactere[palavraSize - 1 - i];
            catactere[palavraSize - 1 - i] = temp;
        }
        
        return new String(catactere);
	}
}
