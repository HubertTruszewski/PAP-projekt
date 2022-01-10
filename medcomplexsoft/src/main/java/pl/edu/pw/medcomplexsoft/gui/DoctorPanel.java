/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pl.edu.pw.medcomplexsoft.gui;

import pl.edu.pw.medcomplexsoft.model.Doctor;


/**
 *
 * @author hubert
 */
public class DoctorPanel extends javax.swing.JFrame {

    /**
     * Creates new form DoctorPanel
     */
    public DoctorPanel(Doctor doctor) {
        initComponents();
        loggedDoctor = doctor;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        exitItem = new javax.swing.JMenuItem();
        patientMenu = new javax.swing.JMenu();
        newPatientItem = new javax.swing.JMenuItem();
        patientListItem = new javax.swing.JMenuItem();
        prescriptionMenu = new javax.swing.JMenu();
        newPrescriptionItem = new javax.swing.JMenuItem();
        prescriptionListItem = new javax.swing.JMenuItem();
        medicineMenu = new javax.swing.JMenu();
        newMedicineItem = new javax.swing.JMenuItem();
        medicineListItem = new javax.swing.JMenuItem();
        appointmentMenu = new javax.swing.JMenu();
        newAppointmentItem = new javax.swing.JMenuItem();
        appointmentListItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Panel lekarza");
        setSize(new java.awt.Dimension(1200, 900));

        fileMenu.setText("Plik");

        exitItem.setText("Wyjście");
        exitItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitItem);

        jMenuBar1.add(fileMenu);

        patientMenu.setText("Pacjenci");

        newPatientItem.setText("Nowy pacjent");
        newPatientItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPatientItemActionPerformed(evt);
            }
        });
        patientMenu.add(newPatientItem);

        patientListItem.setText("Lista");
        patientListItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientListItemActionPerformed(evt);
            }
        });
        patientMenu.add(patientListItem);

        jMenuBar1.add(patientMenu);

        prescriptionMenu.setText("Recepty");

        newPrescriptionItem.setText("Nowa");
        newPrescriptionItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPrescriptionItemActionPerformed(evt);
            }
        });
        prescriptionMenu.add(newPrescriptionItem);

        prescriptionListItem.setText("Lista");
        prescriptionListItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prescriptionListItemActionPerformed(evt);
            }
        });
        prescriptionMenu.add(prescriptionListItem);

        jMenuBar1.add(prescriptionMenu);

        medicineMenu.setText("Leki");

        newMedicineItem.setText("Nowy");
        newMedicineItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newMedicineItemActionPerformed(evt);
            }
        });
        medicineMenu.add(newMedicineItem);

        medicineListItem.setText("Lista");
        medicineListItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicineListItemActionPerformed(evt);
            }
        });
        medicineMenu.add(medicineListItem);

        jMenuBar1.add(medicineMenu);

        appointmentMenu.setText("Wizyty");

        newAppointmentItem.setText("Zaplanuj");
        newAppointmentItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAppointmentItemActionPerformed(evt);
            }
        });
        appointmentMenu.add(newAppointmentItem);

        appointmentListItem.setText("Lista");
        appointmentListItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointmentListItemActionPerformed(evt);
            }
        });
        appointmentMenu.add(appointmentListItem);

        jMenuBar1.add(appointmentMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 865, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitItemActionPerformed

    private void newPrescriptionItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPrescriptionItemActionPerformed
        NewPrescriptionDialog newPrescriptionDialog = new NewPrescriptionDialog(null, true, loggedDoctor);
        newPrescriptionDialog.setLocationRelativeTo(this.rootPane);
        newPrescriptionDialog.setVisible(true);
    }//GEN-LAST:event_newPrescriptionItemActionPerformed

    private void newMedicineItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newMedicineItemActionPerformed
        NewMedicineDialog newMedicineDialog = new NewMedicineDialog();
        newMedicineDialog.setLocationRelativeTo(this.rootPane);
        newMedicineDialog.setVisible(true);
    }//GEN-LAST:event_newMedicineItemActionPerformed

    private void patientListItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientListItemActionPerformed
        PatientListDialog patientsListDialog = new PatientListDialog(null, true);
        patientsListDialog.setLocationRelativeTo(this.rootPane);
        patientsListDialog.showDialog();
    }//GEN-LAST:event_patientListItemActionPerformed

    private void medicineListItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicineListItemActionPerformed
        MedicineListDialog medicineListDialog = new MedicineListDialog(null, true);
        medicineListDialog.setLocationRelativeTo(this.rootPane);
        medicineListDialog.showDialog();
    }//GEN-LAST:event_medicineListItemActionPerformed

    private void prescriptionListItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prescriptionListItemActionPerformed
        PrescriptionListDialog receiptListDialog = new PrescriptionListDialog(null, true, loggedDoctor);
        receiptListDialog.setLocationRelativeTo(this.rootPane);
        receiptListDialog.showDialog();
    }//GEN-LAST:event_prescriptionListItemActionPerformed

    private void appointmentListItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointmentListItemActionPerformed
        AppointmentsList appointmentsList = new AppointmentsList(null, true, loggedDoctor);
        appointmentsList.setLocationRelativeTo(this.rootPane);
        appointmentsList.showDialog();
    }//GEN-LAST:event_appointmentListItemActionPerformed

    private void newPatientItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPatientItemActionPerformed
        NewPatient newPatientDialog = new NewPatient(null, true);
        newPatientDialog.setLocationRelativeTo(this.rootPane);
        newPatientDialog.setVisible(true);

    }//GEN-LAST:event_newPatientItemActionPerformed

    private void newAppointmentItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAppointmentItemActionPerformed
        CreateNewAppointment createNewAppointment = new CreateNewAppointment(null, true, loggedDoctor);
        createNewAppointment.setLocationRelativeTo(this.rootPane);
        createNewAppointment.showDialog();
    }//GEN-LAST:event_newAppointmentItemActionPerformed

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
            java.util.logging.Logger.getLogger(DoctorPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorPanel(null).setVisible(true);
            }
        });
    }
    private Doctor loggedDoctor;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem appointmentListItem;
    private javax.swing.JMenu appointmentMenu;
    private javax.swing.JMenuItem exitItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem medicineListItem;
    private javax.swing.JMenu medicineMenu;
    private javax.swing.JMenuItem newAppointmentItem;
    private javax.swing.JMenuItem newMedicineItem;
    private javax.swing.JMenuItem newPatientItem;
    private javax.swing.JMenuItem newPrescriptionItem;
    private javax.swing.JMenuItem patientListItem;
    private javax.swing.JMenu patientMenu;
    private javax.swing.JMenuItem prescriptionListItem;
    private javax.swing.JMenu prescriptionMenu;
    // End of variables declaration//GEN-END:variables
}
