package VetorMatriz;

import java.util.Scanner;

public class at08rodando {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// int vetor[] = new int[5];
		// int i;

		// for (i = 0; i < 5; i++) {
		// System.out.println("Insira um número inteiro: ");
		// vetor[i] = input.nextInt();
		// }
		// for (i = 0; i < 5; i++) {
		// System.out.print(vetor[i] + "|");
		// }

		int vetor[] = new int[5];
		int i;
		int mult = 1;
		int soma = 0;

		for (i = 0; i < 5; i++) {
			System.out.printf("Insira um número inteiro: ");
			vetor[i] = input.nextInt();
		}

		for (i = 0; i < 5; i++) {
			System.out.print(vetor[i] + "|");
			soma = soma + vetor[i];
			mult = mult * vetor[i];
		}

		System.out.println("\nA somatória dos 5 números foi: " + soma);
		System.out.println("A multiplicação dos 5 números é: " + mult);

		input.close();
	}

}
