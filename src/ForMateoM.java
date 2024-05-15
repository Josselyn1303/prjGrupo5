public class ForMateoM {
    public void imprimirletraM (int n){
        String b = "\u001B[0m";
        String verde= "\033[32m";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j==0 || j == n-1 || (i == j && j <= n / 2) || (i + j == n-1 && j >= n/2 )) {
                    System.out.print(verde+ "+ " +verde);
                }
                else{
                    System.out.print(b+ "  " +b );
                }
            }
            System.out.println(b+"");

        }
    }
}