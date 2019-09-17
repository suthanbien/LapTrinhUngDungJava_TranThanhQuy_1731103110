package Tuan2;

import javax.swing.*;
import java.awt.*;

public class Bai4 extends JFrame {
    public Bai4(){
        super("DeMo Windows");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel pnBorder=new JPanel();
        pnBorder.setLayout(new BorderLayout());
        JPanel pnNorth=new JPanel();
        pnNorth.setBackground(Color.RED);
        pnBorder.add(pnNorth,BorderLayout.NORTH);
        JPanel pnsouth=new JPanel();
        pnsouth.setBackground(Color.RED);
        pnBorder.add(pnsouth,BorderLayout.SOUTH);
        JPanel pnWest=new JPanel();
        pnWest.setBackground(Color.BLUE);
        pnBorder.add(pnWest,BorderLayout.WEST);
        JPanel pnEast=new JPanel();
        pnEast.setBackground(Color.BLUE);
        pnBorder.add(pnEast,BorderLayout.EAST);
        JPanel pnCenter=new JPanel();
        pnCenter.setBackground(Color.YELLOW);
        pnBorder.add(pnCenter,BorderLayout.CENTER);
        getContentPane().add(pnBorder);

    }

    public static void main(String[] args) {
        Bai4 ui=new Bai4();
        ui.setSize(400,200);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
    }
}
