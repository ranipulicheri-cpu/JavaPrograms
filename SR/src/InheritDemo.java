class Person{
	String name,address;
	int age;
	Person(String name,int age,String address){
		this.name=name;
		this.age=age;
		this.address=address;
	}
	public String toString() {
		return "Name : "+name+"\nAddress : "+address;
		
	}
	
}
class Employe extends Person{
	int empId;
	String dept;
	Employe(Person p,int empId,String dept){
		super(p.name,p.age,p.address);
		this.empId=empId;
		this.dept=dept;
	}
	void getDetails() {
		System.out.println("Emp id: "+empId+"\nDept: "+dept);
	}
	
}
public class InheritDemo {
  public static void main(String[] args) {
	  Person p=new Person("Rani",20,"wgl");
	  Employe e=new Employe(p,2345,"Software");
	  System.out.println(p);
	  e.getDetails();
  }
}
