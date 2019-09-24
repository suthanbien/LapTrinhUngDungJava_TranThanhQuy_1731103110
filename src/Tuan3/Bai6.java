package Tuan3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bai6 {
    private JPanel pnMain;
    private JButton btnGiai;
    private JButton btnXoa;
    private JButton btnThoat;
    private JTextField txtSoa;
    private JTextField txtSob;
    private JTextField txtKetQua;
    private JRadioButton radCong;
    private JRadioButton radNhan;
    private JRadioButton radTru;
    private JRadioButton radChia;
    private JPanel pnMau;

    public Bai6() {
        ButtonGroup group=new ButtonGroup();
        group.add(radCong);group.add(radTru);
        group.add(radNhan);group.add(radChia);

        btnThoat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ret=JOptionPane.showConfirmDialog(null, "Muốn thoát hả?", "Thoát", JOptionPane.YES_NO_OPTION);
                if(ret==JOptionPane.YES_OPTION)
                    System.exit(0);
            }
        });
        btnXoa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSob.setText("");
                txtSoa.setText("");
                txtKetQua.setText("");
            }
        });
        btnGiai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sa=txtSoa.getText();
                int a=0,b=0;
                try
                {
                    a=Integer.parseInt(sa);
                }
                catch(Exception ex)
                {
                    JOptionPane.showMessageDialog(null, "Nhập sai định dạng!");
                    txtSoa.selectAll();
                    txtSoa.requestFocus();
                    return;
                }
                String sb=txtSob.getText();
                try
                {
                    b=Integer.parseInt(sb);
                }
                catch(Exception ex)
                {
                    JOptionPane.showMessageDialog(null, "Nhập sai định dạng!");
                    txtSob.selectAll();
                    txtSob.requestFocus();
                    return;
                }
                double kq=0;
                if(radCong.isSelected())
                {
                    kq=(a+b);
                }
                else if(radTru.isSelected())
                {
                    kq=(a-b);
                }
                else if(radNhan.isSelected())
                {
                    kq=(a*b);
                }
                else
                {
                    kq=a*1.0/b*1.0;
                }
                txtKetQua.setText(kq+"");

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bài 6");
        frame.setContentPane(new Bai6().pnMain);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
