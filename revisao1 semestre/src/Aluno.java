public class Aluno extends Pessoa{


    private String matricula;

    public Aluno(String nome, String documento, String email, String matricula) {
        this.nome = nome;
        this.documento = documento;
        this.email = email;
        this.matricula = matricula;
    }


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
