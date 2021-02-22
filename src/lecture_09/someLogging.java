package lecture_09;

public class someLogging {
	/**
	 * ����������� ����� log. �� ������ �������� �� ����� ��� ������ � ��� ������ (�
	 * ������� ���������� ����� log), � ����� ���������� ���������. ��� ������, ���
	 * ������ � ��������� ��������� ���������� � ��������.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log("In main method");
	}

	public static void log(String text) {
		StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
		String[] array = new String[3];
		array[0] = stackTraceElements[2].getClassName();
		array[1] = stackTraceElements[2].getMethodName();
		array[2] = text;
		System.out.println(String.join(": ", array));
	}

}
