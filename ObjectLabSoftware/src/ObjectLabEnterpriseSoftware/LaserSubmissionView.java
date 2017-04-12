package ObjectLabEnterpriseSoftware;

import java.awt.Color;
import java.awt.EventQueue;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Russell
 */
public class LaserSubmissionView extends javax.swing.JFrame {

    /**
     * Creates new form LaserSubmissionView
     */
    private boolean cancel;
    private LaserSubmissionView laserSubmissionView;
    private newStudentView newStudentView;
    private JPanel contentPane;
    private String name;
    private String id;
    private LaserTimeView timeView;
    private newStudentView newStuView;
    
    public LaserSubmissionView(){
        
    }
    
    public void LaserSubmissionView(String userID, String userName) {
        name = userName;
        id = userID;
        System.out.println("construct\n");
        getContentPane().setBackground(Color.WHITE);
        cancel = false; 
        
        setTitle("Laser Submission View");
        setResizable(false);
        initComponents();
        setVisible(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        cancel1 = new javax.swing.JButton();
        material = new javax.swing.JComboBox();
        thickness = new javax.swing.JTextField();
        label4 = new java.awt.Label();
        monName = new javax.swing.JTextField();

        jLabel5.setText("jLabel5");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Laser Cutter Submission");

        jLabel2.setText("Material:");

        jLabel3.setText("Thickness:");

        submit.setText("Submit");
        submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitMouseClicked(evt);
            }
        });

        cancel1.setText("Cancel");
        cancel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancel1MouseClicked(evt);
            }
        });
        cancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel1ActionPerformed(evt);
            }
        });

        material.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Plastic", "Metal", "Wood", "Other" }));
        material.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                materialComponentHidden(evt);
            }
        });
        material.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialActionPerformed(evt);
            }
        });

        label4.setText("Lab Monitor Name:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cancel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(submit))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(300, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(material, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(thickness, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(monName)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(monName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(material, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(thickness, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel1)
                    .addComponent(submit))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel1MouseClicked
        newStuView = new newStudentView();
        newStuView.newStudentView(id, name);
        dispose();   
    }//GEN-LAST:event_cancel1MouseClicked

    private void submitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitMouseClicked
        System.out.println("submit\n");


        String monitorName = monName.getText();
        String materialType = (String) material.getSelectedItem();
        double thick = 0;
        try{
            System.out.println("Start try lasersub");
            thick = Double.parseDouble(thickness.getText());  
            timeView = new LaserTimeView();
            timeView.LaserTimeView(id, name, monitorName, materialType, thick, 0,0,0);
            //setVisible(false);
            dispose();
        }
        catch(NumberFormatException E){
            JOptionPane.showMessageDialog(null, "Enter a valid number for thickness", "Invalid Thickness", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_submitMouseClicked

    private void materialComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_materialComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_materialComponentHidden

    private void materialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_materialActionPerformed

    private void cancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel1ActionPerformed
        newStuView = new newStudentView();
        newStuView.newStudentView(id, name);
        dispose();
    }//GEN-LAST:event_cancel1ActionPerformed

    public boolean isCancelled()
    {
        return cancel;
    }
    
    public static void main(String args[]) {
        System.out.println("Main\n");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
                                   
					LaserSubmissionView frame = new LaserSubmissionView();
					frame.setVisible(true);
                                        System.out.println("Frame\n");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuItem jMenuItem1;
    private java.awt.Label label4;
    private javax.swing.JComboBox material;
    private javax.swing.JTextField monName;
    private javax.swing.JButton submit;
    private javax.swing.JTextField thickness;
    // End of variables declaration//GEN-END:variables

}
