/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Lenovo
 */
public class PatientDetail {
    private String tcNo;
    private String patientName;
    private String patientLastName;
    private String doctorName;
    private String doctorLastName;
    private String appointmentDate;
    private String polyclinicName;

    public PatientDetail(String tcNo, String patientName, String patientLastName, String doctorName, String doctorLastName, String appointmentDate, String polyclinicName) {
        this.tcNo = tcNo;
        this.patientName = patientName;
        this.patientLastName = patientLastName;
        this.doctorName = doctorName;
        this.doctorLastName = doctorLastName;
        this.appointmentDate = appointmentDate;
        this.polyclinicName = polyclinicName;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientLastName() {
        return patientLastName;
    }

    public void setPatientLastName(String patientLastName) {
        this.patientLastName = patientLastName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorLastName() {
        return doctorLastName;
    }

    public void setDoctorLastName(String doctorLastName) {
        this.doctorLastName = doctorLastName;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getPolyclinicName() {
        return polyclinicName;
    }

    public void setPolyclinicName(String polyclinicName) {
        this.polyclinicName = polyclinicName;
    }
}
