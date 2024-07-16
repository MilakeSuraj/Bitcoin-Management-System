
package bitcoin.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;


public class Login extends JFrame implements ActionListener{
JButton login,clear,signup;
JTextField cardTextField;
JPasswordField pinTextField;
    Login(){
        
        setTitle("Bitcoin Machine");
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(80, 10, 100, 100);
        add(label);
        
        
        JLabel text = new JLabel("Welcome To BTM ");
        text.setFont(new Font("Osward",Font.BOLD,40));
        text.setBounds(200,40,400,40);
        add(text);
        
        JLabel cardno = new JLabel("Card No : ");
        cardno.setFont(new Font("Railway",Font.BOLD,28));
       cardno.setBounds(120,150,400,30);
        add(cardno);
        
        cardTextField = new JTextField();
        cardTextField.setBounds(300, 150, 230, 30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(cardTextField);
        
        
        
        JLabel pin = new JLabel("PIN : ");
        pin.setFont(new Font("Railway",Font.BOLD,28));
        pin.setBounds(120,220,250,30);
        add(pin);
        
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300, 220, 230, 30);
        pinTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(pinTextField);
        
        
        login = new JButton("SIGN IN");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.ORANGE);
        login.setForeground(Color.BLACK);
        login.addActionListener(this);
        add(login);
        
        clear = new JButton("CLEAR");
        clear.setBounds(430, 300, 100, 30);
        clear.setBackground(Color.ORANGE);
        clear.setForeground(Color.BLACK);
        clear.addActionListener(this);
        add(clear);
        
        signup = new JButton("SIGN UP");
        signup.setBounds(300, 350, 230, 30);
        signup.setBackground(Color.ORANGE);
        signup.setForeground(Color.BLACK);
        signup.addActionListener(this);
        add(signup);
        
        getContentPane().setBackground(Color.white);
        
        setSize(800,480);
        setVisible(true);
        setLocation(350,200);
        
    }
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource()==clear)
            {
                cardTextField.setText("");
                pinTextField.setText("");
            }
            else if(ae.getSource()==login)
                {
                    Conn conn = new Conn();
                    String cardnumber =cardTextField.getText();
                    String pinnumber =pinTextField.getText();
                    
                    String query ="select * from login where cardnumber ='"+cardnumber+"' and pin ='"+pinnumber+"'";
                    
                    try
                    {
                     ResultSet rs = conn.s.executeQuery(query);
                     if(rs.next())
                     {
                         setVisible(false);
                         new Transactions(pinnumber).setVisible(true);
                     }
                     else
                     {
                         JOptionPane.showMessageDialog(null,"Incorrect Card Number or PIN");
                     }
                    }
                    catch(Exception e)
                    {
                        System.out.println(e);
                    }
                    
                }
            else if(ae.getSource()==signup)
                {
                    setVisible(false);
                    new SignupOne().setVisible(true);
                }
            
        
    }

    public static void main(String args[]) {
        
        new Login();
        
    }
    


  
}
