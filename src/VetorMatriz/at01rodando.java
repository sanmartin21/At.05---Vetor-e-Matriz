package VetorMatriz;

import java.util.Scanner;

public class at01rodando {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int vetor[] = new int[5];
		int i;

		for (i = 0; i < 5; i++) {
			System.out.println("Insira um número inteiro: ");
			vetor[i] = input.nextInt();
		}
		for (i = 0; i < 5; i++) {
			System.out.print(vetor[i] + "|");
		}
		input.close();

	}

}
