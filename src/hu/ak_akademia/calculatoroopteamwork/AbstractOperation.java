package hu.ak_akademia.calculatoroopteamwork;

public abstract class AbstractOperation implements Operation {

    protected UserInputManager userInputManager;

    public AbstractOperation(UserInputManager userInputManager) {
        this.userInputManager = userInputManager;
    }

    @Override
    public void printResult(double result) {
        System.out.println(getResultName() + result);
    }

}