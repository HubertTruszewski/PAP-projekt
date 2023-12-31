/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package pl.edu.pw.medcomplexsoft.gui;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Vector;

import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

import pl.edu.pw.medcomplexsoft.database.Database;
import pl.edu.pw.medcomplexsoft.model.Doctor;
import pl.edu.pw.medcomplexsoft.model.Patient;
import pl.edu.pw.medcomplexsoft.model.Prescription;
import pl.edu.pw.medcomplexsoft.model.PrescriptionPosition;
import pl.edu.pw.medcomplexsoft.model.Status;

/**
 *
 * @author hubert
 */
public class NewPrescriptionDialog extends javax.swing.JDialog {
    private Patient choosenPatient;
    private Doctor prescribingDoctor;
    ArrayList<PrescriptionPosition> prescriptionPositions = new ArrayList<PrescriptionPosition>();
    /**
     * Creates new form NewPrescriptionDialog
     */
    public NewPrescriptionDialog(java.awt.Frame parent, boolean modal, Doctor doctor) {
        super(parent, modal);
        initComponents();
        prescribingDoctor = doctor;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        patientLabel = new javax.swing.JLabel();
        patientNameLabel = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        choosePatientButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        prescriptionPositionsList = new javax.swing.JList<>();
        newPositionButton = new javax.swing.JButton();
        deletePositionButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        expirationDatePicker = new com.github.lgooddatepicker.components.DatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nowa recepta");

        patientLabel.setText("Pacjent:");

        addButton.setText("Dodaj");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        choosePatientButton.setText("Wybierz");
        choosePatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choosePatientButtonActionPerformed(evt);
            }
        });

        prescriptionPositionsList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(prescriptionPositionsList);

        newPositionButton.setText("Nowa pozycja");
        newPositionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPositionButtonActionPerformed(evt);
            }
        });

        deletePositionButton.setText("Usuń pozycję");
        deletePositionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePositionButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Data ważności:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(newPositionButton, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(deletePositionButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(expirationDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(patientLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(patientNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(choosePatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(patientLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(choosePatientButton)))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(expirationDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(newPositionButton)
                        .addGap(18, 18, 18)
                        .addComponent(deletePositionButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addButton)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        Prescription prescription = new Prescription();
        prescription.setPrescribingDoctor(prescribingDoctor);
        prescription.setReceivingPatient(choosenPatient);
        prescription.setIssueDate(LocalDate.now());
        prescription.setExpirationDate(expirationDatePicker.getDate());
        prescription.setPositions(prescriptionPositions);
        prescription.getPositions().forEach(pp -> {pp.setPrescription(prescription);});
        prescription.setStatus(Status.ACTIVE);

        if(choosenPatient == null)
            JOptionPane.showMessageDialog(this, "Brak wybranego pacjenta", "Błąd", JOptionPane.ERROR_MESSAGE);
        else if(prescriptionPositions.size() == 0)
            JOptionPane.showMessageDialog(this, "Brak pozycji na recepcie", "Błąd", JOptionPane.ERROR_MESSAGE);
        else if(prescription.getIssueDate().compareTo(prescription.getExpirationDate()) > 0)
             JOptionPane.showMessageDialog(this, "Data ważności nie może być wcześniejsza niż dziejsza data", "Błąd", JOptionPane.ERROR_MESSAGE);
        else {
            int selection = JOptionPane.showConfirmDialog(this, "Czy potwierdzasz dodanie recepty?", "Potwierdzenie",
                                                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(selection == JOptionPane.OK_OPTION)
            {
                EntityManager entityManager = Database.getEntityManager();
                var tx = entityManager.getTransaction();
                tx.begin();
                entityManager.persist(prescription);
                tx.commit();
                dispose();
            }
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void newPositionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPositionButtonActionPerformed
        NewPrescriptionPositionDialog newPrescriptionPosition = new NewPrescriptionPositionDialog(null, true);
        newPrescriptionPosition.setLocationRelativeTo(this.rootPane);
        var result = newPrescriptionPosition.showDialog();
        if(result != null)
            prescriptionPositions.add(result);
        showPositions();
    }//GEN-LAST:event_newPositionButtonActionPerformed

    private void choosePatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choosePatientButtonActionPerformed
        PatientListDialog patientListDialog = new PatientListDialog(null, true);
        patientListDialog.setLocationRelativeTo(this.rootPane);
        var result = patientListDialog.showDialog();
        if(result != null)
            choosenPatient = result;
            patientNameLabel.setText(choosenPatient.getFullName());
    }//GEN-LAST:event_choosePatientButtonActionPerformed

    private void deletePositionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePositionButtonActionPerformed
        int selectedIndex = prescriptionPositionsList.getSelectedIndex();
        if(selectedIndex == -1)
            JOptionPane.showMessageDialog(this, "Nie wybrano żadnej pozycji do usunięcia",
                "Błąd", JOptionPane.ERROR_MESSAGE);
        else {
            prescriptionPositions.remove(selectedIndex);
        }
        showPositions();
    }//GEN-LAST:event_deletePositionButtonActionPerformed

    private void showPositions()
    {
        Vector<String> positions = new Vector<String>();
        for (var p : prescriptionPositions)
            positions.add(p.getMedicine().getName() + " " + p.getDosage());
        prescriptionPositionsList.setListData(positions);
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
            java.util.logging.Logger.getLogger(NewPrescriptionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewPrescriptionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewPrescriptionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewPrescriptionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewPrescriptionDialog dialog = new NewPrescriptionDialog(new javax.swing.JFrame(), true, null);
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
    private javax.swing.JButton addButton;
    private javax.swing.JButton choosePatientButton;
    private javax.swing.JButton deletePositionButton;
    private com.github.lgooddatepicker.components.DatePicker expirationDatePicker;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton newPositionButton;
    private javax.swing.JLabel patientLabel;
    private javax.swing.JLabel patientNameLabel;
    private javax.swing.JList<String> prescriptionPositionsList;
    // End of variables declaration//GEN-END:variables
}
