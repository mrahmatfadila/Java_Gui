import javax.swing.*;

public class TampilComboBox extends JFrame {
    final static String Pilihan[] = {"Pilihan ke-1", "Pilihan ke-2", "Pilihan ke-3"};
    private JPanel panelku = new JPanel();
    private static JComboBox<String> comboBox = new JComboBox<>(Pilihan);

    TampilComboBox() {
        super("Membuat ComboBox");
        panelku.setLayout(null);
        setSize(350, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        comboBox.setBounds(90, 70, 150, 25);
        panelku.add(comboBox);
        getContentPane().add(panelku);
        setVisible(true);
    }

    public static void main(String args[]) {
        TampilComboBox frameku = new TampilComboBox();
        comboBox.addItem("Pilihan Tambahan");
        comboBox.removeItem("Pilihan ke-2");
    }
}
