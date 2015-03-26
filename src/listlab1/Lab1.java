
package listlab1;

import java.util.ArrayList;
import java.util.List;

public class Lab1 {
    public static void main(String[] args) {
        List hobbyList = new ArrayList();
        hobbyList.add("Working Out");
        hobbyList.add("Stock Trading");
        hobbyList.add("Video Games");
        
        for(int i = 0; i < hobbyList.size(); i++){
            String answer = (String)hobbyList.get(i);
            System.out.println(answer);
        }
    }
}
