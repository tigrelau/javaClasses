import java.sql.SQLOutput;

public class Teste {

    static void main() {
        Aluno aluno = new Aluno("Aluno 1", "123456", "laurafofatigrinha@teste.com","123456");
        aluno.imprimirDados();

        Professor professor = new Professor("Professor 1", "426389", "professorteste@teste.com");
        professor.imprimirDados();

        Pessoa pessoa = new Pessoa("pessoa", "123455", "pessoa@teste.com");
        pessoa.imprimirDados();

        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.somar(1,2));
        System.out.println(calculadora.somar(2.0,1));
    }

}
