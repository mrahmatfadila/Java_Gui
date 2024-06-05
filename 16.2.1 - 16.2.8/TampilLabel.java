// 16.2.3. JLabel

import javax.swing.*;
public class TampilLabel extends JFrame{
    private JPanel panelku = new JPanel();
    private static JLabel labelku = new JLabel("Label dengan Java");

    TampilLabel(){
        super("Membuat Label");
        panelku.setLayout(null);
        setSize(350,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        labelku.setBounds(60,20,160,25);
        panelku.add(labelku);
        getContentPane().add(panelku);
        setVisible(true);
    }
public static void main(String args[]){
        TampilLabel frameku = new TampilLabel();
    }
}