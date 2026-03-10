import java.util.Scanner;

public class TesteOperador {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o número da operação:");
        int numero = entrada.nextInt();

        float resultado = 3;
        resultado = resultado + numero;

        System.out.println("O resultado da operação de soma é " + resultado);

        resultado = resultado - numero;

        System.out.println("O resultado da operação de subtração é " + resultado);

        resultado = resultado / numero;

        System.out.println("O resultado da operação de divisão é " + resultado);

        resultado = resultado * numero;

        System.out.println("O resultado da operação de multiplicação é " + resultado);


        resultado = resultado % numero;

        System.out.println("O resultado da operação de modulo é " + resultado);
        entrada.close();
    }

}

