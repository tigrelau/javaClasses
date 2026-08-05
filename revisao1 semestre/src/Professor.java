public class Professor extends Pessoa{

    private String inscrição;


    public Professor(String nome, String inscrição, String email) {
        this.nome = nome;
        this.email = email;
        this.documento = documento;
        this.inscrição = inscrição;
    }


    public String getInscrição() {
        return inscrição;
    }

    public void setInscrição(String inscrição) {
        this.inscrição = inscrição;
    }

}
