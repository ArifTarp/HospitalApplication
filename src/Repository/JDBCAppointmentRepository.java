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
        String sqlGetPolyclinicId = "select id from polyclinics where lower(name) = lower('" + appointmentDetail.getPolyclinicName() + "')";
        String sqlAddAppointment = "insert into appointments (id,doctorid,patientid,polyclinicid,appointmentdate) values(1,?,?,?,?)";
        
        
        statement = connection.createStatement();
        resultSet = statement.executeQuery(sqlGetDoctorId);
        resultSet.next();
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
        statement.close();
        
        
        preparedStatement = (PreparedStatement) connection.prepareStatement(sqlAddAppointment);
        preparedStatement.setInt(1, doctorId);
        preparedStatement.setInt(2, patientId);
        preparedStatement.setInt(3, polyclinicId);
        preparedStatement.setDate(4, appointmentDetail.getAppointmentDate());

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
