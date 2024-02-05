
package travel.management.system;
import java.sql.*; 

public class Conn {
    Conn (){
        Connection c; 
        Statement s; 
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            c = DriverManager.getConnection("jdbc:mysql:///tms/", "root", "grantnilson"); 
            s = c.createStatement(); 
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    
    
}
