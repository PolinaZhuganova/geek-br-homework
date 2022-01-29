import model.*;

/**
 * Класс src.Main
 */
public class Main {
	public static void main(String[] args) {

		Animal[] animals = {new DomesticCat("Barsik"), new Dog("Bobik"), new Tiger("Sherhan"),
			new Unicorn("Uliy"), new DomesticCat("Musya")};

		for (var animal:animals) {
			animal.run(150);
			animal.swim(15);
		}
		Animal.printAnimalCount();
		DomesticCat.printCatCount();
		Dog.printDogCount();
		Tiger.printTigerCount();
		Unicorn.printUniCount();

	}
}