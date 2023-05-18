/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.titlebar;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class TitleBar extends javax.swing.JPanel {
    
    private int currentState;
    private Point pressed;
    private final MainFrame MAIN;
    private ComponentResizer resize;

    public TitleBar(MainFrame MAIN) {
        this.MAIN = MAIN;
        initComponents();
    }
    public void init(JFrame MAIN) {
        resize = new ComponentResizer();
        resize.setSnapSize(new Dimension(10, 10));
        resize.setMinimumSize(new Dimension(300, 200));
        resize.setMaximumSize(Toolkit.getDefaultToolkit().getScreenSize());
        resize.registerComponent(MAIN);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        moveableButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        minimizeButton = new javax.swing.JButton();
        maximizeButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(39, 39, 39));

        moveableButton.setContentAreaFilled(false);
        moveableButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        moveableButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                moveableButtonMouseDragged(evt);
            }
        });
        moveableButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                moveableButtonMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                moveableButtonMousePressed(evt);
            }
        });
        moveableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveableButtonActionPerformed(evt);
            }
        });

        exitButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Downloads\\close.png")); // NOI18N
        exitButton.setContentAreaFilled(false);
        exitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        minimizeButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Downloads\\minus.png")); // NOI18N
        minimizeButton.setContentAreaFilled(false);
        minimizeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizeButtonActionPerformed(evt);
            }
        });

        maximizeButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Downloads\\copy.png")); // NOI18N
        maximizeButton.setContentAreaFilled(false);
        maximizeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        maximizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maximizeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(moveableButton, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minimizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(maximizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(moveableButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(exitButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(minimizeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(maximizeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        MAIN.dispose();
    }//GEN-LAST:event_exitButtonActionPerformed

    private void minimizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizeButtonActionPerformed
        MAIN.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeButtonActionPerformed

    private void maximizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maximizeButtonActionPerformed
        if(MAIN.isResizable()){
            if (MAIN.getExtendedState() == JFrame.MAXIMIZED_BOTH) {
                MAIN.setExtendedState(JFrame.NORMAL);
                currentState = 1;
            } else {
                MAIN.setExtendedState(JFrame.MAXIMIZED_BOTH);
                currentState = 6;
            }
        }
    }//GEN-LAST:event_maximizeButtonActionPerformed

    private void moveableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveableButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_moveableButtonActionPerformed

    private void moveableButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveableButtonMousePressed
        pressed = evt.getPoint();
    }//GEN-LAST:event_moveableButtonMousePressed

    private void moveableButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveableButtonMouseClicked
        if (evt.getClickCount() == 2) {
            if (MAIN.getExtendedState() == JFrame.MAXIMIZED_BOTH) {
                MAIN.setExtendedState(JFrame.NORMAL);
                currentState = 1;
            } else {
                MAIN.setExtendedState(JFrame.MAXIMIZED_BOTH);
                currentState = 6;
            }
        }
    }//GEN-LAST:event_moveableButtonMouseClicked

    private void moveableButtonMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveableButtonMouseDragged
        MAIN.setExtendedState(JFrame.NORMAL);
        int thisX = MAIN.getLocation().x;
        int thisY = MAIN.getLocation().y;

        int xMoved = evt.getX() - pressed.x;
        int yMoved = evt.getY() - pressed.y;

        int X = thisX + xMoved;
        int Y = thisY + yMoved;
        MAIN.setLocation(X, Y);
    }//GEN-LAST:event_moveableButtonMouseDragged
    
    public int getCurrentState(){
        return currentState;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitButton;
    private javax.swing.JButton maximizeButton;
    private javax.swing.JButton minimizeButton;
    private javax.swing.JButton moveableButton;
    // End of variables declaration//GEN-END:variables
}
