package inheritance;

public class manager extends employee{
	public String dept;
	
	public manager(String name,int age,int empid,String dept)
	{
		//super()
		super(name,age,empid);
		this.dept=dept;
		
	}

}
