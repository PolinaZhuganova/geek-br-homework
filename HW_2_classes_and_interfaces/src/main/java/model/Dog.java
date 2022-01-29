package model;

/**
 * Класс src.model.Dog
 */
public class Dog extends Animal {

	private static int dogCount = 0;

	public Dog(String dogName) {
		super(dogName);
		animalCount++;
		dogCount++;

	}

	@Override
	public void run(int distance) {
		if (distance > 500) {
			System.out.println(super.getName() + " столько не пробежит");
		} else {
			System.out.println(super.getName() + " пробежал" + distance + "м");
		}

	}

	@Override
	public void swim(int distance1) {
		if (distance1 > 10) {
			System.out.println(super.getName() + " столько не проплывет");
		} else {
			System.out.println(super.getName() + " проплыл" + distance1 + "м");
		}
	}
		public static void printDogCount() {
			System.out.println(dogCount);
		}

}