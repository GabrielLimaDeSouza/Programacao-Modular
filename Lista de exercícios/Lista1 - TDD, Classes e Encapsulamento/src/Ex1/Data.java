package Ex1;

import java.time.LocalDate;

public class Data {

	private int dia;
	private int mes;
	private int ano;

	private static int[] DIASDOMES = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int ANO_ATUAL = 2022;
	private static final String[] DIASDASEMANA = { "sábado", "domingo", "segunda", "terça", "quarta", "quinta",
			"sexta" };

	/**
	 * Construtor com parâmetros
	 *
	 * @param ano Ano passado por parâmetro
	 * @param mes Mês passado por parâmetro
	 * @param dia Dia passado por parâmetro
	 */
	public Data(int ano, int mes, int dia) {
		this.ano = ano;
		this.mes = mes;
		this.dia = dia;
		if (eAnoBissexto()) {
			DIASDOMES[2] = 29;
		}
	}

	/**
	 * Construtor sem parâmetros, a data gerada é a data atual
	 */
	public Data() {
		LocalDate data = LocalDate.now();
		this.ano = data.getYear();
		this.mes = data.getMonthValue();
		this.dia = data.getDayOfMonth();
	}

	/**
	 * Método que adiciona determinada quantidade de dias em uma data
	 * 
	 * @param dias Quantidade de dias a ser adicionado
	 */
	public void adicionaDias(int dias) {

		boolean resposta = false;

		while (!resposta) {

			if ((this.dia + dias) <= DIASDOMES[this.mes]) {
				this.dia = this.dia + dias;
				resposta = true;

			} else {
				if (this.mes != 12) {

					dias = dias - (DIASDOMES[this.mes] - this.dia);
					this.dia = 0;
					this.mes = this.mes + 1;
				} else {
					dias = dias - (DIASDOMES[this.mes] - this.dia);
					this.dia = 0;
					this.mes = 1;
					this.ano++;
				}

			}

		}

	}

	/**
	 * Método que retorna a quantidade de dias em determinado mês
	 * 
	 * @return quantidade de dias no mês
	 */
	public int diasNoMes() {
		return DIASDOMES[this.mes];
	}

	/**
	 * Método que verifica o dia da semana de uma determinada data
	 * 
	 * @return o dia da semana
	 */
	public String diaDaSemana() {
		int deslocamento = 0;
		int totalDias = 0;
		int mesParaSomar = 1;

		while (mesParaSomar != this.mes) { 
			totalDias += DIASDOMES[mesParaSomar];
			mesParaSomar++;
		}

		totalDias += (this.dia - 1); 
		deslocamento = totalDias % 7; 

		return DIASDASEMANA[deslocamento];
	}

	/**
	 * Método que verifica se o ano é bissexto
	 * 
	 * @return true se o ano é bissexto
	 * @return false se o ano não é bissexto
	 */
	public boolean eAnoBissexto() {
		if (this.ano % 400 == 0) {
			return true;
		} else if (this.ano % 4 == 0 && this.ano % 100 != 0) {
			return true;
		}
		return false;
	}

	/**
	 * Método que adiciona um dia a data atual
	 */
	public void proximoDia() {
		if (this.dia + 1 > DIASDOMES[this.mes]) {
			if (this.mes == 12) {
				this.mes = 1;
				this.dia = 1;
				this.ano++;
			} else {
				this.mes++;
				this.dia = 1;
			}
		} else {
			this.dia++;
		}
	}

	/**
	 * Método que transcreve a data por extenso
	 * 
	 * @return string em formato dd/mm/yyyy
	 */
	public String porExtenso() {
		return (String.format("%02d", this.dia) + "/" + String.format("%02d", this.mes) + "/"
				+ String.format("%4d", this.ano));
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAno() {
		return ano;
	}
}
