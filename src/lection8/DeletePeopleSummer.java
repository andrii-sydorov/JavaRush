package lection8;

import java.util.Map;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.text.SimpleDateFormat;
import java.util.Iterator;

/**
 * ������� ������� (Map<String, Date>) � ������� � ���� ������ ������� ��
 * ��������: "�������" - "���� ��������". ������� �� ������� ���� �����,
 * ���������� �����.
 * 
 * @author SMD_ASY
 *
 */
public class DeletePeopleSummer {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Map<String, Date> mp = createMap();
		System.out.println("Before elimination the people, who was born at summer:");
		printMap(mp);
		System.out.println();
		removeAllSummerPeople(mp);
		System.out.println("After elimination people, who was born at summer:");
		printMap(mp);
	}

	public static Map<String, Date> createMap() throws ParseException {
		DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
		Map<String, Date> map = new HashMap<>();
		map.put("�������", dateFormat.parse("MAY 1 2012"));
		map.put("������", dateFormat.parse("APRIL 1 2012"));
		map.put("������", dateFormat.parse("JUNE 1 2012"));
		map.put("������", dateFormat.parse("DECEMBER 1 2012"));
		map.put("�������", dateFormat.parse("JULY 1 2012"));
		map.put("��������", dateFormat.parse("FEBRUARY 1 2012"));
		map.put("�������", dateFormat.parse("AUGUST 1 2012"));
		map.put("������", dateFormat.parse("SEPTEMBER 1 2012"));
		map.put("������", dateFormat.parse("MARCH 1 2012"));
		map.put("���������", dateFormat.parse("NOVEMBER 1 2012"));

		// �������� ��� ��� ���
		return map;
	}

	public static void removeAllSummerPeople(Map<String, Date> map) {
		Iterator<Map.Entry<String, Date>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Date> pair = it.next();
			if (pair.getValue().getMonth() > 4 && pair.getValue().getMonth() < 8) {
				it.remove();
			}
		}
	}

	public static void removeAllSummerPeopleTest(Map<String, Date> map) {
		Map<String, Date> copy = new HashMap<String, Date>(map);
		for (Map.Entry<String, Date> pair : copy.entrySet()) {
			Date tempDate = pair.getValue();
			String tempName = pair.getKey();
			if (tempDate.getMonth() > 4 && tempDate.getMonth() < 8) {
				map.remove(tempName);
			}
		}

//		for(String names : copy.keySet()) {
//			Date d = copy.get(names);
//            int month = d.getMonth() + 1;
//            if (month == 6 || month == 7 || month == 8) {
//            	map.remove(names);
//            }
//		}
	}

	public static void printMap(Map<String, Date> map) {
		Iterator<Map.Entry<String, Date>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Date> pair = it.next();
			System.out.println(pair.getKey() + " " + pair.getValue());
		}
	}

}
