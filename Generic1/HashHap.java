package Generic1;
import java.util.*;

public class HashHap {
	public static void main(String args[]) {
		Random ran = new Random();
		HashSet<Number> hs = new LinkedHashSet<Number>();
		for(int i=0;i<10;i++) {
			int keys = ran.nextInt(100);
			double values = ran.nextDouble();
			hs.add(keys);
			hs.add(values);
		}
		List<Number> list = new ArrayList<Number>(hs);
		for(int j=0;j<list.size();j+=2) {
			System.out.println("Key: "+list.get(j)+ " Value : "+list.get(j+1));
		}
	}
	

}
