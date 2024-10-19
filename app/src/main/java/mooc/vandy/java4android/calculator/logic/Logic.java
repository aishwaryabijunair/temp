package mooc.vandy.java4android.calculator.logic;

import java.util.HashMap;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out) {
        mOut = out;
    }


    /**
     * Perform the operation on argumentOne and argumentTwo.
     */
    public int process(int argumentOne, int argumentTwo, int operation) {
        int result;
        if (operation == 1) {
            result = Add.add(argumentOne, argumentTwo);
        } else if (operation == 2) {
            result = (int) Divide.divide(argumentOne, argumentTwo);
        } else if (operation == 3) {
            result = Subtract.subtract(argumentOne, argumentTwo);
        } else {
            result = Multiply.multiply(argumentOne, argumentTwo);
        }
        return result;
    }
}
