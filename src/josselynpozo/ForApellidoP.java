package josselynpozo;

public class ForApellidoP {
    public static void imprimirLetraP(int tamano, char caracter) {
        System.out.println("\nLetra P - For");
            for (int i = 0; i < tamano; i++) {
        System.out.print("*");       
            }
        System.out.println();
        for (int i = 1; i <= tamano; i++) {
            for (int j = 1; j <= tamano; j++) {
                if (j == 1 || j == 1 || tamano/2==i || (j==tamano && i<=tamano/2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}  


    
