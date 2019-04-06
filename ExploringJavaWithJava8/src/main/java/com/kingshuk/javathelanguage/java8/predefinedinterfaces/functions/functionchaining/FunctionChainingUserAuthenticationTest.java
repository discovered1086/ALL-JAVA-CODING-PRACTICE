package com.kingshuk.javathelanguage.java8.predefinedinterfaces.functions.functionchaining;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Function;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
class Authentication {
	@NonNull
	private String userName;

	@NonNull
	private String password;

	private Set<String> messages = new HashSet<>();
}

public class FunctionChainingUserAuthenticationTest {

	private static Map<String, String> userMap = null;

	static {
		userMap = new HashMap<>();
		userMap.put("rishi2616", "password-1");
		userMap.put("deekshab", "deekshab13");
	}

	public static void main(String[] args) {

		String userName = null;

		String password = null;

		try (Scanner scanner = new Scanner(System.in);) {
			System.out.println("Please enter the username");
			userName = scanner.next();

			System.out.println("Please enter the password");
			password = scanner.next();
		}

		Authentication auth = new Authentication(userName, password);

		Function<Authentication, Authentication> checkUserName = authData -> {

			Set<String> keySet = userMap.keySet();

			if (!keySet.contains(authData.getUserName().toLowerCase())) {
				authData.getMessages().add("Username not found in our systems");
			}
			return authData;
		};

		Function<Authentication, Set<String>> checkPassword = authData -> {
			String passwordOnRecord = userMap.get(authData.getUserName().toLowerCase());
			if (passwordOnRecord != null && !passwordOnRecord.equals(authData.getPassword())) {
				authData.getMessages().add("Invalid password");
			} else if (authData.getMessages().isEmpty()) {
				authData.getMessages().add("Congratulations on a successful login...!!!");
			}

			return authData.getMessages();
		};

		checkUserName.andThen(checkPassword).apply(auth).forEach(System.out::println);
	}

}
