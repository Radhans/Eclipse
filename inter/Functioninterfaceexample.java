package inter;
import java.util.function.*;

public class Functioninterfaceexample {
	static String show(String message) {
		return "Hello "+message;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Function interface refering a method
		Function<String,String> fun = Functioninterfaceexample::show;
		//calling function interface method
		System.out.println(fun.apply("peter"));

	}

}
