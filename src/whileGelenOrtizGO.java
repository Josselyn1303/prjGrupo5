public class whileGelenOrtizGO {
    public static void imprimirLetraG(int tamano, char caracter) {
        System.out.println("Letra G");
        int i = 0;
        while (i < tamano) {
            int j = 0;
            while (j < tamano) {
                if ((i == 0 && j >= 0 && j < tamano) ||                         
                    (i == tamano / 2 && j >= 0 && j < tamano ) ||                
                    (j == 0 && i >= 0 && i < tamano) ||                         
                    ((i >= tamano / 2 || i == tamano - 1) && j == tamano - 1) || 
                    (i == tamano - 1 && j >= 0 && j < tamano)) {                
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
    public static void imprimirLetraO(int tamano2, char caracter2) {
        int i = 0;
        while (i < tamano2) {
            int j = 0;
            while (j < tamano2) {
                if ((i== 0 || i == tamano2 -1) && (j > 0 && j < tamano2 -1)) {
                    System.out.print(caracter2 + " ");
                } else if ((j == 0 || j == tamano2 - 1) && (i > 0 && i < tamano2 - 1)) {
                    System.out.print(caracter2 + " ");
                } else {
                    System.out.print("  ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
    public static void whileImprimirLetrasGO(int tamano, char caracter) {
        imprimirLetraG(tamano, caracter);
        System.out.println(); 
        imprimirLetraO(tamano, caracter);
    } 
    
}
