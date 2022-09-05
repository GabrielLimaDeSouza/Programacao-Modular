package Ex3;

public class Conta {
	private int numeroDaConta;
	private float saldo;
	private static int contador=0;
	
	
	/**
	 * Construtor sem paramêtros, o saldo é setado como 0 e o número da conta é criado com base em um ID auto-incremento
	 * 
	 */
	public Conta() {
		this.numeroDaConta = Conta.contador;
		this.saldo = 0;
		Conta.contador++;
	}

	/**
	 * Método de saque, é verificado se há valor disponível na conta para a realização do saque
	 * 
	 * @param valor Valor a ser sacado
	 */
	public void sacar(float valor) {
		if(this.saldo >= valor) {
			this.saldo = this.saldo - valor;
		}
	}
	
	
	/**
	 * Método de depósito, o valor é adicionado ao saldo da conta
	 * 
	 * @param valor Valor a ser depositado na conta
	 */
	public void depositar(float valor) {
		this.saldo = this.saldo + valor;
	}
	
	
	/**
	 * Método de transferência, é verificado se há valor disponível na conta para a realização da transferência,
	 * o dinheiro é subtraído da conta do enviante e depositado na conta destino
	 * 
	 * @param destino Conta para onde será realizada a transferência
	 * @param valor Valor a ser sacado
	 */
	public void transferir(Conta destino, float valor) {
		if(this.saldo >= valor) {
			destino.saldo = destino.saldo + valor;
			this.saldo = this.saldo - valor;
		}
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public float getSaldo() {
		return saldo;
	}

	public static int getContador() {
		return contador;
	}
	
}
