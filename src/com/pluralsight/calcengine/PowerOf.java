package com.pluralsight.calcengine;

public class PowerOf implements MathProcessing {
    @Override
    public String getKeyword() {
        return "power";
    }

    @Override
    public char getSymbol() {
        return '0';
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        return Math.pow(leftVal,rightVal);
    }
}
