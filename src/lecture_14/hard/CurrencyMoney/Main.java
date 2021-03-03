package lecture_14.hard.CurrencyMoney;

import java.util.List;
import java.util.ArrayList;

/**
 * ������� ���������������� ���������, ������� �������� ����������� �����������
 * � ��������.
 * 
 * 	� ����������� ������ Money ������ ��������� ���� amount ���� double. 
 * 	������ ��������� ������ ��� ���� amount(public double getAmount()), ����� � �����
 * ���� ����� ���� �������� ������ ����� ������ Money. 
 * 	� ��������� ������ ������ ������ Hryvnia, Ruble � USD, ������� ����� �������� ��������� ������ Money.
 *  � ������� Hryvnia, Ruble � USD �������� ����� getCurrencyName() ������� �����
 * ���������� �������� ��������������� ������ (������) � ���� ������������ (USD,
 * UAH, RUB).
 *  � ������� Hryvnia, Ruble � USD �������� ��������� (public) �����������, ������� ��������� ���� �������� � �������� ����������� ��������
 * ������ (super) � ���� ����������.
 *  ������� ������ allMoney ��������� ���� ��������� � ������ ������� ������ � ���������������� ��������� �����.
 * 
 * @author ASY
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person ivan = new Person("����");
		for (Money money : ivan.getAllMoney()) {
			System.out.println(
					ivan.name + " ����� ������� � ������� " + money.getAmount() + " " + money.getCurrencyName());
		}
	}

	public static class Person {

		String name;
		private List<Money> allMoney;

		Person(String name) {
			this.name = name;
			this.allMoney = new ArrayList<Money>();
			allMoney.add(new Hryvnia(100));
			allMoney.add(new Ruble(50));
			allMoney.add(new USD(25));
		}

		public List<Money> getAllMoney() {
			return allMoney;
		}
	}

}
