package lection8;

import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * ������: ��������� ����������, ����� ����� (�������) ���� � ���� � ���������
 * �������. ����� ������: ��������� ������ �������� �� � �������� �����, � �
 * ��������:
 * 
 * ������ �����: ������ ������� ���� ������� ������ ����������
 * 
 * ������
 * 
 * ������ ������: ����������
 * 
 * @author SMD_ASY
 *
 */
public class DefineTown {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		List<String> ls = new ArrayList<>();
		while (true) {
			String temp = bf.readLine();
			if (temp.isEmpty()) {
				break;
			}
			ls.add(temp);
		}
		
		/*
		 * String city = reader.readLine();
		 * 
		 * if (map.containsKey(city)) {
		 * 	 	String familyName = map.get(city);
		 * 		System.out.println(familyName); 
		 * }
		 */

		String family = bf.readLine();
		for (int i = 0; i < ls.size(); i++) {
			if (ls.get(i).equals(family)) {
				System.out.println(ls.get(i + 1));
				break;
			}
		}
	}

}
