package list;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> x = new ArrayList<Integer>();
		x.add(10);
		x.add(20);
		x.add(50);
		
		List<Integer> y = new ArrayList<Integer>();
		
		int j = x.size() - 1;
		for(int i=j;i>=0;i--) {
			int m = x.get(i);
			y.add(m);
		}
		
		System.out.println(y.toString());
	}

}
