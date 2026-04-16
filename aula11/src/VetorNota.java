public class VetorNota {
    public static void main(String[] args) {
        double[] notas = {7.5, 3.2, 9.0, 6.7, 5.8};

        double totalNotas = 0;

        for(double nota : notas){
            totalNotas = totalNotas + nota;
        }

        double media = totalNotas / notas.length;

        System.out.println(media);

    }
}
