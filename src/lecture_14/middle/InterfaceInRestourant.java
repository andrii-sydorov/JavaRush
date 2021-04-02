package lecture_14.middle;

/**
 * Давай напишем программу, которая поможет тебе выбрать, что съесть на обед.
 * Для этого нужно:
 * 
 * Реализовать интерфейс Selectable в классе Food. 
 * Метод onSelect() должен выводить на экран фразу "The food was selected". Подумай, какие методы можно
 * вызвать для переменной food, а какие для — selectable. 
 * В методе foodMethods вызови методы onSelect, onEat, если это возможно. 
 * В методе selectableMethods вызови методы onSelect, onEat, если это возможно. Не используй явное приведение типов.
 * 
 * @author SMD_ASY
 *
 */
public class InterfaceInRestourant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food food = new Food();
		Selectable selectable = new Food();
		Food newFood = (Food) selectable;

		foodsMethods(food);
		selectableMethods(selectable);

	}

	public static void foodsMethods(Food food) {
		food.onSelect();
		food.onEat();
	}

	public static void selectableMethods(Selectable selectable) {
		selectable.onSelect();
	}

	public interface Selectable {
		void onSelect();
	}

	static class Food implements Selectable {
		public void onEat() {
			System.out.println("The food was eaten");
		}

		public void onSelect() {
			System.out.println("The food was selected");
		}
	}

}
