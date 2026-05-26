import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Log implements ActionListener
{
  
   JFrame f=new JFrame();
   JPanel p= new JPanel();
   JLabel l= new JLabel("Student ID");
   JLabel l1= new JLabel("Password");
   JLabel l2= new JLabel();
   JButton b = new JButton("Login");
   Log()
   {   
        
         ImageIcon i = new  ImageIcon("aiub.jpg");//adding photos with jlabel
         l2.setBounds(0,0,1400,800);
         l2.setIcon(i);
         l2.setText("American International University - Bangladesh");
         l2.setHorizontalTextPosition(JLabel.CENTER);//you can move text right and left
         l2.setVerticalTextPosition(JLabel.TOP);//you can move text center  and bottom
         l2.setForeground(new Color(0xFFFFFF));
         l.setFont(new Font("Anik ",Font.PLAIN,15));
         l1.setFont(new Font("Anik ",Font.PLAIN,15));
         l2.setFont(new Font("Anik ",Font.PLAIN,30));//
         l2.setIconTextGap(-50);
         l2.setBackground(new Color(0x0033FF));//set  background color
         l2.setOpaque(true);//diplay background color
         l2.setVerticalAlignment(JLabel.CENTER);//set vertical position of text+icon
         l2.setHorizontalAlignment(JLabel.CENTER);


         
       b.setBounds(240,200,100,50);
       b.addActionListener(this);
       p.add(b);

        
        JTextField fi = new JTextField();
        fi.setBounds(181,100,150,30);
        p.add(fi);
       
        JPasswordField pi = new JPasswordField();
        pi.setBounds(181,150,150,30);
        p.add(pi);
        l.setBounds(100,100,80,30);
        l1.setBounds(100,150,80,30);
        p.add(l);
        p.add(l1);
        p.add(l2);
		  p.setLayout(null);


       

		  f.setSize(1400,800);
		  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  f.add(p);
        f.setVisible(true);
   }

	public void actionPerformed(ActionEvent e)
	{

      if(e.getSource()==b)
      {
        
         
         f.dispose();
         log3 l= new log3();
         
         
      }
	}

   
}