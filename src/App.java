

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
    

            ForNombreJosJ.imprimirLetraJ(7,'@');
            ForApellidoP.imprimirLetraP(7, '-');
            ForJP.ForImprimirLetrasJP(7, '#');
            WhileNombreJ.imprimirLetraJ (7, '~');
            WhileApellidoP.imprimirLetraP (7, '=');
            WhileJP.whileImprimirLetrasJP (7, '%');
            DoWhileNombreJ.imprimirLetraJ(7, '°');
            DoWhileApellidoP.imprimirLetraP(7,'#');
            DoWhileJP.DoWhileImprimirLetrasJP(7, '+');
        }
    }
