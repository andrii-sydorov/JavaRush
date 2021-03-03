package lecture_15.middle.ConstructorOverload;

/**
 * Чтобы решить эту задачу:
 * 
 * Создай 4 конструктора с разными модификаторами доступа в классе Solution.
 * В отдельном файле создай класс SubSolution и сделай его потомком класса
 * Solution.
 * Внутри класса SubSolution создай конструкторы командой Alt+Insert -> Constructors.
 * Исправь модификаторы доступа конструкторов в SubSolution так, чтобы получилось 3 разных (все, кроме private).
 * 
 * @author SMD_ASY
 *
 */

public class Solution {

	public Solution() {

	}

	protected Solution(int i) {

	}

	private Solution(double i) {

	}

	Solution(short i) {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
