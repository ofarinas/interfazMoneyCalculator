/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz.de.usuario;

import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.PopupMenu;
import javax.swing.JComboBox;
import javax.swing.JPanel;

/**
 *
 * @author usuario
 */
public class CurrencyPanel extends JPanel{
public static final String []correncies={"EUR","USD","CAD","GBP"};
    public CurrencyPanel() {
     this.setLayout(new FlowLayout(FlowLayout.LEFT));
      this.add(createCombo());
    }

    private JComboBox createCombo() {
        JComboBox combo=new JComboBox(correncies);
        return combo;
    }

    
}
