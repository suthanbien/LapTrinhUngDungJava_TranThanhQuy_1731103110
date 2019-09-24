package Tuan3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class Bai7 {
    private JPanel pnMain;
    private JButton btnToDenChan;
    private JButton btnToDenLe;
    private JButton btnToDenNguyenTo;
    private JButton btnBoToDen;
    private JButton btnXoaGiaTriToDen;
    private JButton btnTongGiaTri;
    private JButton btnDong;
    private JButton btnNhap;
    private JTextField txtNhap;
    private JCheckBox checkNhapAm;
    private JList jlSo;
    private JScrollPane jscp;
    DefaultListModel listModel =new DefaultListModel<>();
    

    public Bai7() {

        jlSo.setModel(listModel);


        btnNhap.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nhapSo();
            }
        });
        btnToDenChan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toDenChan();
            }
        });
        btnToDenLe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toDenLe();
            }
        });
        btnToDenNguyenTo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toDenSoNguyenTo();
            }
        });
        btnBoToDen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlSo.clearSelection();
            }
        });
        btnXoaGiaTriToDen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(jlSo.isSelectionEmpty()==false){
                    for(int i=0;i<listModel.size()+5;i++){
                        int index = jlSo.getSelectedIndex();
                        System.out.println(""+index);
                        if(index >= 0){
                            listModel.removeElementAt(index);
                        }
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null,"Bạn chưa chọn mục để xóa");
                }
            }
        });
        btnTongGiaTri.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Tổng giá trị trong list là: "+listModel.size());
            }
        });
        btnDong.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ret=JOptionPane.showConfirmDialog(null, "Muốn thoát hả?", "Thoát", JOptionPane.YES_NO_OPTION);
                if(ret==JOptionPane.YES_OPTION)
                    System.exit(0);
            }
        });
    }


    public void nhapSo(){
        try{
            int n=Integer.parseInt(txtNhap.getText());
            if(checkNhapAm.isSelected()){
                listModel.addElement(n);
                txtNhap.setText("");
            }
            else {
                if(n<0){

                    JOptionPane.showMessageDialog(null,"Chỉ nhập số dương");
                }
                else {
                    listModel.addElement(n);
                    txtNhap.setText("");
                }
            }
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null,"Vui lòng nhập đúng số");
        }
    }
    public  void toDenChan(){
        jlSo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        int[] select = new int[listModel.size()];
        for(int i=0;i<listModel.size();i++){
            int chan=Integer.parseInt(listModel.get(i).toString());
            if(chan%2==0){
               select[i]=i;
            }
            else {
                select[i]=-1;
            }
        }
        jlSo.setSelectedIndices(select);
    }
    public void toDenLe(){
        jlSo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        int[] select = new int[listModel.size()];
        for(int i=0;i<listModel.size();i++){
            int le=Integer.parseInt(listModel.get(i).toString());
            if(le%2==1){
                select[i]=i;
            }
            else {
                select[i]=-1;
            }
        }
        jlSo.setSelectedIndices(select);
    }
    public void toDenSoNguyenTo(){
        jlSo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        int[] select = new int[listModel.size()];
        for(int i=0;i<listModel.size();i++){
            int so=Integer.parseInt(listModel.get(i).toString());
            if(kiemTraSNT(so)==true){
                select[i]=i;
            }
            else {
                select[i]=-1;
            }
        }
        jlSo.setSelectedIndices(select);
    }
    public  boolean kiemTraSNT(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Thao tác trên JList ");
        frame.setContentPane(new Bai7().pnMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

    }

}
