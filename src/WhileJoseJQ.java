public class WhileJoseJQ {
    public int filas;
    public int columnas;

    public WhileJoseJQ(int filas, int columnas){
        this.filas = filas;
        this.columnas = columnas;
    }
        public void imprimir() {
            int i = 0;
            while (i < filas) {
            int j = 0;
            while (j < columnas * 2 + 1) {
                 if (j < columnas) {
                    if (j == columnas / 2 || (i == filas - 1 && j <= columnas / 2) || (i == 0 && j != columnas / 2)) {
                        System.out.print("*");
                     } else {
                        System.out.print(" ");
                    }
                } else if (j == columnas) {
                    System.out.print(" ");
                } else {
                    if ((j == columnas + 1 || j == columnas * 2) && (i > 0 && i < filas - 1) || (i == 0 || i == filas - 1) && (j > columnas + 1 && j < columnas * 2) || (i >= filas / 2 && i < filas - 1) && (j >=          columnas / 2 + 1 && j < columnas *   2 && j == i + columnas / 2 -          filas / 2 +  columnas)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

