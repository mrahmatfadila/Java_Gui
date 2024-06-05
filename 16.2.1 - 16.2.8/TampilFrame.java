// JFrame
import javax.swing.*;
public class TampilFrame extends JFrame{
    public TampilFrame(){
        super("Membuat Frame dengan JFrame");
        setSize(350,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
public static void main(String args[]){
        TampilFrame frameku = new TampilFrame();
    }
}