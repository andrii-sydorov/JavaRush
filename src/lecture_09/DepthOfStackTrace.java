package lecture_09;

public class DepthOfStackTrace {
	/**
	 * Написать метод, который возвращает результат - глубину его стек-трейса -
	 * количество методов в нем (количество элементов в списке). Это же число метод
	 * должен выводить на экран.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int depth = getDeepthOfStackTrace();
	}

	public static int getDeepthOfStackTrace() {
		System.out.println(Thread.currentThread().getStackTrace().length);
		return Thread.currentThread().getStackTrace().length;
	}

}
