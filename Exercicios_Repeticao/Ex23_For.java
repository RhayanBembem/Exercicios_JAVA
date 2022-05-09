package Exercicios_Repeticao;
import java.util.Scanner;
public class Ex23_For {

public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	String sexo;
	sexo = "genero";
	for (int i = 0; sexo.equals("M") || sexo.equals("F") || sexo != "M" || sexo != "F"; i++) {
		System.out.println("Insira a sigla referênte ao seu sexo:  ");
		sexo = ler.nextLine();
		sexo = sexo.toUpperCase();
		if (sexo.equals("M")) {
			System.out.println("Seu sexo é masculino!");
			break;
		}else if  (sexo.equals("F")) {
			System.out.println("Seu sexo é  feminino!");
			break;
			
		}else {
			System.out.println("Incorreto!, escolha somente as siglas M ou F");
			
		}
	}
	}

}
