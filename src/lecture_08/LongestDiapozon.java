package lecture_08;

import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Iterator;

/**
 * 1. ������ ������ �����. 
 * 2. ������ � ������ 10 ����� � ����������. 
 * 3. ������� �� ����� ����� ����� ������� ������������������ ������������� ����� � ������.
 * 
 * ������ ��� ������ 2, 4, 4, 4, 8, 8, 4, 12, 12, 14: 
 * 
 * 3
 * 
 * ������� �������� ����� 3, �.�. ����� ������� ������������������ �������������
 * ����� ������� �� ���� �������
 * 
 * @author SMD_ASY
 *
 */
public class LongestDiapozon {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter your's value: ");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> ls = new ArrayList<Integer>();
		final int n = 10;
		for (int i = 0; i < n; i++) {
			ls.add(Integer.valueOf(bf.readLine()));
		}
		int numberOfRepeatElements = 1;
		Iterator<Integer> it = ls.iterator();
		boolean start = true;
		int previousElement = 0;
		int nextElement = 0;
		int tempMax = 0;
		while (it.hasNext()) {
			if (start) {
				previousElement = it.next();
				start = false;
				continue;
			}
			nextElement = it.next();
			if (nextElement == previousElement) {
				previousElement = nextElement;
				numberOfRepeatElements++;
			} else {
				if (numberOfRepeatElements >= tempMax) {
					tempMax = numberOfRepeatElements;
				}
				previousElement = nextElement;
				numberOfRepeatElements = 1;
			}
		}
		int answer = (tempMax >= numberOfRepeatElements ? tempMax : numberOfRepeatElements);
		System.out.println(answer);
	}

}
