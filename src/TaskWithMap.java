import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskWithMap {
    public static void main(String[] args) {
        int[] ints = {1,2,3,4,5,5,5,5,5,5,4,4,4,3,3,3,2,2,2,1,1,5,5};


        Map<Integer, Integer> map = new HashMap<>();

        //key value
        // 1    1
        // 2    1
        // 3    1
        // 4    1
        // 5    3
        for (int anInt : ints) {
            if(map.containsKey(anInt)){
                map.replace(anInt, map.get(anInt) + 1);
            }else{
                map.put(anInt, 1);
            }
            System.out.println(map);
        }

    }
}
