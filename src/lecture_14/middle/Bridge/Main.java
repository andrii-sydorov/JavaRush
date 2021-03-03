package lecture_14.middle.Bridge;

/**
 * � ���� ������ ���� �����:
 * 
 * ������� ��������� Bridge � ������� int getCarsCount(). 
 * ������� ������ WaterBridge � SuspensionBridge, ������� ��������� ��������� Bridge. 
 * ����� getCarsCount() ������ ���������� ����� ������������� �������� ���� int. 
 * ����� getCarsCount() ������ ���������� ��������� �������� ��� ��������� �������. 
 * � ������ Solution ������� ��������� ����� println(Bridge bridge). 
 * � ������ println() ������� �� ������� �������� getCarsCount() ��� ������� bridge.
 * ������ ����� � ��������� ������ ���� � ��������� ������.
 * 
 * @author SMD_ASY
 *
 */
public class Main {

	public static void main(String[] args) {
		println(new WaterBridge());
		println(new SuspensionBridge());

	}

	public static void println(Bridge bridge) {
		System.out.println(bridge.getCarsCount());
	}

}
