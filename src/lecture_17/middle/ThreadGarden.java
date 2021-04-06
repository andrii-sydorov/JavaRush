package lecture_17.middle;

/**
 * 1. Создай метод public void addFruit(int index, String fruit) - который добавляет параметр fruit в лист fruits на позицию index.
2. Создай метод public void removeFruit(int index) - который удаляет из fruits элемент с индексом index.
3. Создай метод public void addVegetable(int index, String vegetable) - который добавляет параметр vegetable в лист vegetables на позицию index.
4. Создай метод public void removeVegetable(int index) - который удаляет из vegetables элемент с индексом index.
5. Класс Garden будет использоваться нитями. Поэтому сделай так, чтобы все методы блокировали мьютекс this.
6. Реализуй это минимальным количеством кода.
 */

import java.util.List;
import java.util.ArrayList;

public class ThreadGarden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static class Garden {
		public final List<String> fruits = new ArrayList<>();
		public final List<String> vegetables = new ArrayList<>();

		public void addFruit(int index, String fruit) {
			synchronized (this) {
				fruits.add(index, fruit);
			}
		}

		public void removeFruit(int index) {
			synchronized (this) {
				fruits.remove(index);
			}
		}

		public void addVegetable(int index, String vegetable) {
			synchronized (this) {
				vegetables.add(index, vegetable);
			}
		}

		public void removeVegetable(int index) {
			synchronized (this) {
				vegetables.remove(index);
			}
		}

	}

}
