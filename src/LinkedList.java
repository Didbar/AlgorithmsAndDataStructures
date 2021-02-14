import java.sql.SQLOutput;
import java.util.NoSuchElementException;

public class LinkedList {

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private  int size = 0;

    public void addLast(int item){
        var node  = new Node(item);

        if(isEmpty())
           first = last = node;

        else {
            last.next  = node;
            last = node;
        }

        size++;

    }

    public void addFirst(int item){
        var node  = new Node(item);

        if(isEmpty()) {
            first = last = node;
        }else {
            node.next = first;
            first = node;
        }
        size++;
    }

    public int indexOf(int item){
        int index  = 0;
        var current = first;

        while(current != null){
            if(current.value == item) return  index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item){
        var current = first;

        while (current != null){
            if (current.value == item) return true;
            current = current.next;
        }

        return false;
    }

    public void  removeFirst(){
        if (isEmpty()) throw new NoSuchElementException();
        if (first == last) {
            first = last =null;
            size--;
            return;
        }
        var second  = first.next;

        first.next = null;
        first = second;

        size--;
    }


    public void removeLast(){
        if(isEmpty()) throw new NoSuchElementException();

        if(first == last){
            first = last = null;
            size = 0;
            return;
        }

        var previous  = getPrevious(last);
        last = previous;
        last.next = null;

        size--;
    }

    public int size() {
        return size;
    }

    public int[] toArray(){
        int[] array = new int[size];

        var index = 0;
        var cuurent = first ;

        while(cuurent != null){
            array[index++] = cuurent.value;
            cuurent = cuurent.next;
        }

        return array;
    }

    public void reverse(){
        if(isEmpty()) return;
        if (first == last ) return;

//        int i =0;
//        int half = size /2;
//        var cur = first;
//        var prev = last;
//        var left = cur.value;
//        var right = prev.value;
//
//        while( i < half ){
//
//            cur.value = right;
//            prev.value = left;
//            cur = cur.next;
//            prev = getPrevious(prev);
//            left = cur.value;
//            right = prev.value;
//            i++;
//        }
//

        var previous  = first;
        var current =  first.next;
        while (current != null){
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }


        last = first;
        last.next = null;
        first = previous;
    }

    public int getKth(int kth){

        if (kth > size || kth <= 0) throw new IllegalArgumentException();
        if (isEmpty()) throw  new IllegalStateException();

        var result =  first;
        var cur = first;
        int distance =kth -1;
        cur  = getDistanceElement(distance, cur);
        while(cur.next  != null){
            result = result.next;
            cur = cur.next;
        }

        return result.value;
    }

    //PRIVATE METHODS
    private  Node getDistanceElement(int distance , Node cur){
        while(distance > 0){
            cur = cur.next;
            distance--;
        }
        return cur;
    }

    private boolean isEmpty(){
        return first == null;
    }

    private Node getPrevious(Node node){
        var current = first;

        while (current != last){
            if(current.next == node) return current;
            current = current.next;


        }
        return null;

    }
}
