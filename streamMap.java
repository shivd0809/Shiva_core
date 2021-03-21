package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class streamMap {
	
	public static void main(String[] args) {
		
		List<String> names=new ArrayList<String>();
		names.add("SHIV");
		
		List<String> listNames=names.stream().sorted().map(String::toUpperCase).forEach(System.out::println);
				
		
	}

}
