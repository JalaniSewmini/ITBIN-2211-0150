/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author User
 */
public class mainframe extends javax.swing.JFrame {

    /**
     * Creates new form mainframe
     */
    public mainframe() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        des1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cusReg = new javax.swing.JButton();
        supReg = new javax.swing.JButton();
        Orde = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        des3 = new javax.swing.JLabel();
        dis2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        des1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        des1.setText("Welcome to Bloom House.");
        getContentPane().add(des1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 320, 30));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cusReg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cusReg.setText("Customer Registration");
        cusReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusRegActionPerformed(evt);
            }
        });
        jPanel1.add(cusReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 590, -1, -1));

        supReg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        supReg.setText("Supplier Registration");
        supReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supRegActionPerformed(evt);
            }
        });
        jPanel1.add(supReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 590, -1, -1));

        Orde.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Orde.setText("Order Details");
        Orde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdeActionPerformed(evt);
            }
        });
        jPanel1.add(Orde, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 590, -1, -1));

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(863, 645, 80, 40));

        des3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        des3.setText("Click the bottons below for your needs.");
        jPanel1.add(des3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, 410, 60));

        dis2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dis2.setText("We are happy to annouse that we are able to make your special occasions even more beautiful.");
        jPanel1.add(dis2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 640, 20));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 204));
        jScrollPane1.setBorder(null);

        jTextArea1.setBackground(new java.awt.Color(204, 255, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("          Where every petal tells a story. Embrace the artisty of nature with our hanspicked selection\n of blooms,curated to capture the essence of every occasion.\n Whether you are celebrating love, friendship,or simply the beauty of life itself, \n our vibrant arrangements are crafted with care and cretivity to bring joy to every doorshep. \n From elegant roses to cheerful daisies, let us help you express your sentiments with style and grace. \n");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 880, 170));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Explore our collection today and let the language \nof flowers speak volumes for you.");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 800, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/floral-pink-rosehip-flowers-among-green-leaves__1_-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 350, 230));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/OIP-removebg-preview (1).png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -20, 270, 150));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setText("AYUBOWAN !!");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cusRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusRegActionPerformed
        Cregistration cr= new Cregistration();
        cr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cusRegActionPerformed

    private void supRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supRegActionPerformed
        Sregistration sr= new Sregistration();
        sr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_supRegActionPerformed

    private void OrdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdeActionPerformed
        OrderDetails od=new OrderDetails();
        od.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_OrdeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        login lg= new login();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Orde;
    private javax.swing.JButton cusReg;
    private javax.swing.JLabel des1;
    private javax.swing.JLabel des3;
    private javax.swing.JLabel dis2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton supReg;
    // End of variables declaration//GEN-END:variables
}
