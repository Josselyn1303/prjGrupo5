import java.util.Scanner;

public class dowhile_j {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la altura de la letra 'J': ");
        int altura = scanner.nextInt();
        
        if (altura < 3) {
            System.out.println("La altura debe ser al menos 3 para formar la letra 'J'.");
            return;
        }
        
        int i = 0;
        
        do {
            if (i == 0) {
                for (int j = 0; j < altura - 1; j++) {
                    System.out.print("*");
                }
            } else if (i == altura - 1) {
                System.out.print(" *");
                for (int j = 1; j < altura - 1; j++) {
                    System.out.print(" ");
                }
            } else {
                for (int j = 0; j < altura - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();  
            i++;
        } while (i < altura);

        scanner.close();
    }
}
