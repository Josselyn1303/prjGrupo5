public class ForMateoMosqueraMM {
    public void imprimirletraMM(int n) {
        String b = "\u001B[0m";
        String verde = "\033[32m";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Imprime la primera letra 'M'
                if (j == 0 || j == n - 1 || (i == j && j <= n / 2) || (i + j == n - 1 && j >= n / 2)) {
                    System.out.print(verde + "+ " + verde);
                } else {
                    System.out.print(b + "  " + b);
                }
            }

            System.out.print("  ");

            for (int j = 0; j < n; j++) {
                // Imprime la segunda letra 'M'
                if (j == 0 || j == n - 1 || (i == j && j <= n / 2) || (i + j == n - 1 && j >= n / 2)) {
                    System.out.print(verde + "+ " + verde);
                } else {
                    System.out.print(b + "  " + b);
                }
            }

            System.out.println(b + "");
        }
        System.out.println("======================");

    }
}
