import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.font.TextAttribute;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class ButtonFactory {

    public static JButton createDefaultButton(String text) {
        return createButton(text, Color.WHITE, Color.BLACK, ColorConstants.SILVER_GRAY);
    }

    public static JButton createPrimaryButton(String text) {
        return createButton(text, ColorConstants.PRIMARY_BACKGROUND, Color.WHITE, ColorConstants.PRIMARY_BORDER);
    }

    public static JButton createSuccessButton(String text) {
        return createButton(text, ColorConstants.SUCCESS_BACKGROUND, Color.WHITE, ColorConstants.SUCCESS_BORDER);
    }

    public static JButton createInfoButton(String text) {
        return createButton(text, ColorConstants.INFO_BACKGROUND, Color.WHITE, ColorConstants.INFO_BORDER);
    }

    public static JButton createWarnningButton(String text) {
        return createButton(text, ColorConstants.WARNNING_BACKGROUND, Color.WHITE, ColorConstants.WARNNING_BORDER);
    }

    public static JButton createDangerButton(String text) {
        return createButton(text, ColorConstants.DANGER_BACKGROUND, Color.WHITE, ColorConstants.DANGER_BORDER);
    }

    public static JButton createButton(String text, Color backgroud, Color foreground, Color cBorder) {
        JButton button = new JButton(text);
        button.setForeground(foreground);
        button.setBackground(backgroud);
        Border line = new LineBorder(cBorder);
        Border margin = new EmptyBorder(5, 15, 5, 15);
        Border compound = new CompoundBorder(line, margin);
        button.setBorder(compound);
        return button;
    }
    
    public static JButton createHyperLinkButton(String text){
        final JButton button = new JButton(text);
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
        button.setFocusPainted(false);
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setCursor(new Cursor(Cursor.HAND_CURSOR));
                HashMap<TextAttribute, Object> textAttrMap = new HashMap<TextAttribute, Object>();
                textAttrMap.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
                button.setFont(button.getFont().deriveFont(textAttrMap));
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                button.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                HashMap<TextAttribute, Object> textAttrMap = new HashMap<TextAttribute, Object>();
                textAttrMap.put(TextAttribute.UNDERLINE, null);
                button.setFont(button.getFont().deriveFont(textAttrMap));
            }
        });
        return button;
    }
}
