
public class Parrot {
	public static void main(String[] args) {
        //create a class instance
        //call your first method here
		Parrot parrot = new Parrot();
		parrot.talk();
		
		String[] words = {"Howdy", "Polly", "wanna", "cracker"};
	    parrot.repeat(words);
	    
	    int eatenCrackers = parrot.crackersEaten(11, 10);
    }

    //create your first method here 
	public void talk() {
		System.out.println("squawk squawk squawk");
	}
	
	public void repeat(String[] words) {
		for(int i=0;i <words.length;i++) {
			System.out.println(words[i]);
		}   	
    }
	
	public int crackersEaten(int stolenCrackers ,int crackersGiven){
		return stolenCrackers + crackersGiven;
	}
}
