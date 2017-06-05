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
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;

public class Register extends JFrame {

	public Register() {
	    setTitle("REGISTER");
		setSize(450, 450);
		setLocationRelativeTo(null); //center frame in screen
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
        setAlwaysOnTop(true);

		JPanel contentPane = new JPanel(new GridBagLayout());
		contentPane.setBorder(BorderFactory.createEmptyBorder(5,20,5,20));
		setContentPane(contentPane);
		
		GridBagConstraints c = new GridBagConstraints();

		JLabel headLabel = new JLabel("MEMBER REGISTER");
		headLabel.setFont(new Font("",Font.BOLD, 20));
		headLabel.setHorizontalAlignment(JLabel.CENTER);
		
		c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1.0;
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(0,0,20,0);
        contentPane.add(headLabel, c);
		
		// user name panel
		JTextField userNameField = FieldFactory.createPlaceholderField("UserName");
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridy = 1;
		c.insets = new Insets(0,0,15,0);
		contentPane.add(userNameField, c);

		// password panel
        JPasswordField passwordField = FieldFactory.createPlaceholderPasswordField("Password");
		c.gridy = 2;
		contentPane.add(passwordField, c);
		
		JPasswordField confirmPasswordField = FieldFactory.createPlaceholderPasswordField("Confirm Password");
        c.gridy = 3;
        contentPane.add(confirmPasswordField, c);
        
        //gender combo
        JComboBox genderCombo = new JComboBox(new String[]{"Male", "FeMale"});
        c.gridy = 4;
        c.ipady = 20;
        contentPane.add(genderCombo, c);
        
        JButton btnSigin = ButtonFactory.createHyperLinkButton("SIGN IN");
        c.gridy = 5;
        c.ipady = 0;
        contentPane.add(btnSigin, c);

		// button 
		JButton btnSubmit = ButtonFactory.createPrimaryButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("SUBMIT");
            }
        });
		c.gridy = 6;
		c.ipady = 20;
		contentPane.add(btnSubmit, c);
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
		Register login = new Register();
		login.setVisible(true);
	}

}
