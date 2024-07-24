import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 1, 2, 3, 1};
        System.out.println(Arrays.toString(nums));
        List<List<Integer>> d2 = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                System.out.println(map.keySet());
                d2.add(new ArrayList<>(map.keySet()));
                map.clear();
                map.put(nums[i], 1);

            }
        }

//        System.out.println(d2);
    }
}
