package Lambda;

import java.util.*;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Predicatedemo {
	
	public static void main(String args[]) {
		
		List<String> names = Arrays.asList("Raju","Rani","A1","A2","ABC");
		java.util.function.Predicate<String> p = (s) -> s.startsWith("R");
		for(String st : names) {
			if(p.test(st))
				System.out.println(st);
		}
		UnaryOperator<Integer> unary = v -> v*10;
		Function<Integer, Integer> function = v -> v*10;
		
		System.out.println(unary.apply(10));
		System.out.println(function.apply(20));
	}

}
