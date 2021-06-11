
public class Chicken {
	public static void main(String[] args) {
        //create a class instance
        Chicken chicken = new Chicken();

        //call talk method here
        chicken.talk();
        
        //call the greetHuman with an argument
        String person = "Buster";
        chicken.greetHuman(person);
        
        int numOfEggs = chicken.countEggs(12, 6);
    }

    public void talk(){
        System.out.println("Cluck cluck cluck");
    }
    
    public void greetHuman(String name){
        System.out.println("cluck cluck buckaw "+name); 
    }
    
    public int countEggs(int eggsLaid, int eggsEaten){
        return eggsLaid - eggsEaten;
}
}
