package Tuan3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lap2 {
    private JPanel pnMain;
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
    private JLabel lbHienThi;
    long a=0;
    private String phepToan="";

    public Lap2() {
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nhapSo(btn1);
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nhapSo(btn2);
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nhapSo(btn3);
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nhapSo(btn4);
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nhapSo(btn5);
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nhapSo(btn6);
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nhapSo(btn7);
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nhapSo(btn8);
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nhapSo(btn9);
            }
        });
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nhapSo(btn0);
            }
        });
        btnC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbHienThi.setText("0");
            }
        });
        btnChia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Long.parseLong(lbHienThi.getText());
                if(a!=0){
                phepToan="/";
                lbHienThi.setText("0");
                }
            }
        });
        btnNhan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Long.parseLong(lbHienThi.getText());
                if(a!=0){
                    phepToan="*";
                    lbHienThi.setText("0");
                }
            }
        });
        btnTru.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Long.parseLong(lbHienThi.getText());
                if(a!=0){
                    phepToan="-";
                    lbHienThi.setText("0");
                }
            }
        });
        btnCong.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Long.parseLong(lbHienThi.getText());
                if(a!=0){
                    phepToan="+";
                    lbHienThi.setText("0");
                }
            }
        });
        btnBang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(phepToan.length()>0){

                    if(phepToan.equals("+")){
                        long b=Long.parseLong(lbHienThi.getText());
                        long kq=a+b;
                        lbHienThi.setText(""+kq);
                    }
                    else if(phepToan.equals("-")){
                        long b=Long.parseLong(lbHienThi.getText());
                        long kq=a-b;
                        lbHienThi.setText(""+kq);
                    }
                    else if(phepToan.equals("*")){
                        long b=Long.parseLong(lbHienThi.getText());
                        long kq=a*b;
                        lbHienThi.setText(""+kq);
                    }
                    else if(phepToan.equals("/")){
                        long b=Long.parseLong(lbHienThi.getText());
                        long kq=a/b;
                        lbHienThi.setText(""+kq);
                    }
                    else if(phepToan.equals("%")){
                        double kq=((double)a/100);
                        lbHienThi.setText(""+kq);
                    }
                }
            }
        });
        btnSqrt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Long.parseLong(lbHienThi.getText());
                if(a>0){
                    lbHienThi.setText("" + Math.sqrt(a));
                }
            }
        });
        btn1Chiax.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Long.parseLong(lbHienThi.getText());
                if(a!=0){
                    double kq=1/(double) a;
                    lbHienThi.setText("" + kq);
                }

            }
        });
        btnPhanTram.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Long.parseLong(lbHienThi.getText());
                if(a!=0){
                    phepToan="%";
                    lbHienThi.setText(a+"%");
                }
            }
        });
        btnCongTru.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Long.parseLong(lbHienThi.getText());
                System.out.println(a);
                if(a!=0){
                    if(a>0){
                        lbHienThi.setText("-"+a);
                    }
                    else if(a<0){

                        lbHienThi.setText(""+(a*-1));
                    }
                }
            }
        });
    }
    public void nhapSo(JButton btn){
        try {
            String gt=lbHienThi.getText();
            if(gt.length()<12){
                if(gt.equals("0")){
                    gt="";
                }
                long so=Long.parseLong(gt+btn.getText());
                lbHienThi.setText(String.valueOf(so));
            }
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null,"Vui lòng xóa dữa liệu củ");
        }

    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Lap2().pnMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

    }
}
