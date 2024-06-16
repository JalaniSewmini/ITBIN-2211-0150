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
public class Cregistration extends javax.swing.JFrame {

    
    
    
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    public Cregistration() {
        initComponents();
        conn=dbconnect1.connect();
        tabledata();
        
    }

   public void tabledata(){
   
       try {
           String sql="SELECT cid,FullName,Address,Province,ContactNumber,ContactNumber2,EmailAddress FROM customer";
           pst=conn.prepareStatement(sql);
           rs=pst.executeQuery();
           
           table1.setModel(DbUtils.resultSetToTableModel(rs));
           
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null,e);
       }
   
   
   
   }
   
   public void tableselect(){
   
   
   int s=table1.getSelectedRow();
   
    String caid=table1.getValueAt(s, 0).toString();
       String name=table1.getValueAt(s, 1).toString();
       String add=table1.getValueAt(s, 2).toString();
        String pro=table1.getValueAt(s, 3).toString();
        String pn1=table1.getValueAt(s, 4).toString();
       String pn2= table1.getValueAt(s, 5).toString(); 
        String email=table1.getValueAt(s, 6).toString();
   
   
   
   
  idbox.setText(caid);
  fnbtn.setText(name);
  addbtn.setText(add);
  probtn.setSelectedItem(pro);
  num1btn.setText(pn1);
  num2btn.setText(pn2);
  emailbtn.setText(email);
   
   
   }
   
         
   
   public void update(){
       
       String caid=idbox.getText();
       String name=fnbtn.getText();
       String add=addbtn.getText();
        String pro=probtn.getSelectedItem().toString();
        String pn1=num1btn.getText();
       String pn2= num2btn.getText();    
        String email=emailbtn.getText();
        
        
        
        try {
            String sql="UPDATE customer SET FullName=?, Address=?,Province=?,ContactNumber=?,ContactNumber2=?,EmailAddress=?   WHERE cid=?";
            pst=conn.prepareStatement(sql);
           
            
            
            pst.setString(1, name);
            pst.setString(2, add);
            pst.setString(3, pro);
            pst.setString(4, pn1);
            pst.setString(5, pn2);
            pst.setString(6, email);
            pst.setString(7, caid);
            
             pst.execute();
             
            JOptionPane.showMessageDialog(null,"Update Successfull");
            setVisible(false);
            new Cregistration().setVisible(true);
            
        } catch (SQLException e) {
        JOptionPane.showMessageDialog(null,"Update Error"+ e.getMessage());
        
        
    } 
   
   
   }
           
           
           
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fnbtn = new javax.swing.JTextField();
        addbtn = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        probtn = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        num1btn = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        num2btn = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        emailbtn = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        idbox = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Customer Registration");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 33, 320, 36));

        jLabel2.setText("Full Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 164, 26));

        jLabel3.setText("Address");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 114, -1));
        jPanel1.add(fnbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 256, -1));
        jPanel1.add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 256, -1));

        jLabel5.setText("Province");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 118, -1));

        probtn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Central", "Eastern", "North Central", "North Western", "Northern", "Sabaragamuwa", "Southern", "Uva", "Western", " ", " " }));
        jPanel1.add(probtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 162, -1));

        jLabel6.setText("Contact Number 1 :-");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 148, -1));
        jPanel1.add(num1btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 256, -1));

        jButton1.setBackground(new java.awt.Color(255, 153, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon/icons8-submit-64.png"))); // NOI18N
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, -1, -1));

        jLabel7.setText("Contact Number 2 :-");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 135, -1));
        jPanel1.add(num2btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 256, -1));

        jLabel9.setText("Email Address :-");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 107, -1));

        emailbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailbtnActionPerformed(evt);
            }
        });
        jPanel1.add(emailbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 256, -1));

        jButton3.setBackground(new java.awt.Color(255, 153, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon/icons8-home.gif"))); // NOI18N
        jButton3.setText("Home");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 670, -1, -1));

        table1.setBackground(new java.awt.Color(204, 255, 204));
        table1.setModel(new javax.swing.table.DefaultTableModel(
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
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 79, 752, -1));

        jButton4.setBackground(new java.awt.Color(255, 153, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon/icons8-update.gif"))); // NOI18N
        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 530, -1, -1));

        jButton5.setBackground(new java.awt.Color(255, 153, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon/icons8-delete-48.png"))); // NOI18N
        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 530, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("ID");
        jLabel8.setToolTipText("");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        idbox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(idbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        String name;
        String add;
        String pro;
        String pn1;
        int pn2;
        String email;
        
        
        name=fnbtn.getText();
        add=addbtn.getText();
        pro=probtn.getSelectedItem().toString();
        pn1=num1btn.getText();
        pn2= Integer.parseInt(num2btn.getText());    
        email=emailbtn.getText();
        try {
            String sql="INSERT INTO customer (FullName,Address,Province,ContactNumber,ContactNumber2,EmailAddress) VALUE ('"+name+"','"+add+"','"+pro+"','"+pn1+"','"+pn2+"','"+email+"')";
            pst=conn.prepareStatement(sql);
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Submited");
           
            
        } catch (SQLException e) {
        JOptionPane.showMessageDialog(null,e);
        
    }//GEN-LAST:event_jButton1ActionPerformed
     tabledata();
    }
    
    
    
    
    
    private void emailbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailbtnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       mainframe mf= new mainframe();
            mf.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       update();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        tableselect();
    }//GEN-LAST:event_table1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int che=JOptionPane.showConfirmDialog(null, "Do you want to delete");
        
        if(che==0)
        {
        String caid =idbox.getText();
        
            try {
                String sql="DELETE FROM customer WHERE cid='"+caid+"'";
                pst=conn.prepareStatement(sql);
                pst.execute();
                 JOptionPane.showMessageDialog(null,"Deleted");
                setVisible(false);
                 new Cregistration().setVisible(true);
                
                
            } catch (Exception e) {
                
                
                JOptionPane.showMessageDialog(null,e);
                setVisible(false);
                 new Cregistration().setVisible(true);
            }
        
       
        }
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Cregistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cregistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cregistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cregistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cregistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addbtn;
    private javax.swing.JTextField emailbtn;
    private javax.swing.JTextField fnbtn;
    private javax.swing.JLabel idbox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField num1btn;
    private javax.swing.JTextField num2btn;
    private javax.swing.JComboBox<String> probtn;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables
}
