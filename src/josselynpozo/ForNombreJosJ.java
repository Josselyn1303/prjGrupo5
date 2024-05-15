package josselynpozo;

public class ForNombreJosJ {
    public static void imprimirLetraJ(int tamano, char caracter) {
        System.out.println("Letra J");
        System.out.println();
        for (int i = 0; i < tamano ; i++){
            System.out.print(caracter);
        }
        System.out.println();

        for (int i = 0; i < tamano; i++) {
            for (int j = 0 ; j < tamano; j++) {
                if (j == tamano / 2) {
                    System.out.print("@");
                } else {
                    System.out.print(" ");
                }
            }
        System.out.println();
        }

        for (int i = 0; i <= tamano / 2; i++) {
            System.out.print(caracter);   
        }
    }
}
