package VetorMatriz;

import java.util.Arrays;
import java.util.Scanner;

public class at12rodando {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Insira várias palavras separadas: ");
		String palavra = input.next();
		String separar[] = palavra.split(";");

		System.out.println(Arrays.toString(separar));

		input.close();
	}
}
