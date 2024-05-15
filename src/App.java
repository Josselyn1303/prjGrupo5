

import josselynpozo.DoWhileApellidoP;
import josselynpozo.DoWhileJP;
import josselynpozo.DoWhileNombreJ;
import josselynpozo.ForApellidoP;
import josselynpozo.ForJP;
import josselynpozo.ForNombreJosJ;
import josselynpozo.WhileApellidoP;
import josselynpozo.WhileJP;
import josselynpozo.WhileNombreJ;

    public class App {
        public static void main(String[] args)throws Exception{

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
    

            ForNombreJosJ.imprimirLetraJ(7,'@');
            ForApellidoP.imprimirLetraP(7, '-');
            ForJP.ForImprimirLetrasJP(7, '#');
            WhileNombreJ.imprimirLetraJ (7, '~');
            WhileApellidoP.imprimirLetraP (7, '=');
            WhileJP.whileImprimirLetrasJP (7, '%');
            DoWhileNombreJ.imprimirLetraJ(7, '°');
            DoWhileApellidoP.imprimirLetraP(7,'#');
            DoWhileJP.DoWhileImprimirLetrasJP(7, '+');
        

            forGelenG.imprimirLetraG (7, '~');
            forOrtizO.imprimirLetraO (7, '*');
            forGelenOrtizGO.imprimirLetrasGO(7, '-');
            whileGelenG.imprimirLetraG (7, '~');
            whileOrtizO.imprimirLetraO (7, '*');
            whileGelenOrtizGO.whileImprimirLetrasGO (7, '?');
            doWhileGelenG.imprimirLetraG(7, '°');
            doWhileOrtizO.imprimirLetraO(7,'/');
            doWhileGelenOrtizGO.dWhileImprimirLetrasGO(7, '^');
        }
    }
