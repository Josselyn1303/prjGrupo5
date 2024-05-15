/* 
import java.util.Scanner;  

public class JO_while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  

        o
        System.out.print("Ingrese la altura de las letras 'J' y 'O': ");
        int altura = scanner.nextInt();

        int i = 0;
        while (i < altura) {
            
            if (i == 0) {
                
                int j = 0;
                while (j < altura - 1) {
                    System.out.print("*");
                    j++;
                }
                System.out.print("  ");  
            } else if (i == altura - 1) {
                
                System.out.print(" *");
                int j = 1;
                while (j < altura - 1) {
                    System.out.print(" ");
                    j++;
                }
                System.out.print("  ");  
            } else {
                
                int j = 0;
                while (j < altura - 1) {
                    System.out.print(" ");
                    j++;
                }
                System.out.print("*  ");  
            }

            
            if (i == 0 || i == altura - 1) {
                
                System.out.print(" ");
                int j = 0;
                while (j < altura - 2) {
                    System.out.print("*");
                    j++;
                }
            } else {
                System.out.print("*");
                int j = 0;
                while (j < altura - 2) {
                    System.out.print(" ");
                    j++;
                }
                System.out.print("*");
            }

            System.out.println();  
            i++;
        }

        
        scanner.close();
    }
}
