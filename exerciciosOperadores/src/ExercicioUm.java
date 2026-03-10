import java.util.Scanner;

public class ExercicioUm {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int first = entrada.nextInt();

        System.out.println("Digite o segundo número:");
        int second = entrada.nextInt();

        int resultado = 0;
        resultado = first + second;

        System.out.println(first + " + " + second + " é igual a " + resultado);

        resultado = first - second;

        System.out.println(first + " - " + second + " é igual a " + resultado);

        resultado = first * second;

        System.out.println(first + " x " + second + " é igual a " + resultado);

        resultado = first / second;

        System.out.println(first + "/" + second + " é igual a " + resultado);

        resultado = first % second;

        System.out.println(first + " % " + second + " é igual a " + resultado);
    }

}
