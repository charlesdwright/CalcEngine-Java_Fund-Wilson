package com.pluralsight.calcengine;

public interface MathProcessing {

    String SEPARATOR=" ";
    String getKeyword();  //ie "add"
    char getSymbol();    //ie "+"
    double doCalculation(double leftVal, double rightVal);

}
