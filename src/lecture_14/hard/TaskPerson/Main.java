package lecture_14.hard.TaskPerson;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	/**
	 * ����� ������� ���������, ������� ���������, ��� �������� ���� ��� �����
	 * ��������. ��� ����� �����:
	 * 
	 * ������ [� �����] � ���������� ��������� ����� (������). 
	 * ������ (�����) ����� ���� ������: "user", "loser", "coder", "proger". 
	 * ���� �������, ����� ������ �� ��������� �� � ����� �� ���� ���������.
	 * 
	 * ��� ������ ��������� ������ �����: 
	 * 	������� ��������������� ������ [��.Person.java], ��������, ��� ������ "user" ����� ������� ������ ������ User.
	 * 	�������� ���� ������ � ����� doWork. 
	 * 
	 * �������� ���������� ������ doWork, �������: 
	 * 	�������� ����� live() � ����������� �������, ���� ���� ������ (person) ����� ��� User. 
	 * 	�������� ����� doNothing(), ���� person ����� ��� Loser. 
	 * 	�������� ����� writeCode(), ���� person ����� ��� Coder. 
	 * 	�������� ����� enjoy(), ���� person ����� ��� Proger.
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		System.out.println("Enter your style of life:");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Person person = null;
		metka: while (true) {
			String key = bf.readLine();
			switch (key) {
			case "user":
				person = new Person.User();
				break;
			case "loser":
				person = new Person.Loser();
				break;
			case "coder":
				person = new Person.Coder();
				break;
			case "proger":
				person = new Person.Proger();
				break;
			default:
				break metka;
			}
			doWork(person);
		}

	}

	public static void doWork(Person person) {
		if (person instanceof Person.User) {
			Person.User user = (Person.User) person;
			user.live();
		} else if (person instanceof Person.Loser) {
			Person.Loser loser = (Person.Loser) person;
			loser.doNothing();
		} else if (person instanceof Person.Coder) {
			Person.Coder coder = (Person.Coder) person;
			coder.writeCode();
		} else if (person instanceof Person.Proger) {
			Person.Proger proger = (Person.Proger) person;
			proger.enjoy();
		}
	}

}
