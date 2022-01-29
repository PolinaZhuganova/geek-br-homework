import model.*;
import service.*;

/**
 * Класс Main
 */
public class Main {
	public static void main(String[] args) {

		Functions[] competitors = {new Human(), new Cat(), new Robot()};
		Trial[] trials = {new Racetrack(), new Wall()};

		for (var competitor : competitors) {
			for (var trial : trials) {


				if (trial instanceof Racetrack) {
					Racetrack racetrack = (Racetrack)trial;
					competitor.run(racetrack.getTrackLength());
				} else if (trial instanceof Wall) {
					Wall wall = (Wall) trial;
					competitor.jump(wall.getWallHeight());
				}

			}
		}
	}
}