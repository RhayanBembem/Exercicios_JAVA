package Exercicios_Repeticao;
import java.util.Scanner;
public class Ex22_Do {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int num1,num2;
		
		System.out.println("Insira o valor do primeiro número: ");
		num1 = ler.nextInt();
		do{
			System.out.printf("Insira o valor do segundo número: ");
			num2 = ler.nextInt();
			
		}
		while (num1>num2);
		System.out.println("O primeiro número inserido é menor que o segundo!");
	}

}
