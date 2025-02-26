package Java;

import java.util.HashMap;
import java.util.List;

public class LeetCode2080 {
    List<HashMap<Integer, Integer>> freqs;

    public void RangeFreqQuery(int[] arr) {
        int len=arr.length;
        HashMap<Integer, Integer> freq=new HashMap<>();
        for(int i=0;i<len;i++){
            freq.put(arr[i],freq.getOrDefault(arr[i],0)+1);
            freqs.add(freq);
        }
    }

    public int query(int left, int right, int value) {
        return left==0? freqs.get(right).getOrDefault(value,0): freqs.get(right).getOrDefault(value,0)-freqs.get(left-1).getOrDefault(value,0);
    }
}
