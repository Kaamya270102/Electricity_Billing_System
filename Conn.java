package electricitybillingsystem;

import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");    //Dynamically load the driver's class file into memory, which automatically registers it.
            c=DriverManager.getConnection("jdbc:mysql:///project","root","Vidhu#28");  //create connection object
            s=c.createStatement();   //access our database
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
    }
}

 
