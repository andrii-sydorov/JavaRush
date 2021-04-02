package lecture_14.hard;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Давай найдем наибольший общий делитель (НОД). Для этого:
 * 
 * Введи с клавиатуры 2 целых положительных числа. Выведи в консоли наибольший
 * общий делитель.
 * 
 * @author ASY
 *
 */
public class NOD {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int firstNumber = 0;
		int secondNumber = 0;
		try{
			firstNumber = Integer.valueOf(bf.readLine());
			secondNumber = Integer.valueOf(bf.readLine());
		} catch(NumberFormatException e) {		
		}
		if(firstNumber < 0 || secondNumber < 0) {
			throw new MyException("the negative value were dected");
		}
		bf.close();
		System.out.println(nod(firstNumber, secondNumber));
	}
	
	public static class MyException extends Exception{
		public MyException (String message) {
			super(message);
		}
	}
	
	public static int nod(int firstNumber, int secondNumber) {
		int ans = 0;
		for(int i = 1; i <= Math.min(firstNumber, secondNumber); i ++) {
			if(firstNumber % i == 0 && secondNumber % i == 0) {
				ans = i;
			}
		}
		return ans;
	}
	/*
	 * int nod(int a, int b) {
        return b == 0 ? a : nod(b, a % b);
        }
        
        private static int getNOD(int first, int second) {
        	if (first < 1 || second < 1) {
            throw new IllegalArgumentException();
        	}

        	while (first != second) {
            if (first > second) {
                first -= second;
            	}
            if (second > first) {
                second -= first;
            	}
        	}
       return first;
    }
	 */
}
