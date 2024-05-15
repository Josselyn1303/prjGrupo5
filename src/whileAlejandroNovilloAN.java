public class whileAlejandroNovilloAN {

    public void imprimirWhileA(int tamanoAN) {
        char caracter = 219;
        System.out.println("--------------");
        System.out.println("      AN");
        System.out.println("--------------");
        int i = 0;
        while (i < tamanoAN) {
            int j = 0;
            while (j < tamanoAN) {
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
            }
            System.out.print(" ");
            int k = 0;
            while (k < tamanoAN) {
                if (k == 0 || k == tamanoAN - 1 || i == k) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
                k++;
            }
            System.out.println("");
            i++;
        }
        System.out.println("");
    }
}