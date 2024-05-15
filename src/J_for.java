import java.util.Scanner;

public class J_for {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la altura de la letra 'J': ");
        int altura = scanner.nextInt();
        
        for (int i = 0; i < altura; i++) {
            if (i == 0) {
                
                for (int j = 0; j < altura - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else if (i == altura - 1) {
                System.out.print(" *");
                for (int j = 1; j < altura - 1; j++) {
                    System.out.print(" ");
                }
                System.out.println();
            } else {
                for (int j = 0; j < altura - 1; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }

        scanner.close();
    }
}
