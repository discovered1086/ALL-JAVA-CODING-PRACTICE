package com.kingshuk.javathelanguage.java8.predefinedinterfaces.predicate;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
class User {
	private String userName;

	private String password;

}

public class PredicateUserAuthenticationHarness {
	static Map<String, User> userMap = new HashMap<>();

	static {
		userMap.put("kingshuk", new User("kingshuk", "rishi2616"));
		userMap.put("deeksha", new User("deeksha", "deekshab"));
	}

	public static void main(String[] args) {
		Predicate<User> userPredicate = user -> userMap.containsKey(user.getUserName())
				&& user.getPassword().equals(userMap.get(user.getUserName()).getPassword());

		User user = new User("kingshuk", "rishi2616");

		User user2 = new User("deeksha", "rishi2616");
		
		checkCredentials(userPredicate, user);
		
		checkCredentials(userPredicate, user2);

	}

	private static void checkCredentials(Predicate<User> userPredicate, User user) {
		if (userPredicate.test(user)) {
			System.out.println("Credentials matches for user: " + user.getUserName());
		}else {
			System.out.println("Credentials DID NOT match for user: " + user.getUserName());
		}
	}

}
