public class whileNovilloN {

    public void imprimirWhileN(int tamanoN) {
        char caracter = 219;
        System.out.println("-------------");
        System.out.println("   Letra N");
        System.out.println("-------------");
        int i = 0;
        while (i < tamanoN) {
            int j = 0;
            while (j < tamanoN) {
                if (j == 0 || j == tamanoN - 1 || i == j) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println("");
            i++;
        }
        System.out.println("");
    }
}