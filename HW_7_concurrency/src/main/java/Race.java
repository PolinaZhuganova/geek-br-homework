import java.util.*;

/**
 * Класс Race
 */
public class Race {
	private ArrayList<Stage> stages;

	public ArrayList<Stage> getStages() {
		return stages;
	}

	public Race(Stage... stages) {
		this.stages = new ArrayList<>(Arrays.asList(stages));
	}
}