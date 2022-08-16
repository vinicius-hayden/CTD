import java.sql.*;

public class Program {

    private static final String sqlCreateTable = "DROP TABLE IF EXISTS figures; CREATE TABLE figures (id INT PRIMARY KEY, figure VARCHAR(32), color VARCHAR(32))";

    private static final String sqlInsert1 = "INSERT INTO figures (id, figure, color) VALUES (1, 'Circle', 'Red')";
    private static final String sqlInsert2 = "INSERT INTO figures (id, figure, color) VALUES (2, 'Circle', 'Red')";
    private static final String sqlInsert3 = "INSERT INTO figures (id, figure, color) VALUES (3, 'Square', 'Yellow')";
    private static final String sqlInsert4 = "INSERT INTO figures (id, figure, color) VALUES (4, 'Square', 'Blue')";
    private static final String sqlInsert5 = "INSERT INTO figures (id, figure, color) VALUES (5, 'Square', 'Green')";

    public static void main(String[] args) throws SQLException {

        Connection myConnection = null;

        try {
            myConnection = dataBaseConnection();

            System.out.println("Connection established!");
            Statement prepare = dataBaseConnection().createStatement();

            prepare.execute(sqlCreateTable);
            prepare.execute(sqlInsert1);
            prepare.execute(sqlInsert2);
            prepare.execute(sqlInsert3);
            prepare.execute(sqlInsert4);
            prepare.execute(sqlInsert5);
            listAll(myConnection);
            listRedCircles(myConnection);

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Closed!");
            myConnection.close();
        }

    }

    public static Connection dataBaseConnection() throws Exception {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/figure", "sa", "");
    }

    public static void listRedCircles(Connection connection) throws SQLException {
        String sqlQuery = "SELECT color, figure FROM figures WHERE color = 'Red'";
        Statement queryPrepare = connection.createStatement();
        ResultSet resultSet = queryPrepare.executeQuery(sqlQuery);

        while (resultSet.next()) {
            System.out.println("Figure: " + resultSet.getString("figure") + " - " + "Color: " + resultSet.getString("color"));
        }
    }


    public static void listAll(Connection connection) throws SQLException {

        String sqlQuery = "SELECT * FROM figures";
        Statement queryPrepare = connection.createStatement();
        ResultSet resultSet = queryPrepare.executeQuery(sqlQuery);

        while (resultSet.next()) {
            System.out.println(resultSet.getString(2) + " - " + "Color: " + resultSet.getString(3));
        }
    }
}