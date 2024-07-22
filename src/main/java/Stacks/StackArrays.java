package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class StackArrays {
    private int[] arr;
    private int topOfStack;
    private int size;

    public StackArrays(int size) {
        this.size = size;
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("Stack created with a size of: " + size);
    }

    public boolean isEmpty(){
        if (topOfStack == -1){
            System.out.println("Stack is empty");
            return true;
        } else {
            System.out.println("Stack is not empty");
            return false;
        }
    }

    public boolean isFull(){
        if (topOfStack == size -1){
            System.out.println("Stack is full");
            return true;
        } else {
            System.out.println("Stack is not full");
            return false;
        }
    }

    public void push(int value){
        if (isFull()) {
            System.out.println("Stack Overflow: Cannot push " + value + ", stack is full");
        } else {
            topOfStack++;
            arr[topOfStack] = value;
            System.out.println("Pushed " + value + " into stack");
        }
    }

    public void pop(){
        if (isEmpty()){
            System.out.println("Stack is empty");
        } else {
            int poppedValue = arr[topOfStack];
            topOfStack--;
            System.out.println("Popped " + poppedValue + " from stack");
        }
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("Stack is empty, nothing to peek");
            return -1; // Assuming -1 is used to indicate an error or empty stack
        } else {
            System.out.println("Value at top of stack is: " + arr[topOfStack - 1]);
            return arr[topOfStack - 1];
        }
    }

}
