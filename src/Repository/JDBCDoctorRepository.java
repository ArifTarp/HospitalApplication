/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import Entity.Doctor;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class JDBCDoctorRepository extends JDBCConnection{
    
    Connection connection;
    DbContext dbContext;
    Statement statement;
    ResultSet resultSet;
    PreparedStatement preparedStatement;

    public JDBCDoctorRepository(){
        try {
            dbContext = new DbContext();
            connection = dbContext.getConnection();
            System.out.println("Connection is success.");
        } catch (SQLException exception) {
            dbContext.showErrorMessage(exception);
        }
    }
    
    public void addDoctor(Doctor doctor) throws SQLException{
        
        CallableStatement cs = connection.prepareCall("{call addDoctor(?,?,?)}");
        cs.setString("first_name", doctor.getFirstName());
        cs.setString("lastname_name", doctor.getLastName());
        cs.setString("doctor_code", doctor.getDoctorCode());
        cs.executeQuery();
        connection.close();
    }
    
    public ArrayList<Doctor> getAllDoctors() throws SQLException {
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select firstName,lastName from doctors");
            ArrayList<Doctor> doctors = new ArrayList<>();
            if(resultSet != null){
                while (resultSet.next()) {
                doctors.add(new Doctor(resultSet.getString("firstName"), 
                        resultSet.getString("lastName")));
                }
            }
            
            return doctors;
        } catch (SQLException exception) {
            dbContext.showErrorMessage(exception);
        } finally {            
            connection.close();
        }
        return null;
    }

    @Override
    public String connectionStatus() throws SQLException {
        if(connection.isClosed() == false)
            return "Not Connected\n";
        else
            return "Connected\n";
    }
    
}
