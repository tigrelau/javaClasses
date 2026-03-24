import java.util.Scanner;

public class MaiorValor {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int primeiro = entrada.nextInt();

        System.out.println("Digite o segundo número");
        int segundo = entrada.nextInt();

        int resultado = 0;

        resultado = primeiro + segundo;
        System.out.println( primeiro + " + " + segundo + " = " + resultado);

        resultado = primeiro - segundo;
        System.out.println(primeiro + " - " + segundo + " = " + resultado);

        resultado = primeiro * segundo;
        System.out.println(primeiro + " x " + segundo + " = " + resultado);

        resultado = primeiro / segundo;
        System.out.println(primeiro + "/" + segundo + " = " + resultado);
        
    }
}
