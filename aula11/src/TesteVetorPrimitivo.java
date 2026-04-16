public class TesteVetorPrimitivo {
    public static void main(String[] args) {
        int[] numeros = new int[5];

        numeros[0]=1;
        numeros[1]=2;
        numeros[2]=3;
        numeros[3]=4;
        numeros[4]=5;

        for(int i =0; i < numeros.length; i++){
            if(numeros[i] == 4){
                numeros[i] = 10;
            }
            System.out.println("O valor do array numeros[" + i + "] é " + numeros[i]);
        }
        int[] numerosFixos = {5, 10, 20, 50, 60};

        for(int valor: numerosFixos){
            System.out.println("O valor do array é: " + valor);
        }
    }
}
