package Ex2;

public class Aplicacao {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Gabriel", 12544525100L, 19, "Masculino");
		System.out.println("Criando a pessoa "+pessoa.getNome()+" de CPF "+pessoa.getCpf()+" com "+pessoa.getIdade()+ " anos e de sexo "+pessoa.getSexo());
		System.out.println(pessoa.getNome()+" é maior de idade? "+pessoa.eMaiorDeIdade()+"\n");
		Pessoa pessoaNova = new Pessoa("Vanessa", 42546875175L, 12, "Feminino");
		System.out.println("Criando a pessoa "+pessoaNova.getNome()+" de CPF "+pessoaNova.getCpf()+" com "+pessoaNova.getIdade()+ " anos e de sexo "+pessoaNova.getSexo());
		System.out.println(pessoaNova.getNome()+" é maior de idade? "+pessoaNova.eMaiorDeIdade());
		
	}
}
