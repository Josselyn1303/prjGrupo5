package josselynpozo;

public class ForJP { 
    public class Main {

        public static void main(String[] args) {
            int tamano = 5; // Puedes ajustar el tamaño según tus necesidades
            char caracter = '#'; // Puedes cambiar el carácter según tus preferencias
    
            imprimirLetraJ(tamano, caracter);
            imprimirLetraP(tamano, caracter);
        }
    
        public static void imprimirLetraJ(int tamano, char caracter) {
            System.out.println("Letra J - For");
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
            System.out.println();
        }
    
        public static void imprimirLetraP(int tamano, char caracter) {
            System.out.println("\nLetra P - For");
            for (int i = 0; i < tamano; i++) {
                System.out.print("*");       
            }
            System.out.println();
            for (int i = 1; i <= tamano; i++) {
                for (int j = 1; j <= tamano; j++) {
                    if (j == 1 || j == 1 || tamano/2==i || (j==tamano && i<=tamano/2)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println(" ");
            }
        }

        public static void ForImprimirLetrasJP(int tamano, char caracter) {
            imprimirLetraJ(tamano, caracter);
            System.out.println(); 
            imprimirLetraP(tamano, caracter);
        } 
    }
}
      
    /*public static void imprimirLetraJ(int tamano, char caracter) {
        System.out.println("Letra JP - For");
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

        for (int i = 0; i < tamano; i++) {
            System.out.print("*");       
                }
            System.out.println();
            for (int i = 1; i <= tamano; i++) {
                for (int j = 1; j <= tamano; j++) {
                    if (j == 1 || j == 1 || tamano/2==i || (j==tamano && i<=tamano/2)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println(" ");
            }
        }

    public static void ForImprimirLetrasJP(int tamano, char caracter) {
        imprimirLetraJ(tamano, caracter);
        System.out.println(); 
        imprimirLetraP(tamano, caracter);
    } 
}*/

    
