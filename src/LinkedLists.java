import java.util.Arrays;

public class LinkedLists {

    public static  void  main (String[] args){
        var  list = new LinkedList();

        list.addFirst(50);
        list.addFirst(40);
        list.addFirst(30);
        list.addFirst(20);
        list.addFirst(10);

        int res = list.getKth(1);


        System.out.println(res);



    }
}
