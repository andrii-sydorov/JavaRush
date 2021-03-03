package lecture_14.middle.Computer;

/**
 * ����� ������� ���������. ��� ��� ���� ����� �������:
 * 
 * ������ ��������� CompItem. ������ � ���� ����� String getName(). 
 * ������ ������ Keyboard, Mouse, Monitor, ������� ��������� ��������� CompItem. 
 * ����� getName() ������ ���������� ��� ������, ��������, ��� ������ Keyboard �����
 * "Keyboard". 
 * ������ ����� Computer. 
 * � ����� Computer ������ ��������� ���� keyboard ���� Keyboard. 
 * � ����� Computer ������ ��������� ���� mouse ���� Mouse. 
 * � ����� Computer ������ ��������� ���� monitor ���� Monitor. 
 * ������ ����������� � ����� ����������� � ������ Computer ��������� ���������� ������ Alt+Insert (��� Windows) ������ ������ (������� Constructor). 
 * ������ ������������ ��������������� ��� ��� ���� (����������) ������ � ������������ � ����������� �����������. 
 * ������ ������� ��� ����� ������ Computer (� ������ ��������� ���������� ������ Alt+Insert (��� Windows) � ������ ������� Getter). 
 * ��� ��������� ������ � ��������� ������ ���� � ��������� ������.
 * 
 * @author SMD_ASY
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer computer = new Computer(new Keyboard(), new Mouse(), new Monitor());
		if (isWork(computer.getKeyboard()) && isWork(computer.getMonitor()) && isWork(computer.getMouse())) {
			System.out.println("Work!");
		}
	}

	public static boolean isWork(CompItem item) {
		System.out.println(item.getName());
		return item.getName() != null && item.getName().length() > 4;
	}
}
