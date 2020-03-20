package inheritance;

public class student extends person {
	
	public String school;
	public student(String name,int age,String school)
	{
		super(name,age);
		this.school=school;
		
	}
	public student()
	{
		System.out.println("default");
		
	}
	public void dosomething()
	{
		System.out.println("students study to learn or to get job");
	}

	

}
