public class DowhileJoseJ {
    public int filas;
    public int columnas;

    public DowhileJoseJ (int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
    }

    public void imprimir() {
        int i = 0;
        do {
            int j = 0;
            do {
                if (j == columnas / 2 || (i == filas - 1 && j <= columnas / 2) || (i == 0 && j != columnas / 2)) {
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