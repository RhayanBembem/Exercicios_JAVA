package Exercicios_Repeticao;
import java.util.Scanner;
public class Ex31_For {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);		
		termo, i, soma, n, int;
		
		System.out.println("Insira N, e descubra a soma dos N primeiros termos: ");
		n = ler.nextInt();
		
		termo =2;
		soma = 0;
		i = 3 ;
		if (n > 0 && n <100) {
		System.out.println(termo);
	
			while (i <= (2 * n)) {
				
				termo = termo + i ;
				soma =  soma + termo;
				i +=2;
				
				System.out.println(termo);
			}
			System.out.printf("A soma de todos é %d",(soma+2));
			
		}else {
			System.out.println("Incorreto, insira o valor novamente: ");
			n = ler.nextInt();
			
		}
		ler.close();
		
		
		
		
		
		
		
		
		
		
	}

}
