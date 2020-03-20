package inter;
import java.util.function.*;

public class consumerinterfaceexample {

	
		static void printMessage(String name){
		System.out.println("Hello "+name);

	}

	static void printvalue(int val) {
		System.out.println(val);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> consumer1 = consumerinterfaceexample::printMessage;
		consumer1.accept("John");
		
		Consumer<Integer> consumer2 = consumerinterfaceexample::printvalue;
		consumer2.accept(10);
	}
		
	
}
