import java.util.Scanner; 
public class JustinOrtiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Ingrese la altura: ");
        int altura = scanner.nextInt();

        int i = 0;
        while (i < altura - 1) {
            System.out.println("     *");
            i++;
        }

        int j = 0;
        while (j < 2) {
            if (j == 0) {
                System.out.print("  *");
            }
            System.out.print("*");
            j++;
        }
        System.out.println(); 

        
        scanner.close();
    }
}
