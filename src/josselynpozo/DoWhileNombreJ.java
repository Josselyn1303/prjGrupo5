package josselynpozo;

    public class DoWhileNombreJ {
        public static void imprimirLetraJ(int tamano, char caracter) {
            System.out.println();
            System.out.println("Letra J - Do-While");
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
    }
    
    
      
    