package Exercicios_Repeticao;
import java.util.Scanner;
public class Ex25_While {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int num, tab;
		
		System.out.println("Qual número deseja conhecer a tabuada? ");
		num = ler.nextInt();
		if (num >0) {
			while(num >0) {
				tab = num * 1;
				System.out.printf("%d x 1 = %d \n", num, tab);
				tab = num * 2;
				System.out.printf("%d x 2 = %d \n", num, tab);
				tab = num * 3;
				System.out.printf("%d x 3 = %d \n", num, tab);
				tab = num * 4;
				System.out.printf("%d x 4 = %d \n", num, tab);
				tab = num * 5;
				System.out.printf("%d x 5 = %d \n", num, tab);
				tab = num * 6;
				System.out.printf("%d x 6 = %d \n", num, tab);
				tab = num * 7;
				System.out.printf("%d x 7 = %d \n", num, tab);
				tab = num * 8;
				System.out.printf("%d x 8 = %d \n", num, tab);
				tab = num * 9;
				System.out.printf("%d x 9 = %d \n", num, tab);
				tab = num * 10;
				System.out.printf("%d x 10 = %d \n", num, tab);
				break;
			}
		}else {
			System.out.println("Incorreto!, não insira números negativos.");
			
		}
	}

}
