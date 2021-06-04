package day_0602_collection_framework.example_hashmap;

public class Student {
	Integer grade;
	String name;
	public Student(Integer grade, String name) {
		this.grade = grade;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student member = (Student) obj;
			return member.name.equals(name)&&member.grade.equals(grade);
		}else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return name.hashCode()+ grade;
	}
}
