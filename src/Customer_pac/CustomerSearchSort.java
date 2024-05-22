/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Customer_pac;

import javax.swing.*;
import database.*;
import Customer_pac.CustomerPanel;
import Classes.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author heman
 */
public class CustomerSearchSort extends javax.swing.JFrame {
    
    /**
     * Creates new form CustomerSearchSort
     */
    public CustomerSearchSort() {
        initComponents();
        String Query = "select * from customer";
        populateWithCustomerData(Query);
    }
    private void populateWithCustomerData(String Query)
    {
        ResultSet rs = Select.getData(Query);
        DefaultTableModel model= (DefaultTableModel)table_customer.getModel();
        try{
            while(rs.next()){
                model.addRow(new Object[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(16)});
            }
            rs.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        searchbyid = new javax.swing.JTextField();
        searchbyname = new javax.swing.JTextField();
        btn_searchid = new javax.swing.JButton();
        btn_searchname = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_customer = new javax.swing.JTable();
        sortcombo = new javax.swing.JComboBox<>();
        searchbynat = new javax.swing.JTextField();
        btn_searchnat = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 100, 0, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1463, 6, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Search By ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Search By Customer Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        searchbyid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchbyid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbyidActionPerformed(evt);
            }
        });
        getContentPane().add(searchbyid, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 58, 200, 30));

        searchbyname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(searchbyname, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 136, 200, 30));

        btn_searchid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_searchid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.jpeg"))); // NOI18N
        btn_searchid.setFocusable(false);
        btn_searchid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchidActionPerformed(evt);
            }
        });
        getContentPane().add(btn_searchid, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 50, 30, 40));

        btn_searchname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_searchname.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.jpeg"))); // NOI18N
        btn_searchname.setFocusable(false);
        btn_searchname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchnameActionPerformed(evt);
            }
        });
        getContentPane().add(btn_searchname, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 30, -1));

        table_customer.setBackground(new java.awt.Color(255, 225, 153));
        table_customer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Phone no", "Nationality", "Gender", "Email", "Address", "Aadhar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_customer.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table_customer);
        if (table_customer.getColumnModel().getColumnCount() > 0) {
            table_customer.getColumnModel().getColumn(0).setResizable(false);
            table_customer.getColumnModel().getColumn(1).setResizable(false);
            table_customer.getColumnModel().getColumn(2).setResizable(false);
            table_customer.getColumnModel().getColumn(3).setResizable(false);
            table_customer.getColumnModel().getColumn(4).setResizable(false);
            table_customer.getColumnModel().getColumn(5).setResizable(false);
            table_customer.getColumnModel().getColumn(6).setResizable(false);
            table_customer.getColumnModel().getColumn(7).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 982, 330));

        sortcombo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sortcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Name /ASC", "Name /DESC", "Gender(Male)", "Gender(Female)", "Phone Number" }));
        sortcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortcomboActionPerformed(evt);
            }
        });
        getContentPane().add(sortcombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 180, 210, 40));

        searchbynat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(searchbynat, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 200, 30));

        btn_searchnat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_searchnat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.jpeg"))); // NOI18N
        btn_searchnat.setFocusable(false);
        btn_searchnat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchnatActionPerformed(evt);
            }
        });
        getContentPane().add(btn_searchnat, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 30, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Search By Nationality");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sorting.png"))); // NOI18N
        jLabel4.setText("SORT BY :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 170, 120, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-360, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new CustomerPanel().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    public void rowCount(){
        DefaultTableModel model= (DefaultTableModel)table_customer.getModel();
        try{
            model.setRowCount(0);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void btn_searchidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchidActionPerformed
        String Query1 = "select * from customer where id = "+ searchbyid.getText();
        rowCount();
        populateWithCustomerData(Query1);
    }//GEN-LAST:event_btn_searchidActionPerformed

    private void btn_searchnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchnameActionPerformed
        String sname = searchbyname.getText();
        String Query2 = "select * from customer where name like '%"+sname+"%'";
        rowCount();
        populateWithCustomerData(Query2);
    }//GEN-LAST:event_btn_searchnameActionPerformed

    private void btn_searchnatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchnatActionPerformed
        String Query = "select * from customer where nationality = '"+ searchbynat.getText()+"'";
        rowCount();
        populateWithCustomerData(Query);
    }//GEN-LAST:event_btn_searchnatActionPerformed

    private void sortcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortcomboActionPerformed
        // TODO add your handling code here:
        String sortTeq = (String) sortcombo.getSelectedItem();
        /* 
        ID
        Name /ASC
        Name /DESC
        Gender(Male)
        Gender(Female)
        Mobile Number
        */
        switch(sortTeq){
            case "ID" -> { 
                String Query1 = "select * from customer order by id";
                rowCount();
                populateWithCustomerData(Query1);
            }
            case "Name /ASC" -> {
                String Query2 = "select * from customer order by name";
                rowCount();
                populateWithCustomerData(Query2);
            }
            case "Name /DESC" -> {
                String Query3 = "select * from customer order by name DESC";
                rowCount();
                populateWithCustomerData(Query3);
            }
            case "Gender(Male)" -> {
                String gender = "Male";
                String Query4 = "select * from customer where gender = '"+gender+"'";
                rowCount();
                populateWithCustomerData(Query4);
            }
            case "Gender(Female)" -> {
                String gender2 = "Female";
                String Query5 = "select * from customer where gender = '"+gender2+"'";
                rowCount();
                populateWithCustomerData(Query5);
            }
            case "Phone Number" -> {
                String Query6 = "select * from customer order by mobileNumber";
                rowCount();
                populateWithCustomerData(Query6);
            }
            default -> {
            }
        }
    }//GEN-LAST:event_sortcomboActionPerformed

    private void searchbyidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbyidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchbyidActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustomerSearchSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerSearchSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerSearchSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerSearchSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerSearchSort().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_searchid;
    private javax.swing.JButton btn_searchname;
    private javax.swing.JButton btn_searchnat;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField searchbyid;
    private javax.swing.JTextField searchbyname;
    private javax.swing.JTextField searchbynat;
    private javax.swing.JComboBox<String> sortcombo;
    private javax.swing.JTable table_customer;
    // End of variables declaration//GEN-END:variables
}
