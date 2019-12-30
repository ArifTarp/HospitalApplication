/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.sql.Date;

/**
 *
 * @author Lenovo
 */
public class AppointmentDetail {
    private String doctorCode;
    private String patiendTcNo;
    private String polyclinicName;
    private Date appointmentDate;

    public AppointmentDetail(String doctorCode, String patiendTcNo, String polyclinicName, Date AppointmentDate) {
        this.doctorCode = doctorCode;
        this.patiendTcNo = patiendTcNo;
        this.polyclinicName = polyclinicName;
        this.appointmentDate = AppointmentDate;
    }
     public AppointmentDetail(String doctorCode, String patiendTcNo, String polyclinicName) {
        this.doctorCode = doctorCode;
        this.patiendTcNo = patiendTcNo;
        this.polyclinicName = polyclinicName;
    }
     
     public String getDoctorCode() {
        return doctorCode;
    }
   
    public void setDoctorCode(String doctorCode) {
        this.doctorCode = doctorCode;
    }
   
    public String getPatiendTcNo() {
        return patiendTcNo;
    }
    
    public void setPatiendTcNo(String patiendTcNo) {
        this.patiendTcNo = patiendTcNo;
    }
    
    public String getPolyclinicName() {
        return polyclinicName;
    }

    public void setPolyclinicName(String polyclinicName) {
        this.polyclinicName = polyclinicName;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date AppointmentDate) {
        this.appointmentDate = AppointmentDate;
    }
}
