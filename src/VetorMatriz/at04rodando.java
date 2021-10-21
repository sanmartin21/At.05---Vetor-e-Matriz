package VetorMatriz;

import java.util.Scanner;

public class at04rodando {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		float n[] = new float[4];
		float soma = 0;
		float media;

		for (int i = 0; i < 4; i++) {
			System.out.println("Insira a nota: ");
			n[i] = input.nextFloat();
			soma = soma + n[i];
		}
		media = soma / 4;

		System.out.println("A média das notas será: " + media);

		input.close();
	}

}
