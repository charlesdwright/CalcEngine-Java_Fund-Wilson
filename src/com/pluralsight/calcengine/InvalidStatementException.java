package com.pluralsight.calcengine;

public class InvalidStatementException extends Exception{

    public InvalidStatementException(String reason, String statement){
        super(reason + ":  " + statement);    //super accepts string message

    }

    public InvalidStatementException(String reason, String statement, Throwable cause){
        super(reason + ":  " + statement, cause); // super accepts Throwable

    }
}
