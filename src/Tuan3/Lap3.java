package Tuan3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Lap3 {
    private JPanel pnMain;
    private JButton btn1;
    private JButton btn4;
    private JButton btn2;
    private JButton btn3;
    private JButton btn13;
    private JButton btn14;
    private JButton btn15;
    private JButton btn16;
    private JButton btn12;
    private JButton btn11;
    private JButton btn10;
    private JButton btn9;
    private JButton btn8;
    private JButton btn7;
    private JButton btn6;
    private JButton btn5;
    private JButton btnStart;

    public Lap3() {
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enBtn();
                ganSo();
                macDinh();
                win();
            }
        });
        btn16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            kiemTraBtn2ke(btn16,btn15,btn12);
            win();
            }
        });
        btn15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kiemTraBtn3ke(btn15,btn14,btn11,btn16);
                win();
            }
        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kiemTraBtn2ke(btn1,btn2,btn5);
                win();
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kiemTraBtn3ke(btn2,btn1,btn6,btn3);
                win();
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kiemTraBtn3ke(btn3,btn2,btn7,btn4);
                win();
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kiemTraBtn2ke(btn4,btn3,btn8);
                win();
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kiemTraBtn3ke(btn5,btn1,btn6,btn9);
                win();
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kiemTraBtn4ke(btn6,btn2,btn5,btn10,btn7);
                win();
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kiemTraBtn4ke(btn7,btn3,btn6,btn11,btn8);
                win();
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kiemTraBtn3ke(btn8,btn7,btn4,btn12);
                win();
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kiemTraBtn3ke(btn9,btn5,btn10,btn13);
                win();
            }
        });
        btn10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kiemTraBtn4ke(btn10,btn9,btn6,btn14,btn11);
                win();
            }
        });
        btn11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kiemTraBtn4ke(btn11,btn10,btn7,btn12,btn15);
                win();
            }
        });
        btn12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kiemTraBtn3ke(btn12,btn11,btn8,btn16);
                win();
            }
        });
        btn13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kiemTraBtn2ke(btn13,btn9,btn14);
                    win();
            }
        });
        btn14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kiemTraBtn3ke(btn14,btn13,btn10,btn15);
                win();
            }
        });
    }
    public void kiemTraBtn3ke(JButton buttonan, JButton button1, JButton button2,JButton button3){

        if(button1.getText().length()==0){
            button1.setText(buttonan.getText());
            button1.setBackground(null);
            buttonan.setText("");
            buttonan.setBackground(Color.CYAN);
        }
        if(button2.getText().length()==0){
            button2.setText(buttonan.getText());
            button2.setBackground(null);
            buttonan.setText("");
            buttonan.setBackground(Color.CYAN);
        }
        if(button3.getText().length()==0){
            button3.setText(buttonan.getText());
            button3.setBackground(null);
            buttonan.setText("");
            buttonan.setBackground(Color.CYAN);
        }

    }
    public  boolean checkWin(){
        if(btn1.getText().equals("1")&&btn2.getText().equals("2")&&btn3.getText().equals("3")&&
                btn4.getText().equals("4")&&btn5.getText().equals("5")&&btn6.getText().equals("6")&&
                btn7.getText().equals("7")&&btn8.getText().equals("8")&&btn9.getText().equals("9")&&
                btn10.getText().equals("10")&&btn11.getText().equals("11")&&btn12.getText().equals("12")&&
                btn13.getText().equals("13")&&btn14.getText().equals("14")&&btn15.getText().equals("15")&&
                btn16.getText().equals("")){
            return true;
        }
        else {
            return false;
        }
    }
    public void win(){
        if(checkWin()==true){
            JOptionPane.showInputDialog(null,"Chúc Mừng Bạn Chiến Thắng");
        }
    }
    public void kiemTraBtn2ke(JButton buttonan, JButton button1, JButton button2){

        if(button1.getText().length()==0){
            button1.setText(buttonan.getText());
            button1.setBackground(null);
            buttonan.setText("");
            buttonan.setBackground(Color.CYAN);
        }
        if(button2.getText().length()==0){
            button2.setText(buttonan.getText());
            button2.setBackground(null);
            buttonan.setText("");
            buttonan.setBackground(Color.CYAN);
        }
    }
    public void kiemTraBtn4ke(JButton buttonan, JButton button1, JButton button2,JButton button3,JButton button4){

        if(button1.getText().length()==0){
            button1.setText(buttonan.getText());
            button1.setBackground(null);
            buttonan.setText("");
            buttonan.setBackground(Color.CYAN);
        }
        if(button2.getText().length()==0){
            button2.setText(buttonan.getText());
            button2.setBackground(null);
            buttonan.setText("");
            buttonan.setBackground(Color.CYAN);
        }
        if(button3.getText().length()==0){
            button3.setText(buttonan.getText());
            button3.setBackground(null);
            buttonan.setText("");
            buttonan.setBackground(Color.CYAN);
        }
        if(button4.getText().length()==0){
            button4.setText(buttonan.getText());
            button4.setBackground(null);
            buttonan.setText("");
            buttonan.setBackground(Color.CYAN);
        }

    }
    public void tronMang(int[] ar) {

        Random rnd = ThreadLocalRandom.current();
        for (int i = ar.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);

            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }
    public void ganSo(){
        int []a={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        tronMang(a);
        int num1=a[1];
        btn1.setText(""+num1);

        int num2=a[2];
        btn2.setText(""+num2);

        int num3=a[3];
        btn3.setText(""+num3);

        int num4=a[4];
        btn4.setText(""+num4);

        int num5=a[5];
        btn5.setText(""+num5);

        int num6=a[6];
        btn6.setText(""+num6);

        int num7=a[7];
        btn7.setText(""+num7);

        int num8=a[8];
        btn8.setText(""+num8);

        int num9=a[9];
        btn9.setText(""+num9);

        int num10=a[10];
        btn10.setText(""+num10);

        int num11=a[11];
        btn11.setText(""+num11);

        int num12=a[12];
        btn12.setText(""+num12);

        int num13=a[13];
        btn13.setText(""+num13);

        int num14=a[14];
        btn14.setText(""+num14);

        int num15=a[0];
        btn15.setText(""+num15);
    }
    public void enBtn(){
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
        btn10.setEnabled(true);
        btn11.setEnabled(true);
        btn12.setEnabled(true);
        btn13.setEnabled(true);
        btn14.setEnabled(true);
        btn15.setEnabled(true);
        btn16.setEnabled(true);
    }
    public void macDinh(){
        btn1.setBackground(null);
        btn2.setBackground(null);
        btn3.setBackground(null);
        btn4.setBackground(null);
        btn5.setBackground(null);
        btn6.setBackground(null);
        btn7.setBackground(null);
        btn8.setBackground(null);
        btn9.setBackground(null);
        btn10.setBackground(null);
        btn11.setBackground(null);
        btn12.setBackground(null);
        btn13.setBackground(null);
        btn14.setBackground(null);
        btn15.setBackground(null);
        btn16.setBackground(Color.CYAN);
        btn16.setText("");
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Trò Chơi Xếp Ô Số");
        String titleName = JOptionPane.showInputDialog(null, "Nhập tên");
        frame.setTitle(titleName);
        frame.setContentPane(new Lap3().pnMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(450,450);
        frame.setLocationRelativeTo(null);
    }
}
