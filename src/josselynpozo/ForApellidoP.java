package josselynpozo;

public class ForApellidoP {
    public static void imprimirLetraP(int tamano, char caracter) {
        System.out.println("\nLetra P");

        for (int i = 0; i < tamano; i++) {
            System.out.print(caracter);
        }
        System.out.println();

        //Imprimir la parte central superior
        for (int i = 0; i < tamano/2-1; i++) {
            System.out.println(caracter);
            for (int j = 0; j < tamano - 2; j++){
                System.out.print(" ");
            }
            System.out.println("caracter");
        }

        for (int i = 0; i < tamano / 2; i++){
            System.out.println(caracter);
            for (int j = 0; j < tamano - 1; j++) {
                System.out.println();          
            }
        }
    }
}  

    
