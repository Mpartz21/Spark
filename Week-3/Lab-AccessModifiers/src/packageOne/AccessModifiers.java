package packageOne;
import packageTwo.ProtectedSubClass;

public class AccessModifiers {
	
	public static void main(String[] args) {
        //access class methods here
		Person miguel = new Person();
		miguel.age = 23;
		
		System.out.println(miguel.age);
		

		ProtectedSubClass psc = new ProtectedSubClass();
        psc.printID();
    }
}
