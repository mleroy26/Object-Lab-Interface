package ObjectLabEnterpriseSoftware;

import java.awt.event.*;
import java.awt.*;

public class PasswordDialogView extends javax.swing.JFrame
{

    private static final String NAME_OF_PAGE = "Admin Password";
    private static MainView home = new MainView();
    public static boolean adminLoginStatus;

    public PasswordDialogView()
    {
        initComponents();
        //passwordError.setVisible(false);
		Password.addKeyListener(new KeyAdapter()
        {
            public void keyTyped(KeyEvent capsLockCheck)
            {
                if(capsLockDetector())
				{
					passwordError.setText("WARNING: Caps Lock is on");
				}
				else
				{
					passwordError.setText("");
				}
            }
        });
        addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
            	setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
               dispose();
               home.setPrintersVisible(false);
               home.showStudentOptions();
               home.setVisible(true);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        CancelButton = new javax.swing.JButton();
        SubmitButton = new javax.swing.JButton();
        Password = new javax.swing.JPasswordField();
        passwordError = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(UtilController.getPageName(NAME_OF_PAGE));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Administrator Password:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, 20));

        SubmitButton.setText("Submit");
        SubmitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubmitButtonMouseClicked(evt);
            }
        });
        getContentPane().add(SubmitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, 20));
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 136, -1));
        
        //Login with ENTER button
        Password.addKeyListener(new KeyAdapter()
        {
            public void keyTyped(KeyEvent e)
            {
                char c = e.getKeyChar();
                if(c == KeyEvent.VK_ENTER)
                {
                	
                	attemptAdminLogin();
                }
            }
        });

        passwordError.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        passwordError.setForeground(new java.awt.Color(255, 0, 0));
        passwordError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(passwordError, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 200, 20));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ObjectLabEnterpriseSoftware/images/white_bg.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 130));

        
        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_CancelButtonActionPerformed
    {//GEN-HEADEREND:event_CancelButtonActionPerformed
        dispose();
        home.setPrintersVisible(false);
        home.showStudentOptions();
        home.setVisible(true);
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void attemptAdminLogin()
    {
    	 boolean wasLoginSuccessful = UtilController.checkAdminLogin(new String(Password.getPassword()));

         if (wasLoginSuccessful)
         {
             System.out.println("Password passed!"); 
             adminLoginStatus = true;
             dispose();
             home.resetAdminMode();
         } else
         {
             passwordError.setText("ERROR: Invalid password");
             adminLoginStatus = false;
         }
    }
    
    private void SubmitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitButtonMouseClicked
                /*Hashes the predefined password and the password entered into the
         *JPasswordField and then compares the two
         */
        boolean wasLoginSuccessful = UtilController.checkAdminLogin(new String(Password.getPassword()));

        if (wasLoginSuccessful)
        {
            System.out.println("Password passed!"); 
            adminLoginStatus = true;
            dispose();
            home.resetAdminMode();
        } else
        {
            passwordError.setText("ERROR: Invalid password");
            adminLoginStatus = false;
        }
    }//GEN-LAST:event_SubmitButtonMouseClicked

    private boolean capsLockDetector()
    {
        //Detects if Caps Lock is on. If it is it returns a warning
        if(Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK))
        {
            return true;
        }
		return false;
    }

    /**
     * @param args the command line arguments
     */
    /*
     Eventually update passwordText array to take a constant for its size
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(PasswordDialogView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(PasswordDialogView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(PasswordDialogView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(PasswordDialogView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new PasswordDialogView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel passwordError;
    // End of variables declaration//GEN-END:variables
}
