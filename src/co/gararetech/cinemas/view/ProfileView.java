/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.gararetech.cinemas.view;

import co.gararetech.cinemas.controller.DashboardController;
import co.gararetech.cinemas.controller.ProfileController;
import co.gararetech.cinemas.model.ProfileModel;
import co.gararetech.cinemas.utils.GoogleCloudStorage;
import co.gararetech.cinemas.view.elements.RoundJPasswordField;
import co.gararetech.cinemas.view.elements.RoundJTextField;
import co.gararetech.cinemas.view.elements.RoundJCBox;
import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import java.awt.Color;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingWorker;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Acer
 */
public class ProfileView extends javax.swing.JFrame {

    /**
     * Creates new form ProfilView
     */
    private GoogleCloudStorage googleCloudStorage;
    private ProfileController profileController;
    private DashboardController dashboardController;
    private ProfileModel profileModel;
    private DashboardView dashboardView;
    private ImageIcon appIcon;
    private int mouseX;
    private int mouseY;

    public ProfileView() throws ClassNotFoundException, IllegalAccessException, UnsupportedLookAndFeelException, InstantiationException, URISyntaxException, IOException {
        Properties p = new Properties();
        p.put("windowTitleFont", "Ebrima PLAIN 15");
        p.put("logoString", "");
        p.put("windowDecoration", "off");
        AluminiumLookAndFeel.setCurrentTheme(p);
        UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");

        profileController = new ProfileController();
        profileModel = new ProfileModel();
        googleCloudStorage = new GoogleCloudStorage();
        dashboardController = new DashboardController();
        initComponents();
        profileController.setModel(profileModel);
        appIcon = new ImageIcon(getClass().getResource("images/chair.png"));
        this.setIconImage(appIcon.getImage());
        new SwingWorker<Void, Void>() {
            @Override
            public Void doInBackground() {
                try {
                    profileController.pictureload(ProfileView.this);
                } catch (IOException ex) {
                    Logger.getLogger(ProfileView.class.getName()).log(Level.SEVERE, null, ex);
                }
                return null;
            }
        }.execute();
    }

    
        
    

    public void setDashboardView(DashboardView dashboardView) {
        this.dashboardView = dashboardView;
    }

    public DashboardView getDashboardView() {
        return dashboardView;
    }

    public ProfileController getProfileController() {
        return profileController;
    }

    public ProfileModel getProfileModel() {
        return profileModel;
    }

    public int getMouseX() {
        return mouseX;
    }

    public void setMouseX(int mouseX) {
        this.mouseX = mouseX;
    }

    public int getMouseY() {
        return mouseY;
    }

    public void setMouseY(int mouseY) {
        this.mouseY = mouseY;
    }

    public JCheckBox getIsChangePassword() {
        return isChangePassword;
    }

    public JComboBox getjCity() {
        return jCity;
    }

    public JTextField getTxtEmail() {
        return txtEmail;
    }

    public JPasswordField getTxtNewPassword() {
        return txtNewPassword;
    }

    public JPasswordField getTxtOldPassword() {
        return txtOldPassword;
    }

    public JLabel getProfilePicture() {
        return profilePicture;
    }

    public JButton getBtnProfileSave() {
        return btnProfileSave;
    }

    public GoogleCloudStorage getGoogleCloudStorage() {
        return googleCloudStorage;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtEmail = new RoundJTextField(50);
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnProfileSave = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        profilePicture = new javax.swing.JLabel();
        txtOldPassword = new RoundJPasswordField(50);
        txtNewPassword = new RoundJPasswordField(50);
        jLabel6 = new javax.swing.JLabel();
        jCity = new co.gararetech.cinemas.view.elements.RoundJCBox();
        isChangePassword = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cinemas Booking App");
        setUndecorated(true);

        jPanel1.setBackground(Color.decode("#1D1C1C"));
        jPanel1.setPreferredSize(new java.awt.Dimension(849, 785));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(Color.decode("#222222"));
        jPanel2.setPreferredSize(new java.awt.Dimension(731, 502));

        jLabel1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EMAIL");

        txtEmail.setBackground(Color.decode("#E3DDDD"));
        txtEmail.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        txtEmail.setToolTipText("Email");
        txtEmail.setBorder(BorderFactory.createCompoundBorder(
            txtEmail.getBorder(), 
            BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    txtEmail.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtEmailActionPerformed(evt);
        }
    });

    jLabel2.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(255, 255, 255));
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel2.setText("PROFILE");

    jLabel3.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(255, 255, 255));
    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel3.setText("PASSWORD LAMA");

    btnBack.setBackground(Color.decode("#A27B5C"));
    btnBack.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
    btnBack.setForeground(new java.awt.Color(255, 255, 255));
    btnBack.setText("KEMBALI");
    btnBack.setToolTipText("Kembali");
    btnBack.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnBackActionPerformed(evt);
        }
    });

    btnProfileSave.setBackground(Color.decode("#A27B5C"));
    btnProfileSave.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
    btnProfileSave.setForeground(new java.awt.Color(255, 255, 255));
    btnProfileSave.setText("SIMPAN");
    btnProfileSave.setToolTipText("Simpan");
    btnProfileSave.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnProfileSaveActionPerformed(evt);
        }
    });

    jLabel4.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(255, 255, 255));
    jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel4.setText("PASSWORD BARU");

    profilePicture.setBackground(new java.awt.Color(255, 255, 255));
    profilePicture.setForeground(new java.awt.Color(255, 255, 255));
    profilePicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    profilePicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/gararetech/cinemas/view/images/ProfileIconBlack.png"))); // NOI18N
    profilePicture.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            profilePictureMouseClicked(evt);
        }
    });

    txtOldPassword.setBackground(Color.decode("#E3DDDD"));
    txtOldPassword.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
    txtOldPassword.setToolTipText("Password Lama");
    txtOldPassword.setBorder(BorderFactory.createCompoundBorder(
        txtOldPassword.getBorder(), 
        BorderFactory.createEmptyBorder(5, 5, 5, 5)));
txtOldPassword.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtOldPasswordActionPerformed(evt);
    }
    });

    txtNewPassword.setBackground(Color.decode("#E3DDDD"));
    txtNewPassword.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
    txtNewPassword.setToolTipText("Password Baru");
    txtNewPassword.setBorder(BorderFactory.createCompoundBorder(
        txtNewPassword.getBorder(), 
        BorderFactory.createEmptyBorder(5, 5, 5, 5)));
txtNewPassword.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtNewPasswordActionPerformed(evt);
    }
    });

    jLabel6.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
    jLabel6.setForeground(new java.awt.Color(255, 255, 255));
    jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel6.setText("KOTA");

    jCity.setBackground(Color.decode("#E3DDDD"));
    jCity.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
    jCity.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bandung", "Jakarta" }));
    jCity.setToolTipText("Kota");

    isChangePassword.setBackground(Color.decode("#222222"));
    isChangePassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    isChangePassword.setForeground(new java.awt.Color(255, 255, 255));
    isChangePassword.setText("Ubah Password");
    isChangePassword.addChangeListener(new javax.swing.event.ChangeListener() {
        public void stateChanged(javax.swing.event.ChangeEvent evt) {
            isChangePasswordStateChanged(evt);
        }
    });
    isChangePassword.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            isChangePasswordActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(274, 274, 274)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(profilePicture, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(107, 107, 107)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(isChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(btnProfileSave, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jCity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(txtNewPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtOldPassword)))))
            .addContainerGap(117, Short.MAX_VALUE))
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(profilePicture)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel6)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jCity, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(isChangePassword)
            .addGap(7, 7, 7)
            .addComponent(jLabel3)
            .addGap(6, 6, 6)
            .addComponent(txtOldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel4)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnProfileSave, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(31, 31, 31))
    );

    jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, 660));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
    );

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        profileController.back(this, this.getDashboardView());
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnProfileSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileSaveActionPerformed
        profileController.loading(this.getBtnProfileSave(), true);
        new Thread() {
            public void run() {
                try {
                    profileController.updateUser(ProfileView.this);
                    profileController.loading(ProfileView.this.getBtnProfileSave(), false);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }.start();
    }//GEN-LAST:event_btnProfileSaveActionPerformed

    private void txtOldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOldPasswordActionPerformed

    private void txtNewPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewPasswordActionPerformed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - this.getMouseX(), y - this.getMouseY());
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        this.setMouseX(evt.getX());
        this.setMouseY(evt.getY());
    }//GEN-LAST:event_jPanel1MousePressed

    private void isChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isChangePasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isChangePasswordActionPerformed

    private void isChangePasswordStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_isChangePasswordStateChanged
        // TODO add your handling code here:
        profileController.selectedChangePassword(this, evt);
    }//GEN-LAST:event_isChangePasswordStateChanged

    private void profilePictureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profilePictureMouseClicked
        try {
            profileController.chooseImage(this, this.getGoogleCloudStorage());
        } catch (IOException ex) {
            Logger.getLogger(ProfileView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_profilePictureMouseClicked

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
            java.util.logging.Logger.getLogger(ProfileView.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfileView.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfileView.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfileView.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ProfileView().setVisible(true);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Kesalahan system " + ex.getMessage());
                    Logger

.getLogger(ProfileView.class  

.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnProfileSave;
    private javax.swing.JCheckBox isChangePassword;
    private javax.swing.JComboBox jCity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel profilePicture;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtNewPassword;
    private javax.swing.JPasswordField txtOldPassword;
    // End of variables declaration//GEN-END:variables
}
