public class DoWhileMateoM {
    public void dowhileletraM(int n) {
        String b = "\u001B[0m";
        String verde= "\033[32m";
        System.out.println("Letra M con el DoWhile");
        int i = 0;
        do {
            int j = 0;
            do{
            if (j==0 || j == n-1 || (i == j && j <= n / 2) || (i + j == n-1 && j >= n/2 )) {
                System.out.print(verde+ "+ " +verde);
            }
            else{
                System.out.print(b+ "  " +b );
            }
            j++;
        } while (j < n);
        System.out.println(b+ "");
        i++;
        
    } while(i < n);
    }
}
