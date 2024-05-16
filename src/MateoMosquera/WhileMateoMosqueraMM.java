public class WhileMateoMosqueraMM {
    public void whileletraMM(int n) {
        String b = "\u001B[0m";
        String verde = "\033[32m";

        int i = 0;
        while (i < n) {
            int j = 0;
            while (j < n) {
                if (j == 0 || j == n - 1 || (i == j && j <= n / 2) || (i + j == n - 1 && j >= n / 2)) {
                    System.out.print(verde + "+ " + verde);
                } else {
                    System.out.print(b + "  " + b);
                }
                j++;
            }

            System.out.print("  ");

            j = 0;
            while (j < n) {
 
                if (j == 0 || j == n - 1 || (i == j && j <= n / 2) || (i + j == n - 1 && j >= n / 2)) {
                    System.out.print(verde + "+ " + verde);
                } else {
                    System.out.print(b + "  " + b);
                }
                j++;
            }

            System.out.println(b + "");
            i++;
        }
    }
}