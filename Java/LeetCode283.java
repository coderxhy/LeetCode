package Java;

public class LeetCode283 {
    //每次交换都是将当前最左侧非零数 放在指针位置
    //指针位标记了当前读到的非零个数
    public void moveZeroes(int[] nums) {
        int ptr=0; //指向最左边的0
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int tmp=nums[i];
                nums[i]=nums[ptr];
                nums[ptr]=tmp;
                ptr++;
            }
        }
    }
}
