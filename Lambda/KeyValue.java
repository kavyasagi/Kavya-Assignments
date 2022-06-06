package Lambda;

import java.util.HashMap;

public class KeyValue {
	public static void main(String[] args) 
	{
		StringBuilder mix=new StringBuilder();
		
        HashMap<Integer,String> foo=new HashMap<>();
        
        foo.put(1," Hello ");
        foo.put(2," Hii ");
        foo.put(3," Welcome ");
        foo.put(4," Niceday ");
        
        foo.entrySet().forEach(t-> mix.append(t));
        System.out.println(mix);
    }
}
