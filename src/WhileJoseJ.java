public class WhileJoseJ {
    public int filas;
    public int columnas;

    public WhileJoseJ (int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
    }

    public void imprimir() {
        int i = 0;
        while (i < filas) {
            int j = 0;
            while (j < columnas) {
                if (j == columnas / 2 || (i == filas - 1 && j <= columnas / 2) || (i == 0 && j != columnas / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
    
}