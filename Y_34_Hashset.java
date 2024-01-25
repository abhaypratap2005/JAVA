import java.util.HashSet;
import java.util.Iterator;

public class Y_34_Hashset {

    public class Hashing {

    }

    public static void main(String[] args) {
        // creating
        HashSet<Integer> set = new HashSet<>();

        // insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        // search
        if (set.contains(1)) {
            System.out.println("true");
        }
        if (!set.contains(6)) {
            System.out.println("no");
        }

        // delete
        set.remove(1);
        if (!set.contains(1)) {
        System.out.println("not contain");
        }


        // size
        System.out.println("size: " + set.size());



        //print all
        System.out.println(set);


        //iterator
       Iterator it= set.iterator();
       while(it.hasNext()){
        System.out.println(it.next());
       }


        }
    }
