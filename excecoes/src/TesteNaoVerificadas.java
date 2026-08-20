public class TesteNaoVerificadas {

    public static void main(String[] args) {
        try {
            int resultado = 10 / 1;
        } catch (ArithmeticException e) {
            System.out.println("Erro");
            e.printStackTrace();
        } finally {
            System.out.println("Finalizando...");
        }
    }
}
