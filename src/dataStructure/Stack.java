package dataStructure;

import java.util.Objects;

public class Stack {
    private String [] element = new String[5];

    boolean stackIsEmpty = true;
    private int count;



    public void push(String items) {
        stackIsEmpty = false;
        element[count] = items;
        count++;

    }

    public int size() {
        return count++;
    }

    public void pop(int id) {
        element[count] = null;
        count--;
    }

    public int peek(int id) {
        for (int itemNumber = 0; itemNumber < element.length; itemNumber++){
            if (Objects.equals(element[itemNumber],element)){
                return element.length - itemNumber;
            }
        }

        return -1;
    }
}
