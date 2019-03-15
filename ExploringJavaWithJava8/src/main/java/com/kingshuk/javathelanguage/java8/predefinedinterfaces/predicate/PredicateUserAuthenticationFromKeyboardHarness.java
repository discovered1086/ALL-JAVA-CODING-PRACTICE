package com.kingshuk.javathelanguage.java8.predefinedinterfaces.predicate;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Predicate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


public class PredicateUserAuthenticationFromKeyboardHarness {
	static Map<String, User> userMap = new HashMap<>();

	static {
		userMap.put("kingshuk", new User("kingshuk", "rishi2616"));
		userMap.put("deeksha", new User("deeksha", "deekshab"));
	}

	public static void main(String[] args) {
		Predicate<User> userPredicate = user -> userMap.containsKey(user.getUserName())
				&& user.getPassword().equals(userMap.get(user.getUserName()).getPassword());

		//Getting the credentials for keyboard
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter user name: ");
		
		User user = new User();
		
		user.setUserName(scanner.next());
		
		System.out.println("Enter password: ");
		
		user.setPassword(scanner.next());
		
		scanner.close();
		
		checkCredentials(userPredicate, user);

	}

	private static void checkCredentials(Predicate<User> userPredicate, User user) {
		if (userPredicate.test(user)) {
			System.out.println("Credentials matches for user: " + user.getUserName());
		}else {
			System.out.println("Credentials DID NOT match for user: " + user.getUserName());
		}
	}

}
