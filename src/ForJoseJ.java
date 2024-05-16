public class ForJoseJ {
    public int filas;
    public int columnas;

    public ForJoseJ (int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
    }

    public void imprimir() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (j == columnas / 2 || (i == filas - 1 && j <= columnas / 2) || (i == 0 && j != columnas / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}