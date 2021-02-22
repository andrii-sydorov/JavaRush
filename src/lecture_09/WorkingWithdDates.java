package lecture_09;

import java.util.Date;
import java.util.Locale;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * ������ � ���������� ���� � ������� "2013-08-18" ������� �� ����� ���������
 * ���� � ���� "AUG 18, 2013". ��������������� �������� Date � SimpleDateFormat.
 * 
 * @author SMD_ASY
 *
 */
public class WorkingWithdDates {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat inputFormat = new SimpleDateFormat(pattern, Locale.ENGLISH);
		String date = bf.readLine();
		Date d = inputFormat.parse(date);
		SimpleDateFormat outputFormat = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
		System.out.println(outputFormat.format(d).toUpperCase());
	}
}
