package josselynpozo;

public class DoWhileNombreJ {
        public static void imprimirLetraJ(int tamano, char caracter) {
        System.out.println();
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
                    System.out.print(' ');
                }
                j++;
            } while (j < (tamano - 1));
            System.out.println();
        } while (i++ < (tamano - 2));
    }
}
    
      
    