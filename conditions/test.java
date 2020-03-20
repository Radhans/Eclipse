package conditions;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=50;
		int c=20;
		if(a>b && a>c)
		{
			System.out.println("a is greater" +a);
		}
		else if(b>c && b>c)
		{
			System.out.println("b is greater" +b);
		}
		else if(c>a && c>b)
		{
			System.out.println("c is greater"+c);
		}
		else
		{
			System.out.println("a and b and c are equal");
		}


	}

}
