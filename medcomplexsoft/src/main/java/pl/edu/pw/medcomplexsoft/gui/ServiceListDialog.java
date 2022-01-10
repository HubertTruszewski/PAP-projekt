/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package pl.edu.pw.medcomplexsoft.gui;

import java.util.List;
import java.util.Vector;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;

import pl.edu.pw.medcomplexsoft.database.Database;
import pl.edu.pw.medcomplexsoft.model.Service;


/**
 *
 * @author hubert
 */
public class ServiceListDialog extends javax.swing.JDialog {

    private List<Service> serviceObjectList;
    /**
     * Creates new form MedicineListDialog
     */
    public ServiceListDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        serviceList = new javax.swing.JList<>();
        newButton = new javax.swing.JButton();
        changeButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        okButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista leków");

        serviceList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(serviceList);

        newButton.setText("Nowy");
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });

        changeButton.setText("Zmień");
        changeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Usuń");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        okButton.setText("Ok");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(newButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(changeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                        .addComponent(okButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(newButton)
                .addGap(40, 40, 40)
                .addComponent(changeButton)
                .addGap(40, 40, 40)
                .addComponent(deleteButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(okButton)
                .addGap(95, 95, 95))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_okButtonActionPerformed

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        NewServiceDialog newServiceDialog = new NewServiceDialog();
        newServiceDialog.setLocationRelativeTo(this.rootPane);
        newServiceDialog.showDialog();
        loadData();
    }//GEN-LAST:event_newButtonActionPerformed

    private void changeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeButtonActionPerformed
        int selectedMedicineIndex = serviceList.getSelectedIndex();
        if(selectedMedicineIndex != -1)
        {
            Service selectedService = serviceObjectList.get(selectedMedicineIndex);
            NewServiceDialog newServiceDialog = new NewServiceDialog(selectedService);
            newServiceDialog.setLocationRelativeTo(this.rootPane);
            newServiceDialog.showDialog();
            loadData();
        } else {
            JOptionPane.showMessageDialog(this, "Nie wybrano żadnego leku z listy",
                                              "Błąd", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_changeButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        EntityManager entityManager = Database.getEntityManager();
        int selectedServiceIndex = serviceList.getSelectedIndex();
        if(serviceList.getSelectedIndex() != -1)
        {
            Service removingService = serviceObjectList.get(selectedServiceIndex);
            int selection = JOptionPane.showConfirmDialog(this, "Czy potwierdzasz usuniecie usługi " + removingService.getName()+"?",
                                                    "Potwierdzenie",
                                                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(selection == JOptionPane.OK_OPTION)
            {
                if(removingService.getServicePositions().size() != 0)
                {
                    JOptionPane.showMessageDialog(this, "Nie można usunąć usługi, który została już wykonana",
                                                "Błąd", JOptionPane.ERROR_MESSAGE);
                } else {
                    var tx = entityManager.getTransaction();
                    tx.begin();
                    entityManager.remove(removingService);
                    tx.commit();
                    loadData();
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Nie wybrano żadnej usługi z listy",
                                              "Błąd", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void loadData() {
        EntityManager entityManager = Database.getEntityManager();
        TypedQuery<Service> typedQuery = entityManager.createQuery("SELECT s FROM Service s", Service.class);
        serviceObjectList = typedQuery.getResultList();
        Vector<String> stringServiceVector = new Vector<String>();
        for(int i=1; i<=serviceObjectList.size(); ++i)
        {
            var service= serviceObjectList.get(i-1);
            stringServiceVector.add(i + ". " + service.getName() + " " + service.getPrice());
        }
        serviceList.setListData(stringServiceVector);
    }

    public Service showDialog() {
        loadData();
        setVisible(true);
        int selectedIndex = serviceList.getSelectedIndex();
        if(selectedIndex != -1)
            return serviceObjectList.get(selectedIndex);
        return null;
    }

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
            java.util.logging.Logger.getLogger(ServiceListDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServiceListDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServiceListDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServiceListDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ServiceListDialog dialog = new ServiceListDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton changeButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton newButton;
    private javax.swing.JButton okButton;
    private javax.swing.JList<String> serviceList;
    // End of variables declaration//GEN-END:variables
}
