package su.nstGroup.mainPackage;

import java.sql.*;

class DBWorker {

    private final String login = "root";
    private final String password = "root";
    private final String server = "jdbc:mysql://localhost:3306/klubok?useSSL=true";
    private Connection connection = null;
    private Statement statement = null;

    DBWorker(){
        try {
            connection = DriverManager.getConnection(server, login, password);
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    ResultSet getResultSet(String query){
        ResultSet resultSet = null;
        try {
            resultSet = statement.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }
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
