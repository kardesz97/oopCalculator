package hu.ak_akademia.calculatoroopteamwork;

public class DummyOperation extends AbstractOperation {

    public DummyOperation(UserInputManager userInputManager) {
        super(userInputManager);
    }

    @Override
    public double execute() {
        return 0;
    }

    @Override
    public String getFirstOperandName() {
        return null;
    }

    @Override
    public String getSecondOperandName() {
        return null;
    }

    @Override
    public String getResultName() {
        return "";
    }

    @Override
    public void printResult(double result) {
    }

}