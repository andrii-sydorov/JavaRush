package lecture_09;

/**
 * Перехватить исключение (и вывести его на экран), указав его тип, возникающее
 * при выполнении кода: 
 * int num=Integer.parseInt("XYZ");
 * System.out.println(num);
 * 
 * @author SMD_ASY
 *
 */
public class NFE {

	public static void main(String[] args) {
		try {
			int num = Integer.parseInt("XYZ");
			System.out.println(num);
		} catch (NumberFormatException nfe) {
			System.out.println(nfe);
		}
	}
}
