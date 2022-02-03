
import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

/**
 * Класс Staffer
 */

public class Staffer {


	private String name;
	private int age;
	private int salary;

	public Staffer(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}


	public int getSalary() {
		return salary;
	}

	/**
	 * Возвращает
	 *
	 * @return
	 */
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public static void main(String[] args) {


		List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "a", "a", "a", "a", "b", "c", "a", "a", "a"));
		String result = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
			.entrySet().stream()
			.max(Comparator.comparingLong(e -> e.getValue()))
			.get().getKey();
		System.out.println(result);


		Staffer[] array = {
			new Staffer("Al", 45, 100500),
			new Staffer("Bob", 30, 400),
			new Staffer("Jo", 23, 500),
			new Staffer("Anton", 32, 650)};


		Stream<Staffer> stafferStream = Arrays.stream(array);
		double avSalary = stafferStream.mapToInt(Staffer::getSalary).average().getAsDouble();
		System.out.println("Average salary is " + avSalary);


		final int N = 2;
		System.out.println(
			Arrays.stream(array).sorted((o1, o2) -> o2.getAge() - o1.getAge())
				.limit(N)
				.map(Staffer::getName)
				.collect(Collectors.joining(", ", N + " olderst are ", ".")));

	}

}



