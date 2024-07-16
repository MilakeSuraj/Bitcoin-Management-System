
package bitcoin.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;

class BalanceEnquiry extends JFrame implements ActionListener {

    
    JButton b1;
    JLabel l1;
    String pin;

    BalanceEnquiry(String pin) {
        this.pin = pin;

        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 960, 1080);
        add(l3);

        l1 = new JLabel();
        

        b1 = new JButton("BACK");
        b1.setBounds(390, 633, 150, 35);
        l3.add(b1);
        int balance= 0;
        try{    
        
            Conn conn =new Conn();
            ResultSet rs  = conn.s.executeQuery("select *from bank where pin = '"+pin+"'");
                
                while(rs.next())
                {
                    if(rs.getString("type").equals("Deposit"))
                    {
                        balance+=Integer.parseInt(rs.getString("amount"));
                    }
                    else
                    {
                        balance-=Integer.parseInt(rs.getString("amount"));
                    }
                }
            
        }
        catch(Exception e){
            
        }

        l1.setText("Your Current Account Balance is Rs "+balance);
            l1.setForeground(Color.white);
            l1.setFont(new Font("System", Font.BOLD, 16));
            l1.setBounds(190, 350, 400, 35);
            l3.add(l1);
            b1.addActionListener(this);
            b1.setBackground(Color.orange);

        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
        
}
        
        

        
    

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Transactions(pin).setVisible(true);
    
}
    public static void main(String[] args){
        new BalanceEnquiry("").setVisible(true);
    }
}

   