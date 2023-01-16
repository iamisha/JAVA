import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
public class HashMapExam {

    public static void main(String [] args){

        // Declaring the hashmap
        HashMap<String, Integer>map = new HashMap<>();

        // Inserting the hashmap
        map.put("Isha", 201710);
        map.put("Priyanka", 201725);

        // Printing all the values in hashmap
        System.out.println("using put() method to insert the key and value");
        System.out.println(map);

        System.out.println("Printing if the specified hashmap contains the following key or not");
        System.out.println(map.containsKey("Isha"));
        System.out.println(map.containsKey("Raju"));

        // Printing if the specified hashmap contains the following value or not
        System.out.println(map.containsValue(201710));
        System.out.println(map.containsValue(201712));

        // search the key
        if(map.containsKey("Isha")){
            System.out.println("key is present in the map");
            System.out.println(map.get("Isha"));
        }else{
            System.out.println("key is not present in the map");
        }

        System.out.println("get method simply prints the value of the specified key if the key is present otherwise it returns null");
        System.out.println(map.get("Isha")); // key exists");
        System.out.println(map.get("Muna")); // key doesn't exist


        // Iteration in HashMap

        System.out.println("only for test purpose");
        int arr[] = {1, 2, 33};
        for(int i=0; i<3; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        for(int value : arr){
            System.out.print(value + " ");
        }
        System.out.println();

         // Iteration in HashMap
         System.out.println("Printing the key with their values through entrySet()");
         for(Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
         }

         // setting all the keys
         System.out.println("Printing the key with their values through keySet()");
         Set<String>keys = map.keySet();
         for(String key : keys){
            System.out.println(key + " "+map.get(key));
         }

        System.out.println("removing any pair in HashMap");
        map.remove("Isha");
        System.out.println(map);
    }   
}
