package lecture_13.hard.RepkaTalePackage;

import java.util.List;
import java.util.ArrayList;

/**
 * ����� ������� ��������� �� ������� ������ "�����":
 * 
 * �������� ��������� RepkaItem � ������ Person. 
 * � ������ Person �������� ����� pull(Person person), ������� ������� ����� ���� '<name> �� <person>'.
 * 
 * ������: 
 * ����� �� ����� 
 * ����� �� ����� 
 * 
 * ������� ���������� ������ ����� � ������ tell ������ RepkaStory. 
 * 
 * ������� ����� main � ����������� �������!
 * 
 * @author ASY
 *
 */
public class Tale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> plot = new ArrayList<Person>();
		plot.add(new Person("�����", "�����"));
		plot.add(new Person("�����", "�����"));
		plot.add(new Person("�����", "�����"));
		plot.add(new Person("������", "������"));
		RepkaStory.tell(plot);
	}

}
