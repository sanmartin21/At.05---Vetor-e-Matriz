package VetorMatriz;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Arrays;

public class at11rodando {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Insira uma data no padr�o dd/mm/aaaa : ");
		String date = input.next();
		String datainteira[] = date.split("/");

		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

		sdf.setLenient(false);
		try {
			sdf.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(Arrays.toString(datainteira));
		System.out.println("Data aceita.");

		input.close();

	}
}
