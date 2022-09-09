package classes;
public abstract class Section
{
    private  String SecName;
    private  String RoomNo;
   

    public Section()
    {

    }

     public Section(String SecName,String RoomNo)
    {
       this.SecName=SecName;
       this.RoomNo=RoomNo;
    }

    public void setSecName(String SecName)
    {
        this.SecName=SecName;
    }

    public String getSecName()
    {
        return SecName;
    }
    
    public void setRoomNo(String RoomNo)
    {
         this.RoomNo=RoomNo;
    }
    public String getRoomNo()
    {
        return RoomNo;
    }


    public abstract void showDetails();
 


}