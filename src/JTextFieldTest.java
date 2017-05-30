import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JTextFieldTest extends JFrame {
    
    public JTextFieldTest() {
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel contentPane = new JPanel();
        setContentPane(contentPane);
        
        JTextField field1 = new JTextField();
        field1.setPreferredSize(new Dimension(150,30));
        contentPane.add(field1);
        
        JTextField field2 = new JTextField();
        field2.setPreferredSize(new Dimension(250,30));
        contentPane.add(field2);
    }

    public static void main(String[] args) {
        JTextFieldTest test = new JTextFieldTest();
        test.setVisible(true);
    }

}
