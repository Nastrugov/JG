package su.nstGroup.mainPackage;

import java.sql.*;

public class DBWorker {

    private final String login = "root";
    private final String password = "root";
    private final String server = "jdbc:mysql://localhost:3306/klubok?useSSL=true";
    private Connection connection = null;
    private Statement statement = null;

    public DBWorker(){
        try {
            connection = DriverManager.getConnection(server, login, password);
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

/*    public static void main(String[] args) throws Exception{
        DBWorker worker = new DBWorker();
        ResultSet setId = worker.statement.executeQuery("select * from knitted_products");
        while(setId.next()){
            System.out.print("<--" + setId.getInt("id") + "||");
            System.out.print(setId.getString("name")+ "||");
            System.out.print(setId.getString("material")+ "||");
            System.out.print(setId.getString("size")+ "||");
            System.out.print(setId.getString("color")+ "||");
            System.out.print(setId.getFloat("cost")+ "||");
            System.out.println(setId.getString("pictures")+ "-->");
        }

        worker.close();
    }*/

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
