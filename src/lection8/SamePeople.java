package lection8;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class SamePeople {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "aleksei";
		String surname = "belonenko";
		Map<String, String> map = createMap();
		System.out.println(getCountTheSameFirstName(map, surname));
		System.out.println(getCountTheSameLastName(map, name));
	}

	public static Map<String, String> createMap() {
		Map<String, String> map = new HashMap<>();
		map.put("�������", "���������");
		map.put("������", "�������");
		map.put("��������", "�������");
		map.put("�������", "�����");
		map.put("�����", "������");
		map.put("�������", "�������");
		map.put("�������", "���������");
		map.put("������", "������");
		map.put("�������", "����");
		map.put("������", "�������");
		return map;
	}

	public static int getCountTheSameFirstName(Map<String, String> map, String name) {
		// �������� ��� ��� ���
		int count = 0;
		for (Map.Entry<String, String> pair : map.entrySet()) {
			if (pair.getValue().equals(name)) {
				count++;
			}
		}
		return count;
	}

	public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
		// �������� ��� ��� ���
		int count = 0;
		Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> pair = it.next();
			if (pair.getKey().equals(lastName)) {
				count++;
			}
		}
		return count;
	}
}
