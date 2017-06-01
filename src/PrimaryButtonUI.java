import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.AbstractButton;
import javax.swing.JComponent;
import javax.swing.plaf.ButtonUI;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicButtonUI;

public class PrimaryButtonUI extends BasicButtonUI {
    
    private static final PrimaryButtonUI buttonUI = new PrimaryButtonUI();
    private Color background = new Color(91, 192, 222);
    
    PrimaryButtonUI() {
    }

    public static ComponentUI createUI(JComponent c){
        return new PrimaryButtonUI();
    }
    
    @Override
    public Dimension getPreferredSize(JComponent c) {
        return new Dimension(200, 40);
    }
    
    @Override
    public void paint(Graphics g, JComponent c) {
       // super.paint(g, c);
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setPaint(this.background);
        int radius = 15;
        g2.fillRoundRect(0, 0, c.getWidth(), c.getHeight(), radius, radius);
        g2.dispose();
    }
    
    @Override
    protected void paintText(Graphics g, AbstractButton b, Rectangle textRect, String text) {
        // TODO Auto-generated method stub
        super.paintText(g, b, textRect, text);
    }
    
}
