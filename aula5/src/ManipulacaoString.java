public class ManipulacaoString {

    public static void main (String [] args){

        String descricao = "A disciplina de Java é legal. ";

        descricao = descricao.concat("Isso mesmo!");

        if (descricao.contains("Java")) {
            System.out.println("tem Java");
        }

        descricao = descricao.toLowerCase();

        if (descricao.equals("A disciplina de Java é legal.  Isso mesmo!")); {
            System.out.println("o texto é igual");
        }

        if (descricao.equalsIgnoreCase("A disciplina de Java é legal.  Isso mesmo!")); {
            System.out.println("o texto é igual ignorando o case");
        }

        descricao = descricao.replace("legal", "top");


        System.out.println(descricao);

    }

}
