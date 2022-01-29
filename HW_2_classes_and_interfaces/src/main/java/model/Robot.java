package model;

import lombok.Getter;
import service.Functions;

/**
 * Класс Robot
 */
@Getter
public class Robot implements Functions {

	private int maxDistance = 1000;
	private int maxClimbingHeight = 1;

	@Override
	public boolean run(int distance) {
		if(distance>maxDistance){
			System.out.println("Робот не справился, соревнование окончено");
			return false;
		}
		else {
			System.out.println("Робот пробежал "+distance);
			return true;
		}
	}

	@Override
	public boolean jump(int height) {
		if (height > maxClimbingHeight) {
			System.out.println("Робот не справился, соревнование окончено");
			return false;
		} else {
			System.out.println("Робот перелез высоту " +height);
			return true;
		}
}}