package lecture_15.middle;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * � ���� ������ ���� �����:
 * 
 * � ����������� ����� ������� � ������� � � � � ��� ���������� � ����� int.
 * ���������� IOException � ����� catch. 
 * ������� ����� ����� ������� close().
 * 
 * @author SMD_ASY
 *
 */

public class StaticInit {
	// ������������� �� ���������
	public static int A;
	public static int B;
	// ����������� ����������� ���������� ������ ���������� ������ �� ������������� � ������
	static {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try {
			A = Integer.valueOf(bf.readLine());
			B = Integer.valueOf(bf.readLine());
		} catch (IOException ioe) {

		}
	}

	public static int min = MIN(A, B);

	public static void main(String[] args) {
		System.out.println(min);
	}

	public static int MIN(int a, int b) {
		return a >= b ? b : a;
	}
}
