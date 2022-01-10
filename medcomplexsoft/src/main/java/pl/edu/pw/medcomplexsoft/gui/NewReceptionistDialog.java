/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package pl.edu.pw.medcomplexsoft.gui;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.swing.JOptionPane;

import java.time.LocalDate;
import java.time.ZoneId;

import pl.edu.pw.medcomplexsoft.database.Database;
import pl.edu.pw.medcomplexsoft.model.*;



/**
 *
 * @author kubix
 */
public class NewReceptionistDialog extends javax.swing.JDialog {

    /**
     * Creates new form NewDoctorDialog
     */

    public NewReceptionistDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

    }

    public NewReceptionistDialog(java.awt.Frame parent, boolean modal, Receptionist receptionist) {
        super(parent, modal);
        initComponents();
        changingReceptionistId = receptionist.getId();
        nameField.setText(receptionist.getName());
        surnameField.setText(receptionist.getSurname());
        salaryField.setText(Double.toString(receptionist.getSalary()));
        dateSpinner.setValue(java.sql.Date.valueOf(receptionist.getBirthDate()));
        peselField.setText(receptionist.getPesel());
        if(receptionist.getGender() == 'K')
            femaleRadioButton.setSelected(true);
        else
            maleRadioButton.setSelected(true);
        streetField.setText(receptionist.getAddress().getStreet());
        houseField.setText(String.valueOf(receptionist.getAddress().getHouseNumber()));
        if(receptionist.getAddress().getFlatNumber() != null)
            flatField.setText(String.valueOf(receptionist.getAddress().getFlatNumber()));
        cityField.setText(receptionist.getAddress().getCity());
        postalCodeField.setText(receptionist.getAddress().getPostalCode());
        countryField.setText(receptionist.getAddress().getCountry());
        emailField.setText(receptionist.getMailAddress());
        loginField.setText(receptionist.getUsername());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        buttonGroup1 = new javax.swing.ButtonGroup();
        maleRadioButton = new javax.swing.JRadioButton();
        femaleRadioButton = new javax.swing.JRadioButton();
        streetLabel = new javax.swing.JLabel();
        streetField = new javax.swing.JTextField();
        houseLabel = new javax.swing.JLabel();
        houseField = new javax.swing.JTextField();
        flatLabel = new javax.swing.JLabel();
        flatField = new javax.swing.JTextField();
        cityLabel = new javax.swing.JLabel();
        cityField = new javax.swing.JTextField();
        postalCodeLabel = new javax.swing.JLabel();
        postalCodeField = new javax.swing.JTextField();
        countryLabel = new javax.swing.JLabel();
        countryField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        loginLabel = new javax.swing.JLabel();
        surnameLabel = new javax.swing.JLabel();
        loginField = new javax.swing.JTextField();
        surnameField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        birthDateLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        dateSpinner = new javax.swing.JSpinner();
        cancelButton = new javax.swing.JButton();
        peselLabel = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        peselField = new javax.swing.JTextField();
        genderLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        salaryField = new javax.swing.JTextField();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        buttonGroup1.add(maleRadioButton);
        maleRadioButton.setSelected(true);
        maleRadioButton.setText("Mężczyna");

        buttonGroup1.add(femaleRadioButton);
        femaleRadioButton.setText("Kobieta");

        streetLabel.setText("Ulica");

        houseLabel.setText("Numer domu");

        flatLabel.setText("Numer mieszkania");

        flatField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flatFieldActionPerformed(evt);
            }
        });

        cityLabel.setText("Miasto");

        postalCodeLabel.setText("Kod pocztowy");

        countryLabel.setText("Kraj");

        emailLabel.setText("E-mail");

        nameLabel.setText("Imię");

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        loginLabel.setText("Login");

        surnameLabel.setText("Nazwisko");

        passwordLabel.setText("Hasło");

        birthDateLabel.setText("Data urodzenia");

        dateSpinner.setModel(new javax.swing.SpinnerDateModel());
        dateSpinner.setOpaque(false);

        cancelButton.setText("Anuluj");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        peselLabel.setText("PESEL");

        addButton.setText("Dodaj");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        genderLabel.setText("Płeć");

        jLabel2.setText("Pensja");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addButton)
                        .addGap(18, 18, 18)
                        .addComponent(cancelButton)
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(birthDateLabel)
                                    .addComponent(peselLabel)
                                    .addComponent(genderLabel)
                                    .addComponent(streetLabel)
                                    .addComponent(houseLabel)
                                    .addComponent(flatLabel)
                                    .addComponent(cityLabel)
                                    .addComponent(postalCodeLabel)
                                    .addComponent(countryLabel)
                                    .addComponent(loginLabel)
                                    .addComponent(emailLabel))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(maleRadioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(femaleRadioButton)
                                        .addGap(23, 23, 23))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(dateSpinner, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(peselField)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(houseField, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(streetField)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cityField, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(flatField)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(countryField, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(postalCodeField)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(loginField, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(emailField)
                                            .addComponent(passwordField, javax.swing.GroupLayout.Alignment.TRAILING)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(surnameLabel)
                                    .addComponent(nameLabel)
                                    .addComponent(jLabel2))
                                .addGap(71, 71, 71)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameField)
                                    .addComponent(surnameField)
                                    .addComponent(salaryField))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(surnameLabel)
                    .addComponent(surnameField))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(salaryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birthDateLabel)
                    .addComponent(dateSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(peselLabel)
                    .addComponent(peselField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLabel)
                    .addComponent(maleRadioButton)
                    .addComponent(femaleRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(streetLabel)
                    .addComponent(streetField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(houseLabel)
                    .addComponent(houseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(flatLabel)
                    .addComponent(flatField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityLabel)
                    .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postalCodeLabel)
                    .addComponent(postalCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countryLabel)
                    .addComponent(countryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginLabel)
                    .addComponent(loginField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(addButton))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void showDialog(){
        setVisible(true);
    }

    private void flatFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flatFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flatFieldActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        Receptionist receptionist = new Receptionist();
        Address address = new Address();
        receptionist.setName(nameField.getText());
        receptionist.setSurname(surnameField.getText());
        receptionist.setBirthDate(((Date)dateSpinner.getValue()).toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        receptionist.setPesel(peselField.getText());
        receptionist.setUsername(loginField.getText());
        String hashedPassword = org.apache.commons.codec.digest.DigestUtils.sha256Hex(String.valueOf(passwordField.getPassword()));
        receptionist.setPassword(hashedPassword);
        if(maleRadioButton.isSelected())
        receptionist.setGender('M');
        else
        receptionist.setGender('K');
        address.setStreet(streetField.getText());
        address.setHouseNumber(Long.parseLong(houseField.getText()));
        address.setFlatNumber(Long.getLong(flatField.getText()));
        address.setCity(cityField.getText());
        address.setPostalCode(postalCodeField.getText());
        address.setCountry(countryField.getText());
        receptionist.setAddress(address);
        receptionist.setMailAddress(emailField.getText());
        receptionist.setHireDate(LocalDate.now());
        receptionist.setSalary(Double.parseDouble(salaryField.getText()));

        int selection = JOptionPane.showConfirmDialog(this, "Czy potwierdzasz dodanie recepcjonisty?", "Potwierdzenie",
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(selection == JOptionPane.OK_OPTION)
        {
            boolean unique = true;
            EntityManager entityManager = Database.getEntityManager();

            //sprawdzanie loginu
            CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
            CriteriaQuery<Person> criteriaQuery = criteriaBuilder.createQuery(Person.class);
            Root<Person> personRoot = criteriaQuery.from(Person.class);

            Predicate predicateUserName = criteriaBuilder.equal(personRoot.get("username"), loginField.getText());

            criteriaQuery.where(predicateUserName);
            List<Person> result = entityManager.createQuery(criteriaQuery).getResultList();
            if (result.size() != 0){
                unique = false;
                JOptionPane.showMessageDialog(this, "Login już w użyciu. Wybierz inny", "Błąd", JOptionPane.ERROR_MESSAGE);
            }

            //sprawdzanie peselu
            Predicate predicatePesel = criteriaBuilder.equal(personRoot.get("pesel"), peselField.getText());
            criteriaQuery.where(predicatePesel);
            result = entityManager.createQuery(criteriaQuery).getResultList();
            if (result.size() != 0){
                unique = false;
                JOptionPane.showMessageDialog(this, "Osoba o takim peselu jest już w bazie", "Błąd", JOptionPane.ERROR_MESSAGE);
            }

            if(unique){
                var tx = entityManager.getTransaction();
                tx.begin();
                if(changingReceptionistId != -1)
                entityManager.persist(receptionist);
                else {
                    receptionist.setId(changingReceptionistId);
                    entityManager.merge(receptionist);
                }
                tx.commit();
                dispose();
            }
        }
    }//GEN-LAST:event_addButtonActionPerformed

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
            java.util.logging.Logger.getLogger(NewReceptionistDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewReceptionistDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewReceptionistDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewReceptionistDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewReceptionistDialog dialog = new NewReceptionistDialog(new javax.swing.JFrame(), true);
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
    private long changingReceptionistId = -1;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel birthDateLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField cityField;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTextField countryField;
    private javax.swing.JLabel countryLabel;
    private javax.swing.JSpinner dateSpinner;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.JTextField flatField;
    private javax.swing.JLabel flatLabel;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JTextField houseField;
    private javax.swing.JLabel houseLabel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField loginField;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField peselField;
    private javax.swing.JLabel peselLabel;
    private javax.swing.JTextField postalCodeField;
    private javax.swing.JLabel postalCodeLabel;
    private javax.swing.JTextField salaryField;
    private javax.swing.JTextField streetField;
    private javax.swing.JLabel streetLabel;
    private javax.swing.JTextField surnameField;
    private javax.swing.JLabel surnameLabel;
    // End of variables declaration//GEN-END:variables
}