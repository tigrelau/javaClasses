import java.util.Scanner;

public class TesteAtribuicaoCombinada {
     public static void main(String[] args){


         Scanner entrada = new Scanner(System.in);

         System.out.println("Informe o número da operação:");
         int numero = entrada.nextInt();

         float resultado = 2;

         resultado += numero;
         System.out.println("O resultado da operação de soma é " + resultado);

         resultado -= numero;
         System.out.println("O resultado da operação de subtração é " + resultado);

         resultado /= numero;
         System.out.println("O resultado da operação de divisão é " + resultado);

         resultado *= numero;
         System.out.println("O resultado da operação de multiplicação é " + resultado);

         resultado %= numero;
         System.out.println("O resultado da operação do módulo é " + resultado);

         entrada.close();
     }

}
