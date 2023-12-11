import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Scanner;
import javax.swing.*;
public class MulFrames {
    public static void main(String[] args) throws InterruptedException {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        //double height = screenSize.getHeight();
        int x=0,y=0;
        JFrame frame[]= new JFrame[n];
        JLabel label[]= new JLabel[n];
        for(int i=0;i<n;i++){
            frame[i]= new JFrame("error");
            label[i]=new JLabel("Code: 700x40");
            frame[i].add(label[i]);
            frame[i].setSize(420, 210);
            if(i!=0)
            frame[i].setLocationRelativeTo(label[i-1]);
            frame[i].setVisible(true);
            frame[i].setLocation(x,y);
            frame[i].setAlwaysOnTop(true);
            frame[i].setVisible(true);
            x+=(int)(210*0.4);
            y+=(int)105*0.2;
            if(x+240>width){
               y-=40;
                x=0;
            }
            Thread.sleep(75);
            frame[i].setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            } 
            s.nextLine();
        String text = s.nextLine();
        if(text.equals(new String("exit"))){
            System.exit(0);
        }
        s.close();
    }
}
 /* NOTES xd
  Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
double width = screenSize.getWidth();
double height = screenSize.getHeight(); 





  */