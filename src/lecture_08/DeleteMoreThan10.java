package lecture_08;

import java.util.Random;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
 * Удалить из множества все числа больше 10.
 * 
 * @author SMD_ASY
 *
 */
public class DeleteMoreThan10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set = removeAllNumbersGreaterThan10(createSet());
		for (Integer i : set) {
			System.out.println(i);
		}
	}

	public static Set<Integer> createSet() {
		// напишите тут ваш код
		Set<Integer> s = new HashSet<Integer>();
		final int n = 20;
		Random r = new Random();
		for (int i = 0; i < n; i++) {
			s.add(r.nextInt(25) + 1);
		}
		return s;
	}

	public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
		// напишите тут ваш код
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			if (it.next() > 10) {
				it.remove();
			}
		}
		return set;
	}
}
