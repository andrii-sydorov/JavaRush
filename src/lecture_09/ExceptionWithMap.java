package lecture_09;

import java.util.Map;
import java.util.HashMap;

/**
 * Перехватить исключение (и вывести его на экран), указав его тип, возникающее
 * при выполнении кода: 
 * HashMap<String, String> map = new HashMap<String,String>(null); 
 * map.put(null, null); 
 * map.remove(null);
 * 
 * @author SMD_ASY
 *
 */
public class ExceptionWithMap {

	public static void main(String[] args) {
		try {
			Map<String, String> map = new HashMap<>(null);
			map.put(null, null);
			map.remove(null);
		} catch (Exception e) {
			System.out.println(e.getClass().getName());
		}
	}
}
