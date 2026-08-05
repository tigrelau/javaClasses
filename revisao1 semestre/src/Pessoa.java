public abstract class Pessoa {

    protected String nome;

    protected String documento;

    protected String email;

    public Pessoa() {

    }

    public Pessoa(String nome, String documento, String email) {
        this.nome = nome;
        this.documento = documento;
        this.email = email;
    }


    public void imprimirDados(){

        System.out.println("Dados da pessoa" + this.nome + " email " + this.email + " documento " + this.documento + " ");
    }

    public abstract void teste();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
