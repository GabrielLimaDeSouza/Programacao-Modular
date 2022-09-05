package Ex1;

public class Aplicacao {

	public static void main(String[] args) {
		Data data = new Data();
		System.out.println("Data criada: "+ data.porExtenso()+"\n");
		System.out.println("Verificando que dia da semana é o dia "+data.porExtenso()+": "+data.diaDaSemana()+"\n");
		data.adicionaDias(2);
		System.out.println("Adicionando dois dias: "+ data.porExtenso()+"\n");
		System.out.println("Quantidade de dias no mês "+ data.getMes() + " - "+ data.diasNoMes()+ " dias \n");
		System.out.println("Verificando se o ano "+ data.getAno()+ " é bissexto: "+data.eAnoBissexto()+"\n");
		Data dataBissexta = new Data(2024,10,10);
		System.out.println("Criando nova data "+dataBissexta.porExtenso()+"\n");
		System.out.println("Verificando se o ano "+ dataBissexta.getAno()+ " é bissexto: "+dataBissexta.eAnoBissexto());
	}

}
