package lecture_15.middle;

/**
 * � ����������� ����� ������� Exception. �����, ����� ����� �� ����������, �
 * ������ �������� ���������� B ��������� ��������� �� ������: Exception in
 * thread "main" java.lang.ExceptionInInitializerError at
 * java.lang.Class.forName0(Native Method) at
 * java.lang.Class.forName(Class.java:186) at
 * com.intellij.rt.execution.application.AppMain.main(AppMain.java:113) Caused
 * by: java.lang.RuntimeException: at
 * com.javarush.task.task15.task1517.Solution.<clinit>(Solution.java:22)
 * 
 * @author SMD_ASY
 *
 */
public class StaticException {

	public static int A = 0;
	
	static {
		if (true) throw new RuntimeException("");
	}

	public static int B = 5;
	// ������ �������, ��� ���� ����������� ����, ������ ���� ����� ������������� ����� ������.
	static {
		int res = B / A;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(B);
	}

}
