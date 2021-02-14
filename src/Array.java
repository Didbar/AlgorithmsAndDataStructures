public class Array {
     private int[] items;
     private int count;

     public Array(int lenght){
        items = new int[lenght];
     }

     public void print(){
         for (int i = 0; i < count; i++)
             System.out.println(items[i]);

     }

     public void insert(int item){
        if(items.length == count){
            int [] newArr = new int[count * 2];
            for (int i = 0; i < count ;i++)
                newArr[i] = items[i];
            this.items = newArr;
        }

         items[count++] = item;
     }

     public void removeAt(int index){
         if(index < 0 || index >= count)
             throw  new IllegalArgumentException();

         for (int i = index; i < count-1; i++)
             items[i] = items[i + 1];

         count--;
     }

     public int indexOf(int item){
         for(int i = 0; i < count; i++ )
             if(items[i] == item) return i;

         return -1;
     }
}
