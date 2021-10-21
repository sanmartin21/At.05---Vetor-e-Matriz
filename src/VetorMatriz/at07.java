package VetorMatriz;

import java.util.Scanner;

public class at07 {

public static void main(String[] args) {
		


			Scanner entrada=new Scanner(System.in);
			
			float n[]=new float[2];
			int aluno[]= new int [2];
			int x,k,j;
			float soma = 0, media = 0;
			int alunos=0;
			
			for (k=0;k<2;k++) {
				System.out.println("Insira as notas do aluno");
			
			for(x=0;x<2;x++) {
			System.out.printf("Nota ",(x+1));
			n[x]=entrada.nextFloat(); 
			
			for( j= 0; j<n.length; j++) {
		        media += n[j];
		    float total = (float)media / n.length;
		    System.out.println("A m�dia do aluno: "+k+" � "+total); 
			
			if (total>7) {
			    alunos++;
			    System.out.println(alunos++);}
			else {
				System.out.println("Nenhum aluno alca�ou a media");}
			}
			}
			}
			}
		}
			