package model;

/**
 * Класс src.model.Animal
 */
public abstract class Animal {


	protected static int animalCount = 0;
	private String name;

	public Animal(String name) {
		this.name = name;
		animalCount++;
	}

	/**
	 * Возвращает
	 *
	 * @return
	 */
	public String getName() {
		return name;
	}


	public abstract void run(int distance);

	public abstract void swim(int distance1);

	public static void printAnimalCount(){
		System.out.println(animalCount);
	}

	@Override
	public String toString() {
		return "src.model.Animal{" +
			"name='" + name + '\'' +
			'}';
	}
}