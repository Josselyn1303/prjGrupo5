public class forAlejandroA {

    public void imprimirForA(int tamanoA) {
        char caracter = 219;
        System.out.println("-------------");
        System.out.println("   Letra A");
        System.out.println("-------------");
        for (int i = 0; i < tamanoA; i++){
            for (int j = 0; j < tamanoA; j++){
                if (i == 0){
                    if (j == tamanoA - 1){
                        System.out.print(caracter);
                    }else{
                    System.out.print(caracter);
                    }
                }else if (i == tamanoA / 2){
                    if (j == tamanoA - 1){
                        System.out.print(caracter);
                    }else{
                        System.out.print(caracter);
                    }
                }else if (i != 0){
                    if (j == 0){
                        System.out.print(caracter);
                    }else if (j == tamanoA - 1){
                        System.out.print(caracter);
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }
}