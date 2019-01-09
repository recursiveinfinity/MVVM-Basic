package com.example.mvvm_basic;

import java.util.Observable;

public class CalculatorViewModel extends Observable {

    private int result = 0;

    public void add(String a, String b) {
        int numberOne = Integer.valueOf(a);
        int numberTwo = Integer.valueOf(b);

        result = numberOne + numberTwo;
        setChanged();
        notifyObservers(result);
    }

    public void subtract(String a, String b) {
        int numberOne = Integer.valueOf(a);
        int numberTwo = Integer.valueOf(b);

        result = numberOne - numberTwo;
        setChanged();
        notifyObservers(result);
    }


}
