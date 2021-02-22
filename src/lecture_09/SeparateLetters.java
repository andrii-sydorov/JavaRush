package lecture_09;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * ��������� ������ ������� �� ����� ��� ������: 
 * 1. ������ ������ �������� ������ ������� ����� �� �������� ������. 
 * 2. ������ - ������ ��������� ����� � ����� ���������� �� �������� ������. ����� ��������� ��������, ������
 * ������ ������ ������������� ��������. 
 * ������ �����: 
 * ���� ���� ����.
 * 
 * ������ ������: 
 * � � � � � � 
 * � � � � � � .
 * 
 * @author SMD_ASY
 *
 */

public class SeparateLetters {

	public static char[] vowels = new char[] { '�', '�', '�', '�', '�', '�', '�', '�', '�', '�' };

	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		try {
			line += bf.readLine();
		} catch (IOException ie) {
		}
		String vowelsLine = "";
		String notVowelsLine = "";
		for (int i = 0; i < line.length(); i++) {
			if (line.charAt(i) == ' ') {
				continue;
			}
			if (isVowel(line.charAt(i))) {
				vowelsLine += Character.toString(line.charAt(i)) + " ";
			} else {
				notVowelsLine += Character.toString(line.charAt(i)) + " ";
			}
		}
		System.out.println(vowelsLine);
		System.out.println(notVowelsLine);
	}

	/**
	 * This method is checking, ob the letters vowel are
	 * 
	 * @param character
	 * @return
	 */
	public static boolean isVowel(char character) {
		character = Character.toLowerCase(character); // �������� ������ � ������ ������� - �� ��������� � ��������
														// ������
		for (char vowel : vowels) { // ���� ����� ������� �������
			if (character == vowel) {
				return true;
			}
		}
		return false;
	}
}
