/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.chrisle.netbeans.plugins.nbsymlink.components;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author ChrisLE
 */
public class CreateSymlinkDialog extends javax.swing.JDialog {
    private JFileChooser _fileChooser;
    private File _currentFolder;
    
    /**
     * Creates new form CreateSymlinkDialog
     */
    public CreateSymlinkDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        this._fileChooser = new JFileChooser();
    }
    
    public void setFileChooserDir(File currentFolder, boolean isSource) {
        this._currentFolder = currentFolder;
        this._fileChooser.setCurrentDirectory(currentFolder);
        
        if (isSource) {
            this._sourceFolder.setText(currentFolder.getPath());
        } else {
            this._targetFolder.setText(currentFolder.getPath());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        _sourceFolderLabel = new javax.swing.JLabel();
        _sourceFolder = new javax.swing.JTextField();
        _sourceFolderChooserBtn = new javax.swing.JButton();
        _targetFolderLabel = new javax.swing.JLabel();
        _targetFolder = new javax.swing.JTextField();
        _targetFolderChooserBtn = new javax.swing.JButton();
        _createSymlink = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        org.openide.awt.Mnemonics.setLocalizedText(_sourceFolderLabel, org.openide.util.NbBundle.getMessage(CreateSymlinkDialog.class, "CreateSymlinkDialog._sourceFolderLabel.text")); // NOI18N

        _sourceFolder.setText(org.openide.util.NbBundle.getMessage(CreateSymlinkDialog.class, "CreateSymlinkDialog._sourceFolder.text")); // NOI18N
        _sourceFolder.setMinimumSize(new java.awt.Dimension(4, 25));
        _sourceFolder.setPreferredSize(new java.awt.Dimension(4, 25));

        org.openide.awt.Mnemonics.setLocalizedText(_sourceFolderChooserBtn, org.openide.util.NbBundle.getMessage(CreateSymlinkDialog.class, "CreateSymlinkDialog._sourceFolderChooserBtn.text")); // NOI18N
        _sourceFolderChooserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _sourceFolderChooserBtnActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(_targetFolderLabel, org.openide.util.NbBundle.getMessage(CreateSymlinkDialog.class, "CreateSymlinkDialog._targetFolderLabel.text")); // NOI18N

        _targetFolder.setText(org.openide.util.NbBundle.getMessage(CreateSymlinkDialog.class, "CreateSymlinkDialog._targetFolder.text")); // NOI18N
        _targetFolder.setMinimumSize(new java.awt.Dimension(4, 25));
        _targetFolder.setPreferredSize(new java.awt.Dimension(4, 25));

        org.openide.awt.Mnemonics.setLocalizedText(_targetFolderChooserBtn, org.openide.util.NbBundle.getMessage(CreateSymlinkDialog.class, "CreateSymlinkDialog._targetFolderChooserBtn.text")); // NOI18N
        _targetFolderChooserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _targetFolderChooserBtnActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(_createSymlink, org.openide.util.NbBundle.getMessage(CreateSymlinkDialog.class, "CreateSymlinkDialog._createSymlink.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(_targetFolderLabel)
                            .addComponent(_sourceFolderLabel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 168, Short.MAX_VALUE)
                                .addComponent(_createSymlink))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(_sourceFolder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(_sourceFolderChooserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(_targetFolder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(_targetFolderChooserBtn)))
                        .addGap(32, 32, 32))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(_sourceFolderLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_sourceFolder, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_sourceFolderChooserBtn))
                .addGap(18, 18, 18)
                .addComponent(_targetFolderLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_targetFolder, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_targetFolderChooserBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(_createSymlink)
                .addContainerGap())
        );

        _targetFolderLabel.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(CreateSymlinkDialog.class, "CreateSymlinkDialog._targetFolderLabel.AccessibleContext.accessibleName")); // NOI18N

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void _sourceFolderChooserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__sourceFolderChooserBtnActionPerformed
        this._fileChooser.showOpenDialog(null);
    }//GEN-LAST:event__sourceFolderChooserBtnActionPerformed

    private void _targetFolderChooserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__targetFolderChooserBtnActionPerformed
        this._fileChooser.showOpenDialog(null);
    }//GEN-LAST:event__targetFolderChooserBtnActionPerformed

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
            java.util.logging.Logger.getLogger(CreateSymlinkDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateSymlinkDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateSymlinkDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateSymlinkDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CreateSymlinkDialog dialog = new CreateSymlinkDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton _createSymlink;
    private javax.swing.JTextField _sourceFolder;
    private javax.swing.JButton _sourceFolderChooserBtn;
    private javax.swing.JLabel _sourceFolderLabel;
    private javax.swing.JTextField _targetFolder;
    private javax.swing.JButton _targetFolderChooserBtn;
    private javax.swing.JLabel _targetFolderLabel;
    // End of variables declaration//GEN-END:variables
}
