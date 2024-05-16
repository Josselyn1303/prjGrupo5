import GelenOrtiz.doWhileGelenG;
import GelenOrtiz.doWhileGelenOrtizGO;
import GelenOrtiz.doWhileOrtizO;
import GelenOrtiz.forGelenG;
import GelenOrtiz.forGelenOrtizGO;
import GelenOrtiz.forOrtizO;
import GelenOrtiz.whileGelenG;
import GelenOrtiz.whileGelenOrtizGO;
import GelenOrtiz.whileOrtizO;

public class App {
    public static void main(String[] args) throws Exception {
        
        forGelenG.imprimirLetraG (7, '~');
        forOrtizO.imprimirLetraO (7, '*');
        forGelenOrtizGO.imprimirLetrasGO (7, '-');
        whileGelenG.imprimirLetraG (7, '~');
        whileOrtizO.imprimirLetraO (7, '*');
        whileGelenOrtizGO.whileImprimirLetrasGO (7, '?');
        doWhileGelenG.imprimirLetraG(7, '°');
        doWhileOrtizO.imprimirLetraO(7,'/');
        doWhileGelenOrtizGO.doWhileImprimirLetrasGO(7, '^');
    }
}
