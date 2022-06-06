package Lambda;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Removewords {
	public static void main(String args[]) {
		ArrayList<String> arrayList = new ArrayList<String>(
			Arrays.asList("ads","dggh","adsfd","adssf"));
			Predicate<String> filter = str -> (str.length() == 3);
			
			System.out.println("Original ArrayList :" +arrayList);
			boolean value = arrayList.removeIf(filter);
			System.out.println("Returned value: " +value);
			System.out.println("ArrayList after removeIF(): "+arrayList);
		}
	}


