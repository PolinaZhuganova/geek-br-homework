package model;

/**
 * Класс src.model.DomesticCat
 */
public class DomesticCat extends Animal{

	private static int catCount = 0;

	public DomesticCat(String catName){
		super(catName);
		animalCount++;
		catCount++;
	}


	@Override
	public void run(int distance) {
		if (distance > 200) {
			System.out.println(super.getName() + " столько не пробежит");
		} else {
			System.out.println(super.getName() + " пробежал" + distance + "м");
		}
	}

	@Override
	public void swim(int distance1) {
		System.out.println(super.getName()+" не проплывет даже "+distance1);
	}

	public static void printCatCount(){
		System.out.println(catCount);
	}
}