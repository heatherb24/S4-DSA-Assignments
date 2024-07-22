package Stacks;

public class StackMain {
    public static void main(String[] args) {
        System.out.println("StackArrays:");
        StackArrays stackArrays = new StackArrays(5);
        System.out.println();

        System.out.println("Pushing elements:");
        stackArrays.push(1);
        stackArrays.push(2);
        stackArrays.push(3);
        System.out.println();

        System.out.println("Stack Empty or Full?:");
        System.out.println("Is stack empty? " + stackArrays.isEmpty());
        System.out.println("Is stack full? " + stackArrays.isFull());
        System.out.println();

        System.out.println("Peek:");
        System.out.println("Peek: " + stackArrays.peek());
        System.out.println();

        System.out.println("Popping elements:");
        while (!stackArrays.isEmpty()) {
            stackArrays.pop();
        }

        System.out.println("Is stack empty now? " + stackArrays.isEmpty());
        System.out.println();
        System.out.println();

        System.out.println("StackLinkedList:");
        StackLinkedLists stackLinkedList = new StackLinkedLists();
        System.out.println();

        System.out.println("Pushing elements:");
        stackLinkedList.push(1);
        stackLinkedList.push(2);
        stackLinkedList.push(3);

        System.out.println("Is stack empty? " + stackLinkedList.isEmpty());
        System.out.println();

        System.out.println("Peek:");
        System.out.println("Peek: " + stackLinkedList.peek());
        System.out.println();

        System.out.println("Popping elements:");
        while (!stackLinkedList.isEmpty()) {
            stackLinkedList.pop();
        }

        System.out.println("Is stack empty now? " + stackLinkedList.isEmpty());
        System.out.println();

        System.out.println("Deleting stack:");
        stackLinkedList.deleteStack();
    }
}
