package lecture_15.middle.TemplatePattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.io.IOException;

/**
 * В этой задаче тебе нужно:
 * 
 *  В отдельном файле создать класс DrinkMaker с тремя абстрактными методами:
 * void getRightCup() - выбрать подходящую чашку; void putIngredient() -
 * положить ингредиенты; void pour() - залить жидкость.
 *  В классе DrinkMaker создать и реализовать метод void makeDrink(), который готовит напиток в такой
 * последовательности: выбирает чашку, кладет ингредиенты, заливает жидкость.
 *  В отдельных файлах создать классы LatteMaker и TeaMaker, которые наследуются от DrinkMaker. 
 * 	Распределить следующие фразы между всеми методами в классах LatteMaker и TeaMaker: "Заливаем кипятком" "Берем чашку для латте" "Насыпаем
 * чай" "Берем чашку для чая" "Заливаем молоком с пенкой" "Делаем кофе".
 * Каждый метод должен выводить в консоль свою фразу, не пересекаясь с другими методами
 * 
 * @author SMD_ASY
 *
 */

public class Main {

	public static void main(String[] args) throws IOException {
		DrinkMaker dm = null;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String key = bf.readLine();
		switch (key) {
		case "tea":
			dm = new TeaMaker();
			break;
		case "latte":
			dm = new LatteMaker();
			break;
		default:
			break;
		}
		for (Method m : dm.getClass().getMethods()) {
			System.out.println(m.getName());
		}
	}

}
