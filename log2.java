import javax.swing.*;   
import java.awt.event.*;  
public class log2 extends JFrame implements ActionListener
{  
    JFrame f = new JFrame();
    JLabel l;  
    JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9;  
    JButton b1,b2,b3;

     log2()
     {  
      l = new JLabel("Please Choose From Given Theory Courses");
      l.setBounds(50,50,300,20);  


       // JFrame f= new JFrame("Theory Course");  
        c1 = new JCheckBox("INTRODUCTION TO DATABASE");  
        c1.setBounds(100,100,250,50);  
        c2 = new JCheckBox("Data Structure and Algorithm");  
        c2.setBounds(100,150, 250,50);  
        c3 = new JCheckBox("COMPLEX VARIABLE,LAPLACE & Z-TRANSFORMATION");  
        c3.setBounds(100,200,400,50);
        c4 = new JCheckBox("CHEMISTRY");  
        c4.setBounds(100,250,250,50);  
        c5= new JCheckBox("COMPUTER AIDED DESIGN & DRAFTING");  
        c5.setBounds(100,300,400,50);  
        c6= new JCheckBox("INTRODUCTION TO ELECTRICAL CIRCUITS");  
        c6.setBounds(100,350,400,50);  
        c7= new JCheckBox("PRINCIPLES OF ACCOUNTING");  
        c7.setBounds(100,400,250,50); 
        c8= new JCheckBox("ELECTRONIC DEVICES");  
        c8.setBounds(100,450,250,50); 
        c9= new JCheckBox("Physics 2");  
        c9.setBounds(100,500,250,50); 


        b1=new JButton("Previous");  
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
        add(c7);
        add(c8);
        
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
           credit+=3;  
           course+="INTRODUCTION TO DATABASE\n";  
        } 
        if(c2.isSelected())
        {  
           credit+=3;  
           course+="Data Structure and Algorithm\n";  
        } 

        if(c3.isSelected())
        {  
           credit+=3;  
           course+="COMPLEX VARIABLE,LAPLACE & Z-TRANSFORMATION\n";  
        } 
        if(c4.isSelected())
        {  
           credit+=3;  
           course+="CHEMISTRY\n";  
        } 
         if(c5.isSelected())
        {  
           credit+=3;  
           course+="COMPUTER AIDED DESIGN & DRAFTING\n";  
        } 
          if(c6.isSelected())
        {  
           credit+=3;  
           course+="INTRODUCTION TO ELECTRICAL CIRCUITS\n";  
        } 
         if(c7.isSelected())
        {  
           credit+=3;  
           course+="PRINCIPLES OF ACCOUNTING\n";  
        } 
         if(c8.isSelected())
        {  
           credit+=3;  
           course+="ELECTRONIC DEVICES\n";  
        } 
         if(c9.isSelected())
        {  
           credit+=3;  
           course+="INTRODUCTION TO ELECTRICAL CIRCUITS\n";  
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