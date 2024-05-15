package josselynpozo;

public class DoWhileApellidoP {
    public static void imprimirLetraP(int tamano2, char caracter2) {
        System.out.println("\nLetra P");
        int i = 0;
        do{
            int j = 0;
            do {
                if (j == 0 || (i == 0 || i == tamano2 / 2) && j < caracter2 - 1)
                    System.out.print("#");
                else
                    System.out.print(" ");
                j++;
            } while (j < caracter2);
            System.out.println();
            i++;
        } while (i < tamano2);
    }
}