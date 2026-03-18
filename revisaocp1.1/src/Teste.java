public class Teste {

    public static void main(String[] args){

        Produto Blush = new Produto();
        Blush.nome = "Rare Beauty Soft Pinch Blush";
        Blush.preco = 199.0;
        Blush.quantidade = 5;

        Blush.calcularValorTotal();
        Blush.exibirInformacoes();

    }

}
