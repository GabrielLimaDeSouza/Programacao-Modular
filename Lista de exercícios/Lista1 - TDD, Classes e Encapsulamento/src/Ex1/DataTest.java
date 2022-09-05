package Ex1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DataTest {

	public static Data data;
	
	/**
	 * Método iniciado antes de todos os testes (instancia um objeto do tipo data)
	 */
	@BeforeEach
	void setUp() throws Exception {
		data = new Data(2022,10,14);
	}
	
	/**
	 * Método que testa se o construtor com paramêtros seta a data corretamente
	 */
	@Test
	public void testConstrutorComParametro() {
		Data dataCriada = new Data(2021,15,8);
		assertEquals("08/15/2021",dataCriada.porExtenso());
	}
	
	/**
	 * Método que testa se o construtor sem paramêtros seta a data atual
	 */
	@Test
	public void testConstrutorSemParametro() {
		Data dataAtual = new Data();
		assertEquals("26/08/2022",dataAtual.porExtenso());
	}
	
	/**
	 * Método que testa se o método ProximoDia() incrementa o dia em uma data
	 */
	@Test
	public void testProximoDia() {
		data.proximoDia();
		assertEquals(15,data.getDia(), "Testa se o dia foi incrementado");
		assertEquals(10,data.getMes(), "Testa se o mês se manteve o mesmo");
		assertEquals(2022,data.getAno(), "Testa se o ano se manteve o mesmo");
	}
	
	/**
	 * Método que testa a função adicionaDias() em datas no mesmo mês
	 */
	@Test
	public void testAdicionaDiasMesmoMes() {
		data.adicionaDias(2);
		assertEquals(16,data.getDia());
		assertEquals(10,data.getMes());
		assertEquals(2022,data.getAno());
	}
	
	/**
	 * Método que testa a função adicionaDias() em datas com meses distintos
	 */
	@Test
	public void testAdicionaDiasVirandoMes() {
		data.adicionaDias(25);
		assertEquals(8,data.getDia());
		assertEquals(11,data.getMes());
		assertEquals(2022,data.getAno());
	}
	
	/**
	 * Método que testa a função adicionaDias() em datas com anos distintos
	 */
	@Test
	public void testAdicionaDiasVirandoAno() {
		data.adicionaDias(150);
		assertEquals(13,data.getDia());
		assertEquals(3,data.getMes());
		assertEquals(2023,data.getAno());
	}
	
	/**
	 * Método que testa se o método ProximoDia() incrementa o dia e o mês em uma data limite
	 */
	@Test
	public void testProximoDiaVirandoMes() {
		Data dataVirandoMes = new Data(2022,8,31);
		dataVirandoMes.proximoDia();
		assertEquals(1,dataVirandoMes.getDia(), "Testa se o dia foi incrementado");
		assertEquals(9,dataVirandoMes.getMes(), "Testa se o mês foi incrementado");
		assertEquals(2022,dataVirandoMes.getAno(), "Testa se o ano se manteve o mesmo");
	}
	
	
	/**
	 * Método que testa se o método ProximoDia() incrementa o dia, mês e ano em uma data limite
	 */
	@Test
	public void testProximoDiaVirandoAno() {
		Data dataVirandoAno = new Data(2022,12,31);
		dataVirandoAno.proximoDia();
		assertEquals(1,dataVirandoAno.getDia(), "Testa se o dia foi incrementado");
		assertEquals(1,dataVirandoAno.getMes(), "Testa se o mês foi incrementado");
		assertEquals(2023,dataVirandoAno.getAno(), "Testa se o ano foi incrementado");
	}
	
	
	/**
	 * Método que testa se o método eAnoBissexto() retorna false para um ano não bissexto
	 */
	@Test
	public void testAnoNaoBissexto() {
		assertFalse(data.eAnoBissexto(), "Testando se o ano 2022 é bissexto (resultado esperado: false)");
	}
	
	
	/**
	 * Método que testa se o método eAnoBissexto() retorna true para um ano bissexto
	 */
	@Test
	public void testAnoBissexto() {
		Data dataBissexto = new Data(2024,05,12);
		assertTrue(dataBissexto.eAnoBissexto());
	}

	/**
	 * Método que testa se o método diasNoMes() retorna a quantidade de dias em um determinado mês
	 */
	@Test
	public void testDiasNoMes() {
		assertEquals(31, data.diasNoMes());
	}
	
	/**
	 * Método que testa se o método diaDaSemana() retorna qual o dia da semana em determinada data
	 */
	@Test
	public void testDiaDaSemana() {
		assertEquals("sexta", data.diaDaSemana());
	}
	
	/**
	 * Método que testa se o método porExtenso() retorna determinada data em formato dd/mm/yyyy
	 */
	@Test
	public void testPorExtenso() {
		assertEquals("14/10/2022",data.porExtenso());
	}

}
