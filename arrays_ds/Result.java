package arrays_ds;
import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.List;

public class Result {
	/*
     * Complete the 'reverseArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static List<Integer> reverseArray(List<Integer> a) {
    // Write your code here now
    	List<Integer> b = new ArrayList<Integer>();
    	
    	int j = a.size() - 1;
		for(int i=j;i>=0;i--) {
			int m = a.get(i);
			b.add(m);
		}
		
		return b;
    }
}
