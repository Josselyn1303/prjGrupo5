public class DowhileJoseQ {
    public int filas;
    public int columnas;

    public DowhileJoseQ(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
    }
    public void imprimir() {
        int i = 0;
        do {
            int j = 0;
            do {
                if ((j == 0 || j == columnas - 1) && (i > 0 && i < filas - 1) || (i == 0 || i == filas - 1) && (j > 0 && j < columnas - 1) || (i >= filas / 2 && i < filas - 1) && (j >= columnas / 2 && j < columnas - 1 && j == i + columnas / 2 - filas / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                j++;
            } while (j < columnas);
            System.out.println();
            i++;
        } while (i < filas);
    }
}