package test;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 2, 3};
        MajorityElement me = new MajorityElement();
        System.out.println(me.majorityElement(nums));
    }

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int majorityCount = nums.length/2;
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if(map.get(num) > majorityCount) {
                return num;
            }
        }
        // Majority element does not exist
        return -1;
    }
}

