package jrout.tutorial.db.postgres;

//import org.postgresql.Driver;

import java.sql.*;

public class DatabaseDriver {
    private final String url = "jdbc:postgresql://Jayram.local:5432/postgres";
    //jdbc:oracle:thin:@localhost:1521/XE
    private final String username = "postgres";
    private final String password = "postgres";

    public Connection connect(){
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver"); // loading a driver...
//            Class.forName("oracle.jdbc.driver.OracleDriver"); // loading a driver...

//            Driver driver = new Driver();
//            DriverManager.registerDriver(driver);

            connection = DriverManager.getConnection(url,username,password);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return connection;
    }
    public static void main(String[] args) {
        DatabaseDriver driver = new DatabaseDriver();
        Connection connect = driver.connect();
        if(connect != null) {
            System.out.println("Connection established...");
        }

        Statement statement = null;
        try {
            statement = connect.createStatement();
            ResultSet resultSet = statement.executeQuery("select actor_id , first_name, last_name from actor ");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("first_name"));
//                System.out.print(resultSet.getString("last_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
