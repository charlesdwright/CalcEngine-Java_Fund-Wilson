package com.pluralsight.calcengine;

public class Modulo implements MathProcessing {


    @Override
    public String getKeyword() {
        return "mod";
    }

    @Override
    public char getSymbol() {
        return '%';
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        return leftVal % rightVal;
    }
}
