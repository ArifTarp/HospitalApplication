package SwingUI;
import Entity.AppointmentDetail;
import Entity.Doctor;
import Entity.Patient;
import Entity.PatientDetail;
import Repository.JDBCAppointmentRepository;
import Repository.JDBCDoctorRepository;
import Repository.JDBCPatientRepository;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainContent extends javax.swing.JFrame {

    public MainContent() {
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SearchThePatientButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtboxDoctorFirstName = new javax.swing.JTextField();
        DeleteThePatientButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtboxDoctorLastName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ListOfPatientButton = new javax.swing.JButton();
        txtboxDoctorCode = new javax.swing.JTextField();
        lblPatientTcNo = new javax.swing.JLabel();
        SearchTheAppointmentButton = new javax.swing.JButton();
        txtboxPatientTcNo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtboxPatientFirstName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtboxPatientLastName = new javax.swing.JTextField();
        AddDoctorButton = new javax.swing.JButton();
        AddillButton = new javax.swing.JButton();
        txtboxPatientIdentityNumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ListOfAppointmentButton = new javax.swing.JButton();
        ListOfDoctorButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtboxAppointmentDate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txrboxPolyclinicName = new javax.swing.JTextField();
        AddAppointmentButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SearchThePatientButton.setText("Hasta ara");
        SearchThePatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchThePatientButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Doktor adı");

        DeleteThePatientButton.setText("Hasta sil");
        DeleteThePatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteThePatientButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Doktor soyadı");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Hasta Tc numarası", "Hasta adı", "Hasta soyadı", "Doktor adı", "Doktor soyadı", "Randevu tarihi", "Poliklinik adı"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setText("Doktor kodu");

        ListOfPatientButton.setLabel("Hastaları listele");
        ListOfPatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListOfPatientButtonActionPerformed(evt);
            }
        });

        lblPatientTcNo.setText("Hasta Tcno");

        SearchTheAppointmentButton.setText("Randevu ara");
        SearchTheAppointmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTheAppointmentButtonActionPerformed(evt);
            }
        });

        jLabel8.setText("Hasta adı");

        jLabel9.setText("Hasta soyadı");

        AddDoctorButton.setText("Doktor ekle");
        AddDoctorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDoctorButtonActionPerformed(evt);
            }
        });

        AddillButton.setText("Hasta ekle");
        AddillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddillButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Hasta kimlik numarası");

        ListOfAppointmentButton.setLabel("Randevuları listele");
        ListOfAppointmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListOfAppointmentButtonActionPerformed(evt);
            }
        });

        ListOfDoctorButton.setText("Doktroları lsitele");
        ListOfDoctorButton.setActionCommand("Doktorları listele");
        ListOfDoctorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListOfDoctorButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Randevu zamanı");

        txtboxAppointmentDate.setToolTipText("");

        jLabel6.setText("Poliklinik adı");

        AddAppointmentButton.setText("Randevu ekle");
        AddAppointmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAppointmentButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txrboxPolyclinicName, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtboxAppointmentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(AddAppointmentButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(969, 969, 969)
                        .addComponent(ListOfAppointmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ListOfDoctorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(118, 118, 118)
                                    .addComponent(AddDoctorButton))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtboxDoctorFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtboxDoctorLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtboxDoctorCode, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(lblPatientTcNo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtboxPatientTcNo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtboxPatientFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtboxPatientLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(108, 108, 108)
                                    .addComponent(AddillButton)))
                            .addGap(646, 646, 646))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1335, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SearchTheAppointmentButton)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtboxPatientIdentityNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(SearchThePatientButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(DeleteThePatientButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ListOfPatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(402, 402, 402))))))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ListOfAppointmentButton)
                    .addComponent(ListOfDoctorButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 528, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txrboxPolyclinicName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtboxAppointmentDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(AddAppointmentButton)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtboxPatientIdentityNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(SearchThePatientButton)
                        .addComponent(DeleteThePatientButton)
                        .addComponent(ListOfPatientButton))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(SearchTheAppointmentButton)
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtboxDoctorFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtboxDoctorLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtboxDoctorCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addGap(18, 18, 18)
                            .addComponent(AddDoctorButton))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(txtboxPatientFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(txtboxPatientLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblPatientTcNo)
                                .addComponent(txtboxPatientTcNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(AddillButton)))
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchThePatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchThePatientButtonActionPerformed
        try {
            JDBCPatientRepository repository = new JDBCPatientRepository();

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);

            for (Patient p : repository.getAllPatients()) {
                if (txtboxPatientIdentityNumber.getText().equals(p.getTcNo())) {
                    model.addRow(new Object[]{null, null, null, null, null, null, null});

                    jTable1.setValueAt(p.getTcNo(), 0, 0);
                    jTable1.setValueAt(p.getFirstName(), 0, 1);
                    jTable1.setValueAt(p.getLastName(), 0, 2);
                }
            }
        } catch (java.sql.SQLException error) {
            System.out.println(error.getMessage());
        } finally {
            txtboxPatientIdentityNumber.setText("");
        }
    }//GEN-LAST:event_SearchThePatientButtonActionPerformed

    private void DeleteThePatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteThePatientButtonActionPerformed
        // TODO add your handling code here:
        try {
            JDBCPatientRepository repository = new JDBCPatientRepository();
            repository.deletePatient(txtboxPatientIdentityNumber.getText());
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_DeleteThePatientButtonActionPerformed

    private void ListOfPatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListOfPatientButtonActionPerformed
        try {
            JDBCPatientRepository repository = new JDBCPatientRepository();

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);

            int i = 0;

            for (Patient p : repository.getAllPatients()) {
                model.addRow(new Object[]{null, null, null, null, null, null, null});

                jTable1.setValueAt(p.getTcNo(), i, 0);
                jTable1.setValueAt(p.getFirstName(), i, 1);
                jTable1.setValueAt(p.getLastName(), i++, 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MainContent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ListOfPatientButtonActionPerformed

    private void SearchTheAppointmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchTheAppointmentButtonActionPerformed
        // TODO add your handling code here:
        try {
            JDBCPatientRepository repository = new JDBCPatientRepository();

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);

            int i = 0;

            for (PatientDetail p : repository.getAllPatientDetailByTcNo(txtboxPatientIdentityNumber.getText())) {
                model.addRow(new Object[]{null, null, null, null, null, null, null});

                jTable1.setValueAt(p.getTcNo(), i, 0);
                jTable1.setValueAt(p.getPatientName(), i, 1);
                jTable1.setValueAt(p.getPatientLastName(), i, 2);
                jTable1.setValueAt(p.getDoctorName(), i, 3);
                jTable1.setValueAt(p.getDoctorLastName(), i, 4);
                jTable1.setValueAt(p.getAppointmentDate(), i, 5);
                jTable1.setValueAt(p.getPolyclinicName(), i++, 6);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MainContent.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_SearchTheAppointmentButtonActionPerformed

    private void AddDoctorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDoctorButtonActionPerformed
        try {
            JDBCDoctorRepository repository = new JDBCDoctorRepository();
            Doctor doctor = new Doctor(txtboxDoctorFirstName.getText(), txtboxDoctorLastName.getText(), txtboxDoctorCode.getText());

            txtboxDoctorFirstName.setText("");
            txtboxDoctorLastName.setText("");
            txtboxDoctorCode.setText("");

            repository.addDoctor(doctor);
        } catch (SQLException ex) {
            Logger.getLogger(MainContent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AddDoctorButtonActionPerformed

    private void AddillButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddillButtonActionPerformed
        try {
            JDBCPatientRepository repository = new JDBCPatientRepository();
            Patient patient = new Patient(txtboxPatientTcNo.getText(), txtboxPatientFirstName.getText(), txtboxPatientLastName.getText());

            txtboxPatientTcNo.setText("");
            txtboxPatientFirstName.setText("");
            txtboxPatientLastName.setText("");

            repository.addPatient(patient);
            
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
    }//GEN-LAST:event_AddillButtonActionPerformed

    private void ListOfAppointmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListOfAppointmentButtonActionPerformed
        try {
            JDBCPatientRepository repository = new JDBCPatientRepository();

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);

            int i = 0;

            for (PatientDetail p : repository.getAllPatientDetails()) {
                model.addRow(new Object[]{null, null, null, null, null, null, null});

                jTable1.setValueAt(p.getTcNo(), i, 0);
                jTable1.setValueAt(p.getPatientName(), i, 1);
                jTable1.setValueAt(p.getPatientLastName(), i, 2);
                jTable1.setValueAt(p.getDoctorName(), i, 3);
                jTable1.setValueAt(p.getDoctorLastName(), i, 4);
                jTable1.setValueAt(p.getAppointmentDate(), i, 5);
                jTable1.setValueAt(p.getPolyclinicName(), i++, 6);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MainContent.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_ListOfAppointmentButtonActionPerformed

    private void ListOfDoctorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListOfDoctorButtonActionPerformed
        try {
            JDBCDoctorRepository repository = new JDBCDoctorRepository();

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);

            int i = 0;

            for (Doctor d : repository.getAllDoctors()) {
                model.addRow(new Object[]{null, null, null, null, null, null, null});

                jTable1.setValueAt(d.getFirstName(), i, 3);
                jTable1.setValueAt(d.getLastName(), i++, 4);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MainContent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ListOfDoctorButtonActionPerformed

    private void AddAppointmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAppointmentButtonActionPerformed
        try {
            java.util.Date date = new SimpleDateFormat("yyyy/MM/dd").parse(txtboxAppointmentDate.getText());
            JDBCAppointmentRepository repository = new JDBCAppointmentRepository();
            
            AppointmentDetail appointmentDetail = new AppointmentDetail(
                    txtboxDoctorCode.getText(),txtboxPatientTcNo.getText(),txrboxPolyclinicName.getText(),new java.sql.Date(date.getTime())
            );
/*
            txtboxAppointmentDate.setText("");
            txtboxPatientTcNo.setText("");
            txtboxDoctorCode.setText("");
            txrboxPolyclinicName.setText("");*/

            repository.createAppointment(appointmentDetail);
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
        catch (ParseException exception) {
            System.out.println(exception.getMessage());
        }
    }//GEN-LAST:event_AddAppointmentButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainContent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainContent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainContent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainContent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainContent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddAppointmentButton;
    private javax.swing.JButton AddDoctorButton;
    private javax.swing.JButton AddillButton;
    private javax.swing.JButton DeleteThePatientButton;
    private javax.swing.JButton ListOfAppointmentButton;
    private javax.swing.JButton ListOfDoctorButton;
    private javax.swing.JButton ListOfPatientButton;
    private javax.swing.JButton SearchTheAppointmentButton;
    private javax.swing.JButton SearchThePatientButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblPatientTcNo;
    private javax.swing.JTextField txrboxPolyclinicName;
    private javax.swing.JTextField txtboxAppointmentDate;
    private javax.swing.JTextField txtboxDoctorCode;
    private javax.swing.JTextField txtboxDoctorFirstName;
    private javax.swing.JTextField txtboxDoctorLastName;
    private javax.swing.JTextField txtboxPatientFirstName;
    private javax.swing.JTextField txtboxPatientIdentityNumber;
    private javax.swing.JTextField txtboxPatientLastName;
    private javax.swing.JTextField txtboxPatientTcNo;
    // End of variables declaration//GEN-END:variables
}
