import java.util.Arrays;

public class PriorityQueue {

    private int[] items = new int[5];
    private int count;

    public void add(int item){
        if(isFull()) resizeArr();

        var index = shiftItemsToInsert(item);
        items[index] = item;
        count++;
    }
    public int remove(){
        if(isEmpty()) throw  new IllegalStateException();

        return items[--count];
    }

    @Override
    public String toString(){
        return Arrays.toString(items);
    }
    private  void resizeArr() {
        int[] newArr = new int[items.length * 2];

        for (int i = 0; i < items.length ; i++){
            newArr[i] = items[i];
        }
        items = newArr;
    }
    public boolean isEmpty(){
        return count == 0;
    }
    public boolean isFull(){
       return  count == items.length;
    }

    private int shiftItemsToInsert(int item){
        int i;
        for(i = count - 1 ; i >= 0; i--)
            if(items[i] > item)
                items[i + 1] = items[i];
            else
                break;

        return i + 1;
    }
}


