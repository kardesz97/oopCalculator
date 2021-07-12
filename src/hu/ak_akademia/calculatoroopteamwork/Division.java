package hu.ak_akademia.calculatoroopteamwork;

public class Division extends AbstractOperation {

	public Division(UserInputManager userInputManager) {
		super(userInputManager);
	}

	@Override
	public double execute() {
		double a = userInputManager.getDouble(getFirstOperandName());
		double b;
		do {
			b = userInputManager.getDouble(getSecondOperandName());
			if (b == 0.0) {
				System.out.println(Messages.divisionWithZeroError());
			}
		} while (b == 0.0);
		double quotient = a / b;
		return quotient;
	}

	@Override
	public String getFirstOperandName() {
		return "Osztandó: ";
	}

	@Override
	public String getSecondOperandName() {
		return "Osztó: ";
	}

	@Override
	public String getResultName() {
		return "Hányados: ";
	}

}