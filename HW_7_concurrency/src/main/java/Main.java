import java.util.concurrent.*;

/**
 * Класс Main
 */

public class Main {
	public static final int CARS_COUNT = 4;

	public static void main(String[] args) {
		System.out.println("ATTENTION >>> Подготовка!!!");
		Race race = new Race(new Road(60), new Tunnel(), new Road(40));
		Car[] cars = new Car[CARS_COUNT];
		for (int i = 0; i < cars.length; i++) {
			cars[i] = new Car(race, 20 + (int) (Math.random() * 10));
		}


		for (int i = 0; i < cars.length; i++) {
			new Thread(cars[i]).start();

		}

		System.out.println("ATTENTION >>> Гонка началась!!!");

	}
}

//	Все участники должны стартовать одновременно, несмотря на разное время подготовки  +
//	В тоннель не может одновременно заехать больше половины участников (условность) +
//	Когда все завершат гонку, нужно выдать объявление об окончании.
//	Можно корректировать классы (в том числе конструктор машин) и добавлять объекты классов из
//	пакета util.concurrent.
//	Обязательно необходимо объявить победителя гонки, он должен быть только один, и это участник
//	первым закончивший последний этап.