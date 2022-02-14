package service;

import lombok.*;
import model.*;
import repository.*;

import java.io.IOException;
import java.util.*;

/**
 * Класс ExecuteTest
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter
public class TestExecutorService {
	private UserInfoService consoleUserInfoService;
	private QuestionsRepository repository;

	public void startTest() throws IOException {
	consoleUserInfoService.getUser();
	showTestResult(executeTest(repository.getQuestions()));
	}


	//		задать вопросы и принять ответы
	private List<Boolean> executeTest(List<Question> questionList) {

		Scanner scanner = new Scanner(System.in);
		List<Boolean> result = new ArrayList<>();
		for (var q : questionList) {
			System.out.println(q.getQuestion());
			System.out.println(q.getAnswers());
			System.out.println("Enter your answer");
			if (q.getNumberCorrAnswer().equals(scanner.nextLine())) {
				result.add(true);
			} else {
				result.add(false);
			}
		}
		return result;
	}

	private void showTestResult(List<Boolean> result) {
		System.out.println("Your test result: " + result);
	}


}