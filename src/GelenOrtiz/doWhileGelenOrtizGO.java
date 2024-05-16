package GelenOrtiz;
public class doWhileGelenOrtizGO {
    public static void doWhileImprimirLetrasGO(int tamano, char caracter) {
        System.out.println("do While: Letras GO");
        int i = 0;
        do {
            int j = 0;
            do {
                if ((i == 0 && j >= 0 && j < tamano) ||                         
                    (i == tamano / 2 && j >= 0 && j < tamano) ||                
                    (j == 0 && i >= 0 && i < tamano) ||                         
                    ((i >= tamano / 2 || i == tamano - 1) && j == tamano - 1) || 
                    (i == tamano - 1 && j >= 0 && j < tamano)) {                
                    System.out.print(caracter + " ");
                } else {
                    System.out.print("  ");
                }
                j++;
            } while (j < tamano);
            System.out.print("  ");
            j = 0;
            do {
                if ((i == 0 || i == tamano - 1) && (j > 0 && j < tamano - 1)) {
                    System.out.print(caracter + " ");
                } else if ((j == 0 || j == tamano - 1) && (i > 0 && i < tamano - 1)) {
                    System.out.print(caracter + " ");
                } else {
                    System.out.print("  ");
                }
                j++;
            } while (j < tamano);

            System.out.println();
            i++;
        } while (i < tamano);
    }
}

