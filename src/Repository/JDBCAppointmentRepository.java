/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

/*import Entity.AppointmentDetail;*/
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Entity.*;

/**
 *
 * @author Lenovo
 */
public class JDBCAppointmentRepository extends JDBCConnection{
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
        String sqlGetDoctorId = "select id from doctors where lower(doctorCode)=" + "lower('" + appointmentDetail.getDoctorCode() + "')";
        String sqlGetPatientId = "select id from patients where tcNo = " + "'" + appointmentDetail.getPatiendTcNo() + "'";
        String sqlGetPolyclinicId = "select id from polyclinics where lower(nameOfClinic) = lower('" + appointmentDetail.getPolyclinicName() + "')";
        String sqlAddAppointment = "insert into appointments (appointmentDate,doctorId,patientId,polyclinicId) values(?,?,?,?)";
        
        
        statement = connection.createStatement();
        resultSet = statement.executeQuery(sqlGetDoctorId);
        int doctorId = 0;
        while(resultSet.next()){
            doctorId = resultSet.getInt("id");
            System.out.println("DOCTOR ID  " + resultSet.getInt("id"));
        }
        statement.close();
        
        
        statement = connection.createStatement();
        resultSet = statement.executeQuery(sqlGetPatientId);
        int patientId = 0;
        while(resultSet.next()){
            patientId = resultSet.getInt("id");
            System.out.println("patientId" + resultSet.getInt("id"));
        }
        statement.close();
        
        
        statement = connection.createStatement();
        resultSet = statement.executeQuery(sqlGetPolyclinicId);
        int polyclinicId = 0;
        while(resultSet.next()){
            polyclinicId = resultSet.getInt("id");
            System.out.println("polyclinicId" + resultSet.getInt("id"));
        }
        statement.close();
        
        System.out.println(sqlGetDoctorId);
        System.out.println(sqlGetPatientId);
        System.out.println(sqlGetPolyclinicId);
        System.out.println(sqlAddAppointment);
        preparedStatement = (PreparedStatement) connection.prepareStatement(sqlAddAppointment);
        preparedStatement.setDate(1, appointmentDetail.getAppointmentDate());
        preparedStatement.setInt(2, doctorId);
        preparedStatement.setInt(3, patientId);
        preparedStatement.setInt(4, polyclinicId);   

        int result = preparedStatement.executeUpdate();

        System.out.println(result);
        connection.close();
        
    }

    @Override
    public String connectionStatus() throws SQLException {
        if(connection.isClosed() == false)
            return "Not Connected\n";
        else
            return "Connected\n";
    }
}
