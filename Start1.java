import classes.*;
import java.util.regex.*;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.*;
class Start1
{


      University u =new University("American International University-Bangladesh","408/1, Kuratoli, 1229"); 

      String login()
       { 

         Scanner input= new Scanner(System.in);
         try
         {
             System.out.println("\n\n>> For visit "+'"'+"portal.aiub.edu"+'"'+"   [PRESS 1]") ;
             System.out.println(">> Otherwise                     [Press 2]\n") ; 
             System.out.println("------------------------------------------");
             System.out.print(" Insert here >> ");
             int b=input.nextInt();
             System.out.println("------------------------------------------\n\n\n");
             if(b==1)
             {
                login1();
             } 
             else
             {
                 System.out.println("Have a good day!!!");
                 return login();
             }
         }
         catch (InputMismatchException e) 
         {  

            System.out.println("Wrong Input.\nPlease!! Insert input in integer number"); 
             login();
         } 
        

         return null;
        } 


          String login1()
          {
            Scanner input= new Scanner(System.in);
            System.out.println("Please choose your option");
            System.out.println("1.Faculty");
            System.out.println("2.Student");
            System.out.println("---------------------------");
            System.out.print("Enter here>> "); 
            int a = input.nextInt();
            System.out.println("---------------------------\n\n\n");
            switch(a)
            {
              case 1:Flogin2();
              break;
              case 2:login2();
              break;
              default:login1();

            }
             
            return null;
          }



          String login2()
         {      
                File f= new File("History");
                f.mkdir();
                String path= f.getAbsolutePath();

                try
                {
                         FileWriter fw= new FileWriter(path+"/history",true);
                           Scanner input= new Scanner(System.in);
                      System.out.println("|---------------------------------------------|");
                      System.out.println("| American International Unversity-Bangladesh |");
                      System.out.println("|---------------------------------------------|");
                      System.out.println("      -where leaders are created.\n\n");
                      System.out.println("------------------------------------------");
                            System.out.print("Please enter your Id :");

                      String id=input.next();
                      Pattern p = Pattern.compile("((?=.*[0-9])(?=.*[-]).{10})");
                      Matcher m = p.matcher(id);

                      System.out.println("------------------------------------------");
                      System.out.println("------------------------------------------");
                      System.out.print("Please enter your password :");
                      String c=input.next();
                      System.out.println("------------------------------------------\n");    
                       fw.write(id+"\n"+c);
                       fw.close();
                       if(m.matches()==true)
                       {  
                        Login3();  
                  
                       } 
                       else
                       {
                        System.out.println("\n!!!!!!Invalid Username or Password!!!!!!\n");
                        System.out.println("It usually looks like XX-XXXXX-X or XXXX-XXX-X");
                        System.out.println("Please re-type your password and try again\n\n");

                         login2();
                   
                       } 
      
                }
                  catch(Exception e)
                  {
                        System.out.println(e);
                        login2();

                  }                
                  return null;
        }  

             




         String Flogin2()
         {      
                File f= new File("Faculty History");
                f.mkdir();
                String path= f.getAbsolutePath();

                try
                {
                         FileWriter fw= new FileWriter(path+"/history",true);
                           Scanner input= new Scanner(System.in);
                      System.out.println("|---------------------------------------------|");
                      System.out.println("| American International Unversity-Bangladesh |");
                      System.out.println("|---------------------------------------------|");
                      System.out.println("      -where leaders are created.\n\n");
                      System.out.println("------------------------------------------");
                            System.out.print("Please enter your Id :");

                      String id=input.next();
                      Pattern p = Pattern.compile("((?=.*[0-9])(?=.*[-]).{10})");
                      Matcher m = p.matcher(id);

                      System.out.println("------------------------------------------");
                      System.out.println("------------------------------------------");
                      System.out.print("Please enter your password :");
                      String c=input.next();
                      System.out.println("------------------------------------------\n");    
                       fw.write(id+"\n"+c);
                       fw.close();
                       if(m.matches()==true)
                       {  
                             
                          FLogin3();
                       } 
      
                       else
                       {
                        System.out.println("\n!!!!!!Invalid Username or Password!!!!!!\n");
                        System.out.println("It usually looks like XX-XXXXX-X or XXXX-XXX-X");
                        System.out.println("Please re-type your password and try again\n\n");

                         Flogin2();
                   
                       } 
      
                }

                  catch(Exception e)
                  {
                        System.out.println(e);
                        Flogin2();
                  }                
            return null;
        }  
        






        String Login3()
         {  
             Scanner input= new Scanner(System.in);
             System.out.println("|-------------------------------------------|");
                  System.out.println("|-------------- |AIUB PORTAL| --------------|");
                  System.out.println("|-------------------------------------------|");
                  System.out.println("   ______________________________________");
                  System.out.println("               --- WELCOME ---");
                  System.out.println("\n          >>Registration Going On");
                  System.out.println("\nSelect Your Depertment\n");
                  System.out.println("1.CSE");
                  System.out.println("2.IPE");
                  System.out.println("3.EEE");
                  System.out.println("4.BBA");
                  System.out.println("5.ENGLISH");
                  System.out.println("6.LAW");
                  System.out.println("7.LogOut");
                  System.out.print("\nEnter your Choosed Sequential Number :");
                  int b = input.nextInt();                 
                    switch(b)
                    {
                      case 1:System.out.println("What type of Course you want to take?");
                             System.out.println("1.Theory");
                             System.out.println("2.Lab");
                             System.out.println("------------------------------------------");
                             System.out.print("Enter Here>>");
                             int k=input.nextInt();
                             System.out.println("------------------------------------------");
                             switch(k)
                             {
                              case 1:CscTC();
                              break;

                              case 2:CscLC();
                              break;

                              default:Login3();
                             }
                      break;
                      case 2:System.out.println("What type of Course you want to take?");
                             System.out.println("1.Theory");
                             System.out.println("2.Lab");
                             System.out.println("------------------------------------------");
                             System.out.print("Enter Here>>");
                             int w=input.nextInt();
                             System.out.println("------------------------------------------");
                            
                             switch(w)
                             {
                              case 1:IPETC();
                              break;

                              case 2:IPELC();
                              break;

                              default:Login3();
                             }
                      break;
                      case 3:System.out.println("What type of Course you want to take?");
                             System.out.println("1.Theory");
                             System.out.println("2.Lab");
                             System.out.println("------------------------------------------");
                             System.out.print("Enter Here>>");
                             int q=input.nextInt();
                             System.out.println("------------------------------------------");
                             switch(q)
                             {
                              case 1:EEETC();
                              break;

                              case 2:EEELC();
                              break;

                              default:Login3();
                             }
                      break;
                      case 4:BBATC();
                      break;
                      case 5:ENGTC();
                      break;
                      case 6:LAWTC();
                      break;
                      case 7: u.nullcourse();
                               login1();
                    
                      default : return Login3();
                    }
                 return null;
            }
             





                 
        String FLogin3()
         {  
             Scanner input= new Scanner(System.in);
             System.out.println("|-------------------------------------------|");
                  System.out.println("|-------------- |AIUB PORTAL| --------------|");
                  System.out.println("|-------------------------------------------|");
                  System.out.println("   ______________________________________");
                  System.out.println("               --- WELCOME ---");
                  System.out.println("\n          >>Registration Going On");
                  System.out.println("\nSelect Your Depertment\n");
                  System.out.println("1.Faculty of Science And Technology (FST)");
                  System.out.println("2.Faculty of Engineering (FE)");
                  System.out.println("3.Faculty of Business Administration (FBA))");
                  System.out.println("4.Faculty of Arts and Social Sciences (FASS)");
                  System.out.println("5.LogOut");
                  System.out.print("\nEnter your Choosed Sequential Number :");
                  int b = input.nextInt();     

                   switch(b)
                   {
                       case 1: System.out.println("Which type of section you want to add?");
                               System.out.println("1.Theory");
                               System.out.println("2.Lab");

                             System.out.println("------------------------------------------");
                             System.out.print("Enter Here>>");
                             int a=input.nextInt();
                             System.out.println("------------------------------------------");
                            switch(a)
                            {
                              case 1:TFST();

                              break;
                              case 2:LFST();
                              break;
                              default: FLogin3();
                            }
                       break;

                       case 2:System.out.println("You should choose no.1 option");
                       break;

                       case 3:System.out.println("You should choose no.1 option");
                       break;

                       case 4: System.out.println("You should choose no.1 option");
                       break;

                       case 5: u.nullsection();
                             login1();
                       break;

                       
                       default:  FLogin3();


                   }         
                   
                   
                 return null;
            }
              


              String TFST()
              {

                  TSection s1 = new TSection("Java(A)","DS0509",2);
                  TSection s2 = new TSection("Java(B)","DS0609",2);
                  TSection s3 = new TSection("Java(C)","DS0509",2);

                  TSection s4 = new TSection("CPP(A)","DN0501",1.5);
                  TSection s5 = new TSection("CPP(B)","DN0502",1.5);
                  TSection s6 = new TSection("CPP(C)","DN0503",1.5);

                  TSection s7 = new TSection("Database(A)","DN0401",2);
                  TSection s8 = new TSection("Database(B)","DN0402",2);
                  TSection s9 = new TSection("Database(C)","DN0403",2);


               Scanner input= new Scanner(System.in);
               System.out.println("\n\nWhich Theory Section you want to add?\n\n\n");
               System.out.println("1.Java(A)");
               System.out.println("2.Java(B)");
               System.out.println("3.Java(C)");
               System.out.println("4.CPP(A)");
               System.out.println("5.CPP(B)");
               System.out.println("6.CPP(C)");              
               System.out.println("7.Database(A)");
               System.out.println("8.Database(B)");
               System.out.println("9.Database(C)");
               System.out.println("10.Pevious Page");
               System.out.println("11.Next Page");
               System.out.println("12.LogOut\n\n");
               System.out.println("------------------------------------------");
               System.out.print("Please Enter Your Choosed Number Here>>");
               int a= input.nextInt();
               System.out.println("------------------------------------------");
                  
                  if(a==1)
                  {
                         u.addSection(s1);
                         System.out.println("\n\n        ----Section Added----");
                         TFST();

                  }
                  else if(a==2)
                  {
                         u.addSection(s2);
                         System.out.println("\n\n        ----Section Added----");
                         TFST();
                  }
                    else if(a==3)
                  {
                          u.addSection(s3);
                         System.out.println("\n\n        ----Section Added----");
                         TFST();
                  }
                    else if(a==4)
                  {
                         u.addSection(s4);
                         System.out.println("\n\n        ----Section Added----");
                         TFST();
                  }
                    else if(a==5)
                  {
                          u.addSection(s5);
                         System.out.println("\n\n        ----Section Added----");
                         TFST();
                  }
                    else if(a==6)
                  {
                           u.addSection(s6);
                         System.out.println("\n\n        ----Section Added----");
                         TFST();
                  }
                    else if(a==7)
                  {
                          u.addSection(s7);
                         System.out.println("\n\n        ----Section Added----");
                         TFST(); 
                  }  
                  else if(a==8)
                  {
                           u.addSection(s8);
                         System.out.println("\n\n        ----Section Added----");
                         TFST();
                  }
                    else if(a==9)
                  {
                           u.addSection(s9);
                         System.out.println("\n\n        ----Section Added----");
                         TFST();
                  }
                    else if(a==10)
                  {
                         FLogin3();
                  }
                    else if(a==11)
                  {
                    FLogin4();
                  }
                    else if(a==12)
                  {
                    u.nullsection();
                    login1();
                  }
                  else
                  {
                      TFST();
                  }

              return null;

              }






              String LFST()
              {

                  LSection s1 = new LSection("Java(A)-Lab","DS0109",3);
                  LSection s2 = new LSection("Java(B)-Lab","DS0109",3);
                  LSection s3 = new LSection("Java(C)-Lab","DS0109",3);

                  LSection s4 = new LSection("CPP(A)-Lab","DN0201",3);
                  LSection s5 = new LSection("CPP(B)-Lab","DN0202",3);
                  LSection s6 = new LSection("CPP(C)-Lab","DN0203",3);

                  LSection s7 = new LSection("Database(A)-Lab","DN0301",3);
                  LSection s8 = new LSection("Database(B)-Lab","DN0302",3);
                  LSection s9 = new LSection("Database(C)-Lab","DN0303",3);


               Scanner input= new Scanner(System.in);
               System.out.println("\n\nWhich Lab Section you want to add?\n\n\n");
               System.out.println("1.Java(A)-Lab");
               System.out.println("2.Java(B)-Lab");
               System.out.println("3.Java(C)-Lab");
               System.out.println("4.CPP(A)-Lab");
               System.out.println("5.CPP(B)-Lab");
               System.out.println("6.CPP(C)-Lab");              
               System.out.println("7.Database(A)-Lab");
               System.out.println("8.Database(B)-Lab");
               System.out.println("9.Database(C)-Lab");
               System.out.println("10.Pevious Page");
               System.out.println("11.Next Page");
               System.out.println("12.LogOut\n\n");
               System.out.println("------------------------------------------");
               System.out.print("Please Enter Your Choosed Number Here>>");
               int a= input.nextInt();
               System.out.println("------------------------------------------");
                  
                  if(a==1)
                  {
                         u.addSection(s1);
                         System.out.println("\n\n        ----Section Added----");
                         LFST();

                  }
                  else if(a==2)
                  {
                         u.addSection(s2);
                         System.out.println("\n\n        ----Section Added----");
                         LFST();
                  }
                    else if(a==3)
                  {
                          u.addSection(s3);
                         System.out.println("\n\n        ----Section Added----");
                         LFST();
                  }
                    else if(a==4)
                  {
                         u.addSection(s4);
                         System.out.println("\n\n        ----Section Added----");
                         LFST();
                  }
                    else if(a==5)
                  {
                          u.addSection(s5);
                         System.out.println("\n\n        ----Section Added----");
                         LFST();
                  }
                    else if(a==6)
                  {
                           u.addSection(s6);
                         System.out.println("\n\n        ----Section Added----");
                         LFST();
                  }
                    else if(a==7)
                  {
                          u.addSection(s7);
                         System.out.println("\n\n        ----Section Added----");
                         LFST(); 
                  }  
                  else if(a==8)
                  {
                           u.addSection(s8);
                         System.out.println("\n\n        ----Section Added----");
                         LFST();
                  }
                    else if(a==9)
                  {
                           u.addSection(s9);
                         System.out.println("\n\n        ----Section Added----");
                         LFST();
                  }
                    else if(a==10)
                  {
                         FLogin3();
                  }
                    else if(a==11)
                  {
                    FLogin4();
                  }
                    else if(a==12)
                  {
                    u.nullsection();
                    login1();
                  }
                  else
                  {
                      LFST();
                  }

              return null;

              }







 
             
        String CscTC()
          {     
               
               Theory t1 = new Theory("Complex Variable,Laplase & Z_TRANSFORMATION",02101,3);
               Theory t2 = new Theory("Introduction To Electric Circuit",1850,3);
               Theory t3 = new Theory("Introduction To Database",143,3);
               Theory t4 = new Theory("Data Structure & Algorithm",1782,3);
               Theory t5 = new Theory("Principle Of Accounting",6783,3);

               Scanner input= new Scanner(System.in);
               System.out.println("\n\nWhich Theory course you want to add?\n\n\n");
               System.out.println("1.Complex Variable,Laplase & Z_TRANSFORMATION");
               System.out.println("2.Introduction To Electric Circuit");
               System.out.println("3.Introduction To Database");
               System.out.println("4.Data Structure & Algorithm");
               System.out.println("5.Principle Of Accounting");
               System.out.println("6.Pevious Page");
               System.out.println("7.Next Page");
               System.out.println("8.LogOut\n\n");
               System.out.println("------------------------------------------");
               System.out.print("Please Enter Your Choosed Number Here>>");
               int a= input.nextInt();
               System.out.println("------------------------------------------");
               
                                 if(a==1)
                                 {
                                  u.addcourse(t1);
                                  System.out.println("\n\n        ----Course Added----");
                                  CscTC();
                                 }
                                 else if(a==2)
                                 {
                                  u.addcourse(t2);
                                  System.out.println("\n\n        ----Course Added----");
                                  CscTC();
                                 }
                                 else if(a==3)
                                 {
                                  u.addcourse(t3);
                                  System.out.println("\n\n        ----Course Added----");
                                  CscTC();
                                 }
                                 else if(a==4)
                                 {
                                  u.addcourse(t4);
                                  System.out.println("\n\n        ----Course Added----");
                                   CscTC();
                                 }
                                  else if(a==5)
                                 {
                                  u.addcourse(t5);
                                  System.out.println("\n\n        ----Course Added----");
                                  CscTC();        
                                 }
                                 else if(a==6)
                                 {
                                   Login3();
                                 }
                                  else if(a==7)
                                 {
                                  Login4();
                                 }
                                 else if(a==8)
                                 {
                                  u.nullcourse();
                                  login1();
                                 }
                                
                                 else
                                 {
                                   CscTC();
                                 }
                                 
                
               return null;
               
            }

          String CscLC()
          {     
              
               
              Lab t1 = new Lab("Introduction To Electric Circuit Lab",1851,1);
              Lab t2 = new Lab("Data Structure & Algorithm Lab",1783,1);
              Lab t3 = new Lab("Computer Aided Design",2101,1);
              Lab t4 = new Lab("PHYSICS 2 LAB",1204,1);
              
               Scanner input= new Scanner(System.in);
               System.out.println("\n\nWhich Lab course you want to add?\n\n\n");
               System.out.println("1.Introduction To Electric Circuit Lab");
               System.out.println("2.Data Structure & Algorithm Lab");
               System.out.println("3.Computer Aided Design");
               System.out.println("4.PHYSICS 2 LAB");
               System.out.println("5.Pevious Page");
               System.out.println("6.Next Page");
               System.out.println("7.LogOut\n\n");
               System.out.println("------------------------------------------");
               System.out.print("Please Enter Your Choosed Number Here>>");
               int a= input.nextInt();
               System.out.println("------------------------------------------");
               
                                 if(a==1)
                                 {
                                  u.addcourse(t1);
                                  System.out.println("\n\n        \n\n        ----Course Added----");
                                  CscLC();
                                 }
                                 else if(a==2)
                                 {
                                  u.addcourse(t2);
                                  System.out.println("\n\n        \n\n        ----Course Added----");
                                  CscLC();
                                 }
                                 else if(a==3)
                                 {
                                     u.addcourse(t3);
                                     System.out.println("\n\n        \n\n        ----Course Added----");
                                     CscLC();
                                 }
                                 else if(a==4)
                                 {
                                   u.addcourse(t4);
                                   System.out.println("\n\n        \n\n        ----Course Added----");
                                     CscLC();
                                 }
                                 else if(a==5)
                                 {
                                    Login3();
                                 }
                                  else if(a==6)
                                 {
                                  Login4();
                                 }
                                 else if(a==7)
                                 {
                                   u.nullcourse();
                                    login1();
                                 }
                                 
                                 else
                                 {
                                      CscLC();
                                 }
               return null;
               
            }






           String BBATC()
          {     
               
               Theory t1 = new Theory("Organizational Behavior",2111,3);
               Theory t2 = new Theory("Managerial Accounting", 2112,3);
               Theory t3 = new Theory("Business Statistics",2113,3);
               Theory t4 = new Theory("DComputing and Business Applications",2114,3);
               Theory t5 = new Theory("Macro Economics",2115,3);

               Scanner input= new Scanner(System.in);
               System.out.println("\n\nWhich Theory course you want to add?\n\n\n");
               System.out.println("1.Organizational Behavior");
               System.out.println("2.Managerial Accounting");
               System.out.println("3.Business Statistics");
               System.out.println("4.Computing and Business Applications");
               System.out.println("5.Macro Economics");
               System.out.println("6.Pevious Page");
               System.out.println("7.Next Page");
               System.out.println("8.LogOut\n\n");
               System.out.println("------------------------------------------");
               System.out.print("Please Enter Your Choosed Number Here>>");
               int a= input.nextInt();
               System.out.println("------------------------------------------");
                                 if(a==1)
                                 {
                                  u.addcourse(t1);
                                  System.out.println("\n\n        ----Course Added----");
                                 BBATC();
                                 }
                                 else if(a==2)
                                 {
                                  u.addcourse(t2);
                                  System.out.println("\n\n        ----Course Added----");
                                  BBATC();
                                 }
                                 else if(a==3)
                                 {
                                  u.addcourse(t3);
                                  System.out.println("\n\n        ----Course Added----");
                                 BBATC();
                                 }
                                 else if(a==4)
                                 {
                                  u.addcourse(t4);
                                  System.out.println("\n\n        ----Course Added----");
                                   BBATC();
                                 }
                                  else if(a==5)
                                 {
                                  u.addcourse(t5);
                                  System.out.println("\n\n        ----Course Added----");
                                 BBATC();
                                 }
                                 else if(a==6)
                                 {
                                   Login3();
                                 }
                                  else if(a==7)
                                 {
                                  Login4();
                                 }
                                 else if(a==8)
                                 {
                                  u.nullcourse();
                                  login1();
                                 }
                                
                                 else
                                 {
                                   BBATC();
                                 }
                 
                                 
                
               return null;
               
            }


           
    







          String EEETC()
          {     
               
               Theory t1 = new Theory("Math 3 (Complex Variable, Laplace & Z-Transforms)",2101,3);
               Theory t2 = new Theory("Modern Physics", 2103,3);
               Theory t3 = new Theory("Electrical Circuits 2 (AC)",2101,3);
               Theory t4 = new Theory("Electronic Devices",2103,3);
               Theory t5 = new Theory("Programming Language 2",2207,3);

               Scanner input= new Scanner(System.in);
               System.out.println("\n\nWhich Theory course you want to add?\n\n\n");
               System.out.println("1.Math 3 (Complex Variable, Laplace & Z-Transforms");
               System.out.println("2.Modern Physics");
               System.out.println("3.Electrical Circuits 2 (AC)");
               System.out.println("4.Electronic Devices");
               System.out.println("5.Programming Language 2");
               System.out.println("6.Pevious Page");
               System.out.println("7.Next Page");
               System.out.println("8.LogOut\n\n");
               System.out.println("------------------------------------------");
               System.out.print("Please Enter Your Choosed Number Here>>");
               int a= input.nextInt();
               System.out.println("------------------------------------------");
               
                                 if(a==1)
                                 {
                                  u.addcourse(t1);
                                  System.out.println("\n\n        ----Course Added----");
                                 EEETC();
                                 }
                                 else if(a==2)
                                 {
                                  u.addcourse(t2);
                                  System.out.println("\n\n        ----Course Added----");
                                  EEETC();
                                 }
                                 else if(a==3)
                                 {
                                  u.addcourse(t3);
                                  System.out.println("\n\n        ----Course Added----");
                                 EEETC();
                                 }
                                 else if(a==4)
                                 {
                                  u.addcourse(t4);
                                  System.out.println("\n\n        ----Course Added----");
                                  EEETC();
                                 }
                                  else if(a==5)
                                 {
                                  u.addcourse(t5);
                                  System.out.println("\n\n        ----Course Added----");
                                 EEETC();
                                 }
                                 else if(a==6)
                                 {
                                   Login3();
                                 }
                                  else if(a==7)
                                 {
                                  Login4();
                                 }
                                 else if(a==8)
                                 {
                                  u.nullcourse();
                                  login1();
                                 }
                                
                                 else
                                 {
                                   EEETC();
                                 }
                 
                                 
                
               return null;
               
            }



             



           String EEELC()
          {     
              
               
              Lab t1 = new Lab("Electrical Circuits 2 Lab", 2102,1);
              Lab t2 = new Lab("Electronic Devices Lab",2104,1);
              Lab t3 = new Lab("CComputer Aided Design & Electrical Drafting",2101,1);
              

               Scanner input= new Scanner(System.in);
               System.out.println("\n\nWhich Lab course you want to add?\n\n\n");
               System.out.println("1.Electrical Circuits 2 Lab");
               System.out.println("2.Electronic Devices Lab");
               System.out.println("3.Computer Aided Design & Electrical Drafting");
               System.out.println("4.Pevious Page");
               System.out.println("5.Next Page");
               System.out.println("6.LogOut\n\n");
               System.out.println("------------------------------------------");
               System.out.print("Please Enter Your Choosed Number Here>>");
               int a= input.nextInt();
               System.out.println("------------------------------------------");
               
                                 if(a==1)
                                 {
                                  u.addcourse(t1);
                                  System.out.println("\n\n        ----Course Added----");
                                  EEELC();
                                 }
                                 else if(a==2)
                                 {
                                  u.addcourse(t2);
                                  System.out.println("\n\n        ----Course Added----");
                                 EEELC();
                                 }
                                 else if(a==3)
                                 {
                                   u.addcourse(t3);
                                   System.out.println("\n\n        ----Course Added----");
                                    EEELC();
                                 }
                                 else if(a==4)
                                 {
                                    Login3();
                                 }
                                  else if(a==5)
                                 {
                                  Login4();
                                 }
                                 else if(a==6)
                                 {   
                                     u.nullcourse();
                                     login1();
                                 }
                                
                                 else
                                 {
                                     EEELC();
                                 }
               return null;
               
            }








            String IPETC()
          {     
               
               Theory t1 = new Theory("Math 3 (Complex Variable, Laplace & Z-Transforms)",2101,3);
               Theory t2 = new Theory("PHYSICS 2", 2103,3);
               Theory t3 = new Theory("PROGRAMMING LANGUAGE 1 (STRUCTURED PROGRAMMING LANGUAGE)",2113,3);
               Theory t4 = new Theory("ENGINEERING MECHANICS II",2101,3);
               Theory t5 = new Theory("PRINCIPLES OF ACCOUNTING [IPE]",1102,2);
               Theory t6 = new Theory("MANUFACTURING AND PRODUCTION PROCESS I",2101,3);
               

               Scanner input= new Scanner(System.in);
               System.out.println("\n\nWhich Theory course you want to add?\n\n\n");
               System.out.println("1.Math 3 (Complex Variable, Laplace & Z-Transforms");
               System.out.println("2.PHYSICS 2");
               System.out.println("3.PROGRAMMING LANGUAGE 1 (STRUCTURED PROGRAMMING LANGUAGE)");
               System.out.println("4.ENGINEERING MECHANICS II");
               System.out.println("5.PRINCIPLES OF ACCOUNTING [IPE]");
               System.out.println("6.MANUFACTURING AND PRODUCTION PROCESS I");
               System.out.println("7.Pevious Page");
               System.out.println("8.Next Page");
               System.out.println("9.LogOut\n\n");
               System.out.println("------------------------------------------");
               System.out.print("Please Enter Your Choosed Number Here>>");
               int a= input.nextInt();
               System.out.println("------------------------------------------");
               
                                 if(a==1)
                                 {
                                  u.addcourse(t1);
                                  System.out.println("\n\n        ----Course Added----");
                                 IPETC();
                                 }
                                 else if(a==2)
                                 {
                                  u.addcourse(t2);
                                  System.out.println("\n\n        ----Course Added----");
                                  IPETC();
                                 }
                                 else if(a==3)
                                 {
                                  u.addcourse(t3);
                                  System.out.println("\n\n        ----Course Added----");
                                 IPETC();
                                 }
                                 else if(a==4)
                                 {
                                  u.addcourse(t4);
                                  System.out.println("\n\n        ----Course Added----");
                                  IPETC();
                                 }
                                  else if(a==5)
                                 {
                                  u.addcourse(t5);
                                  System.out.println("\n\n        ----Course Added----");
                                 IPETC();
                                 }
                                 else if(a==6)
                                 {
                                   u.addcourse(t6);
                                   System.out.println("\n\n        ----Course Added----");
                                 IPETC();
                                 }
                                 else if(a==7)
                                 {
                                   Login3();
                                 }
                                  else if(a==8)
                                 {
                                  Login4();
                                 }
                                 else if(a==9)
                                 {
                                    u.nullcourse();
                                  login1();
                                 }
                               
                                 else
                                 {
                                   IPETC();
                                 }
                 
                                 
                
               return null;
               
            }


             



          String IPELC()
          {     
              
               
              Lab t1 = new Lab("PHYSICS 2 LAB",1204,1);
              Lab t2 = new Lab("ENGINEERING MECHANICS II LAB",2102,1);
              Lab t3 = new Lab("MANUFACTURING AND PRODUCTION PROCESS I LAB",2102,1);
              

               Scanner input= new Scanner(System.in);
               System.out.println("\n\nWhich Lab course you want to add?\n\n\n");
               System.out.println("1.PHYSICS 2 LAB");
               System.out.println("2.ENGINEERING MECHANICS II LAB");
               System.out.println("3.MANUFACTURING AND PRODUCTION PROCESS I LAB");
               System.out.println("4.Pevious Page");
               System.out.println("5.Next Page");
               System.out.println("6.LogOut\n\n");
               System.out.println("------------------------------------------");
               System.out.print("Please Enter Your Choosed Number Here>>");
               int a= input.nextInt();
               System.out.println("------------------------------------------");
               
                                 if(a==1)
                                 {
                                  u.addcourse(t1);
                                  System.out.println("\n\n        ----Course Added----");
                                  IPELC();
                                 }
                                 else if(a==2)
                                 {
                                  u.addcourse(t2);
                                  System.out.println("\n\n        ----Course Added----");
                                IPELC();
                                 }
                                 else if(a==3)
                                 {
                                   u.addcourse(t3);
                                   System.out.println("\n\n        ----Course Added----");
                                   IPELC();
                                 }
                                 else if(a==4)
                                 {
                                    Login3();
                                 }
                                 else if(a==5)
                                 {
                                  Login4();
                                 }
                                 else if(a==6)
                                 {
                                     u.nullcourse();
                                    login1();
                                 }
                                 else
                                 {
                                   IPELC();
                                 }
               return null;
               
            }

            



               

          String LAWTC()
          {     
              
               
              Theory t1 = new Theory("Muslim Law",1307,3);
              Theory t2 = new Theory("Introduction To Computer",1301,3);
              Theory t3 = new Theory("Constitutional Law Of Bangladesh",1309,3);
              Theory t4 = new Theory("Government And Politics",1310,3);

               Scanner input= new Scanner(System.in);
               System.out.println("\n\nWhich Theory course you want to add?\n\n\n");
               System.out.println("1.Muslim Law");
               System.out.println("2.Introduction To Computer");
               System.out.println("3.Constitutional Law Of Bangladesh");
               System.out.println("4.Government And Politics");
               System.out.println("5.Pevious Page");
               System.out.println("6.Next Page");
               System.out.println("7.LogOut\n\n");
               System.out.println("------------------------------------------");
               System.out.print("Please Enter Your Choosed Number Here>>");
               int a= input.nextInt();
               System.out.println("------------------------------------------");
               
                                 if(a==1)
                                 {
                                  u.addcourse(t1);
                                  System.out.println("\n\n        ----Course Added----");
                                  LAWTC();
                                 }
                                 else if(a==2)
                                 {
                                  u.addcourse(t2);
                                  System.out.println("\n\n        ----Course Added----");
                                  LAWTC();
                                 }
                                 else if(a==3)
                                 {
                                     u.addcourse(t3);
                                     System.out.println("\n\n        ----Course Added----");
                                     LAWTC();
                                 }
                                 else if(a==4)
                                 {
                                   u.addcourse(t4);
                                   System.out.println("\n\n        ----Course Added----");
                                    LAWTC();
                                 }
                                 else if(a==5)
                                 {
                                    Login3();
                                 }
                                  else if(a==6)
                                 {
                                  Login4();
                                 }
                                 else if(a==7)
                                 {
                                    u.nullcourse();
                                    login1();
                                 }
                               
                                 else
                                 {
                                     LAWTC();
                                 }
               return null;
               
            }

            




              String ENGTC()
          {     
               
               Theory t1 = new Theory("Writing For Arts And Social Science",2105,3);
               Theory t2 = new Theory("Phonetics And Phonology",2106,3);
               Theory t3 = new Theory("Introduction To English Poetry",2107,3);
               Theory t4 = new Theory("Statistic For Social Science",2102,3);
               Theory t5 = new Theory("Fundamental Of Econmoics",52105,3);

               Scanner input= new Scanner(System.in);
               System.out.println("\n\nWhich Theory course you want to add?\n\n\n");
               System.out.println("1.Writing For Arts And Social Science");
               System.out.println("2.Phonetics And Phonology");
               System.out.println("3.Introduction To English Poetry");
               System.out.println("4.Statistic For Social Science");
               System.out.println("5.Fundamental Of Econmoics"); 
               System.out.println("6.Pevious Page");
               System.out.println("7.Next Page");
               System.out.println("8.LogOut\n\n");

               System.out.println("------------------------------------------");
               System.out.print("Please Enter Your Choosed Number Here>>");
               int a= input.nextInt();
               System.out.println("------------------------------------------");
              
               
                                 if(a==1)
                                 {
                                  u.addcourse(t1);
                                  System.out.println("\n\n        ----Course Added----");
                                 ENGTC();
                                 }
                                 else if(a==2)
                                 {
                                  u.addcourse(t2);
                                  System.out.println("\n\n        ----Course Added----");
                                  ENGTC();
                                 }
                                 else if(a==3)
                                 {
                                  u.addcourse(t3);
                                  System.out.println("\n\n        ----Course Added----");
                                 ENGTC();
                                 }
                                 else if(a==4)
                                 {
                                  u.addcourse(t4);
                                  System.out.println("\n\n        ----Course Added----");
                                  ENGTC();
                                 }
                                  else if(a==5)
                                 {
                                  u.addcourse(t5);
                                  System.out.println("\n\n        ----Course Added----");
                                  ENGTC();
                                 }
                                 else if(a==6)
                                 {
                                   Login3();
                                 }
                                 else if(a==7)
                                 {
                                  Login4();
                                 }
                                 else if(a==8)
                                 {
                                  u.nullcourse();
                                  login1();
                                 }
                                 else
                                 {
                                  ENGTC();
                                 }
                                 
                
               return null;
               
            }


           
              String Login4()
              {
               
                Scanner input= new Scanner(System.in);
                System.out.println("\n\nChoose Your Option From Below-\n\n");
                System.out.println("1.Show Taken Courses");
                System.out.println("2.Remove Course");
                System.out.println("3.Search Course");
                System.out.println("4.Previous Page");
                System.out.println("5.Log Out");

                System.out.print("Enter Here >>");
                 int a=input.nextInt();
                 if(a==1)
                 {
                    u.showDetails();
                    Login4();
                 }
                 else if(a==2)
                 {
                     System.out.println("You Have Taken These Courses >> ");   
                          u.shwoAllcourses();
                          System.out.print("\n\nPlease Enter The Course Code Which You Want To Remove>> ");  
                          int b=input.nextInt();
								          Course c = u.searchCourse(b);
							          	if(c != null)
							          	{
								          	System.out.println("---Course Found---");
									           if(u.remomovecourse(c))
									           {
										           System.out.println("---Course Removed, Code : " + c.getCourseCode() + "---");
								             }
			                  	}
							         	else
								        {
								        	System.out.println("---Course NOT Found and NOT Removed---");
								        }
                        Login4();
                 }   
                 else if(a==3)
                 {
                   System.out.print("\n\nPlease Enter The Course Code Which You Want To Search>> ");  
                   int c=input.nextInt();
                   Course co = u.searchCourse(c);
                   if(co!=null)
                   {
                       System.out.println("---Course Found---");
                       co.showDetails();
                   }
                   else
                   {
                     System.out.println("---Course Not Found---");
                   }
                   Login4();
                 }

                 else if(a==4)
                 {
                   Login3();
                 }
                 else if(a==5)
                 {
                  u.nullcourse();
                  login1();
                 }  
                 else
                 {
                  Login4();
                 }
               return null;
              }









              String FLogin4()
              {
               
                Scanner input= new Scanner(System.in);
                System.out.println("\n\nChoose Your Option From Below-\n\n");
                System.out.println("1.Show Taken Sections");
                System.out.println("2.Remove Section");
                System.out.println("3.Search Section");
                System.out.println("4.Previous Page");
                System.out.println("5.Log Out");

                System.out.print("Enter Here >>");
                 int a=input.nextInt();
                 if(a==1)
                 {
                    u.ScshowDetails();
                    FLogin4();
                 }
                 else if(a==2)
                 {
                     System.out.println("You Have Taken These Sections >> ");   
                          u.showAllsections();
                          System.out.print("\n\nPlease Enter The Section Name Which You Want To Remove>> ");  
                          String b=input.next();
								          Section sc = u.searchSection(b);
							          	if(sc != null)
							          	{
								          	System.out.println("---Section Found---");
									           if(u.removeSection(sc))
									           {
										           System.out.println("--- Section Removed, Name : " + sc.getSecName() + "---");
								             }
			                  	}
							         	else
								        {
								        	System.out.println("---Section NOT Found and NOT Removed---");
								        }
                        FLogin4();
                 }   
                 else if(a==3)
                 {
                   System.out.print("\n\nPlease Enter The Setion Name Which You Want To Search>> ");  
                   String c=input.next();
                    Section sc =u.searchSection(c);
                   if(sc!=null)
                   {
                       System.out.println("---Section Found---");
                       sc.showDetails();
                   }
                   else
                   {
                     System.out.println("---Section Not Found---");
                   }
                   FLogin4();
                 }

                 else if(a==4)
                 {
                   FLogin3();
                 }
                 else if(a==5)
                 { 
                     u.nullsection();
                     login1();
                 }  
                 else
                 {
                  FLogin4();
                 }
               return null;
              }


  public static void main(String[] args)
   {
       Start1 obj=new Start1();   
       obj.login(); 
       
       obj.login1();
       
         
   }


         
}