import java.util.Arrays;

public class ArrayQueue {
    private int rear;
    private int front;
    private int count;
    private int[] items;

    public ArrayQueue(int capacity){
        items = new int[capacity];
    }

    public void enqueue (int item){
        if(count == items.length) throw new IllegalStateException("Queue is Full");

        if(rear == items.length) rear = 0;
        items[rear++] = item;
        count++;
    }

    public int dequeue(){
        if(count == 0) throw new IllegalStateException("Queue Empty");

        if(front == items.length) front = 0;
        var item = items[front];
        items[front++] = 0;
        count--;
        return item;

    }

    @Override
    public String toString(){
       return  Arrays.toString(items);
    }
}
