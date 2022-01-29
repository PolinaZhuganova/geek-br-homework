package model;

import lombok.Getter;
import service.Functions;


/**
 * Класс Human
 */
@Getter
public class Human implements Functions {

	private int maxDistance = 2000;
	private int maxClimbingHeight = 5;


	@Override
	public boolean run(int distance) {
		if (distance > maxDistance) {
			System.out.println("Человек не справился, соревнование окончено");
			return false;
		} else {
			System.out.println("Человек пробежал " + distance);
			return true;
		}
	}

	@Override
	public boolean jump(int hieght) {
		if (hieght > maxClimbingHeight) {
			System.out.println("Человек не справился, соревнование окончено");
			return false;
		} else {
			System.out.println("Человек перелез высоту " + hieght);
			return true;
		}
	}
}