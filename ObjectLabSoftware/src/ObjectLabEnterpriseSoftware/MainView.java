package ObjectLabEnterpriseSoftware;

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

public class MainView extends javax.swing.JFrame
{
    private static final String NAME_OF_PAGE = "Home";
    private static final char SHARE_DRIVE_DIR = 'Z';

   // AddStudentView newStudentSys;
	//UpdateStudentView updateStudentSys;
    JobsView pendingSys;
    StudentSubmissionView studentSys;
    boolean show;
    String PASS = "ForwardMotion";

    public MainView()
    {
        initComponents();
        this.setResizable(false);
        setPrintersVisible(false);
        njm = new newJobsMgr();
        studentSys = new StudentSubmissionView();
      //  newStudentSys = new AddStudentView();
	//updateStudentSys = new UpdateStudentView();
	
				
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
        errorIdLabel = new javax.swing.JLabel();
        studentIdString = new javax.swing.JTextField();
        studentPassString = new javax.swing.JPasswordField();
        studentButton = new javax.swing.JButton();
        enterBuild = new javax.swing.JButton();
        openProjectsButton = new javax.swing.JButton();
        settingsButton = new javax.swing.JButton();
        ReportsButton = new javax.swing.JButton();
        statsButton = new javax.swing.JButton();
        studentLoginLabel = new javax.swing.JLabel();
        studentPassLabel = new javax.swing.JLabel();
        logoutB = new javax.swing.JButton();
        openProjectsLabel = new javax.swing.JLabel();
        enterBuildLabel = new javax.swing.JLabel();
        ReportsLabel = new javax.swing.JLabel();
        settingsLabel = new javax.swing.JLabel();
        oliSymbol = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        userOptionsMenu = new javax.swing.JMenu();
        newStudentOption = new javax.swing.JMenuItem();
        updateStudentOption = new javax.swing.JMenuItem();
        AdminLogin = new javax.swing.JMenuItem();
        helpButton = new javax.swing.JMenu();
        userGuideButton = new javax.swing.JMenuItem();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(UtilController.getPageName(NAME_OF_PAGE));
        setMinimumSize(new java.awt.Dimension(250, 370));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        
        
        
        
        
        
        errorIdLabel.setBackground(new java.awt.Color(0, 0, 0));
        errorIdLabel.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        errorIdLabel.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(errorIdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 195, 20));

        studentIdString.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        studentIdString.setToolTipText("Enter your student ID.");
        studentIdString.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentIdStringActionPerformed(evt);
            }
        });
        getContentPane().add(studentIdString, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 130, 20));

        studentPassString.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        studentPassString.setToolTipText("Enter your student ID password.");
        studentPassString.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	studentPassStringActionPerformed(evt);
            }
        });

        
        
        
        
        
        studentButton.setBackground(new java.awt.Color(0, 0, 0));
        studentButton.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        studentButton.setText("Login");
        studentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentButtonActionPerformed(evt);
            }
        });
        
        getContentPane().add(studentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 120, -1, 20));

        enterBuild.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ObjectLabEnterpriseSoftware/images/hammer_icon.png"))); // NOI18N
        enterBuild.setToolTipText("");
        enterBuild.setContentAreaFilled(false);
        enterBuild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterBuildActionPerformed(evt);
            }
        });
        getContentPane().add(enterBuild, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 60, 60));

        openProjectsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ObjectLabEnterpriseSoftware/images/clipboard_icon.png"))); // NOI18N
        openProjectsButton.setToolTipText("");
        openProjectsButton.setContentAreaFilled(false);
        openProjectsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openProjectsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(openProjectsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 60, 60));

        settingsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ObjectLabEnterpriseSoftware/images/cog_icon.png"))); // NOI18N
        settingsButton.setToolTipText("");
        settingsButton.setContentAreaFilled(false);
        settingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(settingsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 60, 70));

        ReportsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ObjectLabEnterpriseSoftware/images/reports_icon.png"))); // NOI18N
        ReportsButton.setToolTipText("");
        ReportsButton.setContentAreaFilled(false);
        ReportsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ReportsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 70, -1));
        
        
        ///
        
        	 // press enter when you want to login ~testing Alex 4/13
        studentPassString.addKeyListener(new KeyAdapter()
        {
            public void keyTyped(KeyEvent e)
            {
                char c = e.getKeyChar();
                if(c == KeyEvent.VK_ENTER)
                {
                	attemptLogin();
                }
            }
        });
        
        
        ////
        

        studentLoginLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        studentLoginLabel.setText("Enter Your Net ID:");
        getContentPane().add(studentLoginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 20));
        
        
        studentPassLabel.setFont(new java.awt.Font("Segoe UI", 1, 12));
        studentPassLabel.setText("Password:");
        
        //(int x, int y, int width, int height) 
        getContentPane().add(studentPassString, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 130, 20));

        getContentPane().add(studentPassLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 140, 20));
        
   
        
        
        logoutB.setBackground(new java.awt.Color(0, 0, 0));
        logoutB.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        logoutB.setText("Logout");
        logoutB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBActionPerformed(evt);
            }
        });
        getContentPane().add(logoutB, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 70, -1));

        openProjectsLabel.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        openProjectsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        openProjectsLabel.setText("View Projects");
        getContentPane().add(openProjectsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 70, 130, -1));

        enterBuildLabel.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        enterBuildLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enterBuildLabel.setText("Enter Build");
        getContentPane().add(enterBuildLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 70, -1));

        ReportsLabel.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        ReportsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ReportsLabel.setText("Reports");
        getContentPane().add(ReportsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 70, -1));

        settingsLabel.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        settingsLabel.setText("Settings");
        getContentPane().add(settingsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        oliSymbol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ObjectLabEnterpriseSoftware/images/main_logo.png"))); // NOI18N
        getContentPane().add(oliSymbol, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, 150));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ObjectLabEnterpriseSoftware/images/white_bg.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 325));

        userOptionsMenu.setText("User Options");
        userOptionsMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userOptionsMenuActionPerformed(evt);
            }
        });
        /*
        newStudentOption.setText("Add User");
        newStudentOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newStudentOptionActionPerformed(evt);
            }
        });
        userOptionsMenu.add(newStudentOption); 
        updateStudentOption.setText("Update User Login Info");
        updateStudentOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateStudentOptionActionPerformed(evt);
            }
        });
        userOptionsMenu.add(updateStudentOption);*/

        AdminLogin.setText("Administrator Login");
        AdminLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminLoginActionPerformed(evt);
            }
        });
        userOptionsMenu.add(AdminLogin);

        MenuBar.add(userOptionsMenu);

	/*
        helpButton.setText("Help");
        userGuideButton.setText("User Guide");
        userGuideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userGuideButtonActionPerformed(evt);
            }
        });
        helpButton.add(userGuideButton);
        MenuBar.add(helpButton);
        */

        setJMenuBar(MenuBar);
        
        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void enterBuildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterBuildActionPerformed
        // TODO add your handling code here:
        BuildView Build = new BuildView();
        Build.startMakeBuildProcess();
        dispose();
    }//GEN-LAST:event_enterBuildActionPerformed

    private void openProjectsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openProjectsButtonActionPerformed
        // TODO add your handling code here:
        //pendingSys.PendingJobsStart();
    		njm.setVisible(true);
        dispose();
    }//GEN-LAST:event_openProjectsButtonActionPerformed

    private void ReportsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportsButtonActionPerformed
        // TODO add your handling code here:
        ReportsView reports = new ReportsView();
		reports.setLocationRelativeTo(this);
        reports.ReportsPage();
        dispose();
    }//GEN-LAST:event_ReportsButtonActionPerformed
    
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
                studentPassLabel.setVisible(false);
	} 
	
	public void showStudentOptions()
	{
		studentButton.setVisible(true);
		studentIdString.setVisible(true);
		studentPassString.setVisible(true);
                oliSymbol.setVisible(true);
                studentLoginLabel.setVisible(true);
                studentPassLabel.setVisible(true);
	}
	
	
	private void attemptLogin()
	{
        setPrintersVisible(false);
        String idString = studentIdString.getText();//DB team this is to store String
        String password = new String(studentPassString.getPassword());
        if (idString.length() < 2)
        {
            errorIdLabel.setText("USER ID must be at least 2 characters.");
        } else
        {
            if (UtilController.userIDExist(idString, password))
            {
                errorIdLabel.setText("");
                dispose();
                studentSys.studentSubmissionStart(idString, UtilController.getStudentFname());
            } else
            {
                errorIdLabel.setText("Invalid TU ID or Password.");
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
            errorIdLabel.setText("USER ID must be at least 2 characters.");
        } else
        {
            if (UtilController.userIDExist(idString, password))
            {
                errorIdLabel.setText("");
                dispose();
                studentSys.studentSubmissionStart(idString, UtilController.getStudentFname());
            } else
            {
                errorIdLabel.setText("Invalid TU ID or Password.");
            }
        }
    }//GEN-LAST:event_studentButtonActionPerformed

    private void studentIdStringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentIdStringActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_studentIdStringActionPerformed

    private void studentPassStringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentIdStringActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_studentIdStringActionPerformed
    private void userGuideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userGuideButtonActionPerformed
        UtilController.openAdminHelpPage();
    }//GEN-LAST:event_userGuideButtonActionPerformed

    private void logoutBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBActionPerformed
        setPrintersVisible(false);
        showStudentOptions();
    }//GEN-LAST:event_logoutBActionPerformed

    private void userOptionsMenuActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_userOptionsMenuActionPerformed
    {//GEN-HEADEREND:event_userOptionsMenuActionPerformed
	// Nothing
    }//GEN-LAST:event_userOptionsMenuActionPerformed

    private void updateStudentOptionActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_updateStudentOptionActionPerformed
    {//GEN-HEADEREND:event_updateStudentOptionActionPerformed
        setPrintersVisible(false);

        String idString = studentIdString.getText(); //DB team this is to store String
        char[] password = studentPassString.getPassword();
        String pw = new String(password);
        if (idString.length() != 7)
        {
            errorIdLabel.setText("USER ID must be 7 digits");
        } else
        {
            if (UtilController.userIDExist(idString, pw))
            {
                errorIdLabel.setText("");
                dispose();
              //  updateStudentSys.UpdateStudentViewStart(idString);
            } else
            {
                errorIdLabel.setText("USER ID does not exist");
            }
        }
    }//GEN-LAST:event_updateStudentOptionActionPerformed

    private void newStudentOptionActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_newStudentOptionActionPerformed
    {//GEN-HEADEREND:event_newStudentOptionActionPerformed
       // newStudentSys.NewStudentViewStart();
        dispose();
    }//GEN-LAST:event_newStudentOptionActionPerformed

    private void AdminLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminLoginActionPerformed
        PasswordDialogView dialogue = new PasswordDialogView();
        dialogue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dialogue.setAlwaysOnTop(true);
        dialogue.setVisible(true);
        dialogue.setLocationRelativeTo(this);
        dialogue.setResizable(false);
        errorIdLabel.setVisible(false);
        
        this.dispose();
    }//GEN-LAST:event_AdminLoginActionPerformed

    private void settingsButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
        AdminSettingsView ad = new AdminSettingsView();
        ad.AdminSettingsViewStart();
        dispose();
    }

    public void setPrintersVisible(boolean isVisible)
    {
	studentButton.setVisible(!isVisible);
	studentIdString.setVisible(!isVisible);
	studentPassString.setVisible(!isVisible);
        oliSymbol.setVisible(!isVisible);
        studentLoginLabel.setVisible(!isVisible);
        studentPassLabel.setVisible(!isVisible);
	settingsButton.setVisible(isVisible);
	settingsLabel.setVisible(isVisible);
	openProjectsButton.setVisible(isVisible);
	openProjectsLabel.setVisible(isVisible);
	enterBuild.setVisible(isVisible);
	enterBuildLabel.setVisible(isVisible);
	ReportsButton.setVisible(isVisible);
	ReportsLabel.setVisible(isVisible);
	//statsButton.setVisible(isVisible);
	logoutB.setVisible(isVisible);
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
    private javax.swing.JMenuItem AdminLogin;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JButton ReportsButton;
    private javax.swing.JButton statsButton;
    private javax.swing.JLabel ReportsLabel;
    private javax.swing.JButton enterBuild;
    private javax.swing.JLabel enterBuildLabel;
    private javax.swing.JLabel errorIdLabel;
    private javax.swing.JMenu helpButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton logoutB;
    private javax.swing.JMenuItem newStudentOption;
    private javax.swing.JLabel oliSymbol;
    private javax.swing.JButton openProjectsButton;
    private javax.swing.JLabel openProjectsLabel;
    private javax.swing.JButton settingsButton;
    private javax.swing.JLabel settingsLabel;
    private javax.swing.JButton studentButton;
    private javax.swing.JTextField studentIdString;
    private javax.swing.JPasswordField studentPassString;
    private javax.swing.JLabel studentLoginLabel;
    private javax.swing.JLabel studentPassLabel;
    private javax.swing.JMenuItem updateStudentOption;
    private javax.swing.JMenuItem userGuideButton;
    private javax.swing.JMenu userOptionsMenu;
    private  newJobsMgr njm;
    // End of variables declaration//GEN-END:variables
}