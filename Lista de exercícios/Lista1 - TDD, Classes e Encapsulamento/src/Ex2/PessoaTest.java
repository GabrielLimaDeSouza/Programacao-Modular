package Ex2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PessoaTest2 {

	/**
	 * Testando construtor da classe Pessoa
	 */
	@Test
	public void testConstrutorPessoa() {
		Pessoa pessoa = new Pessoa("Junior Augusto", 15231522200L, 59 , "Masculino");
		assertEquals("Junior Augusto", pessoa.getNome(), "Testando o atributo nome no construtor");
		assertEquals(15231522200L, pessoa.getCpf(), "Testando o atributo CPF no construtor");
		assertEquals(59, pessoa.getIdade(), "Testando o atributo idade no construtor");
		assertEquals("Masculino", pessoa.getSexo(), "Testando o atributo sexo no construtor");
	}

	/**
	 * Testando o método de verificação da maioridade
	 */
    @Test
    public void testMaiorDeIdade() {
        Pessoa pessoa = new Pessoa("Gabriel", 15433452800L, 18, "Masculino");
        assertTrue(pessoa.eMaiorDeIdade(), "é maior de idade");
        Pessoa pessoa2 = new Pessoa("Vanessa", 15487874840L, 17, "Feminino");
        assertFalse(pessoa2.eMaiorDeIdade(), "é menor de idade");
    }
}
    
    

