package VetorMatriz;

import java.util.Scanner;

public class at03rodando {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Insira o tamanho do vetor: ");
		int tam = input.nextInt();
		int vetor[] = new int[tam];
		int k;

		for (k = 0; k < tam; k++) {
			System.out.print("Insira os valores que ir�o compor esse vetor: ");
			vetor[k] = input.nextInt();
		}
		int soma = 0;
		int menor = 0;
		int maior = 0;
		double media = 0;

		for (k = 0; k < tam; k++) {

			if (k == 0) {
				menor = vetor[k];
				maior = vetor[k];
			}

			if (vetor[k] < menor) {
				menor = vetor[k];
			}

			else if (vetor[k] > maior) {
				maior = vetor[k];
			}
			soma = soma + vetor[k];
		}
		media = soma / tam;

		int contadorpar = 0;
		int contadorimpar = 0;

		int mediacima = 0;
		int mediabaixo = 0;

		for (k = 0; k < tam; k++) {
			if (vetor[k] % 2 == 0) {
				contadorpar++;
			} else if (vetor[k] % 2 != 0) {
				contadorimpar++;
			}
		}

		for (k = 0; k < tam; k++) {
			if (vetor[k] > media) {
				mediacima = mediacima + 1;
			} else {
				mediabaixo = mediabaixo + 1;
			}

		}
		System.out.println("A soma ser� : " + soma);
		System.out.println("A m�dia ser� : " + media);
		System.out.println("O maior valor do vetor ser�: " + maior);
		System.out.println("O menor valor valor do vetor ser�: " + menor);
		System.out.println("N�mero pares: " + contadorpar);
		System.out.println("N�meros �mpares: " + contadorimpar);
		System.out.println("N�meros acima da m�dia : " + mediacima);
		System.out.println("N�meros abaixo da m�dia : " + mediabaixo);

		input.close();
	}

}
