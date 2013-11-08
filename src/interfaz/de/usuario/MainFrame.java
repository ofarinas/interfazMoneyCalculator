package interfaz.de.usuario;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Currency;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame{

    public MainFrame() throws HeadlessException {
    this.setTitle("Money Calculator");
    //this.setSize(300,500);
    this.setMinimumSize(new Dimension(300,300));
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
     createComponent();
     this.setVisible(true);
    }

    private void createComponent() {
        this.add(createToolbar(), BorderLayout.SOUTH);
        this.add(createContent());
    }

    private Component createToolbar() {
    JPanel toolbar=new JPanel();
    toolbar.setLayout(new FlowLayout(FlowLayout.RIGHT ));
    toolbar.add(createCalculatebutton());
    toolbar.add(createExitbutton());
    return toolbar;
    }

    private JButton createCalculatebutton() {
        JButton button = new JButton ("Calculate");
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                calculate();
            }
        });
        return button;
    }
    
    private JButton createExitbutton() {
        JButton button = new JButton ("Exit");
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                exit();
            }
        });
        return button;
    }

    public void exit(){
        dispose();
    }
    
    public void calculate(){
        System.out.println("Calculating...");
    }

    private JPanel createContent() {
        JPanel panel =new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel.add(new moneyPanel());
        panel.add(new CurrencyPanel());
        return panel;
    }
    
}
