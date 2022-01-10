/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package pl.edu.pw.medcomplexsoft.gui;

import java.util.List;
import java.util.Vector;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.swing.JOptionPane;

import pl.edu.pw.medcomplexsoft.database.Database;
import pl.edu.pw.medcomplexsoft.model.Doctor;
import pl.edu.pw.medcomplexsoft.model.Patient;
import pl.edu.pw.medcomplexsoft.model.Person;
import pl.edu.pw.medcomplexsoft.model.Prescription;
import pl.edu.pw.medcomplexsoft.model.Status;


/**
 *
 * @author hubert
 */
public class PrescriptionListDialog extends javax.swing.JDialog {
    private Person user;
    private List<Prescription> prescriptionObjectList;
    /**
     * Creates new form ReceiptListDialog
     */
    public PrescriptionListDialog(java.awt.Frame parent, boolean modal, Person user) {
        super(parent, modal);
        initComponents();
        this.user = user;
        if(!(user instanceof Doctor))
            cancelReceiptButton.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        receiptsList = new javax.swing.JList<>();
        newReceiptButton = new javax.swing.JButton();
        cancelReceiptButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        showReceiptButton = new javax.swing.JButton();
        activeRadioButton = new javax.swing.JRadioButton();
        cancelledRadioButton = new javax.swing.JRadioButton();
        realisedRadioButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista recept");

        receiptsList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(receiptsList);

        newReceiptButton.setText("Nowa recepta");
        newReceiptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newReceiptButtonActionPerformed(evt);
            }
        });

        cancelReceiptButton.setText("Anuluj receptę");
        cancelReceiptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelReceiptButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Zamknij");

        showReceiptButton.setText("Wyswietl");
        showReceiptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showReceiptButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(activeRadioButton);
        activeRadioButton.setSelected(true);
        activeRadioButton.setText("Wystawiona");
        activeRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activeRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(cancelledRadioButton);
        cancelledRadioButton.setText("Anulowana");
        cancelledRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelledRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(realisedRadioButton);
        realisedRadioButton.setText("Zrealizowana");
        realisedRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realisedRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cancelReceiptButton, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                        .addComponent(newReceiptButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(showReceiptButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(activeRadioButton)
                    .addComponent(cancelledRadioButton)
                    .addComponent(realisedRadioButton))
                .addGap(0, 28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(newReceiptButton)
                .addGap(32, 32, 32)
                .addComponent(cancelReceiptButton)
                .addGap(39, 39, 39)
                .addComponent(showReceiptButton)
                .addGap(60, 60, 60)
                .addComponent(activeRadioButton)
                .addGap(18, 18, 18)
                .addComponent(cancelledRadioButton)
                .addGap(18, 18, 18)
                .addComponent(realisedRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitButton)
                .addGap(70, 70, 70))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelReceiptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelReceiptButtonActionPerformed
        int selectedIndex = receiptsList.getSelectedIndex();
        if(selectedIndex == -1)
            JOptionPane.showMessageDialog(this, "Nie wybrano żadnej recepty do anulowania do usunięcia",
                "Błąd", JOptionPane.ERROR_MESSAGE);
        else {
            int selection = JOptionPane.showConfirmDialog(this, "Czy potwierdzasz anulowanie tej recepty?", "Potwierdzenie",
                                                JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(selection == JOptionPane.OK_OPTION)
            {
                EntityManager entityManager = Database.getEntityManager();
                Prescription selectedPrescription = prescriptionObjectList.get(selectedIndex);
                selectedPrescription.setStatus(Status.CANCELLED);
                var tx = entityManager.getTransaction();
                tx.begin();
                entityManager.merge(selectedPrescription);
                tx.commit();
            }
        }
    }//GEN-LAST:event_cancelReceiptButtonActionPerformed

    private void showReceiptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showReceiptButtonActionPerformed
        int selectedIndex = receiptsList.getSelectedIndex();
        if(selectedIndex == -1)
            JOptionPane.showMessageDialog(this, "Nie wybrano żadnej recepty do anulowania do usunięcia",
                "Błąd", JOptionPane.ERROR_MESSAGE);
        else {
            PrescpriptionViewDialog prescpriptionViewDialog = new PrescpriptionViewDialog(null, true, prescriptionObjectList.get(selectedIndex));
            prescpriptionViewDialog.setLocationRelativeTo(this.rootPane);
            prescpriptionViewDialog.showDialog();
        }
    }//GEN-LAST:event_showReceiptButtonActionPerformed

    private void newReceiptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newReceiptButtonActionPerformed
        NewPrescriptionDialog newPrescriptionDialog = new NewPrescriptionDialog(null, true, (Doctor)user);
        newPrescriptionDialog.setLocationRelativeTo(this.rootPane);
        newPrescriptionDialog.setVisible(true);
    }//GEN-LAST:event_newReceiptButtonActionPerformed

    private void activeRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activeRadioButtonActionPerformed
        loadData();
    }//GEN-LAST:event_activeRadioButtonActionPerformed

    private void cancelledRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelledRadioButtonActionPerformed
        loadData();
    }//GEN-LAST:event_cancelledRadioButtonActionPerformed

    private void realisedRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realisedRadioButtonActionPerformed
        loadData();
    }//GEN-LAST:event_realisedRadioButtonActionPerformed

    public void showDialog(){
        loadData();
        setVisible(true);
    }

    private void loadData() {
        EntityManager entityManager = Database.getEntityManager();

        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Prescription> criteriaQuery = criteriaBuilder.createQuery(Prescription.class);
        Root<Prescription> prescriptionRoot = criteriaQuery.from(Prescription.class);

        Predicate statusPredicate = criteriaBuilder.equal(prescriptionRoot.get("status"), Status.ACTIVE);
        if(cancelledRadioButton.isSelected())
            statusPredicate = criteriaBuilder.equal(prescriptionRoot.get("status"), Status.CANCELLED);
        else if(realisedRadioButton.isSelected())
            statusPredicate = criteriaBuilder.equal(prescriptionRoot.get("status"), Status.REALISED);

        Predicate secondPredicate;
        Predicate finalPredicate;
        if(user != null && user instanceof Doctor) {
            secondPredicate = criteriaBuilder.equal(prescriptionRoot.get("doctor").get("id"), user.getId());
            finalPredicate = criteriaBuilder.and(secondPredicate, statusPredicate);
        }
        else if(user != null && user instanceof Patient) {
            secondPredicate =  criteriaBuilder.equal(prescriptionRoot.get("patient").get("id"), user.getId());
            finalPredicate = criteriaBuilder.and(secondPredicate, statusPredicate);
        } else
            finalPredicate = statusPredicate;

        criteriaQuery.where(finalPredicate);
        prescriptionObjectList = entityManager.createQuery(criteriaQuery).getResultList();
        Vector<String> listData = new Vector<String>();
        prescriptionObjectList.forEach(p -> listData.add("Recepta nr " + p.getId() + " dla  " + p.getReceivingPatient().getFullName()));
        receiptsList.setListData(listData);
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
            java.util.logging.Logger.getLogger(PrescriptionListDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrescriptionListDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrescriptionListDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrescriptionListDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PrescriptionListDialog dialog = new PrescriptionListDialog(new javax.swing.JFrame(), true, null);
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
    private javax.swing.JRadioButton activeRadioButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancelReceiptButton;
    private javax.swing.JRadioButton cancelledRadioButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton newReceiptButton;
    private javax.swing.JRadioButton realisedRadioButton;
    private javax.swing.JList<String> receiptsList;
    private javax.swing.JButton showReceiptButton;
    // End of variables declaration//GEN-END:variables
}
