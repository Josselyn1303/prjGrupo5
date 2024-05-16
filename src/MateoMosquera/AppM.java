
public class AppM {
    public static void main(String[] args) throws Exception {
        ForMateoM fm;
        ForMosqueraM fmm;
        ForMateoMosqueraMM fmmm;
        WhileMateoM wh;
        WhileMosqueraM whm;
        WhileMateoMosqueraMM wmmm;
        DoWhileMateoM wd;
        DoWhileMosqueraM wdm;  
        DoWhileMateoMosqueraMM dwmm;

        fm = new ForMateoM();
        fmm = new ForMosqueraM();
        fmmm = new ForMateoMosqueraMM(); 
        wh = new WhileMateoM();
        whm = new WhileMosqueraM();
        wmmm = new WhileMateoMosqueraMM();
        wd = new DoWhileMateoM();
        wdm = new DoWhileMosqueraM();
        dwmm = new DoWhileMateoMosqueraMM();


        fm.imprimirletraM(5);
        System.out.println("\n");
        fmm.imprimirletraM(5);
        System.out.println("\n");
        fmmm.imprimirletraMM(5);
        System.out.println("\n");
        wh.whileletraM(5);
        System.out.println("\n");
        whm.whileletraM(5);
        System.out.println("\n");
        wmmm.whileletraMM(5);
        System.out.println("\n");
        wd.dowhileletraM(5);
        System.out.println("\n");
        wdm.dowhileletraM(5);
        System.out.println("\n");
        dwmm.dowhileletraMM(5);
    }
}
