// Declare that this class belongs to the "Electricity" package
package Electricity;

// Import the necessary classes from the "java.sql" package
import java.sql.*;

// Define a public class called "Conn"
public class Conn{
    // Declare two member variables to hold a Connection object and a Statement object respectively
    Connection c;
    Statement s;
    
    // Define a constructor for the class
    public Conn(){  
        // Begin a try block to catch any potential exceptions
        try{  
            // Load the MySQL JDBC driver class
            Class.forName("com.mysql.jdbc.Driver");  
            // Create a new database connection to a MySQL database named "ebs" with username "root" and password "mysql123"
            c =DriverManager.getConnection("jdbc:mysql:///ebs","root","mysql123");    
            // Create a new Statement object from the connection
            s =c.createStatement();  
        }
        // If an exception occurs, catch it and print out the error message
        catch(Exception e){ 
            System.out.println(e);
        }  
    }  
} 


/*In the above code, "package", "class", and "constructor" are all Java programming concepts that serve different purposes.

"Package" is a keyword in Java that is used to group related classes together into a single namespace. In the above code, the package statement package Electricity; is used to declare that the Conn class belongs to the "Electricity" package.

"Class" is a keyword in Java that is used to define a blueprint for creating objects. In the above code, the Conn class is defined with the following syntax: public class Conn{ ... }. This defines a new class called "Conn" that contains a constructor and member variables for holding a database connection and a statement object.

"Constructor" is a special method in Java that is called when an object of a class is created. It is used to initialize the object's state and allocate memory for it. In the above code, the constructor for the Conn class is defined with the following syntax: public Conn(){ ... }. This constructor loads the MySQL JDBC driver, establishes a connection to the "ebs" database, and creates a Statement object that can be used to execute SQL queries against the database.*/
