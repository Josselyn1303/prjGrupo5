public class whileAlejandroA {

    public void imprimirWhileA(int tamanoA) {
        char caracter = 219;
        System.out.println("-------------");
        System.out.println("   Letra A");
        System.out.println("-------------");
        int i = 0;
        while (i < tamanoA) {
            int j = 0;
            while (j < tamanoA) {
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
            }
            System.out.println("");
            i++;
        }
        System.out.println("");
    }
}