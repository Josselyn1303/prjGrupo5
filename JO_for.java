
/*
import java.util.Scanner;

public class JO_for {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la altura de las letras 'J' y 'O': ");
        int altura = scanner.nextInt();
        
        if (altura < 3) {
            System.out.println("La altura debe ser al menos 3 para formar las letras 'J' y 'O'.");
            return;
        }
        
        for (int i = 0; i < altura; i++) {
            if (i == 0) {
                for (int j = 0; j < altura - 1; j++) {
                    System.out.print("*");
                }
                System.out.print("  ");  
            } else if (i == altura - 1) {
              
                System.out.print(" *");
                for (int j = 1; j < altura - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("  ");  
            } else {
                
                for (int j = 0; j < altura - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*  ");  
            }

            if (i == 0 || i == altura - 1) {
                System.out.print(" ");
                for (int j = 0; j < altura - 2; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int j = 0; j < altura - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();  
        }

        scanner.close();
    }
}
