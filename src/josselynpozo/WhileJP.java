package josselynpozo;

public class WhileJP {
    public static void imprimirLetraJ(int tamano, char caracter) {
        System.out.println();
        System.out.println("Letra JP - While");
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
                    System.out.print(' ');
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
            System.out.println( " ");
            
            int i = 0;
        while (i < tamano2) {
            System.out.print("*");
            i++;
        }
        System.out.println();
        
        int j = 1;
        while (j <= tamano2) {
            int k = 1;
            while (k <= tamano2) {
                if (k == 1 || k == 1 || tamano2/2 == j || (k == tamano2 && j <= tamano2/2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                k++;
            }
            System.out.println(" ");
            j++;
        }
    }


    public static void whileImprimirLetrasJP(int tamano, char caracter) {
        imprimirLetraJ(tamano, caracter);
        System.out.println(); 
        imprimirLetraP(tamano, caracter);
    } 
}
