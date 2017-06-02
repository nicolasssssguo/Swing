import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	    setTitle("LOGIN");
		setSize(450, 450);
		setLocationRelativeTo(null); //center frame in screen
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
        setAlwaysOnTop(true);

		JPanel contentPane = new JPanel(new GridBagLayout());
		contentPane.setBorder(BorderFactory.createEmptyBorder(5,20,5,20));
		setContentPane(contentPane);
		
		GridBagConstraints c = new GridBagConstraints();

		JLabel headLabel = new JLabel("MEMBER LOGIN");
		headLabel.setFont(new Font("",Font.BOLD, 20));
		headLabel.setHorizontalAlignment(JLabel.CENTER);
		
		c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1.0;
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(0,0,20,0);
        contentPane.add(headLabel, c);
		
		// user name panel
		JTextField userNameField = new JTextField();
		JPanel userNamePane = createFieldPane("/user.png", userNameField);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridy = 1;
		c.insets = new Insets(0,0,15,0);
		contentPane.add(userNamePane, c);

		// password panel
        JPasswordField pwdField = new JPasswordField();
		JPanel passwordPane = createFieldPane("/lock.png", pwdField);
		c.gridy = 2;
		contentPane.add(passwordPane, c);

		// button 
		JButton btnLogin = ButtonFactory.createPrimaryButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("LOGIN");
            }
        });
		c.gridy = 3;
		c.ipady = 20;
		contentPane.add(btnLogin, c);
		
		JButton btnForget = ButtonFactory.createHyperLinkButton("Forget password?");
		btnForget.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Forget");
            }
        });
		c.ipady = 0;
		c.gridy = 4;
        contentPane.add(btnForget, c);
		
		c.gridy = 5;
		contentPane.add(new JSeparator(SwingConstants.HORIZONTAL), c);
		
		JButton btnReg = ButtonFactory.createSuccessButton("REGISTER");
		btnReg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("REGISTER");
            }
        });
		
		c.gridy = 6;
		c.ipady = 20;
		c.insets = new Insets(20,0,0,0);
		contentPane.add(btnReg, c);
	}
	
	private JPanel createFieldPane(String iconName, JComponent field){
		JPanel fieldPane = new JPanel();
		fieldPane.setLayout(new BoxLayout(fieldPane, BoxLayout.X_AXIS));
		fieldPane.setBorder(new CompoundBorder(BorderFactory.createLineBorder(ColorConstants.SILVER_GRAY,2), 
				BorderFactory.createEmptyBorder(10,10,10,10)));
		
		JLabel icon = new JLabel(SwingUtils.createImageIcon(iconName));
		icon.setPreferredSize(new Dimension(24, 24));
		fieldPane.add(icon);
		
		fieldPane.add(Box.createHorizontalStrut(10));
		JSeparator vSep = new JSeparator(SwingConstants.VERTICAL);
		vSep.setBackground(ColorConstants.SILVER_GRAY);
		fieldPane.add(vSep);
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
