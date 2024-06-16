/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.dbconnect1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author User
 */
public class Sregistration extends javax.swing.JFrame {

    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    
    public Sregistration() {
        initComponents();
         conn=dbconnect1.connect();
         tabledata();
    }

     public void tabledata(){
   
       try {
           String sql="SELECT sid, Shopname,Address,Number,Emergencynumber,shoptype,Typeofflower,Averagetime FROM sregister";
           pst=conn.prepareStatement(sql);
           rs=pst.executeQuery();
           
           table2.setModel(DbUtils.resultSetToTableModel(rs));
           
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null,e);
       }
   
   
   
   }
   
   public void tableselect(){
   
   
   int s=table2.getSelectedRow();
   
    String said=table2.getValueAt(s, 0).toString();
       String name=table2.getValueAt(s, 1).toString();
       String add=table2.getValueAt(s, 2).toString();
       
        String pns=table2.getValueAt(s, 3).toString();
       String pn1= table2.getValueAt(s, 4).toString(); 
        String type=table2.getValueAt(s, 5).toString();
        String tf=table2.getValueAt(s, 6).toString();
        String atb=table2.getValueAt(s, 7).toString();
      
   
   
   
   
  idlbl.setText(said);
  sho.setText(name);
  addre.setText(add);
 
  pn.setText(pns);
  pnd.setText(pn1);
   st.setSelectedItem(type);
  ty.setText(tf);
  at.setSelectedItem(atb);
   
   
   }
   
         
   
   public void update(){
       
       String said=idlbl.getText();
       String name=sho.getText();
       String add=addre.getText();
       String pns= pn.getText();
       String pn2= pnd.getText();    
        
         String type=st.getSelectedItem().toString();
        
        String tf=ty.getText();
        
        String atb=at.getSelectedItem().toString();
        
        
        
        try {
            String sql="UPDATE sregister SET Shopname=?,Address=?,Number=?,Emergencynumber=?,shoptype=?,Typeofflower=?,Averagetime=?   WHERE sid=?";
            pst=conn.prepareStatement(sql);
           
            
            
            pst.setString(1, name);
            pst.setString(2, add);
            
            pst.setString(3, pns);
            pst.setString(4, pn2);
            pst.setString(5, type);
            pst.setString(6, tf);
            pst.setString(7, atb);
            pst.setString(8, said);
            
             pst.execute();
             
            JOptionPane.showMessageDialog(null,"Update Successfull");
            
            
        } catch (SQLException e) {
        JOptionPane.showMessageDialog(null,"Update Error"+ e.getMessage());
        }
        tabledata();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sho = new javax.swing.JTextField();
        addre = new javax.swing.JTextField();
        pn = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pnd = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        at = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        ty = new javax.swing.JTextField();
        st = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        upbtn = new javax.swing.JButton();
        delbtn = new javax.swing.JButton();
        canbtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        idlbl = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Supplier Registration");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 29, 318, 56));

        jLabel2.setText("Shop Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 184, -1));

        jLabel3.setText("Address");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 196, -1));

        jLabel4.setText("Contact Number");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 196, -1));
        jPanel1.add(sho, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 238, -1));
        jPanel1.add(addre, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 238, -1));

        pn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnActionPerformed(evt);
            }
        });
        jPanel1.add(pn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 241, -1));

        jLabel5.setText("Shop Type");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 149, 25));

        jLabel6.setText("Types Of Flowers Provided (Rose, Peonies, Tulips, Calla Lilies, Daisy, Orchids) :-");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, -1));

        jLabel7.setText("Emergency Contact Number");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 196, -1));
        jPanel1.add(pnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 241, -1));

        jLabel8.setText("Average Time To Deliver Flowers");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 613, 209, -1));

        at.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Less than 1 hour", "1 hour ", "2 hours", "2-3 hours", "3-5 hours", "More than 5 hours", " " }));
        jPanel1.add(at, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 610, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon/icons8-submit-64.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 674, -1, -1));

        ty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tyActionPerformed(evt);
            }
        });
        jPanel1.add(ty, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 500, 387, -1));

        st.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Register", "Non Register" }));
        jPanel1.add(st, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon/icons8-home.gif"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 760, -1, -1));

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 800, -1));

        upbtn.setText("Update");
        upbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upbtnActionPerformed(evt);
            }
        });
        jPanel1.add(upbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 490, -1, -1));

        delbtn.setText("Delete");
        delbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delbtnActionPerformed(evt);
            }
        });
        jPanel1.add(delbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 490, -1, -1));

        canbtn.setText("Cancel");
        jPanel1.add(canbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 800, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("ID");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        idlbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(idlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1590, 830));

        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("If your shop is already registered, Click here:-");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 741, 275, -1));

        jButton2.setText("Next");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 737, -1, -1));

        jButton3.setText("Home");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(712, 791, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnActionPerformed

    private void tyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tyActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        String name;
        String add;
        String pro;
        int pns;
        int pn2;
        String type;
         String tf;
          String atb;
        
        
        name=sho.getText();
        add=addre.getText();
        
        pns= Integer.parseInt(pn.getText());
        pn2= Integer.parseInt(pnd.getText());    
        
        type=st.getSelectedItem().toString();
        
        tf=ty.getText();
        
        atb =at.getSelectedItem().toString();
                
        try {
            String sql="INSERT INTO sregister (Shopname,Address,Number,Emergencynumber,shoptype,Typeofflower,Averagetime) VALUE ('"+name+"','"+add+"','"+pns+"','"+pn2+"','"+type+"','"+tf+"','"+atb+"')";
            pst=conn.prepareStatement(sql);
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Submited");
            
            
        } catch (SQLException e) {
        JOptionPane.showMessageDialog(null,e);
        
        
    }   
        tabledata();// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        mainframe mf= new mainframe();
            mf.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
mainframe mf= new mainframe();
            mf.setVisible(true);
            this.dispose();        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void upbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upbtnActionPerformed
       update();
    }//GEN-LAST:event_upbtnActionPerformed

    private void table2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table2MouseClicked
        tableselect();
    }//GEN-LAST:event_table2MouseClicked

    private void delbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delbtnActionPerformed
         int che=JOptionPane.showConfirmDialog(null, "Do you want to delete");
        
        if(che==0)
        {
        String sid =idlbl.getText();
        
            try {
                String sql="DELETE FROM sregister WHERE sid='"+sid+"'";
                pst=conn.prepareStatement(sql);
                pst.execute();
                 JOptionPane.showMessageDialog(null,"Deleted");
                
                
                
            } catch (Exception e) {
                
                
                JOptionPane.showMessageDialog(null,e);
               
            }
        
       
        }
        tabledata();
    }//GEN-LAST:event_delbtnActionPerformed

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
            java.util.logging.Logger.getLogger(Sregistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sregistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sregistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sregistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sregistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addre;
    private javax.swing.JComboBox<String> at;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton canbtn;
    private javax.swing.JButton delbtn;
    private javax.swing.JLabel idlbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pn;
    private javax.swing.JTextField pnd;
    private javax.swing.JTextField sho;
    private javax.swing.JComboBox<String> st;
    private javax.swing.JTable table2;
    private javax.swing.JTextField ty;
    private javax.swing.JButton upbtn;
    // End of variables declaration//GEN-END:variables
}
