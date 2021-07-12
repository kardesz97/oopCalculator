package hu.ak_akademia.calculatoroopteamwork;

public class Addition extends AbstractOperation {

    public Addition(UserInputManager userInputManager) {
        super(userInputManager);
    }

    @Override
    public double execute() {
        double a = userInputManager.getDouble(getFirstOperandName());
        double b = userInputManager.getDouble(getSecondOperandName());
        double sum = a + b;
        return sum;
    }

    @Override
    public String getFirstOperandName() {
        return "Első tag: ";
    }

    @Override
    public String getSecondOperandName() {
        return "Második tag: ";
    }

    @Override
    public String getResultName() {
        return "Összeg: ";
    }

}