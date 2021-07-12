package hu.ak_akademia.calculatoroopteamwork;

public class Multiplication extends AbstractOperation {

    public Multiplication(UserInputManager userInputManager) {
        super(userInputManager);
    }

    @Override
    public double execute() {
        double a = userInputManager.getDouble(getFirstOperandName());
        double b = userInputManager.getDouble(getSecondOperandName());
        double product = a * b;
        return product;
    }

    @Override
    public String getFirstOperandName() {
        return "Első tényező: ";
    }

    @Override
    public String getSecondOperandName() {
        return "Második tényező: ";
    }

    @Override
    public String getResultName() {
        return "Szorzat: ";
    }

}