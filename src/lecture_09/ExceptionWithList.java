package lecture_09;

import java.util.ArrayList;
import java.util.List;

/**
 * Перехватить исключение (и вывести его на экран, указав его тип), возникающее
 * при выполнении кода: 
 * ArrayList<String> list = new ArrayList<String>(); 
 * String s = list.get(18);
 * 
 * @author SMD_ASY
 *
 */
public class ExceptionWithList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		try {
			String s = list.get(18);
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getClass().getName());
			System.out.println(e);
		}
	}

}
