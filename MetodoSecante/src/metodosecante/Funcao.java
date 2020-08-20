package metodosecante;

import javax.swing.JOptionPane;
import org.nfunk.jep.JEP;

public class Funcao {
    JEP j = new JEP();
    public Funcao(String def) {
        j.addVariable("x", 0);
        j.addStandardConstants();
        j.addStandardFunctions();
        j.setImplicitMul(true);
        j.parseExpression(def);
        if (j.hasError()) {
           JOptionPane.showMessageDialog(null, "Erro ao converter a função!");
        }  
    }
     
    public double eval(double x){
        double r;
        j.addVariable("x", x);
        r = j.getValue();
        if (j.hasError()) {
           JOptionPane.showMessageDialog(null, "Erro ao converter a função!");
        }
        return r;
    }
}
