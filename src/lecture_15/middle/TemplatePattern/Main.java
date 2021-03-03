package lecture_15.middle.TemplatePattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.io.IOException;

/**
 * � ���� ������ ���� �����:
 * 
 *  � ��������� ����� ������� ����� DrinkMaker � ����� ������������ ��������:
 * void getRightCup() - ������� ���������� �����; void putIngredient() -
 * �������� �����������; void pour() - ������ ��������.
 *  � ������ DrinkMaker ������� � ����������� ����� void makeDrink(), ������� ������� ������� � �����
 * ������������������: �������� �����, ������ �����������, �������� ��������.
 *  � ��������� ������ ������� ������ LatteMaker � TeaMaker, ������� ����������� �� DrinkMaker. 
 * 	������������ ��������� ����� ����� ����� �������� � ������� LatteMaker � TeaMaker: "�������� ��������" "����� ����� ��� �����" "��������
 * ���" "����� ����� ��� ���" "�������� ������� � ������" "������ ����".
 * ������ ����� ������ �������� � ������� ���� �����, �� ����������� � ������� ��������
 * 
 * @author SMD_ASY
 *
 */

public class Main {

	public static void main(String[] args) throws IOException {
		DrinkMaker dm = null;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String key = bf.readLine();
		switch (key) {
		case "tea":
			dm = new TeaMaker();
			break;
		case "latte":
			dm = new LatteMaker();
			break;
		default:
			break;
		}
		for (Method m : dm.getClass().getMethods()) {
			System.out.println(m.getName());
		}
	}

}
