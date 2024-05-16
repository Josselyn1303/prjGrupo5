package josselynpozo;

public class WhileNombreJ {
    public static void imprimirLetraJ(int tamano, char caracter) {
        System.out.println();
        System.out.println("Letra J - While");
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
}
   
