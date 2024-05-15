import java.util.Scanner;

public class do__while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la altura de la letra 'O': ");
        int altura = scanner.nextInt();
        
        int i = 0;
        
        do {
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
            i++;
        } while (i < altura);

        scanner.close();
    }
}
