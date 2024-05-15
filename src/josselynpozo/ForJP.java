package josselynpozo;

public class ForJP {

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
                    System.out.print("#");
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

        public static void imprimirLetraP(int tamano, char caracter) {
            System.out.println("\nLetra P");
        
            for (int i = 0; i < tamano; i++) {
                for (int j = 0; j < tamano; j++) {
                    if (j == 0 || (i == 0 || i == caracter / 2) && j < tamano - 1)
                        System.out.print("#");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }

    public static void ForImprimirLetrasJP(int tamano, char caracter) {
        imprimirLetraJ(tamano, caracter);
        System.out.println(); 
        imprimirLetraP(tamano, caracter);
    } 
}

    
