package lecture_16.middle;

import java.util.List;
import java.util.ArrayList;

/**
 * В методе main добавить в статический объект list 5 нитей. Каждая нить должна
 * быть новым объектом класса Thread, работающим со своим объектом класса
 * SpecialThread.
 * 
 * @author SMD_ASY
 *
 */

public class ListOfThread {

	public static volatile List<Thread> list = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int n = 5;
		for (int i = 0; i < n; i++) {
			list.add(new Thread(new SpecialThread()));
		}
		for (Thread t : list) {
			t.run();
		}
	}

	public static class SpecialThread implements Runnable {
		@Override
		public void run() {
			System.out.println("it's a run method inside SpecialThread");
		}
	}

}
