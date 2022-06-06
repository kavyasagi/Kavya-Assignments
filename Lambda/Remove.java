package Lambda;

import java.util.function.UnaryOperator;

public class Remove implements UnaryOperator<String> {
	public String apply(String str) {
		return str.toUpperCase();
	}

}

