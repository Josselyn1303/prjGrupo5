public class DoWhileMateoMosqueraMM {
    public void dowhileletraMM(int n) {
        String b = "\u001B[0m";
        String verde = "\033[32m";
        
        int i = 0;
        do {
            int j = 0;
            do {
                if (j == 0 || j == n - 1 || (i == j && j <= n / 2) || (i + j == n - 1 && j >= n / 2)) {
                    System.out.print(verde + "+ " + verde);
                } else {
                    System.out.print(b + "  " + b);
                }
                j++;
            } while (j < n);
            
            System.out.print("  ");
            
            j = 0;
            do {
                if (j == 0 || j == n - 1 || (i == j && j <= n / 2) || (i + j == n - 1 && j >= n / 2)) {
                    System.out.print(verde + "+ " + verde);
                } else {
                    System.out.print(b + "  " + b);
                }
                j++;
            } while (j < n);
            
            System.out.println(b + "");
            i++;
        } while (i < n);
        System.out.println("======================");

    }
}
