package estruturasDeRepeticao;

import java.util.Scanner;

public class lacoWhile {

	public static void main(String[] args) {
		/*Escreva um algoritmo em Java, que leia a idade de várias
		 *pessoas (números inteiros), via teclado e mostre na tela
		 * o total de pessoas cuja idade seja menor que 21 anos e o total 
		 * de pessoas cuja idade seja maior que 50 anos. A leitura dos dados
		 * deve ser finalizada ao digitar uma idade negativa.  */
		
		Scanner scanner = new Scanner(System.in);
		int menor21Anos = 0;
		int maior50Anos = 0;
		boolean isIdadePositivo = true;
		
		while(isIdadePositivo) {
			System.out.println("Digite uma idade: ");
			int idade = scanner.nextInt();
			if(idade < 21 && idade > 0) {
				menor21Anos++;
			} 
			if(idade > 51) {
				maior50Anos++;
			}
			if(idade < 0) {
				isIdadePositivo  = false;
			}
		}
		
		System.out.println("O total de pessoas que tem menos de 21 anos é: " + menor21Anos);
		System.out.println("O total de peesoas que tem mais de 50 anos é: " + maior50Anos);
		
		scanner.close();

	}

}
