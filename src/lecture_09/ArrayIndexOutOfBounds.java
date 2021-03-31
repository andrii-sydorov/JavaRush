package lecture_09;

public class ArrayIndexOutOfBounds {
	/**
	 * Перехватить исключение (и вывести его на экран), указав его тип, возникающее
	 * при выполнении кода: 
	 * int[] m = new int[2]; 
	 * m[8] = 5;
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] m = new int[2];
		try {
			m[8] = 5;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
}
