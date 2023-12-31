/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pl.edu.pw.medcomplexsoft.gui;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import pl.edu.pw.medcomplexsoft.model.*;
import pl.edu.pw.medcomplexsoft.database.Database;


/**
 *
 * @author Grzesiek
 */
public class ReceptionistPanel extends javax.swing.JFrame {
    private Receptionist loggedReceptionist;
    /**
     * Creates new form ReceptionistPanel
     */
    public ReceptionistPanel() {
        initComponents();
    }

    public ReceptionistPanel(Receptionist receptionist) {
        loggedReceptionist = receptionist;
        initComponents();
        loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeLabel = new javax.swing.JLabel();
        todayDateLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        appointmentsTable = new javax.swing.JTable();
        weekDayLabel = new javax.swing.JLabel();
        namesDayLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        changePasswordItem = new javax.swing.JMenuItem();
        logoutMenuItem = new javax.swing.JMenuItem();
        exitItem = new javax.swing.JMenuItem();
        patientMenu = new javax.swing.JMenu();
        newPatientItem = new javax.swing.JMenuItem();
        patientListItem = new javax.swing.JMenuItem();
        prescriptionMenu = new javax.swing.JMenu();
        prescriptionListItem = new javax.swing.JMenuItem();
        medicineMenu = new javax.swing.JMenu();
        newMedicineItem = new javax.swing.JMenuItem();
        medicineListItem = new javax.swing.JMenuItem();
        appointmentMenu = new javax.swing.JMenu();
        newAppointmentItem = new javax.swing.JMenuItem();
        appointmentListItem = new javax.swing.JMenuItem();
        doctorMenu = new javax.swing.JMenu();
        addNewDoctorMenu = new javax.swing.JMenuItem();
        doctorListItem = new javax.swing.JMenuItem();
        serviceMenu = new javax.swing.JMenu();
        serviceListItem = new javax.swing.JMenuItem();
        serviceListMenu = new javax.swing.JMenuItem();
        receptionistMenu = new javax.swing.JMenu();
        newReceptionistMenu = new javax.swing.JMenuItem();
        receptionistListMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Panel recepcjonisty");
        setPreferredSize(new java.awt.Dimension(1200, 900));
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 900));

        welcomeLabel.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        welcomeLabel.setText("Witaj, <name>!");

        todayDateLabel.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        todayDateLabel.setText("2022-01-13");

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel1.setText("Najbliższe wizyty:");

        appointmentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data i godzina", "Pacjent", "Lekarz", "Sala"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        appointmentsTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(appointmentsTable);
        if (appointmentsTable.getColumnModel().getColumnCount() > 0) {
            appointmentsTable.getColumnModel().getColumn(3).setMinWidth(50);
            appointmentsTable.getColumnModel().getColumn(3).setPreferredWidth(50);
            appointmentsTable.getColumnModel().getColumn(3).setMaxWidth(50);
        }

        weekDayLabel.setFont(new java.awt.Font("Ubuntu", 2, 28)); // NOI18N
        weekDayLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        weekDayLabel.setText("Imieniny:");

        namesDayLabel.setFont(new java.awt.Font("Ubuntu", 2, 28)); // NOI18N
        namesDayLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        namesDayLabel.setText("Imieniny:");

        fileMenu.setText("Plik");

        changePasswordItem.setText("Zmień hasło");
        changePasswordItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordItemActionPerformed(evt);
            }
        });
        fileMenu.add(changePasswordItem);

        logoutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        logoutMenuItem.setText("Wyloguj");
        logoutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(logoutMenuItem);

        exitItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        exitItem.setText("Wyjście");
        exitItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitItem);

        jMenuBar1.add(fileMenu);

        patientMenu.setText("Pacjenci");

        newPatientItem.setText("Dodaj pacjenta");
        newPatientItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPatientItemActionPerformed(evt);
            }
        });
        patientMenu.add(newPatientItem);

        patientListItem.setText("Lista pacjentów");
        patientListItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientListItemActionPerformed(evt);
            }
        });
        patientMenu.add(patientListItem);

        jMenuBar1.add(patientMenu);

        prescriptionMenu.setText("Recepty");

        prescriptionListItem.setText("Lista recept");
        prescriptionListItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prescriptionListItemActionPerformed(evt);
            }
        });
        prescriptionMenu.add(prescriptionListItem);

        jMenuBar1.add(prescriptionMenu);

        medicineMenu.setText("Leki");

        newMedicineItem.setText("Nowy lek");
        newMedicineItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newMedicineItemActionPerformed(evt);
            }
        });
        medicineMenu.add(newMedicineItem);

        medicineListItem.setText("Lista leków");
        medicineListItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicineListItemActionPerformed(evt);
            }
        });
        medicineMenu.add(medicineListItem);

        jMenuBar1.add(medicineMenu);

        appointmentMenu.setText("Wizyty");

        newAppointmentItem.setText("Zaplanuj wizytę");
        newAppointmentItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAppointmentItemActionPerformed(evt);
            }
        });
        appointmentMenu.add(newAppointmentItem);

        appointmentListItem.setText("Lista wizyt");
        appointmentListItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointmentListItemActionPerformed(evt);
            }
        });
        appointmentMenu.add(appointmentListItem);

        jMenuBar1.add(appointmentMenu);

        doctorMenu.setText("Lekarze");

        addNewDoctorMenu.setText("Dodaj lekarza");
        addNewDoctorMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewDoctorMenuActionPerformed(evt);
            }
        });
        doctorMenu.add(addNewDoctorMenu);

        doctorListItem.setText("Lista lekarzy");
        doctorListItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorListItemActionPerformed(evt);
            }
        });
        doctorMenu.add(doctorListItem);

        jMenuBar1.add(doctorMenu);

        serviceMenu.setText("Usługi");

        serviceListItem.setText("Dodaj nową usługę");
        serviceListItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceListItemActionPerformed(evt);
            }
        });
        serviceMenu.add(serviceListItem);

        serviceListMenu.setText("Lista usług");
        serviceListMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceListMenuActionPerformed(evt);
            }
        });
        serviceMenu.add(serviceListMenu);

        jMenuBar1.add(serviceMenu);

        receptionistMenu.setText("Repepcjoniści");

        newReceptionistMenu.setText("Nowy recepcjonista");
        newReceptionistMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newReceptionistMenuActionPerformed(evt);
            }
        });
        receptionistMenu.add(newReceptionistMenu);

        receptionistListMenu.setText("Lista recepcjonistów");
        receptionistListMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receptionistListMenuActionPerformed(evt);
            }
        });
        receptionistMenu.add(receptionistListMenu);

        jMenuBar1.add(receptionistMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(weekDayLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                        .addComponent(todayDateLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(namesDayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(todayDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(weekDayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(namesDayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(258, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void patientListItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientListItemActionPerformed
        PatientListDialog patientsListDialog = new PatientListDialog(null, true);
        patientsListDialog.setLocationRelativeTo(this.rootPane);
        patientsListDialog.showDialog();
    }//GEN-LAST:event_patientListItemActionPerformed

    private void exitItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitItemActionPerformed
        int selection = JOptionPane.showConfirmDialog(this, "Czy chcesz wyjść z programu?", "Wyjście", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(selection == JOptionPane.OK_OPTION)
            System.exit(0);
    }//GEN-LAST:event_exitItemActionPerformed

    private void newPatientItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPatientItemActionPerformed
        NewPatient newPatientDialog = new NewPatient(null, true);
        newPatientDialog.setLocationRelativeTo(this.rootPane);
        newPatientDialog.setVisible(true);
    }//GEN-LAST:event_newPatientItemActionPerformed

    private void prescriptionListItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prescriptionListItemActionPerformed
        PrescriptionListDialog receiptListDialog = new PrescriptionListDialog(null, true, loggedReceptionist);
        receiptListDialog.setLocationRelativeTo(this.rootPane);
        receiptListDialog.showDialog();
    }//GEN-LAST:event_prescriptionListItemActionPerformed

    private void newMedicineItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newMedicineItemActionPerformed
        NewMedicineDialog newMedicineDialog = new NewMedicineDialog();
        newMedicineDialog.setLocationRelativeTo(this.rootPane);
        newMedicineDialog.setVisible(true);
    }//GEN-LAST:event_newMedicineItemActionPerformed

    private void medicineListItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicineListItemActionPerformed
        MedicineListDialog medicineListDialog = new MedicineListDialog(null, true);
        medicineListDialog.setLocationRelativeTo(this.rootPane);
        medicineListDialog.showDialog();
    }//GEN-LAST:event_medicineListItemActionPerformed

    private void newAppointmentItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAppointmentItemActionPerformed
        CreateNewAppointment createNewAppointment = new CreateNewAppointment(null, true, loggedReceptionist);
        createNewAppointment.showDialog();
    }//GEN-LAST:event_newAppointmentItemActionPerformed

    private void appointmentListItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointmentListItemActionPerformed
        AppointmentsList appointmentsList = new AppointmentsList(null, true);
        appointmentsList.setLocationRelativeTo(this.rootPane);
        appointmentsList.showDialog();
    }//GEN-LAST:event_appointmentListItemActionPerformed

    private void addNewDoctorMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewDoctorMenuActionPerformed
        NewDoctorDialog newDoctorDialog = new NewDoctorDialog(null, true);
        newDoctorDialog.setLocationRelativeTo(this.rootPane);
        newDoctorDialog.setVisible(true);
    }//GEN-LAST:event_addNewDoctorMenuActionPerformed

    private void doctorListItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorListItemActionPerformed
        DoctorListDialog doctorsListDialog = new DoctorListDialog(null, true, loggedReceptionist);
        doctorsListDialog.setLocationRelativeTo(this.rootPane);
        doctorsListDialog.showDialog();
    }//GEN-LAST:event_doctorListItemActionPerformed

    private void serviceListItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceListItemActionPerformed
        NewServiceDialog newServiceDialog = new NewServiceDialog();
        newServiceDialog.showDialog();
    }//GEN-LAST:event_serviceListItemActionPerformed

    private void serviceListMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceListMenuActionPerformed
        ServiceListDialog serviceListDiaog = new ServiceListDialog(null, true, loggedReceptionist);
        serviceListDiaog.showDialog();
    }//GEN-LAST:event_serviceListMenuActionPerformed

    private void newReceptionistMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newReceptionistMenuActionPerformed
        NewReceptionistDialog newReceptionistDialog = new NewReceptionistDialog(null, true);
        newReceptionistDialog.setLocationRelativeTo(this.rootPane);
        newReceptionistDialog.showDialog();
    }//GEN-LAST:event_newReceptionistMenuActionPerformed

    private void receptionistListMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receptionistListMenuActionPerformed
        ReceptionistListDialog receptionistListDialog = new ReceptionistListDialog(null, true);
        receptionistListDialog.setLocationRelativeTo(this.rootPane);
        receptionistListDialog.showDialog();
    }//GEN-LAST:event_receptionistListMenuActionPerformed

    private void changePasswordItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordItemActionPerformed
        ChangePasswordDialog changePasswordDialog = new ChangePasswordDialog(null, true, loggedReceptionist);
        changePasswordDialog.setLocationRelativeTo(this.rootPane);
        changePasswordDialog.showDialog();
    }//GEN-LAST:event_changePasswordItemActionPerformed

    private void logoutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutMenuItemActionPerformed
        int selection = JOptionPane.showConfirmDialog(this, "Czy na pewno chcesz się wylogować?", "Wylogowywanie",
                                                      JOptionPane.OK_CANCEL_OPTION);
        if(selection == JOptionPane.OK_OPTION) {
            dispose();
            JFrame loginWindow = new LoginWindow();
            loginWindow.setVisible(true);
        }
    }//GEN-LAST:event_logoutMenuItemActionPerformed

    private void loadData() {
        welcomeLabel.setText("Witaj, " + loggedReceptionist.getFullName() + "!");
        LocalDate todayDate = LocalDate.now();
        todayDateLabel.setText(todayDate.toString());
        EntityManager entityManager = Database.getEntityManager();
        String sqlQuery = "SELECT a FROM Appointment a WHERE status='ACTIVE' ORDER BY appointmentdate ASC";
        TypedQuery<Appointment> query = entityManager.createQuery(sqlQuery, Appointment.class).setMaxResults(5);
        List<Appointment> results = query.getResultList();
        DefaultTableModel model = (DefaultTableModel)appointmentsTable.getModel();
        results.forEach(a -> {
            String data[] = {a.getAppointmentDate().toString(), a.getPatient().getFullName(),
                             a.getDoctor().getFullName(), a.getOffice()};
            model.addRow(data);
        });
        Query namesQuery = entityManager.createNativeQuery("SELECT names FROM namesdays WHERE day=?1 AND month=?2");
        namesQuery.setParameter(1, todayDate.getDayOfMonth());
        namesQuery.setParameter(2, todayDate.getMonthValue());
        String result = (String)namesQuery.getSingleResult();
        namesDayLabel.setText("Imieniny: "+result);
        String[] weekDays = {"Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela"};
        weekDayLabel.setText(weekDays[todayDate.getDayOfWeek().getValue()-1]+", "+todayDate.getDayOfYear()+". dzień roku, do końca pozostało: "+(todayDate.lengthOfYear()-todayDate.getDayOfYear()+" dni"));
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
            java.util.logging.Logger.getLogger(ReceptionistPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReceptionistPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReceptionistPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReceptionistPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReceptionistPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addNewDoctorMenu;
    private javax.swing.JMenuItem appointmentListItem;
    private javax.swing.JMenu appointmentMenu;
    private javax.swing.JTable appointmentsTable;
    private javax.swing.JMenuItem changePasswordItem;
    private javax.swing.JMenuItem doctorListItem;
    private javax.swing.JMenu doctorMenu;
    private javax.swing.JMenuItem exitItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem logoutMenuItem;
    private javax.swing.JMenuItem medicineListItem;
    private javax.swing.JMenu medicineMenu;
    private javax.swing.JLabel namesDayLabel;
    private javax.swing.JMenuItem newAppointmentItem;
    private javax.swing.JMenuItem newMedicineItem;
    private javax.swing.JMenuItem newPatientItem;
    private javax.swing.JMenuItem newReceptionistMenu;
    private javax.swing.JMenuItem patientListItem;
    private javax.swing.JMenu patientMenu;
    private javax.swing.JMenuItem prescriptionListItem;
    private javax.swing.JMenu prescriptionMenu;
    private javax.swing.JMenuItem receptionistListMenu;
    private javax.swing.JMenu receptionistMenu;
    private javax.swing.JMenuItem serviceListItem;
    private javax.swing.JMenuItem serviceListMenu;
    private javax.swing.JMenu serviceMenu;
    private javax.swing.JLabel todayDateLabel;
    private javax.swing.JLabel weekDayLabel;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
