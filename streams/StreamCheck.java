package streams;

import java.util.stream.Stream;

public class StreamCheck {
	
	  //print Stream
	
	public static void main(String[] args) {
	Stream<Integer> stream=Stream.of(new Integer[] {2,7,9,8,0,10});		
	
	stream.forEach(System.out::println);
	}

}
