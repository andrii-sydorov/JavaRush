package lecture_08;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде:
 * "May is the 5 month". Используй коллекции.
 * 
 * @author SMD_ASY
 *
 */
public class MonthName {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String month = bf.readLine();
		String[] arStr = { "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER",
				"OCTOBER", "NOVEMBER", "DECEMBER" };
		List<String> ls = new ArrayList<String>(Arrays.asList(arStr));
		int index = 0;
		for (int i = 0; i < ls.size(); i++) {
			if (ls.get(i).equalsIgnoreCase(month)) {
				index = i + 1;
				break;
			}
		}
		System.out.println(month + " is the " + index + " month");
	}

}
