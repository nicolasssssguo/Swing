import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;

public class Login extends JFrame {

    public Login() {
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel();
        setContentPane(contentPane);

        // user name panel
        JPanel userNamePane = new JPanel();
        userNamePane.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createEtchedBorder(EtchedBorder.LOWERED), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        contentPane.add(userNamePane);

        JLabel lbUsername = new JLabel(SwingUtils.createImageIcon("/user_24.png"));
        userNamePane.add(lbUsername);

        JSeparator sep = new JSeparator(SwingConstants.VERTICAL);
        sep.setPreferredSize(new Dimension(1,30));
        sep.setBackground(Color.WHITE);
        userNamePane.add(sep);

        JTextField userNameField = new JTextField();
        userNameField.setPreferredSize(new Dimension(200, 30));
        userNameField.setBorder(null);
        userNameField.setOpaque(false);
        userNamePane.add(userNameField);

        // password panel
        JPanel pwdPane = new JPanel();
        contentPane.add(pwdPane);
    }

    public static void main(String[] args) {
        Login login = new Login();
        login.setVisible(true);
    }

}
