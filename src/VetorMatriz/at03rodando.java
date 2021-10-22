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
			System.out.print("Insira os valores que irão compor esse vetor: ");
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
		System.out.println("A soma será : " + soma);
		System.out.println("A média será : " + media);
		System.out.println("O maior valor do vetor será: " + maior);
		System.out.println("O menor valor valor do vetor será: " + menor);
		System.out.println("Número pares: " + contadorpar);
		System.out.println("Números ímpares: " + contadorimpar);
		System.out.println("Números acima da média : " + mediacima);
		System.out.println("Números abaixo da média : " + mediabaixo);

		input.close();
	}

}
