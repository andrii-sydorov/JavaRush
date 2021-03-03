package lecture_15.middle.Overload;

import java.math.*;

/**
 * ��� ������� ���� ������:
 * 
 * 	��� ���� ��������� � ������ Tree ����� info(Object s) ���, ����� ����������
 * ��� ������: info(Object s), info(Number s), info(String s). 
 * 	��������� � ������ info(Object s).
 *  ������ �� �������� ���������� ����� �������.
 *  ��������, ��� ������ info(Number s) ��������� ����� ���� �����: "������ � 123 , ����� Number, �������� Short".
 * 
 * @author SMD_ASY
 *
 */

public class Main {
	public static void main(String[] args) {
		// ���� 2.
		// ����� ��� Object
		new Tree().info((Object) new Integer("4"));
		new Tree().info((Object) new Short("4"));
		new Tree().info((Object) new BigDecimal("4"));

		// ���� 3.
		// ����� ��� Number
		new Tree().info(new Integer("4"));
		new Tree().info(new Short("4"));
		new Tree().info(new BigDecimal("4"));

		// ���� 4.
		// ����� ��� String
		new Tree().info(new String("4"));
		new Tree().info(new Integer("4").toString());
		new Tree().info(new Short("4").toString());
		new Tree().info(new BigDecimal("4").toString());
	}
}
