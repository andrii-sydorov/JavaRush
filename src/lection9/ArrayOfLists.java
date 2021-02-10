package lection9;

import java.util.ArrayList;

/**
 * ������ ������, ���������� �������� ����� ������ �����. ������� ������ ������
 * ������� � ������ �� �� �����.
 * 
 * @author SMD_ASY
 *
 */
public class ArrayOfLists {

	public static void main(String[] args) {
		ArrayList<String>[] arrayOfStringList = createList();
		printList(arrayOfStringList);
	}

	public static ArrayList<String>[] createList() {
		// �������� ��� ��� ���
		final int n = 3;
		ArrayList<String>[] result = new ArrayList[n];
		char ch = 'A';
		for (int i = 0; i < n; i++) {
			result[i] = new ArrayList<String>();
			for (int j = 0; j < 10; j++) {
				result[i].add(Character.toString(ch));
				ch++;
			}
		}
		return result;
	}

	public static void printList(ArrayList<String>[] arrayOfStringList) {
		for (ArrayList<String> list : arrayOfStringList) {
			for (String string : list) {
				System.out.println(string);
			}
		}
	}

}
