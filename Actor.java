package practise;

public interface Actor {
    void act();
    void speak();
    default void comedy() {
    	System.out.println("I can make peple children laugh");
	 }
}
