package metodosecante;


import javax.swing.JOptionPane;
import org.nfunk.jep.JEP;

/**
 *
 * @author davi
 */

public class JepExample {
    public static void main(String[] args) {
       JEP j = new JEP();
       j.addStandardConstants();
       j.addStandardFunctions();
       j.addVariable("x", 0);
       j.parseExpression("x^2/2");
       if (j.hasError()){
          JOptionPane.showMessageDialog(null, j.getErrorInfo());
       }
       JOptionPane.showMessageDialog(null, j.getValue());
    }  
}

