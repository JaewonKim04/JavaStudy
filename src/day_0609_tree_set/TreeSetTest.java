package day_0609_tree_set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	public static TreeSet<Integer> set = new TreeSet<Integer>();
	public static void main(String[] args) {
		set.add(7);
		set.add(4);
		set.add(5);
		set.add(12);
		set.add(22);
		
		System.out.println("크기:" + set.size());
		
		System.out.println("전체:"+set);
		System.out.println("최솟값:"+set.first());
		System.out.println("최댓값:"+set.last());
		System.out.println("6보다 큰값중 최솟값:"+ set.higher(6));
		System.out.println("20보다 작은값중 최댓값:"+set.lower(20));
		
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}
}
