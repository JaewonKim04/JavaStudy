package day_0602_collection_framework.example_array_list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("java");
		list.add("Spring");
		list.add("NetWork");
		list.add(2,"Database");
		list.add("OS");
		
		int size = list.size();
		System.out.println("총 객체수: "+ size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2: "+ skill);
		System.out.println();
		
		for(String str : list) {
			System.out.println(list.indexOf(str)+" : "+str);
		}
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("Spring");
		
		for(String str : list) {
			System.out.println(list.indexOf(str)+" : "+str);
		}
	}
}
