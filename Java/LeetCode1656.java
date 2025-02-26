package Java;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1656 {
    String [] arr;
    public void OrderedStream(int n) {
        arr = new String[n+1];
        sz=n;
    }
    int index=1;
    int sz;
    public List<String> insert(int idKey, String value) {
        arr[idKey]=value;
        List<String> ans=new ArrayList<>();
        while(index<=sz&&arr[index]!=null){
            ans.add(arr[index]);
            index++;
        }return ans;
    }
}
