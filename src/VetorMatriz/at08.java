package VetorMatriz; 

import java.util.Scanner;

public class at08 {

	public static void main(String[] args) {


		Scanner input =new Scanner(System.in);
		

		int[] num = new int [5];
		int soma = 0;
		int x;
		String mensagem = " ";
		System.out.println("Insira os cinco números:");
		
		for (x = 0; x < 5; x++);
		num[x] = input.nextInt();
		
		soma = soma + num.length;
		mensagem += "Valor Armazenado : " + num[x];
		
		System.out.println(soma);		
	}

}
