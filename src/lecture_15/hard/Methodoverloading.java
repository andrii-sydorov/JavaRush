package lecture_15.hard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * � ���� ������ ���� �����:
 * 
 * ��������� � ������� ������, ���� �� ����� ������� ����� "exit". 
 * ��� ������� ��������, ����� "exit", ������� ����� print().
 * ���� ��������: �������� ����� '.', ������� ����� print() ��� Double; 
 * ������ ����, �� ������ 128, ������� ����� print() ��� short; 
 * ������ ���� ����� ���� ��� ������ ���� ����� 128, ������� ����� print() ��� Integer; 
 * ����� � ������� ����� print() ��� String.
 * 
 * @author SMD_ASY
 *
 */

public class Methodoverloading {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter your's value:");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String value = null;
		while (!(value = bf.readLine()).equals("exit")) {
			double valueDouble = 0;
			try {
				valueDouble = Double.valueOf(value);
			} catch (NumberFormatException nfe) {
				print(value);
				continue;
			}
			if (value.contains(".")) {
				print(valueDouble);
			} else if (Integer.valueOf(value) > 0 && Integer.valueOf(value) < 128) {
				print(Short.valueOf(value));
			} else {
				print(Integer.valueOf(value));
			}
		}

	}

	public static void print(Double value) {
		System.out.println("��� ��� Double, �������� " + value);
	}

	public static void print(String value) {
		System.out.println("��� ��� String, �������� " + value);
	}

	public static void print(short value) {
		System.out.println("��� ��� short, �������� " + value);
	}

	public static void print(Integer value) {
		System.out.println("��� ��� Integer, �������� " + value);
	}

}
