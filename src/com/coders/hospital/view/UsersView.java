/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.coders.hospital.view;

import com.coders.hospital.db.dao.UserDetailsDao;
import com.coders.hospital.db.dao.UsersDao;
import com.coders.hospital.db.type.UsersType;
import com.coders.hospital.db.vo.UserDetailsVo;
import com.coders.hospital.db.vo.UsersVo;
import com.coders.hospital.validation.Validation;
import com.mysql.cj.x.protobuf.MysqlxNotice.Warning.Level;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.lang.System.Logger;

import javax.swing.*;

/**
 * @author Codersbay
 */
public class UsersView extends javax.swing.JFrame {

    public static byte[] imageByte;

    /**
     * Creates new form UsersView
     */
    public UsersView() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtFatherName = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMobile = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cUserType = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtImagePath = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmpSpecialization = new javax.swing.JComboBox<>();

        setAutoRequestFocus(false);
        setFocusTraversalPolicyProvider(true);
        setSize(new java.awt.Dimension(0, 0));

        jLabel6.setText("Father Name");
        jLabel6.setAutoscrolls(true);

        jLabel1.setText("ID");
        jLabel1.setAutoscrolls(true);

        jLabel7.setText("Mobile");
        jLabel7.setAutoscrolls(true);

        jLabel2.setText("User Name");
        jLabel2.setAutoscrolls(true);

        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        jButton1.setText("Add");
        jButton1.setAutoscrolls(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Password");
        jLabel3.setAutoscrolls(true);

        jLabel4.setText("UserType");
        jLabel4.setAutoscrolls(true);

        cUserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "doctor", "nurse", "reception", "patient", "pharmacist", "laboratorist", "acountant" }));
        cUserType.setSelectedIndex(-1);
        cUserType.setAutoscrolls(true);
        cUserType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cUserTypeActionPerformed(evt);
            }
        });

        jLabel5.setText("First name");
        jLabel5.setAutoscrolls(true);

        btnDelete.setText("Delete");
        btnDelete.setAutoscrolls(true);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.setAutoscrolls(true);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        jButton2.setText("Choose Image");
        jButton2.setAutoscrolls(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtImagePath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImagePathActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.setAutoscrolls(true);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        lblImage.setAutoscrolls(true);

        jLabel8.setText("Specialization");

        cmpSpecialization.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "general", "Internist", "Cardiologist", "Glands specialist / endocrinologist", "Doctor of hematology / hematologist", "Doctor of hematology / hematologist", "Oncologist", "Rheumatologist / doctor of rheumatology", "Surgeon", "Pediatrician / doctor of Baby", "Obstetrician & gynecologist", "Ophthalmologist / eyes doctor", "Neurologist", "ENT specialist / Dr. ENT", "Urologist", "Dermatologist", "Hepatologist / doctor of liver disease", "Radiologist", "Psychologist", "Anesthesiologist", "Bones doctor", "Dentist", "Forensic physician medical examiner", "General / GB", "Anatomist" }));
        cmpSpecialization.setSelectedIndex(-1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(5, 5, 5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jLabel8))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtId)
                            .addComponent(txtUserName)
                            .addComponent(txtPassword)
                            .addComponent(cUserType, 0, 180, Short.MAX_VALUE)
                            .addComponent(txtFirstName)
                            .addComponent(txtFatherName)
                            .addComponent(txtMobile))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(txtImagePath)
                            .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmpSpecialization, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEdit))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cUserType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))
                        .addGap(21, 21, 21))
                    .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtImagePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtFatherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmpSpecialization, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDelete, btnEdit, btnSearch, cUserType, cmpSpecialization, jButton1, jButton2, jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, txtFatherName, txtFirstName, txtId, txtImagePath, txtMobile, txtPassword, txtUserName});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        boolean isTextEmpty = Validation.isEmpty(txtId.getText(), txtUserName.getText(), txtPassword.getText(), txtFirstName.getText(), txtFatherName.getText(),txtImagePath.getText());
        boolean isEmpty = Validation.isEmpty(cUserType.getSelectedIndex(),cmpSpecialization.getSelectedIndex());
        boolean isDigit = Validation.isDigit(txtId.getText(), txtMobile.getText());
        boolean isText = Validation.isText(txtUserName.getText(), txtPassword.getText(), txtFirstName.getText(), txtFatherName.getText());

        if (isTextEmpty == true || isEmpty == true) {
            JOptionPane.showMessageDialog(null, "please inter valid data thanks ");
            return;
        }
        if (isDigit == false || isText == false) {
            JOptionPane.showMessageDialog(null, "please inter valid data please ");
            return;
        }

        int id = Integer.valueOf(txtId.getText());//2:10:11 / 8:07:10
        String userName = txtUserName.getText();
        String password = txtPassword.getText();
        UsersType usersType = UsersType.getUsersTypeByType(cUserType.getSelectedItem().toString());
        UsersVo usersVo = new UsersVo();
        usersVo.setId(id);
        usersVo.setUsername(userName);
        usersVo.setPassword(password);
        usersVo.setUsersType(usersType);
        String firstName = txtFirstName.getText();
        String fatherName = txtFatherName.getText();
        String mobile = txtMobile.getText();
        String specialization = cmpSpecialization.getSelectedItem().toString();
        UserDetailsVo userDetailsVo = new UserDetailsVo();
        userDetailsVo.setUsersVo(usersVo);
        userDetailsVo.setFirstName(firstName);
        userDetailsVo.setFatherName(fatherName);
        userDetailsVo.setMobile(mobile);
        userDetailsVo.setSpecialization(specialization);
        userDetailsVo.setImage(imageByte);

        try {
            //   int usersCount = UsersDao.getInstance().insert(usersVo);
            int count = UserDetailsDao.getInstance().insert(userDetailsVo);
            if (count == 1) {
                JOptionPane.showMessageDialog(null, "insert successfully ");
                reset();
            } else {
                JOptionPane.showMessageDialog(null, " failure insert failed  ");
            }
        } catch (Exception ex) {

            throw new RuntimeException(ex);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void cUserTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cUserTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cUserTypeActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        boolean isTextEmpty = Validation.isEmpty(txtId.getText());
        boolean isDigit = Validation.isDigit(txtId.getText());
        if (isTextEmpty == true) {
            JOptionPane.showMessageDialog(null, "please inter valid data  ");
            return;
        }
        if (isDigit == false) {
            JOptionPane.showMessageDialog(null, "please inter valid data  ");
            return;
        }

        int id = Integer.valueOf(txtId.getText());// VALUE WHICH USER ENTER
        UsersVo usersVo = new UsersVo();
        usersVo.setId(id);
        UserDetailsVo userDetailsVo = new UserDetailsVo();
        userDetailsVo.setUsersVo(usersVo);
        try {
            UsersVo uv = UsersDao.getInstance().getDataById(id);
            if (uv == null) {
                JOptionPane.showMessageDialog(null, "please enter valid data ");
                return;
            }
            int count = UserDetailsDao.getInstance().delete(userDetailsVo);
            if (count == 1) {
                JOptionPane.showMessageDialog(null, "Delete successfully ");
                reset();
            } else {
                JOptionPane.showMessageDialog(null, " failure Delete failed  ");
            }
        } catch (Exception ex) {

            throw new RuntimeException(ex);
        }


    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        boolean isTextEmpty = Validation.isEmpty(txtId.getText(), txtUserName.getText(), txtPassword.getText(), txtFirstName.getText(), txtFatherName.getText());
        boolean isEmpty = Validation.isEmpty(cUserType.getSelectedIndex());
        boolean isDigit = Validation.isDigit(txtId.getText(), txtMobile.getText());
        boolean isText = Validation.isText(txtUserName.getText(), txtPassword.getText(), txtFirstName.getText(), txtFatherName.getText());
        if (isTextEmpty == true || isEmpty == true) {
            JOptionPane.showMessageDialog(null, "please inter valid data thanks ");
            return;
        }
        if (isDigit == false || isText == false) {
            JOptionPane.showMessageDialog(null, "please inter valid data please ");
            return;
        }
        int id = Integer.valueOf(txtId.getText());//2:10:11 / 8:07:10
        String userName = txtUserName.getText();
        String password = txtPassword.getText();
        UsersType usersType = UsersType.getUsersTypeByType(cUserType.getSelectedItem().toString());
        UsersVo usersVo = new UsersVo();
        usersVo.setId(id);
        usersVo.setUsername(userName);
        usersVo.setPassword(password);
        usersVo.setUsersType(usersType);
        String firstName = txtFirstName.getText();
        String fatherName = txtFatherName.getText();
        String mobile = txtMobile.getText();
        UserDetailsVo userDetailsVo = new UserDetailsVo();
        userDetailsVo.setUsersVo(usersVo);
        userDetailsVo.setFirstName(firstName);
        userDetailsVo.setFatherName(fatherName);
        userDetailsVo.setMobile(mobile);
        userDetailsVo.setImage(imageByte);
        try {
            UsersVo uv = UsersDao.getInstance().getDataById(id);
            if (uv == null) {
                JOptionPane.showMessageDialog(null, "please enter valid data ");
                return;
            }
            int count = UserDetailsDao.getInstance().update(userDetailsVo);
            if (count == 1) {
                JOptionPane.showMessageDialog(null, "Updte successfully ");
                reset();
            } else {
                JOptionPane.showMessageDialog(null, " failure insert failed  ");
            }
        } catch (Exception ex) {

            throw new RuntimeException(ex);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        JFileChooser jFileChoser = new JFileChooser();
        jFileChoser.showOpenDialog(null);
        File file = jFileChoser.getSelectedFile();
        String ImagePath = file.getAbsolutePath();
        txtImagePath.setText(ImagePath);
        try {
            File file2 = new File(ImagePath);
            FileInputStream fis = new FileInputStream(file2);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] length = new byte[1024];
            for (int i; (i = fis.read(length)) != -1;) {
                baos.write(length, 0, i);
            }
            imageByte = baos.toByteArray();
        } catch (Exception eX) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        
        boolean isTextEmpty = Validation.isEmpty(txtId.getText());
        boolean isDigit = Validation.isDigit(txtId.getText());
        if (isTextEmpty == true) {
            JOptionPane.showMessageDialog(null, "please inter valid ID  ");
            return;
        }
        if (isDigit == false) {
            JOptionPane.showMessageDialog(null, "please inter valid ID please ");
            return;
        }
        int id = Integer.valueOf(txtId.getText());
        try {

            UserDetailsVo userDetailsVo = UserDetailsDao.getInstance().getDataById(id);
            
            if (userDetailsVo == null) {
                JOptionPane.showMessageDialog(null, "ID not exist");
                reset();
            } else {

                txtUserName.setText(userDetailsVo.getUsersVo().getUsername());
                txtPassword.setText(userDetailsVo.getUsersVo().getPassword());
                txtFirstName.setText(userDetailsVo.getFirstName());
                txtFatherName.setText(userDetailsVo.getFatherName());
                txtMobile.setText(userDetailsVo.getMobile());
                
               
                cUserType.setSelectedIndex(userDetailsVo.getUsersVo().getUsersType().getId() - 1);
                byte[]imageByte=userDetailsVo.getImage();
                ImageIcon imageIcon= new ImageIcon(imageByte);
                lblImage.setIcon(imageIcon);
                cmpSpecialization.setSelectedItem(userDetailsVo.getSpecialization());
                
            }
        } catch (Exception ex) {
            System.out.println(ex);
            throw new RuntimeException(ex); 
        }


    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtImagePathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImagePathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImagePathActionPerformed

    /**
     * @param args the command line arguments
     */
    protected void reset() {
        txtId.setText("");
        txtUserName.setText("");
        txtPassword.setText("");
        txtFirstName.setText("");
        txtFatherName.setText("");
        txtMobile.setText("");
        cUserType.setSelectedIndex(-1);
        txtImagePath.setText("");
        lblImage.setIcon(null);
        cmpSpecialization.setSelectedIndex(-1);

    }

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
            java.util.logging.Logger.getLogger(UsersView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsersView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsersView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsersView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsersView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cUserType;
    private javax.swing.JComboBox<String> cmpSpecialization;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblImage;
    private javax.swing.JTextField txtFatherName;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtImagePath;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
