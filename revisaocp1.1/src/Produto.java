public class Produto {

    String nome;
    double preco;
    int quantidade;


    double calcularValorTotal(){
        return preco * quantidade;
    }

    void exibirInformacoes(){
        System.out.println("Sua compra de " + quantidade + " " + nome + " custa " + calcularValorTotal());
    }
}
