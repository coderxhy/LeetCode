package Java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LeetCode128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        Set<Integer> visited =  new HashSet<>();
        int res=0;
        for(int num:set){
            int count=1;
            if(visited.contains(num)){
                continue;
            }else {
                visited.add(num);
                while(set.contains(num+1)){
                    count++;
                    visited.add(num+1);
                    num++;
                }
                res=Math.max(res,count);
            }
        }return res;
    }
}
