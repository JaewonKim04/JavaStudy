package abstractTest2;

public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println();
		
		//변수의 자동 타입 변환
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		
		animal = new Cat();
		animal.sound();
		System.out.println();
		
		animalSound(dog);
		animalSound(new Cat());
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}