package sqauredArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class taskOneTwo {
	
	public static List<Integer> squaredArray(int[] array){
		
		List<Integer> squares = new ArrayList<Integer>();
		
		Arrays.sort(array); 
		
		int left = 0;
		int right = array.length - 1;
		
			while (left < right) {
				
				int leftAbs = Math.abs(array[left]);
				int rightAbs = Math.abs(array[right]);
				
				int leftSquared = leftAbs * leftAbs;
				squares.add(leftSquared);
				left++;
				
				if (left == right) {
					
					int rightSquared = rightAbs * rightAbs;
					squares.add(rightSquared);
				} 
			}
			
			return squares; 
	}

}
