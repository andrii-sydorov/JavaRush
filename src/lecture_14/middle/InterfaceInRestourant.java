package lecture_14.middle;

/**
 * ����� ������� ���������, ������� ������� ���� �������, ��� ������ �� ����.
 * ��� ����� �����:
 * 
 * ����������� ��������� Selectable � ������ Food. 
 * ����� onSelect() ������ �������� �� ����� ����� "The food was selected". �������, ����� ������ �����
 * ������� ��� ���������� food, � ����� ��� � selectable. 
 * � ������ foodMethods ������ ������ onSelect, onEat, ���� ��� ��������. 
 * � ������ selectableMethods ������ ������ onSelect, onEat, ���� ��� ��������. �� ��������� ����� ���������� �����.
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
