package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

 class StringTest {

	public static void main(String[] args) {
		
		String s1 = "abc";
		System.out.println(s1.hashCode());

		s1 += " def";
		System.out.println(s1.hashCode());

		String s2 = new String("xyz");
		System.out.println(s2.hashCode());
		s2 += " 123";
		System.out.println(s2.hashCode());

		System.out.println(s1 + " " + s2 );
		
		System.out.println("----------------- ");
		
		String s3 = "abc";
		System.out.println(s3.hashCode());

		s3 += " def";
		System.out.println(s3.hashCode());

		String s4 = new String("abc");
		System.out.println(s4.hashCode());
		s4 += " def";
		System.out.println(s4.hashCode());

		System.out.println(s3 + " " + s4 );
	
		System.out.println("= = = = =  = = = = = = = =");
		
		String name = "Tamim";
		String name1 = "Tamim";
		name1 = name1.toUpperCase();
		
		
		System.out.println(name1);
		System.out.println(name1);
		System.out.println(name);
		
		List<Integer> al = new ArrayList<Integer>();
		al.add(57);
		al.add(57);al.add(57);
		al.add(57);al.add(57);
		al.add(57);
		al.add(58);
		al.add(58);	al.add(58);	al.add(58);
		System.out.println(al);
		while(al.contains(58) == true){
		if (al.contains(58) == true){
			al.remove(al.indexOf(58));

			System.out.println("In al  Exists");
						
		}
	}
		
		System.out.println("In al Does not Exist");
		
		System.out.println(al);
		System.out.println("In HashSet... ");
	
		Set<Integer> set = new HashSet<Integer>();
		set.add(57);
		set.add(57);
		set.add(57);
		set.add(57);
		set.add(57);
		set.add(57);
		
		System.out.println(set);
		
		if (set.contains(57) == true){
			set.remove(set.remove(57));

			System.out.println("In set Exists");
			
		}
		
		System.out.println("In set  Does not Exist");
		
		System.out.println(set);

		List<Integer> list = new LinkedList<Integer>();
		list.add(57);
		list.add(57);
		list.add(58);
		list.add(56);
		list.add(57);
		list.add(57);
		
		System.out.println(list);
		
		if (list.contains(567) == true){
			list.remove(list.indexOf(567));

			System.out.println(" In linkedlist  Exists");
			
		}
		
		System.out.println("Does not Exist");
		
		System.out.println(list);
		
		
	}
	
}

