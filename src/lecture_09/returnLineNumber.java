package lecture_09;

/**
 * �������� ���� �������, ������� �������� ���� �����. ����� ������ �������
 * ����� ������ ����, �� �������� ������� ���� �����. ������������ ��������:
 * element.getLineNumber().
 * 
 * @author SMD_ASY
 *
 */
public class returnLineNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
	}

	public static int method1() {
		method2();
		StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
		System.out.println(stackTraceElements[2].getLineNumber());
		return stackTraceElements[2].getLineNumber();
	}

	public static int method2() {
		method3();
		StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
		System.out.println(stackTraceElements[2].getLineNumber());
		return stackTraceElements[2].getLineNumber();
	}

	public static int method3() {
		method4();
		StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
		System.out.println(stackTraceElements[2].getLineNumber());
		return stackTraceElements[2].getLineNumber();
	}

	public static int method4() {
		method5();
		StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
		System.out.println(stackTraceElements[2].getLineNumber());
		return stackTraceElements[2].getLineNumber();
	}

	public static int method5() {
		StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
		System.out.println(stackTraceElements[2].getLineNumber());
		// System.out.println(stackTraceElements[1].getLineNumber());
		return stackTraceElements[2].getLineNumber();
	}
}
