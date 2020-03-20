package constructor;

public class person {
	public String name;
	public int age;
	public String address;
	
	public person()
	{
		name="upasana";
		age=32;
		address="bangalore";
	
	}
	
	public person(String name,int age,String address)
	
	{
		this.name=name;
		this.age=age;
		this.address=address;
		
	}
	
	public person(String n,int a)
	{
		name=n;
		age=a;
	}

}
