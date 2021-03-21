package streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DistictVal {
	
	
	public static void main(String[] args) {
		
		
		List<Integer> list= Arrays.asList(2,9,0,8,9,9,4);
		
		
		Object distinctV= list.stream().distinct().collect(Collectors.toList());
		Object list1=list.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(distinctV);
		System.out.println(list1);
		
	}

}
