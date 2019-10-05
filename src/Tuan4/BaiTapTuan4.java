package Tuan4;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class BaiTapTuan4 {
    private JPanel pnMain;
    private JButton btnNew;
    private JButton btnUpdate;
    private JButton btnSave;
    private JButton btnDelete;
    private JTextField txtName;
    private JCheckBox checkBook;
    private JCheckBox checkNewPaper;
    private JCheckBox checkJournal;
    private JTextField txtAddres;
    private JTextField txtContact;
    private JTextField txtEmail;
    private JTextField txtID;
    private JTable tableThongTin;
    private JTextArea areaRemark;
    String id, name, supplierType, Address,  contactNo,  email, remarks;



    public BaiTapTuan4() {
        ButtonGroup btg=new ButtonGroup();
        btg.add(checkBook);
        btg.add(checkJournal);
        btg.add(checkNewPaper);
        getTable();
        //tableThongTin.select
        btnNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                macdinh();
            }
        });
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String strName,strsupplierType = "",strAddress,strcontactNo,stremail,strremarks;
                strName=txtName.getText();
                strAddress=txtAddres.getText();
                strcontactNo=txtContact.getText();
                stremail=txtEmail.getText();
                strremarks=areaRemark.getText();
                if(checkBook.isSelected()==true){
                    strsupplierType="Books";
                }else if(checkJournal.isSelected()==true){
                    strsupplierType="Journals And Magazine";
                }else if(checkNewPaper.isSelected()==true){
                    strsupplierType="New Paper";
                }
                if(strAddress.length()==0&&strcontactNo.length()==0&&stremail.length()==0
                        &&strName.length()==0&&strremarks.length()==0&&strsupplierType.length()==0){
                    JOptionPane.showMessageDialog(null,"Vui Lòng Điền Đầy Đủ Thông Tin");
                }
                else
                {
                    try {
                        ConnectionClass connectionClass = new ConnectionClass();
                        Connection connection = connectionClass.getConnection();
                        String sql = " insert into ThongTin1 values('"+strName+"','"+strsupplierType+"','"+strAddress+"','"+strcontactNo+"','"+stremail+"','"+strremarks+"')";
                        Statement statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery(sql);

                    }
                    catch (Exception ex){

                    }
                    JOptionPane.showMessageDialog(null,"Lưu Thành Công");
                    macdinh();
                    getTable();
                }
            }
        });
        tableThongTin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setvitri();
                btnDelete.setEnabled(true);
                btnUpdate.setEnabled(true);


            }
        });
        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setvitri();
            deleteThongTin(id);
            btnDelete.setEnabled(false);
            btnUpdate.setEnabled(false);
                JOptionPane.showMessageDialog(null,"Xóa Thành Công");
            getTable();

            }
        });
        btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setvitri();
                suaThongTin(id,name,supplierType,Address,contactNo,email,remarks);
                getTable();
                btnDelete.setEnabled(false);
                btnUpdate.setEnabled(false);
                JOptionPane.showMessageDialog(null,"Update Thành Công");

            }
        });
    }

public void macdinh(){
        txtAddres.setText("");
        txtContact.setText("");
        txtEmail.setText("");
        txtName.setText("");
        areaRemark.setText("");
        checkBook.setSelected(false);
       checkJournal.setSelected(false);
       checkNewPaper.setSelected(false);
}
public void setvitri(){
    int row=tableThongTin.getSelectedRow();
    id= tableThongTin.getValueAt(row,0).toString();
    supplierType= tableThongTin.getValueAt(row,2).toString();
    name= tableThongTin.getValueAt(row,1).toString();
    Address= tableThongTin.getValueAt(row,3).toString();
    contactNo= tableThongTin.getValueAt(row,4).toString();
    email= tableThongTin.getValueAt(row,5).toString();
    remarks= tableThongTin.getValueAt(row,6).toString();
}
public void getTable(){
        tableThongTin.removeAll();
    DefaultTableModel tableModel = new DefaultTableModel();
    String []colsName = {"Id", "Name","Supplier Type","Address","Contact No","Email","Remarks"};
    tableModel.setColumnIdentifiers(colsName);
    tableThongTin.setModel(tableModel);
    try {
        ConnectionClass connectionClass = new ConnectionClass();
        Connection connection = connectionClass.getConnection();
        String sql = "SELECT id,name,supplierType, Address,contactNo,email,remarks  from ThongTin1";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sql);

        while(rs.next()) {



                        /*String rows[] = new String[2];
                        rows[0] = rs.getString(1);
                        rows[1] = rs.getString(2);
                        rows[2] = rs.getString(3);
                        rows[3] = rs.getString(4);
                        tableModel.addRow(rows);*/

            int row1 = rs.getInt("id");
            String row2 = rs.getString("name");
            String row3 = rs.getString("supplierType");
            String row4 = rs.getString("Address");
            String row5 = rs.getString("contactNo");
            String row6 = rs.getString("email");
            String row7 = rs.getString("remarks");
            Object[] row = {row1, row2, row3,row4,row5,row6,row7};
            tableModel.addRow(row);
        }


    }
    catch (Exception ex){
        System.out.println("Kiem Tra Lại Thong Tin");
    }
}
public void suaThongTin(String ids,String na,String su,String ad, String co, String em,String re){


    try {
        String sql="UPDATE ThongTin1 SET name = '"+na+"', supplierType= '"+su
                +"', Address= '"+ad+"',contactNo= '"+co+"',email= '"+em
                + "',remarks= '"+re+"' WHERE id = "+ids;
        ConnectionClass connectionClass = new ConnectionClass();
        Connection connection = connectionClass.getConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sql);


    }
    catch (Exception ex){
        System.out.println("Sửa Thất Bại");
    }

}
public void deleteThongTin(String id){
        try {
            String sql="delete from ThongTin1 where id="+id;
            ConnectionClass connectionClass = new ConnectionClass();
            Connection connection = connectionClass.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);

        }
        catch (Exception ex){
            System.out.println("Xóa Thất Bại");
        }
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Book Suppliers Entry");
        frame.setContentPane(new BaiTapTuan4().pnMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

    }
}
