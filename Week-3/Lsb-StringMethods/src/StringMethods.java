
public class StringMethods {
	public static void main(String[] args) {
	   String str = "Pancakes";
	   String s = new String("Pancakes");
	   System.out.println(str.equals("Pancakes"));
	   System.out.println(str.equals(s));
	   System.out.println(str == s);
	   
	   String myFirstString = "withTheSameText";
	   String mySecondString = new String("withTheSameText");
	   
	   System.out.println("myFirstString.equals(mySecondString): "+
		myFirstString.equals(mySecondString));
	   
	   System.out.print("mySecondString == myFirstString : ");
	   System.out.println(mySecondString == myFirstString);
	   
	   System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	   
	   System.out.println(str.length());
	   
	   String supercalifragilisticexpialidocious ="supercalifragilisticexpialidocious ";
	   
	   System.out.println("supercalifragilisticexpialidocious length is: " + supercalifragilisticexpialidocious.length() );
	 
	   System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

	 //use the indexOf() method - note it returns 
	 //the index of the first occurrence of a char
	   System.out.println(str.indexOf('a'));
	   
	   System.out.println(supercalifragilisticexpialidocious.indexOf('c'));
	  
	   System.out.println(supercalifragilisticexpialidocious.indexOf('z'));
		  
	}
}
