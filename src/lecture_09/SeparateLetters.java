package lecture_09;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * Программа должна вывести на экран две строки: 
 * 1. первая строка содержит только гласные буквы из введённой строки. 
 * 2. вторая - только согласные буквы и знаки препинания из введённой строки. Буквы соединять пробелом, каждая
 * строка должна заканчиваться пробелом. 
 * Пример ввода: 
 * Мама мыла раму.
 * 
 * Пример вывода: 
 * а а ы а а у 
 * М м м л р м .
 * 
 * @author SMD_ASY
 *
 */

public class SeparateLetters {

	public static char[] vowels = new char[] { 'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё' };

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
		character = Character.toLowerCase(character); // приводим символ в нижний регистр - от заглавных к строчным
														// буквам
		for (char vowel : vowels) { // ищем среди массива гласных
			if (character == vowel) {
				return true;
			}
		}
		return false;
	}
}
