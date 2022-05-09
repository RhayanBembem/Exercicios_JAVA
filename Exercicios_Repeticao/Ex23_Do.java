package Exercicios_Repeticao;
import java.util.Scanner;
public class Ex23_Do {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		String sexo;
		
//		System.out.printf("Qual � seu sexo (M ou F) ? ");
//		sexo = ler.nextLine();
//		sexo = sexo.toUpperCase();
		
		do {
			System.out.printf("Insira a sigla referênte ao seu sexo:  ");
			sexo = ler.nextLine();
			sexo = sexo.toUpperCase();
			if (sexo.equals("M")) {
				System.out.println("Seu sexo é masculino!");
			} else if (sexo.equals("F")){
				System.out.println("Seu sexo é feminino!");	
			} else {
				System.out.println("Incorreto!, escolha somente M ou F");
			}
		} while (sexo.equals("M") || sexo.equals("F") || sexo != "M" || sexo != "F");
		

	}

}
