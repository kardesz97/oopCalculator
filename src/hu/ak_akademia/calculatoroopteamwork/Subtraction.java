package hu.ak_akademia.calculatoroopteamwork;

public class Subtraction extends AbstractOperation {

    public Subtraction(UserInputManager userInputManager) {
        super(userInputManager);
    }

    @Override
    public double execute() {
        double a = userInputManager.getDouble(getFirstOperandName());
        double b = userInputManager.getDouble(getSecondOperandName());
        double difference = a - b;
        return difference;
    }

    @Override
    public String getFirstOperandName() {
        return "Kisebbítendő: ";
    }

    @Override
    public String getSecondOperandName() {
        return "Kivonandó: ";
    }

    @Override
    public String getResultName() {
        return "Különbség: ";
    }

}