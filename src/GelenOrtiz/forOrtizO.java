package GelenOrtiz;
public class forOrtizO {
    public static void imprimirLetraO(int tamano, char caracter) {
        System.out.println("for: Letra O");
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
}
