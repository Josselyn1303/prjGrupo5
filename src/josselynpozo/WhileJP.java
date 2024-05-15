package josselynpozo;

public class WhileJP {
    public static void imprimirLetraJ(int tamano, char caracter) {
        System.out.println();
        int i = 0, j = 0;

        while (i++ < tamano) {
            System.out.print(caracter);
        }

        System.out.println();

        i = 0;

        while (i++ < (tamano - 2)) {
            while (j < (tamano - 1)) {
                if (j == tamano / 2) {
                    System.out.print(caracter);
                } else {
                    System.out.print('%');
                }
                j++;
            }
            j = 0;
            System.out.println();
        }

        i = 0;
        j = 0;

        while (i++ <= (tamano / 2)) {
            System.out.print(caracter);
        }
    }    

    public static void imprimirLetraP(int tamano2, char caracter2) {
        int i = 0;
        while (i < tamano2) {
            int j = 0;
            while (j < caracter2) {
                if (j == 0 || (i == 0 || i == tamano2 / 2) && j < caracter2 - 1)
                    System.out.print("%");
                else
                    System.out.print(" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void whileImprimirLetrasJP(int tamano, char caracter) {
        imprimirLetraJ(tamano, caracter);
        System.out.println(); 
        imprimirLetraP(tamano, caracter);
    } 
}
