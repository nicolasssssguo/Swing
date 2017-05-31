import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

import javax.swing.Action;
import javax.swing.DefaultButtonModel;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.border.Border;

public class PrimaryButton extends JButton {
	
	private Color background = new Color(91, 192, 222);
	
	public PrimaryButton() {
        super(null, null);
    }

    public PrimaryButton(Icon icon) {
    	super(null, icon);
    }

    public PrimaryButton(String text) {
    	super(text, null);
    }

    public PrimaryButton(Action a) {
    	super();
        setAction(a);
    }

    public PrimaryButton(String text, Icon icon) {
        // Create the model
        setModel(new DefaultButtonModel());

        // initialize
        init(text, icon);
    }
    
    @Override
    protected void paintComponent(Graphics g) {
    	//g.setColor(this.background);
    	Graphics2D g2 = (Graphics2D) g.create();
    	g2.setPaint(this.background);
    	int radius = 15;
    	g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
    	
    	FontMetrics font = g2.getFontMetrics();
    	int x = (getWidth() - font.stringWidth(getText())) / 2;
    	int y = (getHeight() + font.getAscent()) / 2;
    	g2.setPaint(Color.WHITE);
    	g2.drawString(getText(), x, y);
    }
	
	@Override
	protected void paintBorder(Graphics g) {
		if (isBorderPainted()) {
			Border roundedBorder = new RoundedBorder(15);
			g.setColor(this.background);
			roundedBorder.paintBorder(this, g, 0, 0, getWidth(), getHeight());
		}
	}
	
}
