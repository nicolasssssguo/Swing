import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;

public class Login extends JFrame {

	public Login() {
		setSize(450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel contentPane = new JPanel(new GridBagLayout());
		contentPane.setBorder(BorderFactory.createEmptyBorder(5,35,5,35));
		setContentPane(contentPane);
		
		GridBagConstraints c = new GridBagConstraints();

		// user name panel
		JTextField userNameField = new JTextField();
		JPanel userNamePane = createFieldPane("/user_24.png", userNameField);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 1.0;
		c.gridx = 0;
		c.gridy = 0;
		contentPane.add(userNamePane, c);

		// password panel
        JPasswordField pwdField = new JPasswordField();
		JPanel passwordPane = createFieldPane("/lock_24.png", pwdField);
		c.gridy = 1;
		contentPane.add(passwordPane, c);

		// button 
		JButton btnLogin = new JButton("Log in");
		btnLogin.setFont(new Font("", Font.BOLD, 20));
		c.gridy = 2;
		contentPane.add(btnLogin, c);
	}
	
	private JPanel createFieldPane(String iconName, JComponent field){
		JPanel fieldPane = new JPanel();
		fieldPane.setLayout(new BoxLayout(fieldPane, BoxLayout.X_AXIS));
		fieldPane.setBorder(new CompoundBorder(BorderFactory.createEtchedBorder(), 
				BorderFactory.createEmptyBorder(10,10,10,10)));

		JLabel icon = new JLabel(SwingUtils.createImageIcon(iconName));
		icon.setPreferredSize(new Dimension(24, 24));
		fieldPane.add(icon);
		
		fieldPane.add(Box.createHorizontalStrut(10));
		fieldPane.add(new JSeparator(SwingConstants.VERTICAL));
		fieldPane.add(Box.createHorizontalStrut(10));

		field.setBorder(null);
		field.setOpaque(false);
		fieldPane.add(field);
		
		return fieldPane;
	}

	public static void main(String[] args) {
		Login login = new Login();
		login.setVisible(true);
	}

}
