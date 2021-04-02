package lecture_09;

public class returnStackTrace {
	/**
	 * Написать пять методов, которые вызывают друг друга. Каждый метод должен
	 * возвращать свой StackTrace.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
	}

	public static StackTraceElement[] method1() {
		method2();
		StackTraceElement[] stackTraceElemenets = Thread.currentThread().getStackTrace();
		return stackTraceElemenets;
	}

	public static StackTraceElement[] method2() {
		method3();
		StackTraceElement[] stackTraceElemenets = Thread.currentThread().getStackTrace();
		return stackTraceElemenets;
	}

	public static StackTraceElement[] method3() {
		method4();
		StackTraceElement[] stackTraceElemenets = Thread.currentThread().getStackTrace();
		return stackTraceElemenets;
	}

	public static StackTraceElement[] method4() {
		method5();
		StackTraceElement[] stackTraceElemenets = Thread.currentThread().getStackTrace();
		return stackTraceElemenets;
	}

	public static StackTraceElement[] method5() {
		StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
		return stackTraceElements;
	}
}
