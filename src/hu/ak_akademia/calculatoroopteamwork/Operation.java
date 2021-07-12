package hu.ak_akademia.calculatoroopteamwork;

public interface Operation {

    double execute();

    String getFirstOperandName();

    String getSecondOperandName();

    String getResultName();

    void printResult(double result);

}