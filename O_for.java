/* 
import java.util.Scanner;

public class O_for {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la altura de la letra 'O': ");
        int altura = scanner.nextInt();
        
        for (int i = 0; i < altura; i++) {
            if (i == 0 || i == altura - 1) {
                System.out.print(" ");
                for (int j = 0; j < altura - 2; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
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
