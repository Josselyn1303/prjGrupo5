package josselynpozo;

public class DoWhileApellidoP {
    public static void imprimirLetraP(int tamano, char caracter) {
        System.out.println();
        System.out.println("\nLetra P - Do-While");
        int i = 0;
        do {
            System.out.print("*");
            i++;
        } while (i < tamano);
        System.out.println();
        
        int j = 1;
        do {
            int k = 1;
            do {
                if (k == 1 || k == 1 || tamano/2 == j || (k == tamano && j <= tamano/2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                k++;
            } while (k <= tamano);
            System.out.println(" ");
            j++;
        } while (j <= tamano);
    }
    
}