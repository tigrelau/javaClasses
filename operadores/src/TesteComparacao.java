import java.util.Scanner;

public class TesteComparacao {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int primeiro = entrada.nextInt();

        System.out.println("Digite o segundo número:");
        int segundo = entrada.nextInt();

        System.out.println("O resultado da comparação dos número utilizando o operador == é " + (primeiro == segundo));

        if(primeiro == segundo){
            System.out.println("é igual");
        } else {
            System.out.println("é diferente");
        }
        String resultadoTernario = (primeiro == segundo) ? "É igual" : "É diferente";

        System.out.println("O resultado da comparação dos número utilizando o operador != é " + (primeiro != segundo));
        System.out.println("O resultado da comparação dos número utilizando o operador >= é " + (primeiro >= segundo));
        System.out.println("O resultado da comparação dos número utilizando o operador <= é " + (primeiro <= segundo));
        System.out.println("O resultado da comparação dos número utilizando o operador > é " + (primeiro > segundo));
        System.out.println("O resultado da comparação dos número utilizando o operador < é " + (primeiro < segundo));


        if(primeiro == segundo && primeiro >= segundo) {
            System.out.println("As duas operações são verdadeiras");
        }

        if (primeiro != segundo || primeiro < segundo){
            System.out.println("Uma das expressões validadas é verdadeira");
        }

        if(!(primeiro == segundo)){
            System.out.println("Resultado invertido da comparação");
        }

        entrada.close();
    }
}
