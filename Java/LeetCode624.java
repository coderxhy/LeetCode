package Java;

import java.util.List;

public class LeetCode624 {
        public int maxDistance(List<List<Integer>> arrays) {
            int len=arrays.get(0).size();
            int max_val=arrays.get(0).get(len-1);
            int min_val=arrays.get(0).get(0);
            int res=0;
            for(int i=1;i<arrays.size();i++){
                len=arrays.get(i).size();
                res=Math.max(res,Math.max(Math.abs(arrays.get(i).get(len-1)-min_val),Math.abs(max_val-arrays.get(i).get(0))));
                max_val=Math.max(max_val,arrays.get(i).get(len-1));
                min_val=Math.min(min_val,arrays.get(i).get(0));
            }return res;
        }
}
