package constructor;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person p1=new person();
		
		System.out.println(p1.name +" "+p1.age+" "+p1.address);
		
		person p2=new person("radha",22,"davanagere");
		System.out.println(p2.name +" "+p2.age+" "+p2.address);
		person p3=new person("rohan",21);
		p3.address="delhi";
		System.out.println(p3.name +" " + p3.address);
		

	}

}
