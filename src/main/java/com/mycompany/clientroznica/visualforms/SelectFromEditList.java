/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clientroznica.visualforms;

import org.springframework.stereotype.Component;

/**
 *
 * @author User
 */
@Component

public class SelectFromEditList extends javax.swing.JDialog {

    private int selectedItem;

    public int getSelectedItem() {
        return selectedItem;
    }

    public void setSelectedItem(int selectedItem) {
        this.selectedItem = selectedItem;
    }

    /**
     * Creates new form SelectFromEditList
     */
 
    
    public SelectFromEditList() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        editList = new javax.swing.JList();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        editList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editListMouseClicked(evt);
            }
        });
        editList.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                editListKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                editListKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(editList);

        okButton.setText("Ok");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Отмена");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(okButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelButton)
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okButton)
                    .addComponent(cancelButton))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editListMouseClicked
        if (editList.getSelectedIndex()>-1&&evt.getClickCount()==2){
            setSelectedItem(editList.getSelectedIndex());
            setVisible(false);
        }
            
    }//GEN-LAST:event_editListMouseClicked

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        if (editList.getSelectedIndex()>-1){
            setSelectedItem(editList.getSelectedIndex());
            setVisible(false);
        }
    }//GEN-LAST:event_okButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
            setSelectedItem(-1);
            setVisible(false);

    }//GEN-LAST:event_cancelButtonActionPerformed

    private void editListKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editListKeyTyped

    }//GEN-LAST:event_editListKeyTyped

    private void editListKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editListKeyPressed
        if (evt.getKeyCode()==10){
            setSelectedItem(editList.getSelectedIndex());
            setVisible(false);
           
        }        
    }//GEN-LAST:event_editListKeyPressed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    public javax.swing.JList editList;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton okButton;
    // End of variables declaration//GEN-END:variables
}
