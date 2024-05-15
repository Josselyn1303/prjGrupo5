
public class App {
    public static void main(String[] args) throws Exception {
        ForMateoM fm;
        ForMosqueraM fmm;
        WhileMateoM wh;
        WhileMosqueraM whm;
        DoWhileMateoM wd;
        DoWhileMosqueraM wdm;    

        fm = new ForMateoM();
        fmm = new ForMosqueraM();
        wh = new WhileMateoM();
        whm = new WhileMosqueraM();
        wd = new DoWhileMateoM();
        wdm = new DoWhileMosqueraM();

        fm.imprimirletraM(5);
        System.out.println("\n");
        fmm.imprimirletraM(5);
        System.out.println("\n");
        wh.whileletraM(5);
        System.out.println("\n");
        whm.whileletraM(5);
        System.out.println("\n");
        wd.dowhileletraM(5);
        System.out.println("\n");
        wdm.dowhileletraM(5);
    }
}
