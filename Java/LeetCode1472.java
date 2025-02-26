package Java;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1472 {
    List<String> history=new ArrayList<>();
    int index;
    public BrowserHistory(String homepage) {
        history.add(homepage);
        index=0;
    }

    public void visit(String url) {
        index++;
        history=history.subList(0,index);
        history.add(url);
    }

    public String back(int steps) {
        index=Math.max(0,index-steps);
        return history.get(index);
    }

    public String forward(int steps) {
        index=Math.min(history.size()-1,index+steps);
        return history.get(index);
    }
}
