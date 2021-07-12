package hu.ak_akademia.calculatoroopteamwork;

public class Menu {

	private UserInputManager userInputManager;

	public Menu(UserInputManager userInputManager) {
		this.userInputManager = userInputManager;
	}

	public void print() {
		System.out.println("SZÁMOLÓGÉP");
		System.out.println("----------");
		System.out.println("1 - ÖSSZEADÁS");
		System.out.println("2 - KIVONÁS");
		System.out.println("3 - SZORZÁS");
		System.out.println("4 - OSZTÁS");
		System.out.println("5 - HATVÁNYOZÁS");
		System.out.println("6 - KILÉPÉS");
	}

	public int choose() {
		do {
			int choice = userInputManager.getNumber(Messages.getUserInputMessage());
			if (choice >= 1 && choice <= 6) {
				return choice;
			} else {
				System.out.println(Messages.getErrorMenuMessage());
			}
		} while (true);
	}

}
