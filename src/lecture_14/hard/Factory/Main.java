package lecture_14.hard.Factory;

/**
 * ����� ������� ������� (Factory) �� ������������ ��� (Hen):
 * 
 * ������ ����� Hen. 
 * 	������ ��� �����������. 
 * 	������ � ����� ����������� ����� int getCountOfEggsPerMonth(). 
 * 	������ � ����� ����� String getDescription(),������� ���������� ������ "� - ������.". 
 * ������ ����� RussianHen, ������� ����������� �� Hen. 
 * ������ ����� UkrainianHen, ������� ����������� �� Hen.
 * ������ ����� MoldovanHen, ������� ����������� �� Hen. 
 * ������ ����� BelarusianHen, ������� ����������� �� Hen. 
 * � ������ �� ������� ��������� ������� ������ ���� ���������� ������ getCountOfEggsPerMonth. ������ ������
 * ���������� ���������� ��� � ����� �� ������� ���� �����. 
 * � ������ �� ������� ��������� ������� ������ ���� ���������� ������ getDescription.
 * 
 * ������ ������ ���������� ������ ����: <getDescription() ������������� ������>
 * + <" ��� ������ - Sssss. � ���� N ��� � �����."> ��� Sssss - �������� ������
 * ��� N - ���������� ��� � ����� � ������ HenFactory �������� ����� getHen,
 * ������� ���������� ��������������� ������ ������ ���. ��� ��������� ������
 * ������ ���� � ��������� ������.
 * 
 * @author SMD_ASY
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hen hen = HenFactory.getHen(Country.MOLDOVA);
		System.out.println(hen.getCountOfEggsPerMonth());
		System.out.println(hen.getDescription());
	}

	static class HenFactory {

		static Hen getHen(String country) {
			Hen hen = null;
			if (country.equals("Belarus")) {
				hen = new BelarusianHen();
			} else if (country.equals("Russia")) {
				hen = new RussianHen();
			} else if (country.equals("Ukraine")) {
				hen = new UkrainianHen();
			} else {
				hen = new MoldovanHen();
			}
			return hen;
		}
	}

}
