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

    public static final Color DEFAULT_BORDER = new Color(204, 204, 204);

    public static final Color PRIMARY_BACKGROUND = new Color(51, 122, 183);
    public static final Color PRIMARY_BORDER = new Color(46, 109, 164);

    public static final Color SUCCESS_BACKGROUND = new Color(92, 184, 92);
    public static final Color SUCCESS_BORDER = new Color(76, 174, 76);

    public static final Color INFO_BACKGROUND = new Color(91, 192, 222);
    public static final Color INFO_BORDER = new Color(70, 184, 218);

    public static final Color WARNNING_BACKGROUND = new Color(240, 173, 78);
    public static final Color WARNNING_BORDER = new Color(238, 162, 54);

    public static final Color DANGER_BACKGROUND = new Color(217, 83, 79);
    public static final Color DANGER_BORDER = new Color(212, 63, 58);

    public static JButton createDefaultButton(String text) {
        return createButton(text, Color.WHITE, Color.BLACK, DEFAULT_BORDER);
    }

    public static JButton createPrimaryButton(String text) {
        return createButton(text, PRIMARY_BACKGROUND, Color.WHITE, PRIMARY_BORDER);
    }

    public static JButton createSuccessButton(String text) {
        return createButton(text, SUCCESS_BACKGROUND, Color.WHITE, SUCCESS_BORDER);
    }

    public static JButton createInfoButton(String text) {
        return createButton(text, INFO_BACKGROUND, Color.WHITE, INFO_BORDER);
    }

    public static JButton createWarnningButton(String text) {
        return createButton(text, WARNNING_BACKGROUND, Color.WHITE, WARNNING_BORDER);
    }

    public static JButton createDangerButton(String text) {
        return createButton(text, DANGER_BACKGROUND, Color.WHITE, DANGER_BORDER);
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
