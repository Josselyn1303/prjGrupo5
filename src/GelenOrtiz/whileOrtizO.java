package GelenOrtiz;
public class whileOrtizO {
    public static void imprimirLetraO(int tamano2, char caracter2) {
        System.out.println("While: Letra O");
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
}
