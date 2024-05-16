package josselynpozo;

public class DoWhileJP {

    public static void imprimirLetraJ(int tamano, char caracter) {
        System.out.println("\nLetras JP - Do-While");
        System.out.println();
        int i = 0, j;

        do {
            System.out.print(caracter);
            i++;
        } while (i < tamano);

        System.out.println();

        i = 0;

        do {
            j = 0;
            do {
                if (j == tamano / 2) {
                    System.out.print(caracter);
                } else {
                    System.out.print(' ');
                }
                j++;
            } while (j < tamano - 1);
            System.out.println();
            i++;
        } while (i < tamano - 2);

        i = 0;

        do {
            System.out.print(caracter);
            i++;
        } while (i <= tamano / 2);
    }

    public static void imprimirLetraP(int tamano, char caracter) {
        System.out.println();
        int i = 0;
            do {
                System.out.print("*");
                i++;
            } while (i < tamano);
            System.out.println();
            
            int j = 1;
            do {
                int k = 1;
                do {
                    if (k == 1 || k == 1 || tamano/2 == j || (k == tamano && j <= tamano/2)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    k++;
                } while (k <= tamano);
                System.out.println(" ");
                j++;
            } while (j <= tamano);
        }

    public static void DoWhileImprimirLetrasJP(int tamano, char caracter) {
        imprimirLetraJ(tamano, caracter);
        System.out.println(); 
        imprimirLetraP(tamano, caracter);
    } 
}

