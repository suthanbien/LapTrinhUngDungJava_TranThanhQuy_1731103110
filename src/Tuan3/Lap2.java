package Tuan3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lap2 {
    private JPanel pnMain;
    private JTextField txtKetQua;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btnChia;
    private JButton btnSqrt;
    private JButton btn4;
    private JButton btn7;
    private JButton btn0;
    private JButton btn5;
    private JButton btn6;
    private JButton btnNhan;
    private JButton btnPhanTram;
    private JButton btn8;
    private JButton btn9;
    private JButton btnTru;
    private JButton btn1Chiax;
    private JButton btnCongTru;
    private JButton btnC;
    private JButton btnCong;
    private JButton btnBang;
    private JPanel pnNut;

    public Lap2() {
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"hello bé Huyên");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tuan3");
        frame.setContentPane(new Lap2().pnMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

    }
}
