
package bitcoin.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;
import java.util.Date;


public class Withdrawl extends JFrame implements ActionListener{

    JButton withdrawl,back;
    JTextField amount;
    String pinnumber;
    Withdrawl(String pinnumber)
    {
        this.pinnumber=pinnumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text = new JLabel("Enter the amount you want to withdrawl");
        text.setBounds(170, 300, 400, 20);
        text.setForeground(Color.white);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);
        
        amount = new JTextField();
        amount.setFont(new Font("Railway",Font.BOLD,22));
        amount.setBounds(170, 350, 320, 25);
        image.add(amount);
        
        withdrawl = new JButton("WITHDRAW");
        withdrawl.setBounds(355, 485, 150, 30);
        withdrawl.setBackground(Color.orange);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        back = new JButton("BACK");
        back.setBounds(355, 520, 150, 30);
        back.setBackground(Color.orange);
        back.addActionListener(this);
        image.add(back);
        
        
        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==withdrawl)
        {
            String number =amount.getText().trim();
            if(number.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please enter amount you want to Withdrawl ");
            }
            else 
            {
                try
            {   Conn conn = new Conn();
                ResultSet rs  = conn.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
                int balance = 0;
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
                if(balance<Integer.parseInt(number))
                {
                    JOptionPane.showMessageDialog(null,"Insufficient Balance");
                    return;
                }
                Date date = new Date();
                int num = Integer.parseInt(number);
                String query="insert into bank values('"+pinnumber+"','"+date+"','withdrawl','"+num+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Rs : "+ num+" Debited Successfully" );
                
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        
                
            }

            
            
    }
    else {
                new Transactions(pinnumber).setVisible(true);
                setVisible(false);
            }
   
    }
    public static void main(String[] args){
        new Withdrawl("").setVisible(true);
    }
}
