/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class AddUser extends javax.swing.JFrame {

    /**
     * Creates new form AddUser
     */
    public AddUser() {
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

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        addressTxt = new javax.swing.JTextField();
        numberTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cardTxt = new javax.swing.JTextField();
        registerBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        viewuserBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel5.setText("ADD LIBRARY VISITORS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel2.setText("Address");

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel3.setText("Phone Number");

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel4.setText("ID Card");

        nameTxt.setBackground(new java.awt.Color(204, 204, 204));
        nameTxt.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N

        addressTxt.setBackground(new java.awt.Color(204, 204, 204));
        addressTxt.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N

        numberTxt.setBackground(new java.awt.Color(204, 204, 204));
        numberTxt.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setText("Full Name");

        cardTxt.setBackground(new java.awt.Color(204, 204, 204));
        cardTxt.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N

        registerBtn.setBackground(new java.awt.Color(153, 204, 255));
        registerBtn.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        registerBtn.setText("Register");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(153, 204, 255));
        backBtn.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        viewuserBtn.setBackground(new java.awt.Color(153, 204, 255));
        viewuserBtn.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        viewuserBtn.setText("View Users");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(registerBtn))
                        .addGap(67, 67, 67)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(viewuserBtn))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(86, 86, 86)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addressTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(cardTxt)
                            .addComponent(nameTxt)
                            .addComponent(numberTxt))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cardTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(viewuserBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(442, 442, 442)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(691, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
         new LibrarySystemGUI().setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_backBtnActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        try {
    // Get data from form
    String names = nameTxt.getText().trim();
    String address = addressTxt.getText().trim();
    String phonenumber = numberTxt.getText().trim();
    String idnumber = cardTxt.getText().trim();

    // Validation: Check if any field is empty
    if (names.isEmpty() || address.isEmpty() || phonenumber.isEmpty() || idnumber.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please fill in all fields.");
        return; // Exit the method to prevent further processing
    }

    // Validation: Check if the book name is not more than 20 characters
    if (idnumber.length() != 16) {
        JOptionPane.showMessageDialog(null, "Id Card cannot be more than 16 numbers.");
        return; // Exit the method
    }

    // Establish connection
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "");

   
    String insertSQL = "INSERT INTO user (names, address, phonenumber, idnumber) VALUES (?, ?, ?, ?)";
    PreparedStatement pst = con.prepareStatement(insertSQL);
    pst.setString(1, names);
    pst.setString(2, address);
    pst.setString(3, phonenumber);
    pst.setString(4, idnumber);

    // Execute the SQL statement
    pst.executeUpdate();

    // Optional: Clear the form fields
    nameTxt.setText("");
    addressTxt.setText("");
    numberTxt.setText("");
    cardTxt.setText("");

    // Display a success message
    JOptionPane.showMessageDialog(null, "User saved successfully!!");

    // Close connection
    con.close();

} catch (Exception ex) {
    ex.printStackTrace();
    JOptionPane.showMessageDialog(null, "Data not saved!! Exception: " + ex.getMessage());
}
    }//GEN-LAST:event_registerBtnActionPerformed

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
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField cardTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField numberTxt;
    private javax.swing.JButton registerBtn;
    private javax.swing.JButton viewuserBtn;
    // End of variables declaration//GEN-END:variables
}
