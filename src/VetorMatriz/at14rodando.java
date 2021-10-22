package VetorMatriz;

import java.util.Scanner;

public class at14rodando {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int i = 0;
		int k = 0;
		int vetor[] = new int[10];
		int segundovetor[] = new int[10];
		int terceirovetor[] = new int[20];

		for (i = 0; i < 10; i++) {
			System.out.println("Insira um número para compor o primeiro vetor : ");
			vetor[i] = Integer.parseInt(input.nextLine());
		}
		for (i = 0; i < 10; i++) {
			System.out.println("Insira um número para compor o segundo vetor : ");
			segundovetor[i] = Integer.parseInt(input.nextLine());
		}
		for (i = 0; i < 10; i++) {
			terceirovetor[k] = vetor[i];
			k++;
			terceirovetor[k] = segundovetor[i];
			k++;
		}
		System.out.println("O vetor 3 será composto pelos elementos: ");
		for (i = 0; i < 20; i++) {
			System.out.println(terceirovetor[i]);
		}
		input.close();
	}

}
