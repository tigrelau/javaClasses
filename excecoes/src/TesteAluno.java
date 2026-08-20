public class TesteAluno {

    public static void main(String[] args) {
        try {

            Aluno aluno = new Aluno("Carlos", "123456", 17);
            aluno.cadastrar();
            aluno.atualizar();
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        } catch (AlunoException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
