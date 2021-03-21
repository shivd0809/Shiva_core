package streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamEX2 {
	
	public static void main(String[] args) {
		
		Stream stream=Stream.of(1,2,4,5,9,10,11);
		Stream stream2=Stream.of(new Integer[] {2,9,3,2});
		Stream stream3=Stream.of(new ArrayList());
		
		
		//stream.forEach(System.out::println);
		stream.forEach(n->System.out.println(n));
		stream2.forEach(System.out::println);
		
		stream3.forEach(System.out::println);
		
	}

}
