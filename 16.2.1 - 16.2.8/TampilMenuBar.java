// 16.2.7. JMenu

import javax.swing.*;
import java.awt.*;

public class TampilMenuBar extends JFrame{
    private JMenuBar MenuBar = new JMenuBar();
    private JMenu MenuMaster = new JMenu("Master Data");
    private JMenuItem MenuBarang = new JMenuItem("Barang"),
    MenuCustomer = new JMenuItem("Customer"),
    MenuUserAccount = new JMenuItem("User Account");
    private JMenu MenuTransaksi = new JMenu("Transaksi");
    private JMenuItem MenuPenjualan = new JMenuItem("Penjualan"),
    MenuPembelian = new JMenuItem("Pembelian");
    private JMenuItem MenuExit = new JMenuItem("Exit");
    Dimension dimensi = Toolkit.getDefaultToolkit().getScreenSize();

    TampilMenuBar(){
        super("Membuat Menu");
        setSize(350,300);
        setLocation(dimensi.width/2-getWidth()/2,dimensi.height/2-
        getHeight()/2);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        MenuMaster.add(MenuBarang);
        MenuMaster.add(MenuCustomer);
        MenuMaster.addSeparator();
        MenuMaster.add(MenuUserAccount);
        MenuBar.add(MenuMaster);
        MenuTransaksi.add(MenuPenjualan);
        MenuTransaksi.add(MenuPembelian);
        MenuBar.add(MenuTransaksi);
        MenuBar.add(MenuExit);
        setJMenuBar(MenuBar);
        setVisible(true);
    }
    public static void main(String args[]){
        TampilMenuBar frameku = new TampilMenuBar();
    }
}