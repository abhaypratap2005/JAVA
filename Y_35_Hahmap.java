import java.util.*;
public class Y_35_Hahmap {
    
    public static void main(String[] args) {
        //contry(key), population(value)
        HashMap<String, Integer> map=new HashMap<>();


        //insertion
        map.put("India", 120);
        map.put("USA", 30);
        map.put("China", 129);

        System.out.println(map);
        map.put("China", 180);
        System.out.println(map);

        //search
        if(map.containsKey("China")){
            System.out.println("key present");

        }
        else{
            System.out.println("not present");
        }
 
        //get
        System.out.println(map.get("China"));
        System.out.println(map.get("indonesia"));


        int arr[]={12,15,18};
        for(int i=0;i<3;i++){
            System.out.print(arr[i]+" ");


        }
        //new way for loops
    for(int val: arr){
    System.out.print(val+" ");
    }
  System.out.println();
    
  for(Map.Entry<String, Integer> e:map.entrySet()){
       System.out.println(e.getKey());
       System.out.println(e.getValue());
  }
  Set<String> keys =map.keySet();
  for(String key: keys){
    System.out.println(key +" "+map.get(key));
  }


  //remove 
  map.remove("China");
  System.out.println(map);
}
}
//hashmap
