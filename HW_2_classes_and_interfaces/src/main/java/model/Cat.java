package model;

import lombok.Getter;
import service.Functions;

/**
 * Класс Cat
 */
@Getter
public class Cat implements Functions {

	private int maxDistance = 5000;
	private int maxClimbingHeight = 2;

	@Override
	public boolean run(int distance) {
		if(distance>maxDistance){
			System.out.println("Кот не справился, соревнование окончено");
			return false;
		}
		else {
			System.out.println("Кот пробежал "+distance);
			return true;
		}
	}

	@Override
	public boolean jump(int height) {
		if (height > maxClimbingHeight) {
			System.out.println("Кот не справился, соревнование окончено");
			return false;
		} else {
			System.out.println("Кот перелез высоту " +height);
			return true;
		}
	}
}