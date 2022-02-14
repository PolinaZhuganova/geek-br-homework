package model;

import lombok.*;

import java.util.List;

/**
 * Класс Question
 */
@Data
@AllArgsConstructor

public class Question {

	private String question;
	private List<String> answers;
	private String numberCorrAnswer;


}