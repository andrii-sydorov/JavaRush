package lecture_08;

import java.util.Calendar;
import java.util.Date;

/**
 * 1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true,
 * если количество дней с начала года - нечетное число, иначе false 
 * 2. String date передается в формате FEBRUARY 1 2013 
 * Не забудь учесть первый день года.
 * 
 * @author SMD_ASY
 *
 */
public class IsDayOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isDateOdd("MAY 1 2013"));
	}

	public static boolean isDateOdd(String line) {
		String[] data = line.split("\\s+");
		int month = 0;
		String[] monthSt = { "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER",
				"OCTOBER", "NOVEMBER", "DECEMBER" };
		int index = 0;
		while (!data[0].equals(monthSt[index])) {
			index++;
			month++;
		}
		Date stop = new Date(Integer.valueOf(data[2]), month, Integer.valueOf(data[1]));
		Date start = new Date(Integer.valueOf(data[2]), 0, 1);
		long days = (stop.getTime() - start.getTime()) / (3600 * 1000 * 24);
		System.out.println(days);
		return days % 2 == 0 ? true : false;
	}
}
