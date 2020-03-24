package jrout.tutorial.db.postgres;

//import org.postgresql.Driver;

import jrout.tutorial.db.postgres.domain.Actor;

import java.sql.*;

public class DatabaseDriverPreparedStatement {
    private final String url = "jdbc:postgresql://Jayram.local:5432/postgres";
    private final String username = "postgres";
    private final String password = "postgres";

    public Connection connect(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url,username,password);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return connection;
    }
    public static void main(String[] args) {
        DatabaseDriverPreparedStatement driver = new DatabaseDriverPreparedStatement();
        Actor actorDetails = driver.getActorDetails(55);
        System.out.println(actorDetails);

    }

    private Actor getActorDetails(int actorId) {
        Actor actor = null;
        Connection connect = connect();
        if(connect != null) {
            System.out.println("Connection established...");
        }

        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connect.prepareStatement
//                    ("select actor_id , first_name, last_name last_update, from actor where actor_id = ?");
                    ("select * from actor where actor_id = ?");
            preparedStatement.setInt(1,actorId);

//            preparedStatement = connect.prepareStatement
//                    ("select * from actor where first_name = ? and last_name = ?");
//            preparedStatement.setString(1,"Nick");
//            preparedStatement.setString(2,"Stallone");

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                actor = new Actor();
                int actor_id = resultSet.getInt("actor_id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                Date date = resultSet.getDate("last_update");
                actor.setActorId(actor_id);
                actor.setFirstName(firstName);
                actor.setLastName(lastName);
                actor.setLastUpdatedDate(date);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return actor;
    }

}
