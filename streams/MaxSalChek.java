package streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MaxSalChek {

	public static void main(String[] args) {
		Employee e2=new Employee(1, "Samba", 28, 2000);
		Employee e1=new Employee(2, "SIVA", 29, 2000);
		Employee e3=new Employee(3, "SAI", 23, 800);
		Employee e4=new Employee(1, "Samba", 28, 2000);
		List<Employee> list=new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		Optional<Employee> listMaxSal=list.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSal)));
		
		//List nameList=(List) list.stream().distinct().collect(Collector.);
	System.out.println(listMaxSal);
	//*System.out.println(nameList);
	}

}
