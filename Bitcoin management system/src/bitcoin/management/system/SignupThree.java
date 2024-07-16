
package bitcoin.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener{
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String formno;
    SignupThree(String formno){
        
        this.formno=formno;
        setLayout(null);
        
                
        JLabel l1 = new JLabel("Page 3 : Account Details");
        l1.setFont(new Font("Railway",Font.BOLD,22));
        l1.setBounds(280, 40, 400, 40);
        add(l1);
        
        JLabel type = new JLabel("Account Type");
        type.setFont(new Font("Railway",Font.BOLD,22));
        type.setBounds(100, 140, 200, 40);
        add(type);
        
        r1= new JRadioButton("Saving Account");
        r1.setFont(new Font("Railway",Font.BOLD,16));
        r1.setBackground(Color.white);
        r1.setBounds(100, 180, 250, 20);
        add(r1);
        
        r2= new JRadioButton("Fixed Deposite Account");
        r2.setFont(new Font("Railway",Font.BOLD,16));
        r2.setBackground(Color.white);
        r2.setBounds(350, 180, 250, 20);
        add(r2);
        
        r3= new JRadioButton("Current Account");
        r3.setFont(new Font("Railway",Font.BOLD,16));
        r3.setBackground(Color.white);
        r3.setBounds(100, 220, 250, 20);
        add(r3);
        
        r4= new JRadioButton("Recurring Deposite Account");
        r4.setFont(new Font("Railway",Font.BOLD,16));
        r4.setBackground(Color.white);
        r4.setBounds(350, 220, 250, 20);
        add(r4);
        
        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);
        
        JLabel card = new JLabel("Card Number");
        card.setFont(new Font("Railway",Font.BOLD,22));
        card.setBounds(100, 300, 200, 30);
        add(card);
        
        JLabel number = new JLabel("XXXX-XXXX-XXXX-2112");
        number.setFont(new Font("Railway",Font.BOLD,22));
        number.setBounds(330, 300, 300, 30);
        add(number);
        
        JLabel carddetail = new JLabel("Your 16 Digit Card Number");
        carddetail.setFont(new Font("Railway",Font.BOLD,12));
        carddetail.setBounds(100, 330, 300, 20);
        add(carddetail);
        
        JLabel pin = new JLabel("PIN :");
        pin.setFont(new Font("Railway",Font.BOLD,22));
        pin.setBounds(100, 370, 200, 30);
        add(pin);
        
        JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Railway",Font.BOLD,22));
        pnumber.setBounds(330, 370, 300, 30);
        add(pnumber);
        
        JLabel pindetail = new JLabel("Your 4 Digit Password");
        pindetail.setFont(new Font("Railway",Font.BOLD,12));
        pindetail.setBounds(100, 400, 300, 20);
        add(pindetail);
        
        
        JLabel services = new JLabel("Servises Required :");
        services.setFont(new Font("Railway",Font.BOLD,22));
        services.setBounds(100, 450, 400, 30);
        add(services);
        
        c1=new JCheckBox("ATM CARD");
        c1.setFont(new Font("Railway",Font.BOLD,16));
        c1.setBackground(Color.white);
        c1.setBounds(100, 500, 200, 30);
        add(c1);
        
        c2=new JCheckBox("INTERNET BANKING");
        c2.setFont(new Font("Railway",Font.BOLD,16));
        c2.setBackground(Color.white);
        c2.setBounds(350, 500, 200, 30);
        add(c2);
        
        c3=new JCheckBox("MOBILE BANKING");
        c3.setFont(new Font("Railway",Font.BOLD,16));
        c3.setBackground(Color.white);
        c3.setBounds(100, 550, 200, 30);
        add(c3);
        
        c4=new JCheckBox("EMAIL & SMS ALERT");
        c4.setFont(new Font("Railway",Font.BOLD,16));
        c4.setBackground(Color.white);
        c4.setBounds(350, 550, 200, 30);
        add(c4);
        
        c5=new JCheckBox("CHECKBOOK ");
        c5.setFont(new Font("Railway",Font.BOLD,16));
        c5.setBackground(Color.white);
        c5.setBounds(100, 600, 200, 30);
        add(c5);
        
        c6=new JCheckBox("E-STATEMENT");
        c6.setFont(new Font("Railway",Font.BOLD,16));
        c6.setBackground(Color.white);
        c6.setBounds(350, 600, 200, 30);
        add(c6);
        
        c7=new JCheckBox("I here by declares the above entered details are correct to the best of my knowledge");
        c7.setFont(new Font("Railway",Font.BOLD,12));
        c7.setBackground(Color.white);
        c7.setBounds(100, 680, 600, 30);
        add(c7);
        
        submit= new JButton("SUBMIT");
        submit.setBackground(Color.orange);
        submit.setForeground(Color.black);
        submit.setFont(new Font("Railway",Font.BOLD,14));
        submit.setBounds(250, 720, 100, 30);
        submit.addActionListener(this);
        add(submit);
        
        cancel= new JButton("CANCEL");
        cancel.setBackground(Color.orange);
        cancel.setForeground(Color.black);
        cancel.setFont(new Font("Railway",Font.BOLD,14));
        cancel.setBounds(420, 720, 100, 30);
        cancel.addActionListener(this);
        add(cancel);
        
        
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850,820);
        setLocation(350,0);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==submit)
        {
            String accountType = "";
            if(r1.isSelected())
            {
                accountType="Saving account";
            }
            else if(r2.isSelected())
            {
                accountType="Fixed deposite account";
            }
            else if(r3.isSelected())
            {
                accountType="Current account";
            }
            else if(r4.isSelected())
            {
                accountType="Recurring depositr account";
            }
            
           Random random = new Random();
           String cardnumber = ""+ Math.abs((random.nextLong()%9000000000000000L) + 2112200300000000L);
           
           String pinnumber =""+ Math.abs((random.nextLong()%9000L) + 1000L);
           
           String facility ="";
           if(c1.isSelected())
           {
               facility =facility +" ATM CARD";
           }
           if(c2.isSelected())
           {
               facility =facility  +" INTERNET BANKING";
           }
           if(c3.isSelected())
           {
               facility =facility  +" MOBILE BANKING";
           }
           if(c4.isSelected())
           {
               facility =facility  +" EMAIL & SMS ALERT";
           }
           if(c5.isSelected())
           {
               facility =facility  +" CHEQUE BOOK";
           }
           if(c6.isSelected())
           {
               facility =facility  +" E-STATEMENT";
           }
            
           String mark ="";
           if(c7.isSelected())
           {
               mark="marked";
           }
                  
           try
           {
               if(accountType.equals(""))
               {
                   JOptionPane.showMessageDialog(null,"Account Type is required");
               }
               else if(mark.equals(""))
               {
                   JOptionPane.showMessageDialog(null,"Please click the check mark");
               }
               
               else
               {
                   Conn conn = new Conn();
                   String query1 ="insert into signupthree values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                   String query2 ="insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
                   conn.s.executeUpdate(query1);
                   conn.s.executeUpdate(query2);
                   
                   JOptionPane.showMessageDialog(null,"Card Number : "+cardnumber + "\nPin Number  :" + pinnumber);
                   setVisible(false);
                   new Deposit(pinnumber).setVisible(true);
               }
           }
           catch(Exception e)
           {
               System.out.println(e);
           }
        }
        else if(ae.getSource()==cancel){
            setVisible(false);
            new Login().setVisible(true);
        }
    }

    public static void main(String args[]) {
     
        new SignupThree("");
    }

   
}
