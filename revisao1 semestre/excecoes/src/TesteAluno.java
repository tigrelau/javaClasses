public class TesteAluno {

    public static void main(String[] args) {
        try {

            Aluno aluno = new Aluno("Carlos", "123456", 17);
            aluno.cadastrar();
            aluno.atualizar();
        } catch (IllegalArgumentException e) {

        } catch (AlunoException e) {

        } catch (Exception e) {

        }
    }
}
