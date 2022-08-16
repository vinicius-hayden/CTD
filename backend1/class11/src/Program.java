import java.sql.*;

public class Program {


    // Before main method, we'll create SQL instructions.

    private static final String sqlCreateTable = "DROP TABLE IF EXISTS animal; CREATE TABLE animal (id INT PRIMARY KEY, name VARCHAR(64), type VARCHAR(32))  ";

    private static final String sqlInsert1= "INSERT INTO animal (id, name, type) VALUES (1, 'Meg', 'Dog')";
    private static final String sqlInsert2= "INSERT INTO animal (id, name, type) VALUES (2, 'Mingau', 'Cat')";
    private static final String sqlInsert3= "INSERT INTO animal (id, name, type) VALUES (3, 'Dumbo', 'Elephant')";
    private static final String sqlInsert4= "INSERT INTO animal (id, name, type) VALUES (4, 'Puppy', 'Dog')";
    private static final String sqlInsert5= "INSERT INTO animal (id, name, type) VALUES (5, 'Pé de Pano', 'Horse')";
    private static final String sqlDelete= "DELETE FROM animal WHERE id=2";

    public static void main(String[] args) throws SQLException {

        Connection myConnection = null;

        try {
            myConnection = dataBaseConnection();
            System.out.println("Connection successfully made");
            Statement waiting = myConnection.createStatement();
            waiting.execute(sqlCreateTable);
            waiting.execute(sqlInsert1);
            waiting.execute(sqlInsert2);
            waiting.execute(sqlInsert3);
            waiting.execute(sqlInsert4);
            waiting.execute(sqlInsert5);
            listAll(myConnection);
            waiting.execute(sqlDelete);
            listAll(myConnection);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Connection successfully closed");
            myConnection.close();
        }

    }

    // H2 Database connection method (outside main method)

    public static Connection dataBaseConnection() throws Exception {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/class11-animal", "sa", "");
    }

    public static void listAll(Connection connection) throws SQLException {

        String sqlQuery = "SELECT * FROM animal";
        Statement queryPrepare = connection.createStatement();
        ResultSet resultSet = queryPrepare.executeQuery(sqlQuery);

        while (resultSet.next()) {
            System.out.println("ID: " + resultSet.getInt(1) + " - " + "Name: " + resultSet.getString(2) + " - " + "Type: " + resultSet.getString(3));
        }

    }


}
