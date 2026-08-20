public class Aluno {

    private String nome;
    private String matricula;
    private int idade;

    public Aluno(String nome, String matricula, int idade) {
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
    }

    public void cadastrar(){
        if (this.idade < 18) {
            throw new ParametroInvalidoException("Aluno menor de idade!");
        }
        System.out.println("Aluno cadastrado com sucesso!");
    }

    public void atualizar() throws AlunoException {
        if (this.idade > 90 ) {
            throw new AlunoException("Aluno menor de idade!");
        }
        System.out.println("Aluno atualizado com sucesso!");
    }

    public String getNome() {
        return nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public int getIdade() {
        return idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}

