
package Model;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


/**
 *
 * @author User
 */
public class dbconnect1 {
    public static Connection connect(){
    Connection conn = null;
    
    try{
    Class.forName("com.mysql.jdbc.Driver");
    conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/customer details","root","");
    
    }
    catch(Exception e){
    
    JOptionPane.showMessageDialog(null, e);
    }
    
    
    return conn;
    
    
           
    
    
    }
 
}
