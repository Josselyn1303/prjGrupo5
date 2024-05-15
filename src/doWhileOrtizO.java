public class doWhileOrtizO {
    public static void imprimirLetraO(int tamano2, char caracter2) {
        System.out.println("Letra O");
        int i = 0;
        do {
            int j = 0;
            do {
                if ((i== 0 || i == tamano2 -1)&& ( j > 0 && j < tamano2 -1 )) {
                    System.out.print(caracter2 + " ");
                } else if (( j == 0 || j == tamano2 - 1)&& ( i > 0 && i < tamano2 -1)){
                    System.out.print(caracter2 + " ");
                } else {
                    System.out.print("  ");
                }
                j++;
            } while (j < tamano2);
            System.out.println();
            i++;
        } while (i < tamano2);
    }
}
