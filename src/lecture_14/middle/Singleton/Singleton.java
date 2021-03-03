package lecture_14.middle.Singleton;

public class Singleton {
	private static Singleton instance = new Singleton();
	
	private Singleton() {
	}
	
	public static Singleton getInstance() {
		return instance;
	}
	
	public String toString() {
		return "It's singleton";
	}
}
