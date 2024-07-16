
package bitcoin.management.system;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class SignupTwo extends JFrame implements ActionListener{
    
    long random;
    JTextField pan,adhar;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JComboBox religion,category,occupation,education,income;
    String formno;
    
    
    SignupTwo(String formno){
        
        this.formno=formno;
        setLayout(null);
        
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        
        
        JLabel additionalDetails = new JLabel("Page 2 : Additional Details");
        additionalDetails.setFont(new Font("Railway",Font.BOLD,22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);
        
        JLabel Religion = new JLabel("Religion : ");
        Religion.setFont(new Font("Railway",Font.BOLD,20));
        Religion.setBounds(100, 140, 100, 30);
        add(Religion);
        
        String valReligion[] ={"Hindu","Muslim","Sikh","Christian","other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.white);
        add(religion);
        
        
        JLabel Category = new JLabel("Category : ");
        Category.setFont(new Font("Railway",Font.BOLD,20));
        Category.setBounds(100, 190, 200, 30);
        add(Category);
        
        String valcategory[] ={"General","OBC","SC","ST","NT","Other"};
        category = new JComboBox(valcategory);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.white);
        add(category);
        
        
        JLabel Income = new JLabel("Income : ");
        Income.setFont(new Font("Railway",Font.BOLD,20));
        Income.setBounds(100, 240, 200, 30);
        add(Income);
        
        String incomecategory[] ={"Null","<1,50,000","<5,00,00","<8,00,000","<=12,00,000",">12,00,000"};
        income = new JComboBox(incomecategory);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.white);
        add(income);
        
         
        
        
        JLabel Educational = new JLabel("Educational  ");
        Educational.setFont(new Font("Railway",Font.BOLD,20));
        Educational.setBounds(100, 290, 200, 30);
        add(Educational);
        
       
        
        JLabel Qualification = new JLabel("Qualification : ");
        Qualification.setFont(new Font("Railway",Font.BOLD,20));
        Qualification.setBounds(100, 315, 200, 30);
        add(Qualification);
        
        String educationValues[] ={"Non-Graduate","Graduation","Post-Graduation","Doctrate","other"};
        education = new JComboBox(educationValues);
        education.setBounds(300, 315, 400, 30);
        education.setBackground(Color.white);
        add(education);
        
        
       
        
        
        
        JLabel Occupation = new JLabel("Occupation: ");
        Occupation.setFont(new Font("Railway",Font.BOLD,20));
        Occupation.setBounds(100, 390, 200, 30);
        add(Occupation);
        
        String occupationValues[] ={"Student","Salaried","Self-Employed","Bussiness","Retired","other"};
        occupation = new JComboBox(occupationValues);
        occupation.setBounds(300, 390, 400, 30);
        occupation.setBackground(Color.white);
        add(occupation);
        
        
    
        
        JLabel Pan = new JLabel("PAN Number : ");
        Pan.setFont(new Font("Railway",Font.BOLD,20));
        Pan.setBounds(100, 440, 200, 30);
        add(Pan);
        
        pan = new JTextField();
        pan.setFont(new Font("Railway",Font.BOLD,14));
        pan.setBounds(300, 440, 400, 30);
        add(pan);
        
        
        JLabel Adhar= new JLabel("Adhar Number : ");
        Adhar.setFont(new Font("Railway",Font.BOLD,20));
        Adhar.setBounds(100, 490, 200, 30);
        add(Adhar);
        
        adhar = new JTextField();
        adhar.setFont(new Font("Railway",Font.BOLD,14));
        adhar.setBounds(300, 490, 400, 30);
        add(adhar);
        
        
        JLabel state= new JLabel("Senior Citizen : ");
        state.setFont(new Font("Railway",Font.BOLD,20));
        state.setBounds(100, 540, 200, 30);
        add(state);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(450, 540, 100, 30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup scgroup = new ButtonGroup();
        scgroup.add(syes);
        scgroup.add(sno);

        
      
        
        JLabel pincode= new JLabel("Existing Account : ");
        pincode.setFont(new Font("Railway",Font.BOLD,20));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(450, 590, 100, 30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup eaccgroup = new ButtonGroup();
        eaccgroup.add(eyes);
        eaccgroup.add(eno);
        
        
        
        next = new JButton("NEXT");
        next.setBackground(Color.ORANGE);
        next.setForeground(Color.BLACK);
        next.setFont(new Font("Railway",Font.BOLD,14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);
        
        

        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
  
        String sreligion =(String)religion.getSelectedItem();
        String scategory = (String)category.getSelectedItem();
        String sincome =(String)income.getSelectedItem();
        String seducation =(String)education.getSelectedItem();
        String soccupation =(String)occupation.getSelectedItem();
        String seniorcitizen =null;
        if(syes.isSelected())
        {
            seniorcitizen="Yes";
        }
        else if(sno.isSelected())
        {
            seniorcitizen="No";
        }
      
        String existingaccount=null;
        if(eyes.isSelected())
        {
            existingaccount ="Yes";
        }
        else if(eno.isSelected())
        {
             existingaccount ="No";
        }
       
        
        String span =pan.getText();
        String sadhar =adhar.getText();

        try
        {
           
                Conn c= new Conn();
                String query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+sadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
                c.s.execute(query);
                
                setVisible(false);
                new SignupThree(formno).setVisible(true);
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
    
    public static void main(String args[]) {
       new SignupTwo("");
    }
}
