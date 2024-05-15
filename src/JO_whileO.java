/*
 import java.util.Scanner;  

public class JO_whileO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  

        System.out.print("Ingrese la altura de la letra 'O': ");
        int altura = scanner.nextInt();

        if (altura < 3) {
            System.out.println("La altura debe ser al menos 3 para formar la letra 'O'.");
            return;
        }

        int i = 0;
        while (i < altura) {
            if (i == 0 || i == altura - 1) {
                
                System.out.print(" ");
                int j = 0;
                while (j < altura - 2) {
                    System.out.print("*");
                    j++;
                }
                System.out.println();
            } else {

                System.out.print("*");
                int j = 0;
                while (j < altura - 2) {
                    System.out.print(" ");
                    j++;
                }
                System.out.println("*");
            }
            i++;
        }

        scanner.close();
    }
}
