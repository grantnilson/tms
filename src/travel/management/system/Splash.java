package travel.management.system;
import javax.swing.*; 
import java.awt.*; 

public class Splash extends JFrame {
    Splash() {
        setSize(1200, 600); 
        setLocation(200,100); 
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Splash.jpg")); 
        Image i2 = i1.getImage().getScaledInstance(1200, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
        JLabel image = new JLabel(i3); 
        add(image); 
        
        
        setVisible(true); 
    }
    
   public static void main (String [] args) {
       new Splash(); 
       
   }
}
