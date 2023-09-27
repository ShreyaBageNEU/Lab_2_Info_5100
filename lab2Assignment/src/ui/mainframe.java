/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import model.VitalSignHistory;

/**
 *
 * @author Shreya Bage
 */
public class mainframe extends javax.swing.JFrame {

    /**
     * Creates new form mainframe
     */
    VitalSignHistory history;
    public mainframe() {
        initComponents();
        
        history = new VitalSignHistory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        controlpanel = new javax.swing.JPanel();
        createvitals = new javax.swing.JButton();
        ViewVitals = new javax.swing.JButton();
        workpanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        createvitals.setText("Create Vitals");
        createvitals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createvitalsActionPerformed(evt);
            }
        });

        ViewVitals.setText("View Vitals");
        ViewVitals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewVitalsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlpanelLayout = new javax.swing.GroupLayout(controlpanel);
        controlpanel.setLayout(controlpanelLayout);
        controlpanelLayout.setHorizontalGroup(
            controlpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createvitals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ViewVitals, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        controlpanelLayout.setVerticalGroup(
            controlpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlpanelLayout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(createvitals)
                .addGap(50, 50, 50)
                .addComponent(ViewVitals)
                .addContainerGap(269, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(controlpanel);

        javax.swing.GroupLayout workpanelLayout = new javax.swing.GroupLayout(workpanel);
        workpanel.setLayout(workpanelLayout);
        workpanelLayout.setHorizontalGroup(
            workpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 476, Short.MAX_VALUE)
        );
        workpanelLayout.setVerticalGroup(
            workpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 549, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(workpanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createvitalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createvitalsActionPerformed
        // Create an instance of the CreatePanel JPanel in the MainFrame
        // so that when you click on the "create vitals" button you will come to the create vitals panel containing the form
        CreatePanel createPanel = new CreatePanel(history);
        jSplitPane1.setRightComponent(createPanel);
    }//GEN-LAST:event_createvitalsActionPerformed

    private void ViewVitalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewVitalsActionPerformed
        ViewJpanel viewPanel = new ViewJpanel(history);
        jSplitPane1.setRightComponent(viewPanel);
    }//GEN-LAST:event_ViewVitalsActionPerformed

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
    private javax.swing.JButton ViewVitals;
    private javax.swing.JPanel controlpanel;
    private javax.swing.JButton createvitals;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel workpanel;
    // End of variables declaration//GEN-END:variables
}
