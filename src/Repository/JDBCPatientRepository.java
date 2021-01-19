
package Repository;

import Entity.Patient;
import Entity.PatientDetail;
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
public class JDBCPatientRepository extends JDBCConnection{
    Connection connection;
    DbContext dbContext;
    Statement statement;
    ResultSet resultSet;
    PreparedStatement preparedStatement;

    public JDBCPatientRepository() throws SQLException {
        try {
            dbContext = new DbContext();
            connection = dbContext.getConnection();
            System.out.println("Connection is success.");
        } catch (SQLException exception) {
            dbContext.showErrorMessage(exception);
        }
    }
    
    public boolean addPatient(Patient patient) throws SQLException {
        
        String sql = "INSERT into patients (tcNo,firstName,lastName) values('"+patient.getTcNo()+"','"+patient.getFirstName()+"','"+patient.getLastName()+"')";
        preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
        int result = preparedStatement.executeUpdate();
        connection.close();
        if (result != 0) {
            return true;
        }
        else{
            return false;
        }
    }
    
    public ArrayList<Patient> getAllPatients() throws SQLException {
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT p.firstName,p.lastName,p.tcNo from patients p");
            ArrayList<Patient> patients = new ArrayList<>();
            while (resultSet.next()) {
                patients.add(new Patient(resultSet.getString("tcNo"), resultSet.getString("firstName"),
                        resultSet.getString("lastName")));
            }
            return patients;
        } catch (SQLException exception) {
            dbContext.showErrorMessage(exception);
        } finally {            
            connection.close();
        }
        return null;
    }
    
    public ArrayList<PatientDetail> getAllPatientDetails() throws SQLException {
        try {
            statement = connection.createStatement();
            String sql = "select patients.firstName,patients.lastName,patients.tcNo,appointments.appointmentdate,doctors.firstName as doctorname,doctors.lastName as doctorlastname,polyclinics.NAMEOFCLINIC\n"
                    + "from patients join appointments on appointments.patientid = patients.id\n"
                    + "join doctors on doctors.id = appointments.doctorid\n"
                    + "join polyclinics on polyclinics.id = appointments.polyclinicid";

            resultSet = statement.executeQuery(sql);
            ArrayList<PatientDetail> patients = new ArrayList<>();
            while (resultSet.next()) {
                patients.add(new PatientDetail(resultSet.getString("tcNo"), resultSet.getString("firstName"),
                        resultSet.getString("lastName"), resultSet.getString("doctorname"), resultSet.getString("doctorlastname"), resultSet.getString("appointmentdate"),
                        resultSet.getString("NAMEOFCLINIC")));
            }

            return patients;
        } catch (SQLException exception) {
            dbContext.showErrorMessage(exception);
        } finally {
            //statement.close();
            connection.close();
        }
        return null;
    }
    
    public void deletePatient(String tc) throws SQLException {
        String sql = "delete from patients where tcNo = ?";
        preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
        preparedStatement.setString(1, tc);

        int result = preparedStatement.executeUpdate();
        
        connection.close();
    }
    
    public ArrayList<PatientDetail> getAllPatientDetailByTcNo(String tcNo) throws SQLException {
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select patients.firstName,patients.lastName,patients.tcNo,appointments.appointmentdate,doctors.firstName as doctorname,doctors.lastName as doctorlastname,polyclinics.name\n"
                    + "from patients join appointments on appointments.patientid = patients.id\n"
                    + "join doctors on doctors.id = appointments.doctorid\n"
                    + "join polyclinics on polyclinics.id = appointments.polyclinicid where patients.tcNo = " + tcNo);
            ArrayList<PatientDetail> patients = new ArrayList<>();
            while (resultSet.next()) {
                patients.add(new PatientDetail(resultSet.getString("tcNo"), resultSet.getString("firstName"),
                        resultSet.getString("lastName"), resultSet.getString("doctorname"), resultSet.getString("doctorlastname"), resultSet.getString("appointmentdate"),
                        resultSet.getString("name")));
            }

            return patients;
        } catch (SQLException exception) {
            dbContext.showErrorMessage(exception);
        } finally {
            //statement.close();
            connection.close();
        }
        return null;
    }
    
    public ArrayList<Patient> getAllPatientsWithDoctorsAndDates() throws SQLException {
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT patients.id, patients.tcNo, patients.firstName,\n"
                    + " patients.lastName,doctors.firstName,doctors.lastName,\n"
                    + " appointments.date,polyclinics.name\n"
                    + "FROM patients\n"
                    + "JOIN appointments ON patients.id=appointments.patientid\n"
                    + "JOIN doctors ON appointments.doctorid = doctors.id\n"
                    + "JOIN polyclinics ON appointments.polyclinicid = polyclinics.id");
            ArrayList<Patient> patients = new ArrayList<>();
            while (resultSet.next()) {
                patients.add(new Patient(resultSet.getString("patients.tcNo"), resultSet.getString("polyclinics.name"),
                        resultSet.getString("doctors.firstName")));

                System.out.println(resultSet.getString("doctors.firstName") + resultSet.getString("patients.tcNo") + resultSet.getString("polyclinics.name"));
            }
            return patients;
        } catch (SQLException exception) {
            dbContext.showErrorMessage(exception);
        } finally {
            //statement.close();
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
