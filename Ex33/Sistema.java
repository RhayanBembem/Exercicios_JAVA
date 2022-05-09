package Ex33;
import java.util.Scanner;
public class Sistema{

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		Produto[] listaProdutos = new Produto[10] ;
		
		for (int i = 0 ; i <10; i++) {
			Produto b = new Produto();
			System.out.println("Insira seu id: ");
			b.id = ler.nextInt();
			System.out.println("Insira a descrição do produto: ");
			b.descricao = ler.next();
			System.out.println("Insira o valor do produto aqui: ");
			b.valor = ler.nextDouble();
			System.out.println("Insira a quantidade de produtos: ");
			b.quantidade = ler.nextDouble();
			listaProdutos[i] = b;
		}
		for (int i = 0 ; i < 10; i++) {
			if (listaProdutos[i].valor < 100) {
				System.out.printf("O produto de ID %d custa menos de 100 reais. \n", listaProdutos[i].id);
			}
		}
	}

}
