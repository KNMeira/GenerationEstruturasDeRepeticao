package estruturasDeRepeticao;

import java.util.Scanner;

public class lacoFor {

	public static void main(String[] args) {
		/* Escreva um algoritmo em Java, que leia 10 
		 * números inteiros via teclado e mostre na 
		 * tela quantos números são pares e quantos
		 *  número são ímpares. 
		 */
		Scanner scanner = new Scanner(System.in);
		int numPares = 0;
		int numImpares =0;
		
		for(int i = 1; i<= 10; i++) {
			System.out.println("Digite o " + i + "º número: ");
			int num = scanner.nextInt();
			if (num % 2 == 0) {
				numPares++;
			}else {
				numImpares ++;
			}
		}
		
		System.out.println("O total de números pares é: " + numPares);
		System.out.println("O total de números ímpares é: "+ numImpares);
		
		
	    scanner.close();

	}

}
