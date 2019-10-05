package HocTrongLop;

import javax.swing.*;

public class Tuan4Bai1 {
    private JPanel pnMain;
    private JTextField btnName;
    private JTextField btnAddress;
    private JRadioButton radMale;
    private JRadioButton radFeMale;
    private JCheckBox checkJaVa;
    private JCheckBox checkPython;
    private JComboBox cbSubject;
    private JButton btnSave;
    private JButton btnReset;


    public Tuan4Bai1() {
        ButtonGroup btg=new ButtonGroup();
        btg.add(radFeMale);
        btg.add(radMale);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tuan4Bai1");
        frame.setContentPane(new Tuan4Bai1().pnMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
