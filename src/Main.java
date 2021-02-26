import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static  void  main (String[] args){


//          ARRAYS

//        Array list = new Array(3);
//
//        list.insert(10);
//        list.insert(20);
//        list.insert(30);
//
//
//        list.insertAt(50,0);
//        list.print();


//          STACK
//
//        Stack stack  = new Stack();
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//
//        stack.pop();
//        stack.pop();
//
//
//        System.out.println(stack.isEmpty());


//        Queues
//
//        Queue<Integer> queue = new ArrayDeque<>();
//
//        queue.add(10);
//        queue.add(20);
//        queue.add(30);

//        var front = queue.remove();
//        System.out.println(front);
//        System.out.println(queue);
//
//
//        reverse(queue);
//        System.out.println(queue);

//        ArrayQueue myqueue = new ArrayQueue(5);
//        myqueue.enqueue(10);
//        myqueue.enqueue(20);
//        myqueue.dequeue();
//        System.out.println(myqueue);
//
//        QueueWithTwoStacks queue = new QueueWithTwoStacks();
//
//        queue.enqueue(1);
//        queue.enqueue(2);
//        queue.enqueue(3);
//        System.out.println(queue.dequeue());
//        System.out.println(queue.peek());

        PriorityQueue queue = new PriorityQueue();

        queue.add(5);
        queue.add(2);
        queue.add(3);
        while (!queue.isEmpty())
            System.out.println(queue.remove());

        System.out.println(queue);






    }
//    public static  void reverse(Queue<Integer> queue){
//        //add  remove isEmpty.
//        Stack<Integer> stack  = new Stack<>();
//        while (!queue.isEmpty())
//            stack.push(queue.remove());
//
//        while(!stack.empty())
//            queue.add(stack.pop());
//    }
}
