public class forAlejandroNovilloAN {

    public void imprimirForAN(int tamano) {
        char caracter = 219;
        System.out.println("--------------");
        System.out.println("      AN");
        System.out.println("--------------");
        for (int i = 0; i < tamano; i++){
            for (int j = 0; j < tamano; j++){
                if (i == 0){
                    if (j == tamano - 1){
                        System.out.print(caracter);
                    }else{
                    System.out.print(caracter);
                    }
                }else if (i == tamano / 2){
                    if (j == tamano - 1){
                        System.out.print(caracter);
                    }else{
                        System.out.print(caracter);
                    }
                }else if (i != 0){
                    if (j == 0){
                        System.out.print(caracter);
                    }else if (j == tamano - 1){
                        System.out.print(caracter);
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.print(" ");
            for (int j = 0; j < tamano; j++){
                if (j == 0 || j == tamano - 1 || i == j) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }
}