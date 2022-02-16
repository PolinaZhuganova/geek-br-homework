package repository;

import model.Question;
import org.springframework.beans.factory.annotation.Value;

import java.io.*;
import java.util.*;

/**
 * Класс FileQuestionRepository
 */

public class FileQuestionRepository implements QuestionsRepository {
	// открыть путь к файлу
	// считать вопросы
	// реализовать гет квесченс
@Value("${file.path}")
	private String path;

	@Override
	public List<Question> getQuestions() throws IOException {
		try (FileReader fr = new FileReader(path)) {
			List<Question> questions = new ArrayList<>();

			Scanner scan = new Scanner(fr);
			while (scan.hasNextLine()) {
				String[] words = scan.nextLine().split(";");
				String q = words[0];
				List<String> answers = Arrays.asList(words[1], words[2], words[3]);
				String corrAnswer = words[4];
				questions.add(new Question(q, answers, corrAnswer));
			}


			return questions;
		}

	}


}