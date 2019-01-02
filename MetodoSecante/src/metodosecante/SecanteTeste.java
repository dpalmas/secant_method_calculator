package metodosecante;

import javax.swing.JOptionPane;

/**
 *
 * @author davi
 */

public class SecanteTeste {
    public static void main(String[] args) {
       Funcao f = new Funcao("sin(x)*x");
       Secante s = new Secante();
       JOptionPane.showMessageDialog(null, s.raiz(f, 1, 2, 100, 1e-6));
    }   
}
