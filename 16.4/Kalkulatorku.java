// 16.4. Contoh Aplikasi Kalkulator Sederhana

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Kalkulatorku extends JFrame{
    private static JTextField tampilanTextField = new JTextField();
    private static String operant1 = "";
    private static String operant2 = "";
    private static String operatorDipilih = "";
    private static boolean setelahOperator = false;
    private JButton tombol1 = new JButton("1");
    private JButton tombol2 = new JButton("2");
    private JButton tombolTambah = new JButton("+");
    private JButton tombolSamaDengan = new JButton("=");
    private JPanel panelku = new JPanel();
    Dimension dimensi = Toolkit.getDefaultToolkit().getScreenSize();
    private int Jml=1;

    Kalkulatorku(){
        super("Aplikasi Kalkulatorku");
        panelku.setLayout(null);
        setSize(350,200);
        setLocation(dimensi.width/2-getWidth()/2,dimensi.height/2-getHeight()/2);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        /* Menambah TextField pada koordinat (X,Y,Lebar,Tinggi) */
        tampilanTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tampilanTextField.setEditable(false);
        tampilanTextField.setBounds(55,20,200,25);
        /* Menambah Button pada koordinat (X,Y,Lebar,Tinggi) */
        tombol1.setBounds(50,90,50,25);
        tombol2.setBounds(110,90,50,25);
        tombolTambah.setBounds(180,90,50,25);
        tombolSamaDengan.setBounds(240,90,50,25);
        /* Menambahkan Action Listener pada button */
        tombol1.addActionListener(new TombolHandler());
        tombol2.addActionListener(new TombolHandler());
        tombolTambah.addActionListener(new TombolHandler());
        tombolSamaDengan.addActionListener(new TombolHandler());
        /* Menambahakan TextField pada panel */
        panelku.add(tampilanTextField);
        /* Menambahakan button pada panel */
        panelku.add(tombol1);
        panelku.add(tombol2);
        panelku.add(tombolTambah);
        panelku.add(tombolSamaDengan);
        /* Menambahakan panel pada frame */
        getContentPane().add(panelku);
        setVisible(true);
    }
    
    private class TombolHandler implements ActionListener {
        public void actionPerformed(ActionEvent e){
            JButton tombol = (JButton)e.getSource();
            if (tombol.getText().equals("1")) {
                if (setelahOperator) {
                    tampilanTextField.setText("1");
                } else {
                    tampilanTextField.setText(tampilanTextField.getText()+"1");
                }
                setelahOperator = false;
            } else if (tombol.getText().equals("2")) {
                if (setelahOperator) {
                    tampilanTextField.setText("2");
                } else {
                    tampilanTextField.setText(tampilanTextField.getText()+"2");
                }
                setelahOperator = false;
            } else if (tombol.getText().equals("+")) {
                operant1 = tampilanTextField.getText();
                operatorDipilih = "+";
                setelahOperator = true;
            } else if (tombol.getText().equals("=")) {
                operant2 = tampilanTextField.getText();
                double operantPertama = 0;
                double operantKedua = 0;
                
                try {
                    operantPertama = Double.parseDouble(operant1);
                } catch (Exception ex) {
                }

                try {
                    operantKedua = Double.parseDouble(operant2);
                } catch (Exception ex) {
                }
                if (operatorDipilih == "+") {
                    tampilanTextField.setText(Double.toString(operantPertama+operantKedua));
                }
            }
        }
    }
    public static void main(String args[]){
        Kalkulatorku kalkulator = new Kalkulatorku();
    }
}