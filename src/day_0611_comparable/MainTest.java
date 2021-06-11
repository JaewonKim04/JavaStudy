package day_0611_comparable;

import java.util.Iterator;
import java.util.TreeSet;

public class MainTest {
	
	public static void main(String[] agrs) {
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		treeSet.add(new Person("홍길동",45));
		treeSet.add(new Person("김자바",31));
		treeSet.add(new Person("박지원",21));
		
		Iterator<Person> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.name + ":" + person.age);
		}
	}
}
