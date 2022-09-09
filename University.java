

package classes;
import interfaces.*;

public class University implements CourseOperations,SectionOperation,UniversityOperation
{
    public String name;
    public String address;
	public Course co [] = new Course [100];
    public Section sc[] = new Section [100];

    
    public University()
    {
        
    }

    public University(String name, String address)
	{
		this.name = name;
		this.address = address;
	}
    public void setName(String name)
    {
        this.name = name;
    }
	public void setaddress(String address)
    {
        this.address = address;
    }
	public String getName()
    {
        return name;
    }
	public String getaddress()
    {
        return address;
    }
     

     public  boolean addcourse(Course c)
     {
        for(int i=0;i<co.length;i++)
        {
         if(co[i]==null)
         {
            co[i]=c;
            return true;
         }
         
        }
        return false;
     }


     public boolean addSection(Section s)
     {
         for(int i=0;i<sc.length;i++)
        {
         if(sc[i]==null)
         {
            sc[i]=s;
            return true;
         }
         
        }
        return false;
     }

     
     
      public boolean remomovecourse(Course c)
      {
        for(int i=0;i<co.length;i++)
        {
            if(co[i]==c)
            {
                co[i]=null;
                return true;
            }
        }
        return false;
      }

      public void nullcourse()
      {
          for(int i=0;i<co.length;i++)
          {
             co[i]=null;
          }
      }

      public boolean removeSection(Section s)
      {
        for(int i=0;i<sc.length;i++)
        {
            if(sc[i]==s)
            {
                sc[i]=null;
                return true;
            }
        }
        return false;
      }





      public void nullsection()
      {
        for(int i=0;i<sc.length;i++)
        {
            sc[i]=null;
        }
      }



      public Course searchCourse(int courseCode)
	{
      for(int i=0;i<co.length;i++)
      {
        if(co[i]!=null)
        {
            if(co[i].getCourseCode()==courseCode)
            {
                return co[i];
            }
        }
      }
      return null;
    }

    public Section  searchSection(String Sname)
    {
          for(int i=0;i<sc.length;i++)
          {

            if(sc[i]!=null)
            {
                if(sc[i].getSecName().equals(Sname))
                {
                    return sc[i];
                }

            }
          }

          return null;
    }



    public void shwoAllcourses()
    {
        for(int i=0;i<co.length;i++)
        {
            if(co[i]!=null)
            {
                co[i].showDetails();
            }
        }
    }

    
   public  void showAllsections()
   {
      for(int i=0;i<sc.length;i++)
      {
        if(sc[i]!=null)
        {
            sc[i].showDetails();
        }
      }

   }



  


    public void showDetails()
	{   
        System.out.println("---------------------------");
		System.out.println("  ---University Info---");
		System.out.println("University Name: " + name);
        System.out.println("University Address: " + address);
		System.out.println();
		System.out.println("-----------------------------");
		System.out.println("   --- List of Courses --- ");
		shwoAllcourses();
		System.out.println("-------------X------------");
		
	}	



      public void ScshowDetails()
	{   
        System.out.println("---------------------------");
		System.out.println("  ---University Info---");
		System.out.println("University Name: " + name);
        System.out.println("University Address: " + address);
		System.out.println();
		System.out.println("-----------------------------");
		System.out.println("   --- List of Sections --- ");
		showAllsections();
		System.out.println("-------------X------------");
		
	}	








} 