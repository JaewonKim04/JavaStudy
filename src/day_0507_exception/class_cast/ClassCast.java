package day_0507_exception.class_cast;

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
public class ClassCast {
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	}
	public static void changeDog(Animal animal) {
		if(animal instanceof Dog) {//예외처리
			Dog dog = (Dog) animal; 
		}
		
	}
}
