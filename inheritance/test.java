package inheritance;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee e=new employee();
		e.dosomething();
		
		student s=new student();
		s.dosomething();
		manager m=new manager("uppu",32,101,"marketing");
		
		System.out.println(m.name+" "+m.age+" "+m.empid+" "+m.dept);



	}

}
