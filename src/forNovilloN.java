public class forNovilloN {

    public void imprimirForN(int tamanoN) {
        char caracter = 219;
        System.out.println("-------------");
        System.out.println("   Letra N");
        System.out.println("-------------");
        for (int i = 0; i < tamanoN; i++){
            for (int j = 0; j < tamanoN; j++){
                if (j == 0 || j == tamanoN - 1 || i == j) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }
}