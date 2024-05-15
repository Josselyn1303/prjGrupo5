public class doWhileAlejandroA {

    public void imprimirDoWhileA(int tamanoA) {
        char caracter = 219;
        System.out.println("-------------");
        System.out.println("   Letra A");
        System.out.println("-------------");
        int i = 0;
        do {
            int j = 0;
            do {
                if (i == 0) {
                    if (j == tamanoA - 1) {
                        System.out.print(caracter);
                    } else {
                        System.out.print(caracter);
                    }
                } else if (i == tamanoA / 2) {
                    if (j == tamanoA - 1) {
                        System.out.print(caracter);
                    } else {
                        System.out.print(caracter);
                    }
                } else if (i != 0) {
                    if (j == 0) {
                        System.out.print(caracter);
                    } else if (j == tamanoA - 1) {
                        System.out.print(caracter);
                    } else {
                        System.out.print(" ");
                    }
                }
                j++;
            } while (j < tamanoA);
            System.out.println("");
            i++;
        } while (i < tamanoA);
        System.out.println("");
    }
}