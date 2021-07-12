package hu.ak_akademia.calculatoroopteamwork;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			UserInputManager userInputManager = new UserInputManager(scanner);
			Menu menu = new Menu(userInputManager);
			int choice;
			do {
				menu.print();
				choice = menu.choose();
				Operation operation = null;
				switch (choice) {
				case 1:
					operation = new Addition(userInputManager);
					// Addition addition = new Addition();
					// double sum = addition.execute();
					// System.out.println("Az összeg: " + sum);
					break;
				case 2:
					operation = new Subtraction(userInputManager);
					// Subtraction subtraction = new Subtraction(userInputManager);
					// double difference = subtraction.execute();
					// System.out.println("A különbség: " + difference);
					break;
				case 3:
					operation = new Multiplication(userInputManager);
					// Multiplication multiplication = new Multiplication(userInputManager);
					// double product = multiplication.execute();
					// System.out.println("A szorzat: " + product);
					break;
				case 4:
					operation = new Division(userInputManager);
					// Division division = new Division(userInputManager);
					// double quotient = division.execute();
					// System.out.println("Hányados, vagy valami: " + quotient);
					break;
				case 5:
					operation = new Exponentiation(userInputManager);
					break;
				case 6:
					break;
				}
//				double result = operation.execute();
//				operation.printResult(result);
			} while (choice != 6);
			System.out.println(Messages.getGoodByeMessage());
		}
	}

}