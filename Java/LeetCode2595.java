package Java;

public class LeetCode2595 {
    public int[] evenOddBit(int n) {
        String Bineral=Integer.toBinaryString(n);
        int odd=0,even=0;
        int len=Bineral.length();
        for(int i=len-1;i>=0;i--){
            int index=len-1-i;
            if(Bineral.charAt(i)=='1'){
                if(index%2==0)even++;
                else odd++;
            }
        }return new int[]{even,odd};
    }
}
