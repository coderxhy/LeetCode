package Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode15 {
//    给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，
//    同时还满足 nums[i] + nums[j] + nums[k] == 0 。请你返回所有和为 0 且不重复的三元组。
//
//    注意：答案中不可以包含重复的三元组。
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){ //枚举nums[i]
            if(i>0&&nums[i]==nums[i-1])continue;
            int j=i+1,k=nums.length-1;
            while(j<k){
                int sum=nums[k]+nums[j]+nums[i];
                if(sum>0){
                    k--;
                }else if(sum<0){
                    j++;
                }else {
                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    while(j<k&&nums[j]==nums[j+1]){j++;}
                    while(j<k&&nums[k]==nums[k-1]){k--;}
                    k--;j++;
                }
            }
        }return res;
    }
}
