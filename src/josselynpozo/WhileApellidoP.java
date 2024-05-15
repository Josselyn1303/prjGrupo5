package josselynpozo;

public class WhileApellidoP {
    
    public static void imprimirLetraP(int tamano2, char caracter2) {
        System.out.println( " ");
        int i = 0;
        while (i < tamano2) {
            int j = 0;
            while (j < caracter2) {
                if (j == 0 || (i == 0 || i == tamano2 / 2) && j < caracter2 - 1)
                    System.out.print("=");
                else
                    System.out.print(" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

