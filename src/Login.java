import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.plaf.metal.MetalButtonUI;

public class Login extends JFrame {

	public Login() {
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel contentPane = new JPanel(new GridLayout(4, 1));
		setContentPane(contentPane);

		// user name panel
		JPanel userNamePane = new JPanel(new BorderLayout());
		userNamePane.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		contentPane.add(userNamePane);

		JLabel lbUsername = new JLabel(SwingUtils.createImageIcon("/user_24.png"));
		lbUsername.setBorder(BorderFactory.createEmptyBorder(0,0,0,10));
		userNamePane.add(lbUsername, BorderLayout.WEST);

		JTextField userNameField = new JTextField();
		userNameField.setBorder(BorderFactory.createEtchedBorder());
		userNameField.setOpaque(false);
		userNamePane.add(userNameField, BorderLayout.CENTER);

		// password panel
		JPanel pwdPane = new JPanel(new BorderLayout());
		pwdPane.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		contentPane.add(pwdPane);
		
		JLabel lbPwd = new JLabel(SwingUtils.createImageIcon("/lock_24.png"));
        lbPwd.setBorder(BorderFactory.createEmptyBorder(0,5,0,10));
        pwdPane.add(lbPwd, BorderLayout.WEST);
        
        JPasswordField pwdField = new JPasswordField();
        pwdField.setBorder(BorderFactory.createEtchedBorder());
        pwdField.setOpaque(false);
        pwdPane.add(pwdField, BorderLayout.CENTER);
		
	      // register panel
        JPanel regPane = new JPanel();
        contentPane.add(regPane);

		// button panel
		JPanel btnPane = new JPanel(new BorderLayout());
		btnPane.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		contentPane.add(btnPane);
		
		JButton btnLogin = new JButton("Login");
		//btnLogin.setUI(new PrimaryButtonUI());
		btnLogin.setPreferredSize(new Dimension(200, 40));
		btnPane.add(btnLogin);
	}

	public static void main(String[] args) {
		Login login = new Login();
		login.setVisible(true);
	}

}
