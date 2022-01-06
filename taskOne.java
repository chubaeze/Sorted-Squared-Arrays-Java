package sqauredArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class taskOne {
	
	public static List<Integer> squaredArray(int[] array) {
		
		List<Integer> newArray = new ArrayList<Integer>();
		
		Arrays.sort(array); 
		
		for (int i = 0; i < array.length; i++) {
			
			
			int absolute = Math.abs(array[i]);
			int absoluteSquared = absolute * absolute;
			
			newArray.add(absoluteSquared);
			

		
			
	}
		return newArray; 

}
}
