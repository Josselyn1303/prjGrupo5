package josselynpozo;

public class DoWhileJP {

    public static void imprimirLetraJ(int tamano, char caracter) {
        System.out.println();
        System.out.println( "Letra J");
        int i = 0, j = 0;
    
        do {
            System.out.print(caracter);
        } while (i++ < tamano);
    
        System.out.println();
    
        i = 0;
    
        do {
            j = 0;
            do {
                if (j == tamano / 2) {
                    System.out.print(caracter);
                } else {
                    System.out.print('+');
                }
                j++;
            } while (j < (tamano - 1));
            System.out.println();
        } while (i++ < (tamano - 2));
        i = 0;
        j = 0;

        while (i++ <= (tamano / 2)) {
            System.out.print(caracter);
        }
    }


    public static void imprimirLetraP(int tamano2, char caracter2) {
        System.out.println();
        System.out.println( "Letra P");
        int i = 0;
        do{
            int j = 0;
            do {
                if (j == 0 || (i == 0 || i == tamano2 / 2) && j < caracter2 - 1)
                    System.out.print("+");
                else
                    System.out.print(" ");
                j++;
            } while (j < caracter2);
            System.out.println();
            i++;
        } while (i < tamano2);
    }

    public static void DoWhileImprimirLetrasJP(int tamano, char caracter) {
        imprimirLetraJ(tamano, caracter);
        System.out.println(); 
        imprimirLetraP(tamano, caracter);
    } 
}

