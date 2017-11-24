package su.nstGroup.mainPackage;

import java.sql.*;
/*
* Class for working with the database
*/
class DBWorker {

    private final String login = "root";
    private final String password = "root";
    private final String server = "jdbc:mysql://localhost:3306/klubok?useSSL=true";
    private Connection connection = null;
    private Statement statement = null;
/*
* Constructor. Get Connection and Statement
*/
    DBWorker(){
        try {
            connection = DriverManager.getConnection(server, login, password);
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /*
    * Get the ResultSet and give it to the processing
    */
    ResultSet getResultSet(String query){
        ResultSet resultSet = null;
        try {
            resultSet = statement.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    /*
    Close Connection and statement
    */
    public void close(){
        try {
            if(statement != null)
            statement.close();
            if(connection != null)
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
