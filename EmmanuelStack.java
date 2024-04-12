/*
* The EmmanuelStack Class.
*
* @author  Emmanuel Edwards
* @version 1.0
* @since   2024-03-27
*/

import java.util.ArrayList;
import java.util.List;

/**
* The EmmanuelStack() class.
*/
public class EmmanuelStack {
    /**
    * Declares a private instance variable.
    */
    private List<String> stackAsList = new ArrayList<>();

    /**
    * Checks if stack is empty.
    *
    * @return true if the stack is empty, false otherwise
    */
    public boolean isEmpty() {
        return stackAsList.isEmpty();
    }

    /**
    * Returns stack size.
    *
    * @return the size of the stack
    */
    public int size() {
        return stackAsList.size();
    }

    /**
    * The showStack() method.
    *
    * @return the values as a string
    */
    public String showStack() {
        String values = "";
        for (int counter = 0; counter < stackAsList.size(); counter++) {
            values += stackAsList.get(counter);
            if (counter < stackAsList.size() - 1) {
                values += ", ";
            }
        }
    return values;
    }

    /**
    * The push() method.
    *
    * @param input from Main.java
    */
    public void push(String input) {
        stackAsList.add(input);
    }

    /**
    * This method pops a string from the stack.
    *
    * @return the popped string
    */
    public String popItem() {
        final String poppedItem;
        if (!stackAsList.isEmpty()) {
            poppedItem = stackAsList.remove(stackAsList.size() - 1);
        } else {
            poppedItem = null;
        }
        return poppedItem;
    }
}