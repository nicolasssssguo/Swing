import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
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

		JPanel contentPane = new JPanel(new GridLayout(3, 1));
		setContentPane(contentPane);

		// user name panel
		JPanel userNamePane = new JPanel();
		userNamePane.setBorder(BorderFactory.createCompoundBorder(
		        BorderFactory.createEtchedBorder(EtchedBorder.LOWERED), BorderFactory.createEmptyBorder(0, 5, 0, 5)));
		contentPane.add(userNamePane);

		JLabel lbUsername = new JLabel(SwingUtils.createImageIcon("/user_24.png"));
		userNamePane.add(lbUsername);

		JSeparator sep = new JSeparator(SwingConstants.VERTICAL);
		sep.setPreferredSize(new Dimension(1, 30));
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

		// button panel
		JPanel btnPane = new JPanel(new BorderLayout());
		contentPane.add(btnPane);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBorder(new RoundedBorder(15));
		btnPane.add(btnLogin);
	}

	public static void main(String[] args) {
		Login login = new Login();
		login.setVisible(true);
	}

}
