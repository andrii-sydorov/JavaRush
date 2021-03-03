package lecture_14.middle.WineDegustation;

/**
 * ������� ����������� ����� Drink � ������������� ������� public void taste(),
 * ������� ������� � ������� "������". 
 * ������� ����� Wine, ����������� �� Drink,� ������������� ������� public String getHolidayName(), ������� ����������
 * ������ "���� ��������". 
 * ������� ����� BubblyWine, ����������� �� Wine, � ������������� ������� public String getHolidayName(), ������� ����������
 * ������ "����� ���". 
 * �������� ���������� ������� getDeliciousDrink, getWine, getBubblyWine. 
 * ��� ������ ������ ���������� � ��������� ������.
 * 
 * @author SMD_ASY
 *
 */
public class Main {
	public static void main(String[] args) {
		getDeliciousDrink().taste();
		System.out.println(getWine().getHolidayName());
		System.out.println(getBubblyWine().getHolidayName());
		System.out.println(getWine().getHolidayName());
	}

	public static Drink getDeliciousDrink() {
		return new Wine();
	}

	public static Wine getWine() {
		return new Wine();
	}

	public static Wine getBubblyWine() {
		return new BubblyWine();
	}
}
