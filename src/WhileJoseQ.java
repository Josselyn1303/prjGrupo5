public class WhileJoseQ {
    public int filas;
    public int columnas;

    public WhileJoseQ(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
    }

    public void imprimir() {
        int i = 0;
        while (i < filas) {
            int j = 0;
            while (j < columnas) {
                if ((j == 0 || j == columnas - 1) && (i > 0 && i < filas - 1) || (i == 0 || i == filas - 1) && (j > 0 && j < columnas - 1) || (i >= filas / 2 && i < filas - 1) && (j >= columnas / 2 && j < columnas - 1 && j == i + columnas / 2 - filas / 2)) {
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