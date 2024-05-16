

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
    

            ForNombreJosJ.imprimirLetraJ(6,'@');
            ForApellidoP.imprimirLetraP(6 , '-');
            ForJP.ForImprimirLetrasJP(6, '#');
            WhileNombreJ.imprimirLetraJ (6, '~');
            WhileApellidoP.imprimirLetraP (6, '=');
            WhileJP.whileImprimirLetrasJP (6, '%');
            DoWhileNombreJ.imprimirLetraJ(6, '°');
            DoWhileApellidoP.imprimirLetraP(6,'#');
            DoWhileJP.DoWhileImprimirLetrasJP(6, '+');
        

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
