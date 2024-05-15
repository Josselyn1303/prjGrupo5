public class forGelenOrtizGO {
    
    public static void imprimirLetraG(int tamano, char caracter) {
        System.out.println("Letra G- for");
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                if ((i == 0 && j >= 0 && j < tamano) ||                         
                    (i == tamano / 2 && j >= 0 && j < tamano ) ||                
                    (j == 0 && i >= 0 && i < tamano) ||                         
                    ((i >= tamano / 2 || i == tamano - 1) && j == tamano - 1) || 
                    (i == tamano - 1 && j >= 0 && j < tamano)) {                
                    System.out.print(caracter + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void imprimirLetraO(int tamano, char caracter) {
        System.out.println("Letra O- for");
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                if ((i == 0 || i == tamano - 1) && (j > 0 && j < tamano - 1)) {
                    System.out.print(caracter + " ");
                } else if ((j == 0 || j == tamano - 1) && (i > 0 && i < tamano - 1)) {
                    System.out.print(caracter + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
        

    public static void imprimirLetrasGO(int tamano, char caracter) {
        imprimirLetraG(tamano, caracter);
        System.out.println(); 
        imprimirLetraO(tamano, caracter);
    } 
}
