package classes;
public class TSection extends Section
{
    private double classDuration;

    public TSection()
    {

    }
    public TSection(String SecName,String RoomNo, double classDuration)
    {
          super(SecName,RoomNo);
          this.classDuration=classDuration;

    }

    public void setclassDuration(double classDuration)
    {
        this.classDuration=classDuration;

    }
    public double getclassDuration()
    {
        return classDuration;

    }

    public void  showDetails()
    {
        System.out.println("----- Theory Section Information -----");
        System.out.println("Section Name : "+getSecName());
        System.out.println("Room No : "+getRoomNo());
        System.out.println("Class Duration : "+classDuration);
        System.out.println();
        
    }
    
}