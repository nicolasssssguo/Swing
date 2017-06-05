import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;

public class FieldFactory {

    public static int MIN_WIDTH = 200;
    public static int MIN_HEIGHT = 50;
    public static int PADDING = 10;
    public static float MIN_FONT_SIZE = 18;

    public static JTextField createTextField() {
        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(MIN_WIDTH, MIN_HEIGHT));
        textField.setBorder(new CompoundBorder(BorderFactory.createLineBorder(ColorConstants.SILVER_GRAY, 2),
                BorderFactory.createEmptyBorder(PADDING, PADDING, PADDING, PADDING)));
        textField.setOpaque(false);
        textField.setFont(textField.getFont().deriveFont(MIN_FONT_SIZE));
        return textField;
    }

    public static JTextField createPlaceholderField(String placeHolder) {
        PlaceholderTextField textField = new PlaceholderTextField();
        textField.setPlaceholder(placeHolder);
        textField.setPreferredSize(new Dimension(MIN_WIDTH, MIN_HEIGHT));
        textField.setBorder(new CompoundBorder(BorderFactory.createLineBorder(ColorConstants.SILVER_GRAY, 2),
                BorderFactory.createEmptyBorder(PADDING, PADDING, PADDING, PADDING)));
        textField.setOpaque(false);
        textField.setFont(textField.getFont().deriveFont(MIN_FONT_SIZE));
        return textField;
    }

    public static JPasswordField createPasswordField() {
        JPasswordField passwordField = new JPasswordField();
        passwordField.setPreferredSize(new Dimension(MIN_WIDTH, MIN_HEIGHT));
        passwordField.setBorder(new CompoundBorder(BorderFactory.createLineBorder(ColorConstants.SILVER_GRAY, 2),
                BorderFactory.createEmptyBorder(PADDING, PADDING, PADDING, PADDING)));
        passwordField.setOpaque(false);
        passwordField.setFont(passwordField.getFont().deriveFont(MIN_FONT_SIZE));
        return passwordField;
    }
    
    public static JPasswordField createPlaceholderPasswordField(String placeHolder) {
        PlaceholderPasswordField passwordField = new PlaceholderPasswordField();
        passwordField.setPlaceholder(placeHolder);
        passwordField.setPreferredSize(new Dimension(MIN_WIDTH, MIN_HEIGHT));
        passwordField.setBorder(new CompoundBorder(BorderFactory.createLineBorder(ColorConstants.SILVER_GRAY, 2),
                BorderFactory.createEmptyBorder(PADDING, PADDING, PADDING, PADDING)));
        passwordField.setOpaque(false);
        passwordField.setFont(passwordField.getFont().deriveFont(MIN_FONT_SIZE));
        return passwordField;
    }
}
