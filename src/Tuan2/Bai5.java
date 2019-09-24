package Tuan2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Bai5 {
    private JPanel pnMain;
    private JButton btnGiai;
    private JButton btnXoaTrang;
    private JButton btnThoat;
    private JPanel pnButon;
    private JPanel pnNhap;
    private JLabel lblTieuDe;
    private JTextField txtSoa;
    private JTextField txtSob;
    private JTextField txtSoc;
    private JTextField txtKetQua;

    public Bai5() {
        btnGiai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               try {
                   double a = Double.parseDouble(txtSoa.getText());
                   double b = Double.parseDouble(txtSob.getText());
                   double c = Double.parseDouble(txtSoc.getText());
                   String ketQua=giaiPTB2(a,b,c);
                   //JOptionPane.showMessageDialog(null,ketQua);
                   txtKetQua.setText(ketQua);
               }
               catch (Exception ex){
                   JOptionPane.showMessageDialog(null,"Vui Lòng Nhập Đủ Số");
               }
            }
        });
        btnThoat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnXoaTrang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            txtKetQua.setText("");
            txtSoa.setText("");
            txtSob.setText("");
            txtSoc.setText("");
            }
        });

    }
    public String giaiPTB2(double a, double b, double c) {
        double delta,x,x1,x2,canDelta;
        String kq;
        Scanner sc=new Scanner(System.in);
        if(a==0) {
             kq="hệ số a phải >0.";
            return kq;
        }
        else {
            delta = Math.pow(b,2)-4*a*c;
            if(delta<0) {
               kq="Phương trình vô nghiệm.";
                return kq;
            }
            if(delta==0) {
                x=-b/(2*a);
                kq="nghiệm kép: x ="+ x;
                return kq;
            }
            if(delta>0) {
                canDelta=Math.sqrt(delta);
                x1= (-b+canDelta)/(2*a);
                x2 = (-b-canDelta)/(2*a);
                kq="Phương trình có 2 nghiệm: x1= "+x1+"; x2= "+x2;
                return kq;
            }
            return "Error";
        }
    }
    public static void main(String[] args) {
        JFrame jFrame =new JFrame("Bai5");
        jFrame.setContentPane(new Bai5().pnMain);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setLocationRelativeTo(null);
    }



}
