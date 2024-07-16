
package bitcoin.management.system;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Transactions extends JFrame implements ActionListener{

    String pinnumber;
    JButton deposite,withdrawl,ministatement,pinchange,fastcash,exit,balanceenquiry;
    Transactions(String pinnumber)
    {
        this.pinnumber=pinnumber;
        setLayout(null);
     
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        
        JLabel text = new JLabel("Please Select Your Transaction");
        text.setBounds(210, 300, 700, 35);
        text.setForeground(Color.white);
        text.setFont(new Font("Railway",Font.BOLD,16));
        image.add(text);
        
       
        deposite = new JButton("DEPOSITE");
        deposite.setBounds(170, 415, 150, 30);
        deposite.setBackground(Color.orange);
        deposite.addActionListener(this);
        image.add(deposite);
        
        withdrawl = new JButton("CASH WITHDRAWL");
        withdrawl.setBounds(355, 415, 150, 30);
        withdrawl.setBackground(Color.orange);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        fastcash = new JButton("FAST CASH");
        fastcash.setBounds(170, 450, 150, 30);
        fastcash.setBackground(Color.orange);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
        ministatement = new JButton("MINI STATEMENT");
        ministatement.setBounds(355, 450, 150, 30);
        ministatement.setBackground(Color.orange);
        ministatement.addActionListener(this);
        image.add(ministatement);
        
        pinchange = new JButton("PIN CHANGE");
        pinchange.setBounds(170, 485, 150, 30);
        pinchange.setBackground(Color.orange);
        pinchange.addActionListener(this);
        image.add(pinchange);
         
        balanceenquiry = new JButton("BALANCE ENQUIRY");
        balanceenquiry.setBounds(355, 485, 150, 30);
        balanceenquiry.setBackground(Color.orange);
        balanceenquiry.addActionListener(this);
        image.add(balanceenquiry);
        
        exit = new JButton("Exit");
        exit.setBounds(355, 520, 150, 30);
        exit.setBackground(Color.orange);
        exit.addActionListener(this);
        image.add(exit);
        
        
         
         
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==exit)
        {
            System.exit(0);
        }
        else if(ae.getSource()==deposite)
        {
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
            
        }
        else if(ae.getSource()==withdrawl)
        {
            setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
            
        }
        else if(ae.getSource()==fastcash)
        {
            setVisible(false);
            new FastCash(pinnumber).setVisible(true);
            
        }
        else if(ae.getSource()==pinchange)
        {
            setVisible(false);
            new PinChange(pinnumber).setVisible(true);
            
        }
        else if(ae.getSource()==balanceenquiry)
        {
            setVisible(false);
            new BalanceEnquiry(pinnumber).setVisible(true);
            
        }
        else if(ae.getSource()==ministatement)
        {
            
            new MiniStatement(pinnumber).setVisible(true);
            
        }
        
        
    }
    public static void main(String args[]) {

        new Transactions("");
    }
}
