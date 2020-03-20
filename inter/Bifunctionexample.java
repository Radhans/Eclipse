package inter;
import java.util.function.*;

public class Bifunctionexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<String,String,String> bi = (x,y)-> {
			return x+y;
		};
		System.out.println(bi.apply("Hello","java"));
		}
	}


