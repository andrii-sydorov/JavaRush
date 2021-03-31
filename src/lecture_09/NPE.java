package lecture_09;

/**
 * Перехватить исключение (и вывести его на экран), указав его тип, возникающее
 * при выполнении кода: 
 * String s = null; 
 * String m = s.toLowerCase();
 * 
 * @author SMD_ASY
 *
 */
public class NPE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = null;
		try {
			String m = s.toLowerCase();
		} catch (NullPointerException npe) {
			System.out.println(npe);
		}
	}
}
