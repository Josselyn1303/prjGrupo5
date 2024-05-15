import java.util.Scanner;

public class O_for {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar la altura al usuario
        System.out.print("Ingrese la altura de la letra 'O': ");
        int altura = scanner.nextInt();
        
        // Imprimir la letra 'O'
        for (int i = 0; i < altura; i++) {
            if (i == 0 || i == altura - 1) {
                // Imprimir la primera y última línea de 'O' (líneas horizontales superior e inferior)
                System.out.print(" ");
                for (int j = 0; j < altura - 2; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                // Imprimir las líneas intermedias de 'O' (líneas verticales de los lados)
                System.out.print("*");
                for (int j = 0; j < altura - 2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }

        scanner.close();
    }
}
