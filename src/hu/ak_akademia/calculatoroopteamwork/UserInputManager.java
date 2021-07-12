package hu.ak_akademia.calculatoroopteamwork;

import java.util.Scanner;

public class UserInputManager {

    private Scanner scanner;

    public UserInputManager(Scanner scanner) {
        this.scanner = scanner;
    }

    public int getNumber(String message) {
        System.out.print(message);
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }

    public double getDouble(String message) {
        System.out.print(message);
        double numberAsDouble = scanner.nextDouble();
        scanner.nextLine();
        return numberAsDouble;
    }

}