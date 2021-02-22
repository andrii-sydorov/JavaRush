package lecture_13.hard;

import java.util.ArrayList;
import java.util.List;

/**
 * ����� ������� ��������� �� ������� ������ "�����":
 * 
 * �������� ��������� RepkaItem � ������ Person. � ������ Person �������� �����
 * pull(Person person), ������� ������� ����� ���� '<name> �� <person>'.
 * 
 * ������: ����� �� ����� 
 * ����� �� �����
 * 
 * ������� ���������� ������ ����� � ������ tell ������ RepkaStory.
 * 
 * ������� ����� main � ����������� �������!
 * 
 * @author ASY
 *
 */
public class RepkaTale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> plot = new ArrayList<Person>();
		plot.add(new Person("�����", "�����"));
		plot.add(new Person("�����", "�����"));
		plot.add(new Person("�����", "�����"));
		plot.add(new Person("������", "������"));
		RepkaStory.tell(plot);
	}

	public interface RepkaItem {
		void pull(Person person);
	}

	public static class Person implements RepkaItem {
		String name;
		String person;

		Person(String name, String person) {
			this.name = name;
			this.person = person;
		}

		public void pull(Person person) {
			System.out.println(this.name + "��" + this.person);
		}

	}

	static class RepkaStory {
		public static void tell(List<Person> ls) {
			for (int i = ls.size() - 1; i > 0; i--) {
				System.out.println(ls.get(i).name + " �� " + ls.get(i - 1).person);
			}
		}
	}

}
