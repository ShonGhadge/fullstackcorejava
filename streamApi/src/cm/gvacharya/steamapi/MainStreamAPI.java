package cm.gvacharya.steamapi;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MainStreamAPI {
	
	public static void main(String[] args) {
		int[] intArray = {3,2,1,8,5,6,3,2,1,3,6,7};
		
		IntStream intStream = Arrays.stream(intArray);
		
		intStream.map((int no)->no+2)
		.filter(no->no%2==0)
		.map(no->no+1)
		.peek(no->System.out.println(no))
		.distinct()
		.peek(no->System.out.println(no))
//		.sorted(Comparator.reverseOrder())
		.forEach(no->System.out.println(no));
		
		intStream.close();
		
	}

}
