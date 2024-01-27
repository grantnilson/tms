
package travel.management.system;
import java.sql.*; 

public class Conn {
    Conn (){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            c = DriverManager.getConnection("jdbc:mysql://travelmanagementsystem/", "root", "grantnilson"); 
            s = c.createStatement(); 
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    
    
}
