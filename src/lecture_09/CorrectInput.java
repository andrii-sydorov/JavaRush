package lecture_09;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;

/**
 * �������� ���������, ������� ����� ������� ����� � ����������. ��� �� ������
 * ����� � ���������� ������ ���� � ������ readData. ��� ������ readData
 * �������� � try..catch. ���� ������������ ��� �����-�� �����, ������ �����
 * �����, �� ����� ������ ����������� ���������� � ������� �� ����� ��� �����
 * ��������� ����� � �������� ����������. ����� �������� � ����� ������ ��������
 * ������� �����.
 * 
 * @author SMD_ASY
 *
 */
public class CorrectInput {
	public static void main(String[] args) {
		readData();
	}

	public static void readData() {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> ls = new ArrayList<Integer>();
		while (true) {
			try {
				ls.add(Integer.parseInt(bf.readLine()));
			} catch (IOException ie) {
			} catch (NumberFormatException nfe) {
				for (int i = 0; i < ls.size(); i++) {
					System.out.println(ls.get(i));
				}
				break;
			}
		}
	}
}
