package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples {

	public static void main(String[] args) {
		
		//printing numbers
		Stream<Integer> stream=Stream.of(1,2,3,3,5,9,90,23);
		
		stream.forEach(s->System.out.println(s));
		
		

		// create a list of integers
		List<Integer> list = Arrays.asList(2, 4, 9, 0, 7, 8);

		// demonstration of map method

		List<Integer> squareList = list.stream().map(n -> n * n).collect(Collectors.toList());
		List<Integer> evenNum = list.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
		System.out.println(squareList);

		System.out.println(evenNum);

		List<String> listString = Arrays.asList("SAMBA", "SIVA", "SAI", "TRI");

		List<String> listStringStart = listString.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
		System.out.println(listStringStart);
		
		//sorting
		
		List<String> listsort = listString.stream().sorted().collect(Collectors.toList());
		System.out.println(listsort);
		

	}

}
