
package bitcoin.management.system;

import java.sql.*;  

public class Conn {


    Connection c;
    Statement s;
    public Conn(){  
        try{  
         
            c =DriverManager.getConnection("jdbc:mysql://localhost:3307/bitcoinmanagementsystem","root","12345678");    
            s =c.createStatement(); 
           
          
            
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}
