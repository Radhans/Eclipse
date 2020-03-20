package inheritance;

public abstract class person {//extends object
	public String name;
	public int age;
	
	public person(String name,int age)
	{
		this.name=name;
		this.age=age;
		
	}
	
	public person() {System.out.println("person constructor"); }
	
	public abstract void dosomething();
		
	}


