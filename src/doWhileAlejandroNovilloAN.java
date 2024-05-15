public class doWhileAlejandroNovilloAN {

    public void imprimirDoWhileAN(int tamanoAN) {
        char caracter = 219;
        System.out.println("--------------");
        System.out.println("      AN");
        System.out.println("--------------");
        int i = 0;
        do {
            int j = 0;
            do {
                if (i == 0) {
                    if (j == tamanoAN - 1) {
                        System.out.print(caracter);
                    } else {
                        System.out.print(caracter);
                    }
                } else if (i == tamanoAN / 2) {
                    if (j == tamanoAN - 1) {
                        System.out.print(caracter);
                    } else {
                        System.out.print(caracter);
                    }
                } else if (i != 0) {
                    if (j == 0) {
                        System.out.print(caracter);
                    } else if (j == tamanoAN - 1) {
                        System.out.print(caracter);
                    } else {
                        System.out.print(" ");
                    }
                }
                j++;
            } while (j < tamanoAN);
            System.out.print(" ");
            int k = 0;
            do {
                if (k == 0 || k == tamanoAN - 1 || i == k) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
                k++;
            } while (k < tamanoAN);
            System.out.println("");
            i++;
        } while (i < tamanoAN);
        System.out.println("");
    }
}