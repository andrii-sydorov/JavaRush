package lection9;

public class DepthOfStackTrace {
	/**
	 * �������� �����, ������� ���������� ��������� - ������� ��� ����-������ -
	 * ���������� ������� � ��� (���������� ��������� � ������). ��� �� ����� �����
	 * ������ �������� �� �����.
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
