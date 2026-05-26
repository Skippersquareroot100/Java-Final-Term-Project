
import javax.swing.*;   
import java.awt.event.*;  

public class log3 extends JFrame implements ActionListener
{
    JFrame f = new JFrame();
    JLabel l;   
    JButton b1,b2;

    log3()
    {
      l = new JLabel("Please Choose What Type Of Course You Want To Select");
      l.setBounds(540,50,600,20);  
       
        b1=new JButton("Theory Course");  
        b1.setBounds(550,150,150,30);  
        b1.addActionListener(this); 

        b2=new JButton("Lab Course");  
        b2.setBounds(705,150,150,30);  
        b2.addActionListener(this); 


        add(l);
        add(b1);
        add(b2);


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
            log2 l= new  log2();
         }

         if(e.getSource()==b2)
         {
             f.dispose();
           log4 lo=new log4();
         }



     }



}