import javax.swing.*;   
import java.awt.event.*;  
public class log4 extends JFrame implements ActionListener
{  
    JFrame f = new JFrame();
    JLabel l;  
    JCheckBox c1,c2,c3,c4,c5,c6;  
    JButton b1,b2,b3;

     log4()
     {  
      l = new JLabel("Please Choose From Given Lab Courses");
      l.setBounds(50,50,300,20);  


     
        c1 = new JCheckBox("INTRODUCTION TO DATABASE-Lab");  
        c1.setBounds(100,100,250,50);  
        c2 = new JCheckBox("Data Structure and Algorithm-Lab");  
        c2.setBounds(100,150, 250,50);  
        c3 = new JCheckBox("CHEMISTRY-Lab");  
        c3.setBounds(100,200,250,50);  
        c4= new JCheckBox("INTRODUCTION TO ELECTRICAL CIRCUITS-Lab");  
        c4.setBounds(100,250,400,50);  
        c5= new JCheckBox("ELECTRONIC DEVICES-Lab");  
        c5.setBounds(100,300,250,50); 
        c6= new JCheckBox("Physics 2-Lab");  
        c6.setBounds(100,350,250,50); 


        b1=new JButton("Pevious");  
        b1.setBounds(600,700,100,30);  
        b1.addActionListener(this); 

        b2=new JButton("Next");  
        b2.setBounds(705,700,100,30);  
        b2.addActionListener(this); 

        b3=new JButton("Logout");  
        b3.setBounds(660,730,100,30);  
        b3.addActionListener(this); 

        add(l);
        add(b1);
        add(b2);
        add(b3);
        add(c1);  
        add(c2); 
        add(c3);
        add(c4);
        add(c5);  
        add(c6); 
      
        
        setSize(1400,800);  
        setLayout(null);  
        setVisible(true); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
     }  
     

     public void actionPerformed(ActionEvent e)
     {

       if(e.getSource()==b1)
         {
             f.dispose();
             log3 l = new log3();
         }



       int credit=0;  
       String course=""; 

        if(c1.isSelected())
        {  
           credit+=1;  
           course+="INTRODUCTION TO DATABASE-Lab\n";  
        } 
        if(c2.isSelected())
        {  
           credit+=1;  
           course+="Data Structure and Algorithm-Lab\n";  
        } 
        if(c3.isSelected())
        {  
           credit+=1;  
           course+="CHEMISTRY-Lab\n";  
        } 
          if(c4.isSelected())
        {  
           credit+=1;  
           course+="INTRODUCTION TO ELECTRICAL CIRCUITS-Lab\n";  
        } 
         if(c5.isSelected())
        {  
           credit+=1;  
           course+="ELECTRONIC DEVICES-Lab\n";  
        } 
         if(c6.isSelected())
        {  
           credit+=1;
           course+="Physics 2-Lab\n";  
        } 

     
         
          if(e.getSource()==b2)
        {
           course+="-----------------\n";  
           JOptionPane.showMessageDialog(this,"You have taken these courses: \n\n"+course+"Total Credit: "+credit);  
           

        }

        
          

          if(e.getSource()==b3)
         {
             f.dispose();
            Log l = new Log();
         }
        



     }
    

}