package Exercicios_Repeticao;
import java.util.Scanner;
public class Ex22_For {

	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	int num1,num2,i;
	
	System.out.println("Insira o valor do primeiro número: ");
	num1 = ler.nextInt();
	
	System.out.println("Insira o valor do segundo número: ");
	num2 = ler.nextInt();
	
	for (i = 0 ; num1 > num2 ; i++ ) {
		
		if (num2>num1) {
			System.out.println("O primeiro número inserido é menor que o segundo!");
		}else {
			System.out.println("Insira o valor do segundo número: ");
			num2 = ler.nextInt();
		}
	}

	
	}

}
