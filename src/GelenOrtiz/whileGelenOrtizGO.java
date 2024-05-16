package GelenOrtiz;
public class whileGelenOrtizGO {
    public static void whileImprimirLetrasGO(int tamano, char caracter) {
        System.out.println("While: Letras GO");
        int i = 0;
        while (i < tamano) {
            int j = 0;
            
            while (j < tamano) {
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
            }
            
            System.out.print("  ");
            j = 0;
            
            while (j < tamano) {
                if ((i == 0 || i == tamano - 1) && (j > 0 && j < tamano - 1)) {
                    System.out.print(caracter + " ");
                } else if ((j == 0 || j == tamano - 1) && (i > 0 && i < tamano - 1)) {
                    System.out.print(caracter + " ");
                } else {
                    System.out.print("  ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
