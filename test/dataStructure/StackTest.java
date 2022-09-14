package dataStructure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    Stack stack;

    @BeforeEach
    public void setup(){
        stack = new Stack();
    }

    @Test
    public void checkThatStackIsEmpty(){
        stack = new Stack();
        assertTrue(stack.stackIsEmpty);
    }

    @Test
    public void addItemToStack(){
        stack.push("benz");
        assertEquals(1, stack.size());
    }

    @Test
    public void addItem1(){
        stack.push("bibe");
        assertEquals(1, stack.size());
    }
    @Test
    public void removeElemetFromStack(){
        stack.push("benz");
        stack.push("bibe");
        stack.pop(2);
        assertEquals(1, stack.size());
    }

    @Test
    public void peekItemFromStack(){
        stack.push("benz");
        stack.push("bibe");
        stack.peek(1);
        assertEquals(2, stack.size());
    }

    @Test
    public void testMoreOnPeek(){
        stack.push("benz");
        stack.push("bibe");
        stack.push("hymnal");
        stack.push("shoe");
        stack.peek(3);
        assertEquals(4, stack.size());

    }


}