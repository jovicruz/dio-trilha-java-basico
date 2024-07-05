import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Banco banco = new Banco();
		Conta conta = null;
		int opcao = 5;
		double valor = 0;
		while (opcao!=0) {
			Cliente novoCliente = null;
			System.out.println("========== Digite o nome do cliente ==========");
			Scanner scanner = new Scanner(System.in);
			String nomecliente = scanner.nextLine();
			banco.getClientes();
			if (banco.getClienteByNome(nomecliente) != null) {
				novoCliente = banco.getClienteByNome(nomecliente);
				conta = banco.getContaByCliente(novoCliente);
			}

			else{
				novoCliente = new Cliente();
				novoCliente.setNome(nomecliente);
				banco.addCliente(novoCliente);
			}
			
		
		

		
			while (opcao != 0) {
				System.out.println("========== Bem-Vindo(a) " + novoCliente.getNome() + " ==========");
				if (banco.getContasCliente(novoCliente)) {
					System.out.println("Sua conta possui saldo de: R$"+ conta.getSaldo());
					System.out.println("1 - Depositar");
					System.out.println("2 - Sacar");
					System.out.println("3 - Transferir");
					System.out.println("0 - Sair");
					opcao = Integer.parseInt(scanner.nextLine());
					
					switch (opcao) {
						case 1:
							System.out.println("Digite o valor desejado: ");
							valor = Double.parseDouble(scanner.nextLine());
							conta.depositar(valor);
							break;
						case 2:
							System.out.println("Digite o valor desejado: ");
							valor = Double.parseDouble(scanner.nextLine());
							conta.sacar(valor);
							break;
						case 3:
							System.out.println("Digite o numero da agencia: ");
							int agencia = Integer.parseInt(scanner.nextLine());

							System.out.println("Digite o numero da conta: ");
							int numero = Integer.parseInt(scanner.nextLine());

							Conta contadestino = banco.getContaByAgenciaAndNumero(numero, agencia);
							System.out.println("Digite o valor desejado: ");
							valor = Double.parseDouble(scanner.nextLine());

							conta.transferir(valor, contadestino);
						default:
							break;
					}
				}
				else{
					System.out.println("1 - Criar conta poupança");
					System.out.println("2 - Criar conta corrente");
					System.out.println("0 - Sair");
					opcao = Integer.parseInt(scanner.nextLine());
					switch (opcao) {
						case 1:
							conta = new ContaPoupanca(novoCliente);
							banco.addConta(conta);
							break;
						case 2:
							conta = new ContaCorrente(novoCliente);
							banco.addConta(conta);
							break;
						default:
							break;
					}
				}
				
			}
			opcao = 5;
		}
	}

}
