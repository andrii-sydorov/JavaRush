package lecture_15.middle;

/**
 * � ���� ������ ���� �����:
 * 
 * ������� 7 public ����� ������:
 *  intVar ���� int doubleVar ����
 *  double DoubleVar ���� Double 
 *  booleanVar ���� boolean 
 *  ObjectVar ���� Object
 *  ExceptionVar ���� Exception
 *  StringVar ���� String
 * ���������, ��� ��� ���������������� ���������� ����������. ������� �� �������� � ��������
 * ������� � ������ main()
 * 
 * @author SMD_ASY
 *
 */

public class ClassFiled {
	// ���������� ���������� ������
	// ���������� ������ ������ ���������������� ���������� �� ���������, �� ����� ����������� ��� ��� ���.
	int intVar;
	double doubleVar;
	Double DoubleVar;
	boolean booleanVar;
	Object ObjectVar;
	Exception ExceptionVar;
	String StringVar;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassFiled cs = new ClassFiled();
		System.out.println(cs.intVar);
		System.out.println(cs.doubleVar);
		System.out.println(cs.DoubleVar);
		System.out.println(cs.booleanVar);
		System.out.println(cs.ObjectVar);
		System.out.println(cs.ExceptionVar);
		System.out.println(cs.StringVar);
	}

}
