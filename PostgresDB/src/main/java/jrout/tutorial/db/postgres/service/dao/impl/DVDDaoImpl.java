package jrout.tutorial.db.postgres.service.dao.impl;

import jrout.tutorial.db.postgres.Actor;
import jrout.tutorial.db.postgres.service.dao.IDVDDao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DVDDaoImpl implements IDVDDao {

    @Override
    public Actor getActorDetail(int actorId) {
        return getActorDetails(actorId);
    }

    @Override
    public Actor getActorDetail(String firstName, String lastName) {
        return null;
    }

    @Override
    public Actor[] getActors(String fName) {
        List<Actor> actorList = new ArrayList<>();
//
//        Actor [] actors1 = new Actor[10];
//
        Actor actor = null;
        Connection connect = connect();
        if(connect != null) {
            System.out.println("Connection established...");
        }

        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connect.prepareStatement("select * from actor where first_name = ?");
            preparedStatement.setString(1,fName);

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
                actorList.add(actor);
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

        int size = actorList.size();

        Actor[] actors1 = new Actor[size];

        for(int i = 0 ; i< actorList.size(); i++) {
            actors1[i] = actorList.get(i);
        }

        return actors1;
    }

    @Override
    public List<Actor> getActors_v2(String fName) {
        List<Actor> actorList = new ArrayList<>();
        Actor actor = null;
        Connection connect = connect();
        if(connect != null) {
            System.out.println("Connection established...");
        }

        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connect.prepareStatement("select * from actor where first_name = ?");
            preparedStatement.setString(1,fName);

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
                actorList.add(actor);
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

        return actorList;
    }

    @Override
    public String getFilm(String title) {
        return null;
    }


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


    private Actor getActorDetails(int actorId) {
        Actor actor = null;
        Connection connect = connect();
        if(connect != null) {
            System.out.println("Connection established...");
        }

        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connect.prepareStatement("select * from actor where actor_id = ?");
            preparedStatement.setInt(1,actorId);

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
