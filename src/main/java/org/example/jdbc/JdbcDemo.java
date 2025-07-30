package org.example.jdbc;

import java.sql.*;

public class JdbcDemo {

    public static String LOAD_DRIVER = "com.mysql.cj.jdbc.Driver";
    public  static String URL = "jdbc:mysql://localhost:3306/testdb1";
    public static String PASSWORD = "Sumit@2004";
    public static String USERNAME = "root";


    public static void main(String args[]){

        try {
//            Load Driver
            Class.forName(LOAD_DRIVER);
//            Make Connection
            Connection connection = DriverManager.getConnection(URL , USERNAME , PASSWORD);

//            create Statement
            Statement statement = connection.createStatement();

//            Crete Query
            String query = "select * from student";

//            Excute Query

            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String firstName = resultSet.getString("firstname");
                String lastName = resultSet.getString("lastname");

                System.out.println("Id: " + id);
                System.out.println("FirstName: " + firstName);
                System.out.println("LastName: " + lastName);
                System.out.println("---------------");
            }

//            Close the Connection
            connection.close();


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
