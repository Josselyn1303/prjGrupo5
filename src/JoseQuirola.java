import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el número de filas:");
        int filas = scanner.nextInt();
        System.out.println("Ingresa el número de columnas:");
        int columnas = scanner.nextInt();

        // Letra J
        System.out.println("Letra J:");
        imprimirLetraJ(filas, columnas);

        // Letra Q
        System.out.println("Letra Q:");
        imprimirLetraQ(filas, columnas);

        // Letras JQ
        System.out.println(" Letras JQ");
        imprimirLetrasJQ(filas, columnas);

        scanner.close();
    }

    public static void imprimirLetraJ(int filas, int columnas) {
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

    public static void imprimirLetraQ(int filas, int columnas) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if ((j == 0 || j == columnas - 1) && (i > 0 && i < filas - 1) || (i == 0 || i == filas - 1) && (j > 0 && j < columnas - 1) || (i >= filas / 2 && i < filas - 1) && (j >= columnas / 2 && j < columnas - 1 && j == i + columnas / 2 - filas / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void imprimirLetrasJQ(int filas, int columnas) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas * 2 + 1; j++) {
                if (j < columnas) {
                    if (j == columnas / 2 || (i == filas - 1 && j <= columnas / 2) || (i == 0 && j != columnas / 2)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else if (j == columnas) {
                    System.out.print(" ");
                } else {
                    if ((j == columnas + 1 || j == columnas * 2) && (i > 0 && i < filas - 1) || (i == 0 || i == filas - 1) && (j > columnas + 1 && j < columnas * 2) || (i >= filas / 2 && i < filas - 1) && (j >= columnas / 2 + 1 && j < columnas * 2 && j == i + columnas / 2 - filas / 2 + columnas)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
