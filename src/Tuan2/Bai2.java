package Tuan2;

import javax.swing.*;
import java.awt.*;

public class Bai2 extends JFrame {
    public Bai2(){
        super("DeMo Windows");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel pnFlow=new JPanel();
        pnFlow.setLayout(new FlowLayout());
        pnFlow.setBackground(Color.PINK);
        JButton btn1 =new JButton("FlowLayout");
        JButton btn2 =new JButton("Add các Control");
        JButton btn3 =new JButton("Trên 1 dòng");
        JButton btn4 =new JButton("Hết chổ chứa");
        JButton btn5 =new JButton("Thì xuống dòng");
        pnFlow.add(btn1);
        pnFlow.add(btn2);
        pnFlow.add(btn3);
        pnFlow.add(btn4);
        pnFlow.add(btn5);
        Container con=getContentPane();
        con.add(pnFlow);

    }

    public static void main(String[] args) {
        Bai2 ui=new Bai2();
        ui.setSize(400,200);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
    }
}
