package ch10_1_exception_class;

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		
		Dog dog=new Dog();
		changeDog(dog);
		
		Cat cat=new Cat();
		changeDog(cat);
		
	}
	//animal 
	public static void changeDog(Animal animal) {
		Dog dog=(Dog) animal;
	}

}
class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}