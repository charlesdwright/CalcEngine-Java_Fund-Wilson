package com.pluralsight.myapp;
import com.pluralsight.calcengine.CalculateHelper;
import com.pluralsight.calcengine.DynamicHelper;
import com.pluralsight.calcengine.InvalidStatementException;
import com.pluralsight.calcengine.MathEquation;
import com.pluralsight.calcengine.CalculateBase;
import com.pluralsight.calcengine.Adder;
import com.pluralsight.calcengine.MathProcessing;
import com.pluralsight.calcengine.Modulo;
import com.pluralsight.calcengine.PowerOf;
import com.pluralsight.calcengine.Subtracter;
import com.pluralsight.calcengine.Multiplier;
import com.pluralsight.calcengine.Divider;

public class Main {

    public static void main(String[] args) {

//        useCalculatorBase();
//        useMathEquation();
//        useCalculateHelper();

        String[] statements = {

                "add 25.0 92.0",    //25.0  + 92.0 = 117.0
                "power 5.0 2.0",     //5.0 ^ 2.0 = 25.0
                "mod 3.0 2.0"       //3.0 mod 2.0 = 1.0
        };

        DynamicHelper helper = new DynamicHelper(new MathProcessing[] {
                new Adder(),
                new PowerOf(),
                new Modulo()
        });


        for (String statement : statements) {

            String output= helper.process(statement);
            System.out.println(output);
        }

        //CalculateHelper helper = new CalculateHelper();

    }

    static void useCalculateHelper() {

        String[] statements = {

                "add 1.0",              // Error: incorrect number of values
                "add xx 25.0",          // Error: non-numeric data
                "addX 0.0 0.0",         // Error: invalid command.
                "divide 100.0 50.0",
                "add 25.0 92.0",
                "subtract 225.0 17.0",
                "multiply 11.0 3.0"

        };
    }

/*        for( String statement:statements)

    {
        try {
            helper.process(statement);
            System.out.println(helper.toString());
        } catch (InvalidStatementException e) {
            System.out.println(e.getMessage());
            if (e.getCause() != null) {
                System.out.println("   Original exception:  " + e.getCause().getMessage());
            }
        }
    }
*/

//}

    public static void useMathEquation() {


        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation('d', 100.0d, 50.0d);
        equations[1] = new MathEquation('a', 25.0d, 92.0d);
        equations[2] = new MathEquation('s', 225.0d, 17.0d);
        equations[3] = new MathEquation('m', 11.0d, 3.0d);

        for (MathEquation equation : equations) {

            equation.getResult();

            System.out.print("result = ");
            System.out.print(equation.getResult() + "\n");
        }

        System.out.println();
        System.out.print("Using Overloads");
        System.out.println();

        double leftDouble = 9.0d;
        double rightDouble = 4.0d;
        int leftInt = 9;
        int rightint = 4;

        MathEquation equationOverloaded = new MathEquation('d');

        equationOverloaded.execute(leftDouble, rightDouble);
        System.out.print("result= ");
        System.out.println(equationOverloaded.getResult());

        //force "widening" conversion on overloaded function
        equationOverloaded.execute(leftInt, rightint);
        System.out.print("result= ");
        System.out.println(equationOverloaded.getResult());

        //narrowing conversion not allowed, double overload chosen.
        equationOverloaded.execute((double) leftInt, rightint);
        System.out.print("result= ");
        System.out.println(equationOverloaded.getResult());

        //inheritance
        System.out.println();
        System.out.print("Using Inheritance");
        System.out.println();

    }


    public static void useCalculatorBase() {
        CalculateBase[] calculators = {
            new Divider(100.0d, 50.0d),
            new Adder(25.0d, 92.0d),
            new Subtracter(225.0d, 17.0d),
            new Multiplier(11.0d, 3.0d)
        };

        for (CalculateBase calculator : calculators) {
            calculator.calculate();
            System.out.print("result = ");
            System.out.print(calculator.getResult() + "\n");
        }

    }
}

