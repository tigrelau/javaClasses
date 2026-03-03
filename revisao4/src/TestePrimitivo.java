public class TestePrimitivo {
    public static void main(String[] args){

        byte idade = 127;
        System.out.println("A idade é " + idade);

        short ano = 2024;
        System.out.println("O ano é " + ano);

        //ano = idade;
        //System.out.println("O ano alterado é " + ano);

        idade = (byte) ano;
        System.out.println("A idade com cast é " + idade);

    }
}
