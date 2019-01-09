package com.example.mvvm_basic;

import java.util.Observable;

public class CalculatorViewModel extends Observable {

    private int result = 0;
    private int numberOne = 0;
    private int numberTwo = 0;

    public void add(String a, String b) {
        getNumbersFromInput(a, b);

        result = numberOne + numberTwo;
        setChanged();
        notifyObservers(result);
    }

    public void subtract(String a, String b) {
        getNumbersFromInput(a, b);

        result = numberOne - numberTwo;
        setChanged();
        notifyObservers(result);
    }

    public void multiply(String a, String b) {
        getNumbersFromInput(a, b);

        result = numberOne * numberTwo;
        setChanged();
        notifyObservers(result);
    }

    private void getNumbersFromInput(String a, String b) {
        try {
            numberOne = Integer.valueOf(a);
            numberTwo = Integer.valueOf(b);
        } catch (NumberFormatException e) {
            e.printStackTrace();

        }
    }


}
