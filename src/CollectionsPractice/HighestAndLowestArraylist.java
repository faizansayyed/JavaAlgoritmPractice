package CollectionsPractice;

import java.util.Collections;
import java.util.ArrayList;

public class HighestAndLowestArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(44);
        list.add(11);
        list.add(22);
        list.add(33);
        // Sort the collection and get the first and last element
        Collections.sort(list);

        // Use max() and min() methods of COllections classs
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

    }
}
