package Stacks;

public class StackLinkedLists {

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;
    private int size;

    public StackLinkedLists() {
        this.top = null;
        this.size = 0;
        System.out.println("Stack created");
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        size++;
        System.out.println("Pushed " + value + " into stack");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty, cannot pop");
            return -1;
        } else {
            int poppedValue = top.data;
            top = top.next;
            size--;
            System.out.println("Popped " + poppedValue + " from stack");
            return poppedValue;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty, nothing to peek");
            return -1;
        } else {
            System.out.println("Value at top of stack is: " + top.data);
            return top.data;
        }
    }

    public void deleteStack() {
        top = null;
        size = 0;
        System.out.println("Stack deleted");
    }

    public int size() {
        return size;
    }
}