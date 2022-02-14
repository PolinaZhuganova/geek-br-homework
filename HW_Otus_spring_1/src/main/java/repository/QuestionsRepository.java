package repository;
import model.Question;

import java.io.IOException;
import java.util.List;

/**
 * Класс QuestionsRepository
 */
public interface QuestionsRepository {

	List<Question> getQuestions() throws IOException;

}