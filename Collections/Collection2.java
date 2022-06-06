package Collections;

import java.util.HashSet;

public class Collection2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Product[] p=new Product[10];
			HashSet<Object> hs=new HashSet<Object>();
			p[0]=new Product(1);
			p[1]=new Product(1);
			p[2]=new Product(2);
			p[3]=new Product(2);
			p[4]=new Product(3);
			p[5]=new Product(3);
			p[6]=new Product(3);
			p[7]=new Product(3);
			p[8]=new Product(3);
			p[9]=new Product(3);
			hs.add(p[0]);
			hs.add(p[5]);
			hs.add(p[1]);
			hs.add(p[2]);
			hs.add(p[3]);
			hs.add(p[6]);
			hs.add(p[7]);
			hs.add(p[8]);
			hs.add(p[9]);
			hs.add(p[2]);
			hs.add(p[3]);
			hs.add(p[4]);
			System.out.println(hs.toString());
		}
}
