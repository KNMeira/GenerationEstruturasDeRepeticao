package estruturasDeRepeticao;

import java.util.Scanner;

public class lacoDoWhile {

	public static void main(String[] args) {
		/* 3)	Escreva um algoritmo em Java, que leia números
		 *  inteiros via teclado, até que o número zero seja digitado.
		 *  Ao final, mostre na tela a soma de todos os números digitados,
		 *  que sejam positivos. */
		
		Scanner scanner = new Scanner(System.in);
		int totalPositivos = 0; 
		int num = 0;
		
		do { System.out.println("Digite um número Inteiro: ");
	    num = scanner.nextInt();
		 if(num > 0 ) {
			 totalPositivos = totalPositivos + num;
		 }
			
		}while (num !=0);
		
		System.out.println("A soma dos números pares é: " + totalPositivos);
		scanner.close();

	}

}
