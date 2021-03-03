package lecture_15.middle;

/**
 * ����� ���� ������ � �������� �� � ���������� ��������� � ��������� ���
 * ������� ���� � � ������ ���������. ��� ������ ��������� ������ ���������� ��
 * ������ Constants.
 * 
 * 	� ������ Ferrari �������� ����� printlnDesire, ����� �� ������� �� ����� "�
 * ���� ������ �� �������".
 *  � ������ Lanos �������� ����� printlnDesire, ����� �� ������� �� ����� "� ���� ������ �� ������".
 *  ������ public static ����� LuxuriousCar (���������������).
 *  ������ public static ����� CheapCar (�������������).
 *  ��������� Ferrari � Lanos �� CheapCar � LuxuriousCar, �������, ����� ����� ��� ����.
 *  � ������ LuxuriousCar �������� ����� printlnDesire, ����� �� ������� �� ����� "� ���� ������ �� ��������� ������".
 * 	� ������ CheapCar ���������� ����� printlnDesire, ����� �� ������� �� ����� "� ���� ������ �� ������� ������".
 *  � ������� LuxuriousCar � CheapCar ��� ������ printlnDesire �������� ���������� ��������� ������������ ������� ���,
 * ����� � ������� Ferrari � Lanos ����������� ���������� ���������.
 * 
 * @author SMD_ASY
 *
 */
public class CarOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CarOverriding.LuxuriousCar().printlnDesire();
		new CarOverriding.CheapCar().printlnDesire();
		new CarOverriding.Ferrari().printlnDesire();
		new CarOverriding.Lanos().printlnDesire();
	}

	public static class LuxuriousCar {
		protected void printlnDesire() {
			System.out.println(Constants.WANT_STRING + "" + Constants.LUXURIOUS_CAR);
		}
	}

	public static class CheapCar {
		protected void printlnDesire() {
			System.out.println(Constants.WANT_STRING + "" + Constants.CHEAP_CAR);
		}
	}

	public static class Ferrari extends LuxuriousCar {
		@Override
		public void printlnDesire() {
			System.out.println(Constants.WANT_STRING + "" + Constants.FERRARI_NAME);
		}
	}

	public static class Lanos extends CheapCar {
		@Override
		public void printlnDesire() {
			System.out.println(Constants.WANT_STRING + "" + Constants.LANOS_NAME);
		}
	}

	public static class Constants {
		public static String WANT_STRING = "� ���� ������ �� ";
		public static String LUXURIOUS_CAR = "��������� ������";
		public static String CHEAP_CAR = "������� ������";
		public static String FERRARI_NAME = "�������";
		public static String LANOS_NAME = "������";
	}

}
