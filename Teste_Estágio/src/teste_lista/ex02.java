package teste_lista;

import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a, b;
		
		a = 0;
		b = 0;
		
		System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = teclado.nextInt();
        
        while (b <= numero) {
        	if (b == numero) {
                System.out.println(numero + " pertence à sequência de Fibonacci.");
                teclado.close();
            }
			a++;
			b += a;
		}
        
        if ((b -= a) != numero) {
        	System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
	}
}
