package Ex3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContaTest {
	
	public static Conta conta;
	
	/**
	 * Criando uma conta nova e adicionando 150 de saldo
	 */
	@BeforeEach
	public void beforeEach() {
		conta = new Conta();
		conta.depositar(150.00F);
	}
	
	/**
	 * Testando o método depositar
	 */
	@Test
	public void testDepositar() {
		assertEquals(conta.getSaldo(), 150.00F);
	}
	
	/**
	 * Testando o método de transferência entre duas contas
	 */
	@Test
	public void testTransferir() {
		Conta contaParaTransferir = new Conta();
		conta.transferir(contaParaTransferir, 10F);
		assertEquals(140F, conta.getSaldo());
		assertEquals(10F, contaParaTransferir.getSaldo());
	}
	
	/**
	 * Testando o saque
	 */
	@Test
	public void testSacar() {
		conta.sacar(180);
		assertEquals(150, conta.getSaldo(), "Testando o saque com um valor maior que o saldo (saldo indisponível)");
		conta.sacar(120);
		assertEquals(30, conta.getSaldo(), "Testando o saque com saldo disponível");
	}
	

}
