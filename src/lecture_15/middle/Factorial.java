package lecture_15.middle;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.io.IOException;

/**
 * ������ �����, ������� ��������� ��������� - ������������ ���� ����� �� 1 ��
 * ���������� �����, ������� ���.
 * 
 * ������ ����������: 
 * 4! = factorial(4) = 1*2*3*4 
 * ������ ������: 
 * 24
 * 
 * ��� �����:
 * 
 * ����� � ������� ����� ������ ���� ����� 150. �������� ������� factorial. ����
 * ��������� ����� ������ 0, ������ 0.
 * 
 * 0! = 1
 * 
 * @author SMD_ASY
 *
 */

public class Factorial {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter your's number:");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(bf.readLine());
		System.out.println(fact(n));
	}

	public static String fact(int n) {
		if (n < 0) {
			return "0";
		}
		if (n <= 1) {
			return "1";
		}
		BigInteger pow = BigInteger.valueOf(1);
		for (int i = 2; i <= n; i++) {
			pow = pow.multiply(BigInteger.valueOf(i));
		}
		return String.valueOf(pow);
	}

}
