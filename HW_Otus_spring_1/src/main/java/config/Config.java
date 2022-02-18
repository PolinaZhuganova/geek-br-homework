package config;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;
import repository.*;
import service.*;

/**
 * Класс Config
 */
@Component
@Configuration
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