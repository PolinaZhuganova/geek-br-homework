package model;
import service.Trial;

/**
 * Класс Racetrack
 */

public class Racetrack implements Trial {

	private final int trackLength = 500;

	/**
	 * Возвращает
	 *
	 * @return
	 */
	public int getTrackLength() {
		return trackLength;
	}
}