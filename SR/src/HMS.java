
class Person{
	void person(){
	System.out.println("The person can be anything ");
	
}
}
class Doctor extends Person{
			void treat() {
		System.out.println("Person to treat patients");
		}
	}
class Nurse extends Person{
	void treat() {
		System.out.println("Person to treate patients after doctor");
	}
}
class Patient extends Person{
	void treat() {
		System.out.println("The person who has to be treated");
	}
}

public class HMS {
	public static void main(String[] args) {
		
	}

}
