package VetorMatriz;

import java.util.Scanner;

public class at07rodando {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		final int lengthaluno = 10;
		final int lengthnota = 4;
		int i = 0;
		int x;
		int alunos = 0;
		float media = 0, soma = 0;

		for (i = 0; i < lengthaluno; i++) {
			System.out.println("Insira as quatro notas desse aluno!");

			float nota[] = new float[lengthnota];
			for (x = 0; x < lengthnota; x++) {
				System.out.printf("Nota " + (x + 1) + ": ");
				nota[x] = input.nextFloat();
				soma = soma + nota[x];
			}

			media = soma / lengthnota;
			soma = 0;
			System.out.println("A média desse aluno é: " + media);

			if (media >= 7) {
				alunos++;
			}
		}
		System.out.println("O número de alunos com média maior ou igual a 7.0 é: " + alunos);

		input.close();
	}
}
