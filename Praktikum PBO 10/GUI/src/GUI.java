
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.DefaultListModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author lenovo
 */
public class GUI extends javax.swing.JFrame {
    DefaultListModel<String> dlm;
    List<String> items = new ArrayList<>();
    Set<String> itemsSet = new HashSet<>();
    Map<String, String> itemsMap = new HashMap<>();
    String[] datas = {"buku", "meja", "kursi", "tas", "pintu"};
    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        this.dlm = new DefaultListModel<>();
        this.jListItem.setModel(dlm);
        for (String data : datas){
            dlm.addElement(data);
            updateJumlahDataTersimpan();
            updateJumlahDataSetTersimpan();
            updateJumlahDataMapTersimpan();
        }
    }
    
    public void updateJumlahDataTersimpan(){
        jLabelDataTersimpan.setText("Data Tersimpan: " + items.size());
    }
    
    public void updateJumlahDataSetTersimpan(){
        jLabelDataSetTersimpan.setText("Data Tersimpan: " + itemsSet.size());
    }
    
    public void updateJumlahDataMapTersimpan(){
        jLabelDataMapTersimpan.setText("Data Tersimpan: " + itemsMap.size());
    }
   
    public void addItem(String namaItem) {
        dlm.addElement(namaItem);
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
        jListItem = new javax.swing.JList<>();
        jLabelNamaItem = new javax.swing.JLabel();
        jTextFieldNamaItem = new javax.swing.JTextField();
        jButtonAdd = new javax.swing.JButton();
        jButtonClearAll = new javax.swing.JButton();
        jButtonInsertToList = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jLabelDataTersimpan = new javax.swing.JLabel();
        jButtonSaveToList = new javax.swing.JButton();
        jButtonInsertToSet = new javax.swing.JButton();
        jButtonSaveToSet = new javax.swing.JButton();
        jLabelDataSetTersimpan = new javax.swing.JLabel();
        jLabelDataMapTersimpan = new javax.swing.JLabel();
        jButtonInsertToMap = new javax.swing.JButton();
        jButtonSaveToMap = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jListItem.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "", "", "", "", "" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListItem);

        jLabelNamaItem.setText("Nama Item :");

        jTextFieldNamaItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNamaItemActionPerformed(evt);
            }
        });

        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonClearAll.setText("Clear All");
        jButtonClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearAllActionPerformed(evt);
            }
        });

        jButtonInsertToList.setText("Insert To List");
        jButtonInsertToList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertToListActionPerformed(evt);
            }
        });

        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jLabelDataTersimpan.setText("Data Tersimpan : ");

        jButtonSaveToList.setText("Save To List");
        jButtonSaveToList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveToListActionPerformed(evt);
            }
        });

        jButtonInsertToSet.setText("Insert To Set");
        jButtonInsertToSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertToSetActionPerformed(evt);
            }
        });

        jButtonSaveToSet.setText("Save To Set");
        jButtonSaveToSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveToSetActionPerformed(evt);
            }
        });

        jLabelDataSetTersimpan.setText("Data Tersimpan : ");

        jLabelDataMapTersimpan.setText("Data Tersimpan : ");

        jButtonInsertToMap.setText("Insert To Map");
        jButtonInsertToMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertToMapActionPerformed(evt);
            }
        });

        jButtonSaveToMap.setText("Save To Map");
        jButtonSaveToMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveToMapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonClearAll)
                        .addGap(97, 97, 97)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDelete))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonSaveToList)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelDataTersimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonSaveToSet)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButtonInsertToList)
                                .addComponent(jButtonInsertToSet)
                                .addComponent(jButtonInsertToMap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelNamaItem, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldNamaItem))
                            .addComponent(jButtonSaveToMap))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDataSetTersimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelDataMapTersimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSaveToList)
                            .addComponent(jLabelDataTersimpan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonInsertToList)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSaveToSet)
                            .addComponent(jLabelDataSetTersimpan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonInsertToSet)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSaveToMap)
                            .addComponent(jLabelDataMapTersimpan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonInsertToMap)
                        .addGap(11, 11, 11)
                        .addComponent(jLabelNamaItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNamaItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdd)
                    .addComponent(jButtonUpdate)
                    .addComponent(jButtonDelete)
                    .addComponent(jButtonClearAll))
                .addContainerGap(539, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNamaItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNamaItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNamaItemActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        //addItem(jTextFieldNamaItem.getText());
        String namaItem = jTextFieldNamaItem.getText();
        dlm.addElement(namaItem);
        jTextFieldNamaItem.setText("");
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearAllActionPerformed
        dlm.clear();
    }//GEN-LAST:event_jButtonClearAllActionPerformed

    private void jButtonInsertToListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertToListActionPerformed
        for (String item : items) {
            dlm.addElement(item);
        }
        updateJumlahDataTersimpan();
    }//GEN-LAST:event_jButtonInsertToListActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        int index = jListItem.getSelectedIndex();
        String updated = jTextFieldNamaItem.getText();
        dlm.setElementAt(updated, index);
        jTextFieldNamaItem.setText("");
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        int index = jListItem.getSelectedIndex();
        dlm.removeElementAt(index);
        jTextFieldNamaItem.setText("");
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonSaveToListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveToListActionPerformed
        if (!items.isEmpty()){
            items.clear();
        }
        for (int i=0;i<dlm.getSize();i++){
            items.add(dlm.getElementAt(i));
        }
        updateJumlahDataTersimpan();
    }//GEN-LAST:event_jButtonSaveToListActionPerformed

    private void jButtonInsertToSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertToSetActionPerformed
        for (String item : itemsSet){
            dlm.addElement(item);
        }
        updateJumlahDataSetTersimpan();
    }//GEN-LAST:event_jButtonInsertToSetActionPerformed

    private void jButtonSaveToSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveToSetActionPerformed
        if (!itemsSet.isEmpty()){
            itemsSet.clear();
        }
        for (int i=0;i<dlm.getSize();i++){
            itemsSet.add(dlm.getElementAt(i));
        }
        updateJumlahDataSetTersimpan();
    }//GEN-LAST:event_jButtonSaveToSetActionPerformed

    private void jButtonInsertToMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertToMapActionPerformed
        for (Map.Entry<String, String> item : itemsMap.entrySet()){
            dlm.addElement(item.getValue());
        }
    }//GEN-LAST:event_jButtonInsertToMapActionPerformed

    private void jButtonSaveToMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveToMapActionPerformed
        if (!itemsMap.isEmpty()){
            itemsMap.clear();
        }
        for (int i=0;i<dlm.getSize();i++){
            String item = dlm.getElementAt(i);
            String key = "item_"+i;
            itemsMap.put(key, item);    
        }
        updateJumlahDataMapTersimpan();
    }//GEN-LAST:event_jButtonSaveToMapActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonClearAll;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonInsertToList;
    private javax.swing.JButton jButtonInsertToMap;
    private javax.swing.JButton jButtonInsertToSet;
    private javax.swing.JButton jButtonSaveToList;
    private javax.swing.JButton jButtonSaveToMap;
    private javax.swing.JButton jButtonSaveToSet;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabelDataMapTersimpan;
    private javax.swing.JLabel jLabelDataSetTersimpan;
    private javax.swing.JLabel jLabelDataTersimpan;
    private javax.swing.JLabel jLabelNamaItem;
    private javax.swing.JList<String> jListItem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldNamaItem;
    // End of variables declaration//GEN-END:variables
}
