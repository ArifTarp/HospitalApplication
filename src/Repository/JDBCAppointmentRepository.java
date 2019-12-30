/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import Entity.AppointmentDetail;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Lenovo
 */
public class JDBCAppointmentRepository {
    PreparedStatement preparedStatement;
    Connection connection;
    DbContext dbContext;
    Statement statement;
    ResultSet resultSet;

    public JDBCAppointmentRepository() throws SQLException {
        try {
            dbContext = new DbContext();
            connection = dbContext.getConnection();
            System.out.println("Connection is success.");
        } catch (SQLException exception) {
            dbContext.showErrorMessage(exception);
        }
    }
    
    public void createAppointment(AppointmentDetail appointmentDetail) throws SQLException {
        String sqlGetDoctorId = "SELECT id from doctors where doctorCode=" + appointmentDetail.getDoctorCode();
        String sqlGetPatientId = "SELECT id from patients where tcNo = " + appointmentDetail.getPatiendTcNo();
        String sqlGetPolyclinicId = "SELECT id from polyclinics where name = \'" + appointmentDetail.getPolyclinicName() + "\'";
        String sqlAddAppointment = "INSERT into appointments (doctorid,patientid,polyclinicid,date) values(?,?,?,?)";
        statement = connection.createStatement();
        resultSet = statement.executeQuery(sqlGetDoctorId);
        resultSet.next();
        System.out.println(resultSet.getString("id"));
        int doctorId = resultSet.getInt("id");

        statement.close();
        statement = connection.createStatement();
        resultSet = statement.executeQuery(sqlGetPatientId);
        resultSet.next();
        int patientId = resultSet.getInt("id");
        statement.close();
        statement = connection.createStatement();
        resultSet = statement.executeQuery(sqlGetPolyclinicId);
        resultSet.next();
        int polyclinicId = resultSet.getInt("id");
        preparedStatement = (PreparedStatement) connection.prepareStatement(sqlAddAppointment);
        preparedStatement.setInt(1, doctorId);
        preparedStatement.setInt(2, patientId);
        preparedStatement.setInt(3, polyclinicId);
        preparedStatement.setDate(4, appointmentDetail.getAppointmentDate());

        int result = preparedStatement.executeUpdate();
        //statement.close();
        System.out.println(result);
        connection.close();

    }
}
