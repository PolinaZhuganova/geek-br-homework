package model;

/**
 * Класс src.model.Unicorn
 */
public class Unicorn extends Animal {

	private static int uniCount = 0;

	public Unicorn(String uniName) {
		super(uniName);
		animalCount++;
		uniCount++;
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

		public static void printUniCount(){
			System.out.println(uniCount);
		}
}