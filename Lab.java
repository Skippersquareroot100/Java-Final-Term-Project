package classes;

public class Lab extends Course
{
    private int LabCredit;
    public Lab()
	{

	}
    public Lab(String courseName, int courseCode, int LabCredit)
	{
		super(courseName, courseCode);
		this.LabCredit = LabCredit;
	}

    public void setTLabCredit(int LabCredit)
	{
		this.LabCredit = LabCredit;
	}
	public int getLabCredit()
	{
		return LabCredit;
	}

    	public void showDetails()
	{
		System.out.println("----- Lab Course Information -----");
		System.out.println("Course Name: " + getCourseName());
		System.out.println("Course Code: " + getCourseCode());
		System.out.println("LabCourse Credit: " + LabCredit);
		System.out.println();
	}
}