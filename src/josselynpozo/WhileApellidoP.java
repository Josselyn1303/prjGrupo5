package josselynpozo;

public class WhileApellidoP {
    
    public static void imprimirLetraP(int tamano, char caracter) {
        System.out.println();
        System.out.println("Letra P - While");
        int i = 0;
        while (i < tamano) {
            System.out.print("*");
            i++;
        }
        System.out.println();
        
        int j = 1;
        while (j <= tamano) {
            int k = 1;
            while (k <= tamano) {
                if (k == 1 || k == 1 || tamano/2 == j || (k == tamano && j <= tamano/2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                k++;
            }
            System.out.println(" ");
            j++;
        }
    }
}    

