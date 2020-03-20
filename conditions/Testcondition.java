package conditions;

public class Testcondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String oops="/";
		int a=10,b=20;
		switch(oops)
		{
		case "+":
			System.out.println(a+b);
			break;
		case "-":
			System.out.println(a-b);
			break;
		case "*":
			System.out.println(a*b);
			break;
		case "/":
			System.out.println(a%b);
			break;
			default:
				System.out.println("This is not valid");
		}
		
	}
	
}
