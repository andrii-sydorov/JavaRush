package lection9;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

/**
 * ¬веди с клавиатуры 20 слов в список. ѕосчитай, сколько раз каждое из них
 * встречаетс€ в списке. –езультат нужно представить в виде словар€ Map<String,
 * Integer>, где первый параметр - уникальное слово, а второй - число раз,
 * сколько раз данное слово встречалось в списке.
 * 
 * ¬ыведи содержимое словар€ на экран. ¬ тестах регистр (больша€/маленька€
 * буква) вли€ет на результат.
 * 
 * @author SMD_ASY
 *
 */
public class NumberOfWords {

	public static void main(String[] args) throws IOException {
		// making words input
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		List<String> words = new ArrayList<>();
		final int n = 20;
		for (int i = 0; i < n; i++) {
			words.add(bf.readLine());
		}
		// building map
		Map<String, Integer> map = countWords(words);
		// printing map
		Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
//	while(it.hasNext()) {
//		Map.Entry<String, Integer> iter = it.next();
//		System.out.println(iter.getKey() + " " + iter.getValue());
//	}
		for (Map.Entry<String, Integer> pair : map.entrySet()) {
			System.out.println(pair.getKey() + " " + pair.getValue());
		}

	}

	public static Map<String, Integer> countWords(List<String> words) {
		List<String> cloneList = new ArrayList<>(words);
		Map<String, Integer> map = new HashMap<>();
		while (!words.isEmpty()) {
			String temp = words.get(0);
			int count = 0;
			while (words.contains(temp)) {
				count++;
				words.remove(temp);
			}
			map.put(temp, count);
			int test = map.getOrDefault(temp, 0);
		}
		return map;
	}

}
