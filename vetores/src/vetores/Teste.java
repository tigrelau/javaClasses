package vetores;
import java.util.ArrayList;
import java.util.List;

public class Teste {

    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<Produto>();
        produtos.add(new Produto("Caneta", 10, "Bic"));
        produtos.add(new Produto("Lapis", 5, "Faber Castel"));

        System.out.println("COM FOR");
        for(int i = 0; i < produtos.size() -1; i++){
            produtos.get(i).setPreco(100);
           System.out.println(produtos.get(i));
        }

        System.out.println("COM FOREACH");
        for (Produto produto : produtos){
            System.out.println(produtos);
        }
    }

}
