package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class Customer {
 int id;
     String name;
     String place;
     int age;

    Customer( int id,String name,int age,String place)
    {
        this.id = id;
        this.name=name;
        this.place=place;
        this.age=age;
    }
}

public class myApp {
private  Connection connection;

public myApp(String jdbcUrl,String username,String password) throws SQLException
{
    this.connection = DriverManager.getConnection(jdbcUrl,username,password) ;
}

//  private void insertCustomer(int id ,String name,int age,String place) throws SQLException
// {
//     try(PreparedStatement preparedStatement= connection.prepareStatement("insert into customer(customer_id,customer_name,age,place) values(?,?,?,?)"))
//     {
//         preparedStatement.setInt(1, id);
//         preparedStatement.setString(2, name);
//         preparedStatement.setInt(3, age);
//         preparedStatement.setString(4, place);
//         preparedStatement.executeUpdate();
//     }
// }

public void fetchCustomers() throws SQLException {
    // Use the 'connection' to execute SQL queries or updates
    try (PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM customer")) {
        ResultSet resultSet = preparedStatement.executeQuery();

        // Process the result set
        while (resultSet.next()) {
           System.out.println(resultSet.getString("customer_name")+"\t"+resultSet.getString("place"));
        }
    }
}

public void fetchOrders() throws SQLException {
    // Use the 'connection' to execute SQL queries or updates
    try (PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM orders")) {
        ResultSet resultSet = preparedStatement.executeQuery();
     
        // Process the result set
        while (resultSet.next()) {
           System.out.println(resultSet.getInt("prod_id")+"\t"+resultSet.getInt("order_id"));
        }
    }
}

public void closeConnection() throws SQLException
{
    if(!connection.isClosed() || connection!=null)     
        connection.close();
}
public static void main(String[] args) {
    try
    {
        myApp dbHandler = new myApp("jdbc:mysql://localhost:3306/practiselab",
    "root", "root");
       
        System.out.println();
        System.out.println();
        dbHandler.fetchCustomers();
        System.out.println();
        System.out.println();
        dbHandler.fetchOrders();
        System.out.println();
        System.out.println();
        dbHandler.closeConnection();
    }
    catch( SQLException e)
    {
        e.printStackTrace();
    }
 

}
}
