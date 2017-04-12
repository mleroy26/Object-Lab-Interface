package ObjectLabEnterpriseSoftware;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import javax.swing.JOptionPane;
//TEST COMMIT 
public class MainView extends javax.swing.JFrame
{
    private static final String NAME_OF_PAGE = "Home";
    private static final char SHARE_DRIVE_DIR = 'Z';

    newStudentView studentSys;
    newJobsMgr njm;
    newJobsMgr newJobMan;
    PasswordDialogView ad;
    boolean show;
    String PASS = "ForwardMotion";

    public MainView()
    {
    	getContentPane().setBackground(Color.WHITE);
        initComponents();
        this.setResizable(false);
        setPrintersVisible(false);
        studentSys = new newStudentView();
        ad = new PasswordDialogView();
       // getContentPane().remove(jButton1);

	
				
        //Allows only integers for student ID
        studentIdString.addKeyListener(new KeyAdapter()
        {
            public void keyTyped(KeyEvent e)
            {
                char c = e.getKeyChar();
              /*  if (!((c >= '0') && (c <= '9')
                        || (c == KeyEvent.VK_BACK_SPACE)
                        || (c == KeyEvent.VK_DELETE)))
                {
                    getToolkit().beep();
                    e.consume();
                }
				else if (studentIdString.getText().length() >= 7)
				{
					getToolkit().beep();
					e.consume();
				}*/
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        errorIdLabel = new javax.swing.JLabel();
        studentIdString = new javax.swing.JTextField();
        studentButton = new javax.swing.JButton();
        studentLoginLabel = new javax.swing.JLabel();
        oliSymbol = new javax.swing.JLabel();
        studentPassLabel = new javax.swing.JLabel();
        studentPassString = new javax.swing.JPasswordField();
        MenuBar = new javax.swing.JMenuBar();

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Art 101-001\nArt 201-002\nArt 401-004\nArt 501-005\nArt 601-006\nArt 701-007\nArt 801-009");
        jScrollPane1.setViewportView(jTextArea1);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(UtilController.getPageName(NAME_OF_PAGE));
        setMinimumSize(new java.awt.Dimension(400, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        errorIdLabel.setBackground(new java.awt.Color(0, 0, 0));
        errorIdLabel.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        errorIdLabel.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(errorIdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 130, 20));

        studentIdString.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        studentIdString.setToolTipText("Enter seven digit student ID.");
        studentIdString.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentIdStringActionPerformed(evt);
            }
        });
        getContentPane().add(studentIdString, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 70, 170, 30));

        studentButton.setBackground(new java.awt.Color(0, 0, 0));
        studentButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        studentButton.setText("Login");
        studentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentButtonActionPerformed(evt);
            }
        });
        getContentPane().add(studentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 250, 150, 40));

        studentLoginLabel.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        studentLoginLabel.setText("Enter Your TU ID:");
        getContentPane().add(studentLoginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 40, -1, 20));

        oliSymbol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ObjectLabEnterpriseSoftware/images/polytiger2.png"))); // NOI18N
        getContentPane().add(oliSymbol, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 315, -1, -1));

        studentPassLabel.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        studentPassLabel.setText("Password:");
        getContentPane().add(studentPassLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 120, -1, -1));
        studentPassString.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        getContentPane().add(studentPassString, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 150, 170, 30));
        setJMenuBar(MenuBar);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
	public void resetAdminMode()
	{
            njm.setVisible(true);
            hideStudentOptions();
            setVisible(false);
            dispose();
	}
	public void hideStudentOptions()
	{
		studentButton.setVisible(false);
		studentIdString.setVisible(false);
		studentPassString.setVisible(false);
                oliSymbol.setVisible(false);
                studentLoginLabel.setVisible(false);
                studentPassString.setVisible(false);
	} 
	
	public void showStudentOptions()
	{
		studentButton.setVisible(true);
		studentIdString.setVisible(true);
		studentPassString.setVisible(true);
                oliSymbol.setVisible(true);
                studentLoginLabel.setVisible(true);
                studentPassString.setVisible(true);
	}
	
	
	private void attemptLogin()
	{
        setPrintersVisible(false);
        String idString = studentIdString.getText();//DB team this is to store String
        String password = new String(studentPassString.getPassword());
        if (idString.length() < 2)
        {
            JOptionPane.showMessageDialog(null, "USER ID must be at least 2 characters.", "Invalid ID", JOptionPane.ERROR_MESSAGE);
        } else
        {
            if (UtilController.userIDExist(idString, password))
            {
                errorIdLabel.setText("");
                dispose();
                studentSys.newStudentView(idString, UtilController.getStudentFname());
            } else
            {
                JOptionPane.showMessageDialog(null, "Invalid TU ID or Password.", "Invalid ID", JOptionPane.ERROR_MESSAGE);
            }
        }
	}
	
    private void studentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentButtonActionPerformed
        // TODO add your handling code here:
        setPrintersVisible(false);

        
        
        String idString = studentIdString.getText();//DB team this is to store String
        String password = new String(studentPassString.getPassword());
        if (idString.length() < 2)
        {
            JOptionPane.showMessageDialog(null, "USER ID must be at least 2 characters.", "Invalid ID", JOptionPane.ERROR_MESSAGE);
        } else
        {
            if (UtilController.userIDExist(idString, password))
            {
                if(UtilController.isAdmin(idString)){
                    newJobMan = new newJobsMgr(idString);
                    dispose();
                }
                else{
                    errorIdLabel.setText("");
                    dispose();
                    studentSys.newStudentView(idString, UtilController.getStudentFname());
                }
                
            } else
            {
                JOptionPane.showMessageDialog(null, "Invalid TU ID or Password.", "Invalid ID", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_studentButtonActionPerformed

    private void studentIdStringActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:

    }                                               

    private void studentPassStringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentIdStringActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_studentIdStringActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
      NewAccount newAccount = new NewAccount();
      dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /*private void settingsButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
        AdminSettingsView ad = new AdminSettingsView();
        ad.AdminSettingsViewStart();
        dispose();
    }*/

    public void setPrintersVisible(boolean isVisible)
    {
	studentButton.setVisible(!isVisible);
	studentIdString.setVisible(!isVisible);
	studentPassString.setVisible(!isVisible);
        oliSymbol.setVisible(!isVisible);
        studentLoginLabel.setVisible(!isVisible);
        studentPassString.setVisible(!isVisible);
	//settingsButton.setVisible(isVisible);
	//settingsLabel.setVisible(isVisible);
	//openProjectsButton.setVisible(isVisible);
	//openProjectsLabel.setVisible(isVisible);
	//enterBuild.setVisible(isVisible);
	//enterBuildLabel.setVisible(isVisible);
	//ReportsButton.setVisible(isVisible);
	//ReportsLabel.setVisible(isVisible);
	//statsButton.setVisible(isVisible);
	//logoutB.setVisible(isVisible);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */	
    	
    	
    	String mapDrive = "net use " + SHARE_DRIVE_DIR + ": \\\\customshare\\ObjectLabStorage  /user:TOWSONU\\mboyd8 6TgrAlienRazor9!"; // This is the command that mounts the drive.  
        Process p = null;
        
        try
        {
           p = Runtime.getRuntime().exec(mapDrive);
           System.out.println(p.toString());
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong with trying to mount drive");    
        }
      
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Windows".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());

                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new MainView().setVisible(true);
            }
        });
    }
    
    
    public static char getStorageDir()
    {
    	return SHARE_DRIVE_DIR;
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JLabel errorIdLabel;
    private javax.swing.JList jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel oliSymbol;
    private javax.swing.JButton studentButton;
    private javax.swing.JTextField studentIdString;
    private javax.swing.JLabel studentLoginLabel;
    private javax.swing.JLabel studentPassLabel;
    private javax.swing.JPasswordField studentPassString;
    // End of variables declaration//GEN-END:variables
}
