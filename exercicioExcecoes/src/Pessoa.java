
public class Pessoa {
    String nome;
    int idade;
    String endereco;

    public Pessoa(String nome, int idade, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }
    public void cadastrar(){
        if (this.idade < 18) {
            throw new ParametroInvalidoException("Pessoa menor de idade!");
        }
        System.out.println("Pessoa cadastrada com sucesso!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}

