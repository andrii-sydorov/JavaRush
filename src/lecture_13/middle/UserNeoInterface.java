package lecture_13.middle;
/**
 * В этой задаче тебе нужно:

    Реализовать интерфейс DBObject в классе User.
    Реализовать метод initializeIdAndName так, чтобы программа работала и выводила на экран: "The user's name is Neo, id = 1".
    Метод toString и метод main менять нельзя.
    Подумать, что должен возвращать метод initializeIdAndName в классе User.

Обрати внимание: методы toString() и main() менять нельзя.
 * @author SMD_ASY
 *
 */
public class UserNeoInterface {

	public static void main(String[] args) {
		String temp = Matrix.NEO.toString();
		System.out.println(temp);
	}
	
	
	static class Matrix{
		public static DBObject NEO = new User().initiliazeIdAndName(1, "NEO");
	}
	
	public interface DBObject {
		DBObject initiliazeIdAndName(long id, String name);
	}
	
	static class User implements DBObject {
		long id;
		String name;

		@Override
		public User initiliazeIdAndName(long id, String name) {
			this.id = id;
			this.name = name;
			return this;
		}
		
		public String toString() {
			return String.format("The user's name is %s, id = %d", name, id);
		}
	}
}
