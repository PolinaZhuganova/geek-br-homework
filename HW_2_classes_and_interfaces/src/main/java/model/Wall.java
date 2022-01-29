package model;
import service.Trial;

/**
 * Класс Wall
 */

public class Wall implements Trial {

	private final int wallHeight = 2;

	/**
	 * Возвращает
	 *
	 * @return
	 */
	public int getWallHeight() {
		return wallHeight;
	}
}