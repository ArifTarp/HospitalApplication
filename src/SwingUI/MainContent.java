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
import java.util.Calendar;
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
        lblPatientTcNo1 = new javax.swing.JLabel();
        txtboxAppointmentTcNo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtboxAppointmentDoctorCode = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1450, 1000));
        getContentPane().setLayout(null);

        SearchThePatientButton.setText("Hasta ara");
        SearchThePatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchThePatientButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SearchThePatientButton);
        SearchThePatientButton.setBounds(275, 13, 87, 25);

        jLabel1.setText("Doktor adı");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 680, 58, 16);
        getContentPane().add(txtboxDoctorFirstName);
        txtboxDoctorFirstName.setBounds(140, 680, 158, 22);

        DeleteThePatientButton.setText("Hasta sil");
        DeleteThePatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteThePatientButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteThePatientButton);
        DeleteThePatientButton.setBounds(374, 13, 81, 25);

        jLabel2.setText("Doktor soyadı");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 720, 77, 16);

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

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 100, 1335, 513);
        getContentPane().add(txtboxDoctorLastName);
        txtboxDoctorLastName.setBounds(140, 720, 158, 22);

        jLabel3.setText("Doktor kodu");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 760, 68, 16);

        ListOfPatientButton.setLabel("Hastaları listele");
        ListOfPatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListOfPatientButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ListOfPatientButton);
        ListOfPatientButton.setBounds(790, 20, 157, 25);
        getContentPane().add(txtboxDoctorCode);
        txtboxDoctorCode.setBounds(140, 760, 158, 22);

        lblPatientTcNo.setText("Hasta Tcno");
        getContentPane().add(lblPatientTcNo);
        lblPatientTcNo.setBounds(500, 760, 64, 16);

        SearchTheAppointmentButton.setText("Randevu ara");
        SearchTheAppointmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTheAppointmentButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SearchTheAppointmentButton);
        SearchTheAppointmentButton.setBounds(149, 45, 105, 25);
        getContentPane().add(txtboxPatientTcNo);
        txtboxPatientTcNo.setBounds(570, 760, 158, 22);

        jLabel8.setText("Hasta adı");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(510, 680, 53, 16);
        getContentPane().add(txtboxPatientFirstName);
        txtboxPatientFirstName.setBounds(570, 680, 158, 22);

        jLabel9.setText("Hasta soyadı");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(490, 720, 72, 16);
        getContentPane().add(txtboxPatientLastName);
        txtboxPatientLastName.setBounds(570, 720, 158, 22);

        AddDoctorButton.setText("Doktor ekle");
        AddDoctorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDoctorButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AddDoctorButton);
        AddDoctorButton.setBounds(160, 800, 97, 25);

        AddillButton.setText("Hasta ekle");
        AddillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddillButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AddillButton);
        AddillButton.setBounds(600, 800, 91, 25);
        getContentPane().add(txtboxPatientIdentityNumber);
        txtboxPatientIdentityNumber.setBounds(149, 14, 108, 22);

        jLabel4.setText("Hasta kimlik numarası");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(12, 17, 125, 16);

        ListOfAppointmentButton.setLabel("Randevuları listele");
        ListOfAppointmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListOfAppointmentButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ListOfAppointmentButton);
        ListOfAppointmentButton.setBounds(980, 20, 157, 25);

        ListOfDoctorButton.setText("Doktroları lsitele");
        ListOfDoctorButton.setActionCommand("Doktorları listele");
        ListOfDoctorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListOfDoctorButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ListOfDoctorButton);
        ListOfDoctorButton.setBounds(1160, 20, 157, 25);

        jLabel5.setText("Randevu zamanı");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(910, 720, 94, 16);

        txtboxAppointmentDate.setToolTipText("");
        getContentPane().add(txtboxAppointmentDate);
        txtboxAppointmentDate.setBounds(1020, 720, 158, 22);

        jLabel6.setText("Poliklinik adı");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(940, 680, 69, 16);
        getContentPane().add(txrboxPolyclinicName);
        txrboxPolyclinicName.setBounds(1020, 680, 158, 22);

        AddAppointmentButton.setText("Randevu ekle");
        AddAppointmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAppointmentButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AddAppointmentButton);
        AddAppointmentButton.setBounds(1040, 840, 109, 25);

        lblPatientTcNo1.setText("Hasta Tcno");
        getContentPane().add(lblPatientTcNo1);
        lblPatientTcNo1.setBounds(950, 760, 64, 16);
        getContentPane().add(txtboxAppointmentTcNo);
        txtboxAppointmentTcNo.setBounds(1020, 760, 158, 22);

        jLabel7.setText("Doktor kodu");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(940, 800, 68, 16);
        getContentPane().add(txtboxAppointmentDoctorCode);
        txtboxAppointmentDoctorCode.setBounds(1020, 800, 158, 22);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SwingUI/background/main-backgorund.jpg"))); // NOI18N
        jLabel10.setPreferredSize(new java.awt.Dimension(1500, 800));
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 1430, 1000);

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
            java.util.Date date = new SimpleDateFormat("dd/MM/yyyy").parse(txtboxAppointmentDate.getText());
            
            JDBCAppointmentRepository repository = new JDBCAppointmentRepository();
            
            AppointmentDetail appointmentDetail = new AppointmentDetail(
                    txtboxAppointmentDoctorCode.getText(),txtboxAppointmentTcNo.getText(),txrboxPolyclinicName.getText(),new java.sql.Date(date.getTime())
            );

            txtboxAppointmentDate.setText("");
            txtboxPatientTcNo.setText("");
            txtboxDoctorCode.setText("");
            txrboxPolyclinicName.setText("");

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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblPatientTcNo;
    private javax.swing.JLabel lblPatientTcNo1;
    private javax.swing.JTextField txrboxPolyclinicName;
    private javax.swing.JTextField txtboxAppointmentDate;
    private javax.swing.JTextField txtboxAppointmentDoctorCode;
    private javax.swing.JTextField txtboxAppointmentTcNo;
    private javax.swing.JTextField txtboxDoctorCode;
    private javax.swing.JTextField txtboxDoctorFirstName;
    private javax.swing.JTextField txtboxDoctorLastName;
    private javax.swing.JTextField txtboxPatientFirstName;
    private javax.swing.JTextField txtboxPatientIdentityNumber;
    private javax.swing.JTextField txtboxPatientLastName;
    private javax.swing.JTextField txtboxPatientTcNo;
    // End of variables declaration//GEN-END:variables
}
