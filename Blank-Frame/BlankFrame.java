
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.*;

public class BlankFrame {
    public static void main(String[] args) throws InterruptedException {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight(); 
        JFrame f = new JFrame();
        f.setUndecorated(true);
        f.setBackground(new Color(0.1f, 0.1f, 0.1f, 0.1f));
      f.setSize((int)width,(int)height);
       f.setAlwaysOnTop(true);
       f.toFront();
        f.setVisible(true);
        //f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
       Thread.sleep(10000);


    
    }
}
