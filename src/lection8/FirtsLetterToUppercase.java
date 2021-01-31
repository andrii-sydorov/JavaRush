package lection8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * �������� ���������, ������� ������ � ���������� ������ ������. ���������
 * �������� � ������ ������ ����� ���� ���� �� ���������. ������� ��������� ��
 * �����.
 * 
 * @author SMD_ASY
 *
 */
public class FirtsLetterToUppercase {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String line = bf.readLine();
		String[] tempStr = line.trim().split("\\s+");
		for (int i = 0; i < tempStr.length; i++) {
			char[] tempCh = tempStr[i].toCharArray();
			tempCh[0] = Character.toUpperCase(tempCh[0]);
			tempStr[i] = new String(tempCh);
		}
		System.out.println(String.join(" ", tempStr));
	}

}
