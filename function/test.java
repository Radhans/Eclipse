package function;


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodexample obj=new methodexample();
		obj.x=10;
		obj.y=20;
		
	    obj.sum();
		System.out.println(obj.sum(10,20));
		System.out.println(obj.sum(10.5f,20));
		System.out.println(obj.sum(10,20,30));
		System.out.println(obj.sum(10,6.5f));
		System.out.println(obj.sum("uppu","dew"));
		
		int result=obj.sum(10,20,30,40,50);
		System.out.println(result);
		
		String allnames=obj.sum("radha","ranjitha","uppu");
		System.out.println(allnames);

	}

}
