package interfaz.de.usuario;

import java.awt.FlowLayout;
import java.awt.PopupMenu;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author usuario
 */
public class moneyPanel extends JPanel{

    public moneyPanel() {
    this.setLayout(new FlowLayout(FlowLayout.LEFT));
    this.add(createTexfild());
    this.add(new CurrencyPanel());
    }

    private JTextField createTexfild() {
        JTextField jtex=new JTextField(10);
         return jtex;
    }
    
}
