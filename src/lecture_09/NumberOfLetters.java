package lecture_09;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.IOException;

public class NumberOfLetters {
	/**
	 * ����� � ���������� 10 ������� � �������� � ��� ���������� ��������� ���� ���
	 * ����� ��������. ��������� ������ �� ����� � ���������� �������.
	 * 
	 * ������ ������: 
	 * � 5 
	 * � 8 
	 * � 3 
	 * � 7 
	 * � 0 
	 * ... 
	 * � 9
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		// making list alphabet
		List<Character> alphabet = Arrays.asList('�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�',
				'�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�');
		// entering the words
		ArrayList<String> list = new ArrayList<>();
		final int n = 10;
		for (int i = 0; i < n; i++) {
			list.add(bf.readLine().toLowerCase());
		}
		// making array of Character from ArrayList<String>
		String line = "";
		char[] tempArray = null;
		for (int i = 0; i < list.size(); i++) {
			line += list.get(i);
		}
		tempArray = line.toCharArray();
		// looking for numbers of letters
		for (int j = 0; j < alphabet.size(); j++) {
			int count = 0;
			for (int k = 0; k < tempArray.length; k++) {
				if (alphabet.get(j) == tempArray[k]) {
					count++;
				}
			}
			System.out.println(alphabet.get(j) + " " + count);
		}
	}

}
