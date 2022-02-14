package service;

import lombok.NoArgsConstructor;
import model.User;

import java.util.Scanner;

/**
 * Класс ConsoleUserInfoService
 */
@NoArgsConstructor
public class ConsoleUserInfoService implements UserInfoService {


	@Override
	public User getUser() {

		System.out.println("Enter your name");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println("Enter your surname");
		String surname = scanner.nextLine();
		return new User(name, surname);
	}
}