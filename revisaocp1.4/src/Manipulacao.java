import java.util.Scanner;

public class Manipulacao {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma frase:");

        String frase = entrada.nextLine();

        System.out.println("Frase em letras maiúsculas: " + frase.toUpperCase());

        // A quantidade de caracteres (incluindo espaços).
        System.out.println("Quantidade de caracteres: " + frase.length());

        // Se a frase contém a palavra "Java" (ignorando maiúsculas/minúsculas).
        boolean contemJava = frase.toLowerCase().contains("java");
        System.out.println("Contém a palavra 'Java'? " + (contemJava ? "Sim" : "Não"));

        // A frase invertida.
        String fraseInvertida = new StringBuilder(frase).reverse().toString();
        System.out.println("Frase invertida: " + fraseInvertida);



        entrada.close();

    }
}
