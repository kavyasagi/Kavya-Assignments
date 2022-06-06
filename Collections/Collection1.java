package Collections;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Collection1 {
		
		public static void main(String[] args) {

			Gender M=Gender.Male;
			Gender F=Gender.Female;
			Contacts[] obj=new Contacts[5];
			obj[0]=new Contacts("Ram","ram1@gmail.com",M);
			obj[1]=new Contacts("Sita","sita2@gmail.com",M);
			obj[2]=new Contacts("Gita","gita3@gmail.com",M);
			obj[3]=new Contacts<Object>("Ravi","ravi4@gmail.com",F);
			obj[4]=new Contacts<Object>("Somu","somu5@gmail.com",F);
			TreeMap<Long,Contacts> t= new TreeMap<Long,Contacts>(Collections.reverseOrder());
			t.put((long)963767390,obj[0]);
			t.put((long)964378961,obj[1]);
			t.put((long)961768767,obj[2]);
			t.put((long)961879867,obj[3]);
			t.put((long)967987987,obj[4]);
			System.out.println("-----Keys----\n");
			for(Map.Entry m1:t.entrySet()){ 
				System.out.println(m1.getKey());
			}
			System.out.println("\n----Values----\n");
				for(Map.Entry m:t.entrySet()){ 
					System.out.println(m.getValue().toString());
				}
				System.out.println("\n-----KeyValue pairs-----\n");
			for(Map.Entry m:t.entrySet()){ 
			       System.out.println(m.getKey()+" :"+m.getValue().toString());    
			      }    
		    }
}


