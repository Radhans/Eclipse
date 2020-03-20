package exception1;

public class Myclass {
	//two way to deal with exception
	//handle it
	
	public void  method1() {
		try {
			int z = 10/0;
			int[] x= new int[5];
			x[6] = 20;
		}catch(ArithmeticException e) {
			System.out.println(" a number divided by zero leads to infinity");
			
		}catch(IndexOutOfBoundsException e) {
			System.out.println(" reffering array element out of boundary");
			
		}finally
		{
			System.out.println(" this block has to be executed irrespective of an exception");
		}
	}
	
	//declare it
	public void method2() throws Exception {
		int x=10;
		int y=0;
		int z= 10/0;
		
	}

}
