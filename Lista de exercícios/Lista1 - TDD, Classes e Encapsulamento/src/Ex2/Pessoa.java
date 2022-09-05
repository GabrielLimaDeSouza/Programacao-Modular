package Ex2;

public class Pessoa {
    private String nome;
    private long cpf;
    private int idade;
    private String sexo;

    /**
     * Construtor da classe Pessoa
     * @param nome 
     * @param cpf
     * @param idade
     * @param sexo
     */
    public Pessoa(String nome, long cpf, int idade, String sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    /**
     * Método que verifica se a pessoa é maior de idade
     * @return true Se a pessoa é maior de idade
     * @return false Se a pessoa é menor de idade
     */
    public boolean eMaiorDeIdade() {
        if (this.idade >= 18) {
            return true;
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public long getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}