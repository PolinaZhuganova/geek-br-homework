package config;

import org.springframework.context.annotation.Bean;
import repository.*;
import service.*;

/**
 * Класс Config
 */
public class Config {

	@Bean
	public UserInfoService userInfoService(){
		return new ConsoleUserInfoService();
	}
	@Bean
	public QuestionsRepository questionsRepository(){
		return new FileQuestionRepository();
	}

}