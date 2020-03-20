package inheritance;

public class employee extends person {
	public int empid;
	
	public employee()
	{
		System.out.println("employee constructor");
	}
	
	public employee(String name,int age,int empid)
	{
		//super()
		super(name,age);
		this.empid=empid;
	}
	
	public void dosomething()
	{
		System.out.println("employee works to earn");
	}

}
