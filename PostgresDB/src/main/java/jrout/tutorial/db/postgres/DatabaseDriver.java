package jrout.tutorial.db.postgres;

import java.sql.*;

public class DatabaseDriver {
    private final String url = "jdbc:postgresql://Jayram.local:5432/postgres";
    private final String username = "postgres";
    private final String password = "postgres";

    public Connection connect(){
        Connection connection = null;
        try{
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
            while (resultSet.next()){
                System.out.println(resultSet.getString("first_name"));
//                System.out.print(resultSet.getString("last_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
