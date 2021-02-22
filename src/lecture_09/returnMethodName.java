package lecture_09;

public class returnMethodName {
	/**
	 * Написать пять методов, которые вызывают друг друга. Каждый метод должен
	 * возвращать имя метода, вызвавшего его, полученное с помощью StackTrace.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
	}

	public static String method1() {
		method2();
		StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
		System.out.println("StackTrace for method1");
		for (StackTraceElement elements : stackTraceElements) {
			System.out.println(elements.toString());
		}
		System.out.println(stackTraceElements[2].getMethodName());
		System.out.println();
		return stackTraceElements[2].getMethodName();
	}

	public static String method2() {
		method3();
		StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
		System.out.println("StackTrace for method2");
		for (StackTraceElement elements : stackTraceElements) {
			System.out.println(elements.toString());
		}
		System.out.println(stackTraceElements[2].getMethodName());
		System.out.println();
		return stackTraceElements[2].getMethodName();
	}

	public static String method3() {
		method4();
		StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
		System.out.println("StackTrace for method3");
		for (StackTraceElement elements : stackTraceElements) {
			System.out.println(elements.toString());
		}
		System.out.println(stackTraceElements[2].getMethodName());
		System.out.println();
		return stackTraceElements[2].getMethodName();
	}

	public static String method4() {
		method5();
		StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
		System.out.println("StackTrace for method4");
		for (StackTraceElement elements : stackTraceElements) {
			System.out.println(elements.toString());
		}
		System.out.println(stackTraceElements[2].getMethodName());
		System.out.println();
		return stackTraceElements[2].getMethodName();
	}

	public static String method5() {
		StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
		System.out.println("StackTrace for method5");
		for (StackTraceElement elements : stackTraceElements) {
			System.out.println(elements.toString());
		}
		System.out.println(stackTraceElements[2].getMethodName());
		System.out.println();
		return stackTraceElements[2].getMethodName();
	}

}
