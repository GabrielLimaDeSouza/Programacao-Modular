package Ex3;

public class Aplicacao {

	public static void main(String[] args) {
		Conta conta = new Conta();
		System.out.println("Criando a conta "+conta.getNumeroDaConta()+" com "+conta.getSaldo()+" de saldo");
		conta.depositar(150);
		System.out.println("Adicionando 150 reais a conta");
		System.out.println("Novo saldo da conta: "+ conta.getSaldo());
		System.out.println("Sacando 20 reais da conta");
		conta.sacar(20);
		System.out.println("Novo saldo da conta: "+ conta.getSaldo()+"\n");
		Conta contaNova = new Conta();
		System.out.println("Criando a conta "+contaNova.getNumeroDaConta()+" com "+contaNova.getSaldo()+" de saldo");
		System.out.println("Transferindo 100 reais para a nova conta");
		conta.transferir(contaNova, 100);
		System.out.println("Saldo da conta "+conta.getNumeroDaConta()+": "+conta.getSaldo());
		System.out.println("Saldo da conta "+contaNova.getNumeroDaConta()+": "+contaNova.getSaldo());
	}

}
