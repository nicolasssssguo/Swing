import javax.swing.ImageIcon;

public class SwingUtils {
    
    /**
     * 
     * @param iconName the name of the icon
     * @return
     */
    public static ImageIcon createImageIcon(String iconName){
        return new ImageIcon(SwingUtils.class.getResource(iconName));
    }

}
