package inter;

import java.util.function.*;

public class predicatetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> pr = a -> (a>18);//creating predicate
		System.out.println(pr.test(10));//calling predicate method

	}

}
