/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Qvi
 */
public class AddBook extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddBook
     */
    public AddBook() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        abAdd = new javax.swing.JButton();
        abUpdate = new javax.swing.JButton();
        abDelete = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        abBID = new javax.swing.JTextField();
        abName = new javax.swing.JTextField();
        abPrice = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        abP = new javax.swing.JTextArea();
        abC = new javax.swing.JComboBox<>();
        abD = new javax.swing.JComboBox<>();
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(580, 410));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel11.setText("Add Book");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, -1, -1));

        jLabel3.setText("BookID: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel4.setText("Name: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel5.setText("Date: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel6.setText("Category: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel7.setText("Department: ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jLabel8.setText("Publisher: ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));

        jLabel9.setText("Price: ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, -1, -1));

        abAdd.setText("Add");
        jPanel1.add(abAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 80, -1));

        abUpdate.setText("Update");
        jPanel1.add(abUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 80, -1));

        abDelete.setText("Delete");
        jPanel1.add(abDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 80, -1));

        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 140, 230));
        jPanel1.add(abBID, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 130, -1));
        jPanel1.add(abName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 130, -1));
        jPanel1.add(abPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 110, -1));

        abP.setColumns(20);
        abP.setRows(5);
        jScrollPane2.setViewportView(abP);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 160, -1));

        abC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(abC, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 130, -1));

        abD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "CSE", "BBA", "Pharmacy", "Law", "English", "Architecture", "FET", "English", "Public Health" }));
        abD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abDActionPerformed(evt);
            }
        });
        jPanel1.add(abD, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 130, -1));
        jPanel1.add(dateChooserCombo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 130, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 160, -1));

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 580, 70));

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 580, 390));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 580, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_abDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abAdd;
    private javax.swing.JTextField abBID;
    private javax.swing.JComboBox<String> abC;
    private javax.swing.JComboBox<String> abD;
    private javax.swing.JButton abDelete;
    private javax.swing.JTextField abName;
    private javax.swing.JTextArea abP;
    private javax.swing.JTextField abPrice;
    private javax.swing.JButton abUpdate;
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
