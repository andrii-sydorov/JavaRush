package lecture_14.middle.Singleton;

/**
 * �������� Singleton pattern:
 * 
 * 	������ ����� Singleton � ��������� �����. 
 * 	������ � ���� ����������� ����� getInstance(). 
 * 	��� ����� ������ ������ getInstance() �� ������ ���������� ���� � ��� �� ������ ������ Singleton.
 *  �������, ����� ������� ����� ��������� �������� ������ �������� ����� ������.
 *  ������ ��� ������������ � ������ Singleton ���������� (private).
 *  � ����� ������ ���� ����������� ������� ������ (��������� ������) ��������� ������ ����� getInstance
 * 
 * @author ASY
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object s = Singleton.getInstance();
		System.out.println(s);
	}

}
