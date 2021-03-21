package streams;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class StreamEx implements Serializable {
	public static void main(String[] args) {
		
		List<Integer> list =Arrays.asList(1,7,9,8);
		
		for (int i = 0; i < list.size(); i++) {
			
			System.out.println("Normal Loop::"+list.get(i));
			
		}
		for (Integer integer : list) {
			System.out.println("forEach Loop::"+integer);
			
		}
		//using lamda
		list.forEach(n->System.out.println(n));
		//or
		
		/*list.forEach(new Consumer<Integer>() {
			
			public void accept(Integer i) {
				System.out.println(i);
			}

		});*/
		
		list.forEach(System.out::println);
		
	}

}
