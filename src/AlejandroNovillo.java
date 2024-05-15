public class AlejandroNovillo {

    public static void main(String[] args) {
    
        forAlejandroA fA = new forAlejandroA();
        fA.imprimirForA(7);
        forNovilloN fN = new forNovilloN();
        fN.imprimirForN(7);
        forAlejandroNovilloAN fAN = new forAlejandroNovilloAN();
        fAN.imprimirForAN(7);

        whileAlejandroA wA = new whileAlejandroA();
        wA.imprimirWhileA(7);
        whileNovilloN wN = new whileNovilloN();
        wN.imprimirWhileN(7);
        whileAlejandroNovilloAN wAN = new whileAlejandroNovilloAN();
        wAN.imprimirWhileA(7);

        doWhileAlejandroA dA = new doWhileAlejandroA();
        dA.imprimirDoWhileA(7);
        doWhileNovilloN dN = new doWhileNovilloN();
        dN.imprimirDoWhileN(7);
        doWhileAlejandroNovilloAN dAN = new doWhileAlejandroNovilloAN();
        dAN.imprimirDoWhileAN(7);
    }
}