
package resoluçãotela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResoluçãoTela {

    public static void main(String[] args) {
        Toolkit tela = Toolkit.getDefaultToolkit();
        Dimension d = tela.getScreenSize();
        System.out.println("A resolução da tela é " + d.width + " X " + d.height);
    }
    
}
