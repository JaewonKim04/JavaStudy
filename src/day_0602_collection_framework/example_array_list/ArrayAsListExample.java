package day_0602_collection_framework.example_array_list;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동","이순신","세종대왕");
		
		for(String str : list) {   //for each 문
			System.out.println(str);
		}
		System.out.println();
		
		List<Integer> list2 = Arrays.asList(1,2,3);
		for(int value : list2) {
			System.out.println(value);
		}
	}
}
