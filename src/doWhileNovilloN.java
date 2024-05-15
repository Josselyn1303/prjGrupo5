public class doWhileNovilloN {

    public void imprimirDoWhileN(int tamanoN) {
        char caracter = 219;
        System.out.println("-------------");
        System.out.println("   Letra N");
        System.out.println("-------------");
        int i = 0;
        do {
            int j = 0;
            do {
                if (j == 0 || j == tamanoN - 1 || i == j) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
                j++;
            } while (j < tamanoN);
            System.out.println("");
            i++;
        } while (i < tamanoN);
        System.out.println("");
    }
}