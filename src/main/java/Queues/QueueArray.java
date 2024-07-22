package Queues;

public class QueueArray {
    private int [] arr;
    private int backOfQueue;
    private int nItems;
    int beginningOfQueue;

    public QueueArray(int size) {
        this.arr = new int[size];
        this.backOfQueue = -1;
        this.beginningOfQueue = -1;
        this.nItems = 0;
        System.out.println("Queue created wih size of: " + size);
    }

    public boolean isFull(){
        if(backOfQueue == arr.length-1){
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty(){
       return (nItems == 0);
    }

    public void enQueue (int value){
        if (isFull()){
            System.out.println("Queue is Full");
        } else if (isEmpty()) {
            beginningOfQueue = 0;
            backOfQueue++;
            nItems++;
            arr[backOfQueue] = value;
            System.out.println("Inserted " + value + " in Queue");
        } else {
            backOfQueue++;
            nItems++;
            arr[backOfQueue] = value;
            System.out.println("Inserted " + value + " in Queue");
        }

    }

    public int deQueue (int value){
        if (isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        } else {
            int result = arr[beginningOfQueue];
            beginningOfQueue++;
            if (beginningOfQueue > backOfQueue){
                beginningOfQueue = backOfQueue = -1;
            }
            nItems--;
            return result;
        }
    }

    public int peek(){
        if (!isEmpty()){
            return arr[beginningOfQueue];

        } else {
            System.out.println("Queue is empty");
            return -1;
        }
    }

    public void deleteQueue(){
        arr = null;
        System.out.println("Queue deleted");
    }

}
