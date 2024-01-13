import java.util.ArrayList;
import java.util.Collections;

public class Y_25_ArraysList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new   ArrayList<Integer>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(0);
        list.add(1);
        list.add(2);
        System.out.println(list);


        //get elements
        int element = list.get(0);
        System.out.println(element);
         

        //set element
        list.add(1,1);
        System.out.println(list);


        //delete element
        list.remove(3);
        System.out.println(list);

        //size
        int size =list.size();
        System.out.println(size);


        //loops
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println();


        //sorting 
        Collections.sort(list);
        System.out.println(list);
    }
}


//we only create objects in the array lists