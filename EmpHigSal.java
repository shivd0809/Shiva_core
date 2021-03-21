package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmpHigSal {
	
	
	
	static class Employee{
		
		private  int id;
		private String name;
		private int sal;
		 
		 public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getSal() {
			return sal;
		}

		public void setSal(int sal) {
			this.sal = sal;
		}

		Employee( int id, String name, int sal){
			 
			 this.id=id;
			 this.name=name;
			 this.sal=sal;
		 }

			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return this.id+"  "+this.name+" "+this.sal;
			}
		 
		
		
	}

	public static void main(String[] args) {
		
		List<Employee> list=new ArrayList<Employee>();
		//list.add(new EmpHigSal.Employee(1,"SAMBA",100));
		//list.add(new EmpHigSal.Employee(2,"SHIV",200));
		list.add(new EmpHigSal.Employee(3,"SAI",300));
		System.out.println("values  "+list);
		
	    Optional<Employee> highsal=list.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getSal)))	;
		
	    Optional<Employee> highsal1=list.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSal)))	;
		System.out.println(highsal);
		System.out.println(highsal1);
		
		
	}

}
