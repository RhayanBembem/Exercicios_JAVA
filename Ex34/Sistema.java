package Ex34;
import java.util.Scanner;
public class Sistema {
//SE O IF TIVER SO UMA LINHA NAO PRECISA DE CHAVES
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		Cliente [] ListaClientes = new Cliente[5];
		int id;
		String nome;
		int idade;
		String email;
		ContaBancaria conta;
		String atualizaEmail;
		
		String PossuiConta;
		
		for (int i = 0 ; i<5 ; i++) {

			
			System.out.println("Insira seu id: ");
			id= ler.nextInt();
			
			System.out.println("Insira sua idade: ");
			idade = ler.nextInt();
			
			System.out.println("Insira seu nome: ");
			nome = ler.next();
			
			System.out.println("Insira seu email: ");
			email = ler.next();
			
			System.out.println("Possui conta bancária (S/N) ? ");
			PossuiConta =  ler.next().toUpperCase();
			
			if (PossuiConta.equals("S")) {
				ContaBancaria cb = new ContaBancaria();
				
							
				System.out.println("Insira à agência: ");
				cb.agencia = ler.next();
				System.out.println("Insira o número da conta: ");
				cb.numero = ler.next();
				System.out.println("Insira o seu saldo: ");
				cb.saldo = ler.nextDouble();
				
				conta = cb;
			}else {	
				conta = null;	
			}
			
			Cliente c = new Cliente(id,nome,idade,email,conta);
			ListaClientes[i] = c ;
			
		}
		for (int i = 0 ; i<5 ; i++) {
			
			System.out.printf("\n %s ", ListaClientes[i].ExibirNomeIdade());
			System.out.printf("\n %s ", ListaClientes[i].exibirDadosConta());
			System.out.println("Deseja atualizar o email (S/N) ? ");
			atualizaEmail =  ler.next().toUpperCase();
			
			if(atualizaEmail.equals("S")) {
				System.out.println("Insira o email do cliente");
				email = ler.next();
				
				ListaClientes[i].AtualizarEmail(email);
				
				System.out.printf("Email atualizado com sucesso!O Novo email é: %s", ListaClientes[i].email);
			}
//			FUNCIONA MAS N EH BOM
//			
//			if (ListaClientes[i].conta != null ) {
//				System.out.printf("%s \n", ListaClientes[i].exibirDadosConta());
//			}
//			else {
//				System.out.println("N�o tem conta");
//			}
//			
		}
		
		
		
		
		ler.close();
	}

}
