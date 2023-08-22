
public class Main {

	public static void main(String[] args) {
		Fighter Ali = new Fighter("Ali", 15, 125, 85, 60);
		Fighter Mike = new Fighter("Mike", 20, 95, 91, 25);
		
		Match r = new Match(Ali, Mike, 80, 95);
		r.run();

	}

}
