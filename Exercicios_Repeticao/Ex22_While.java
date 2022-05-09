package Exercicios_Repeticao;
import java.util.Scanner;
public class Ex22_While {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int num1,num2;
		
		System.out.printf("Insira o valor do primeiro número: ");
		num1 = ler.nextInt();
		System.out.printf("Insira o valor do segundo número: ");
		num2 = ler.nextInt();
		
		while (num1 > num2) {
			System.out.println("Incorreto! O segundo não pode ser menor que o primeiro.");
			System.out.printf("Insira novamente o valor do segundo número: ");
			num2 = ler.nextInt();
		}
		
		System.out.println("O segundo número é maior que o primeiro!");
	}

}
