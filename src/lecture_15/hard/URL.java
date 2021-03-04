package lecture_15.hard;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * ��� ������� ���� ������ ���� �����:
 * 
 * ������� � ������� URL-������. 
 * ������� �� ����� ������ ���� ���������� ����� ������ (��������� ���� ����� ? � ����������� &, ��������, lvl=15). URL
 * �������� ������� 1 ��������. �������� ��������� ����� � ��� �� ������������������, � ������� ��� ������������ � URL. 
 * ���� ������������ �������� obj, �� �������� ��� �������� � ������ ����� alert(): 
 * alert(double value) - ��� ����� (������� ����� ����������� ������); 
 * alert(String value) - ��� �����. 
 * ������ �������� �� ��, ��� ����� alert() ���������� �������� ����� ������ ������ ���� ���������� �� �����.
 * 
 * ������ 1
 * 
 * ����: http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
 * 
 * �����: 
 * lvl view name
 * 
 * ������ 2
 * 
 * ����: http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
 * 
 * �����: 
 * obj name 
 * double: 3.14
 * 
 * @author SMD_ASY
 *
 */

public class URL {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String url = bf.readLine();
		bf.close();
		String[] tempValues = url.substring(url.indexOf("?") + 1).split("&");
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		for (int i = 0; i < tempValues.length; i++) {
			if (tempValues[i].contains("obj")) {
				sb2.append(tempValues[i] + " ");
			}
			if (tempValues[i].contains("=")) {
				sb1.append(tempValues[i].substring(0, tempValues[i].indexOf("=")) + " ");
			} else {
				sb1.append(tempValues[i] + " ");
			}
		}
		System.out.println(sb1.toString().trim());

		if (sb2.length() != 0) {
			String[] objCon = sb2.toString().split(" ");
			for (int i = 0; i < objCon.length; i++) {
				String tempString = objCon[i].substring(objCon[i].indexOf("=") + 1);
				try {
					double temp = Double.valueOf(tempString);
					alert(temp);
				} catch (NumberFormatException nfe) {
					alert(tempString);
				}
			}
		}
	}

	public static void alert(double value) {
		System.out.println("double: " + value);
	}

	public static void alert(String value) {
		System.out.println("String: " + value);
	}

}
