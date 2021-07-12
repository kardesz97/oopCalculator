package hu.ak_akademia.calculatoroopteamwork;

public class Exponentiation extends AbstractOperation {

	public Exponentiation(UserInputManager userInputManager) {
		super(userInputManager);
	}

	@Override
	public double execute() {
		double a = userInputManager.getDouble(getFirstOperandName());
		double b = userInputManager.getDouble(getSecondOperandName());
		double power = Math.pow(a, b);
		return power;
	}

	@Override
	public String getFirstOperandName() {
		return "Alap: ";
	}

	@Override
	public String getSecondOperandName() {
		return "Kitevő: ";
	}

	@Override
	public String getResultName() {
		return "Hatvány: ";
	}

}
