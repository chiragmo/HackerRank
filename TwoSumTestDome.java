/*
Question: Two Sum
Java Algorithmic thinking Searching Public
Write a function that, when passed a list and a target sum, returns, efficiently with respect to time used, two distinct zero-based indices of any two of the numbers, whose sum is equal to the target sum. If there are no two numbers, the function should return null.
For example, findTwoSum(new int[] { 3, 1, 5, 7, 5, 9 }, 10) should return a single dimensional array with two elements and contain any of the following pairs of indices:
    0 and 3 (or 3 and 0) as 3 + 7 = 10
    1 and 5 (or 5 and 1) as 1 + 9 = 10
    2 and 4 (or 4 and 2) as 5 + 5 = 10
*/


import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
public class TwoSum {
    public static int[] findTwoSum(int[] list, int sum) {
       // throw new UnsupportedOperationException("Waiting to be implemented.");
        HashMap<Integer,Set<Integer>> map = new HashMap<>(list.length);
        int[] ret = new int[2];
        for(int i = 0; i<list.length; i++) {
            if(list[i] < sum) {
            if(map.containsKey(list[i])) {
                Set<Integer> ar = map.get(list[i]);
                ar.add(i); map.put(list[i],ar);
            }
            else {
                 Set<Integer> ar = new HashSet<>();
                ar.add(i); map.put(list[i],ar);
            }
            }
        }
        
        for(int i=0; i<list.length; i++) {
            int val = sum - list[i];
            if(map.containsKey(val)) {
                Set<Integer> li = map.get(val);
                Integer[] a = li.toArray(new Integer[li.size()]);
                for(int j =0; j< a.length; j++) {
                    if(i != a[j]) {
                        ret[0] = a[j]; ret[1] = i;
                        return ret;
                    }
                }
        }
        
    }
        return null;
    }

    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[] { 3, 1, 5, 7, 5, 9 }, 10);
        if(indices != null) {
            System.out.println(indices[0] + " " + indices[1]);
        }
    }
}
