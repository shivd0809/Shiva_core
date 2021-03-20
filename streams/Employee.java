package streams;

public class Employee {

	
    private int id;
    private String name;
    private int age;
    private   int sal;
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", sal=" + sal + "]";
	}


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


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getSal() {
		return sal;
	}


	public void setSal(int sal) {
		this.sal = sal;
	}


	public Employee(int id,String name,int age,int sal) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.sal=sal;
		
		
		
	}
}
