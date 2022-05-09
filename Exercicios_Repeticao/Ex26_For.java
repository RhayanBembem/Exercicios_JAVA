package Exercicios_Repeticao;
import java.util.Scanner;
public class Ex26_For {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int num, a ,b, tab, i ;
		
		System.out.println("Insira um número para descobrir a tabuada: ");
		num = ler.nextInt();
		System.out.println("Insira intervalo de: ");
		b = ler.nextInt();
		System.out.println("Sendo o intervalo de: ");
		a = ler.nextInt();
		
		if (b > a ) {	
			for (i = b; i >= a ; i --) {
				tab = num * i;
				System.out.println(tab);
				

				
			}
		}	
		
		
	}

}
