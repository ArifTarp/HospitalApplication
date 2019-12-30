/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import Entity.Doctor;
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
public class JDBCDoctorRepository {
    
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
        String sql = "insert into doctors (firstName,lastName,doctorCode) values(?,?,?)";
        preparedStatement = (PreparedStatement)connection.prepareStatement(sql);
        preparedStatement.setString(1,doctor.getFirstName());
        preparedStatement.setString(2,doctor.getLastName());
        preparedStatement.setString(3,doctor.getDoctorCode());
        int result = preparedStatement.executeUpdate();
        //statement.close();
        connection.close();
    }
    
    public ArrayList<Doctor> getAllDoctors() throws SQLException {
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select firstName,lastName from doctors");
            ArrayList<Doctor> doctors = new ArrayList<>();
            while (resultSet.next()) {
                doctors.add(new Doctor(resultSet.getString("firstName"), 
                        resultSet.getString("lastName")));
                
                System.out.println(resultSet.getString("firstName") + resultSet.getString("lastName"));
            }
            return doctors;
        } catch (SQLException exception) {
            dbContext.showErrorMessage(exception);
        } finally {            
            connection.close();
        }
        return null;
    }
    
}
