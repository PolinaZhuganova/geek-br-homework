package model;

/**
 * Класс src.model.Tiger
 */
public class Tiger extends Animal {

	private static int tigerCount = 0;

	public Tiger(String tigerName) {
		super(tigerName);
		animalCount++;
		tigerCount++;
	}

	@Override
	public void run(int distance) {
		if (distance > 1000) {
			System.out.println(super.getName() + " столько не пробежит");
		} else {
			System.out.println(super.getName() + " пробежал" + distance + "м");
		}
	}

	@Override
	public void swim(int distance1) {
		if (distance1 > 20) {
			System.out.println(super.getName() + " столько не проплывет");
		} else {
			System.out.println(super.getName() + " проплыл" + distance1 + "м");
		}
	}


	public static void printTigerCount() {
		System.out.println(tigerCount);
	}

}