public class Teste {

    public static void main(String[] args) {
        try {

            Pessoa pessoa = new Pessoa("Laura", 20, "Rua Sueli Maximo de Matos, 47");
            pessoa.cadastrar();
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        } catch (PessoaException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
