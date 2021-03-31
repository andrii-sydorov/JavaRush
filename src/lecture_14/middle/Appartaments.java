package lecture_14.middle;

import java.util.List;
import java.util.ArrayList;

/**
 * В этой задаче тебе нужно:
 * 
 * Реализовать метод cleanAllApartments(). 
 * Пройтись по списку объектов apartments: 
 * 	для однокомнатных квартир (OneRoomApt) вызвать метод clean1Room(); 
 *  для двухкомнатных квартир (TwoRoomApt) вызвать метод clean2Rooms(); 
 *  для трехкомнатных квартир (ThreeRoomApt) вызвать метод clean3Rooms().
 * 
 * @author SMD_ASY
 *
 */

public class Appartaments {
	public static void main(String[] args) {
		List<Apartment> ls = new ArrayList<>();
		ls.add(new OneRoomApt());
		ls.add(new TwoRoomApt());
		ls.add(new ThreeRoomApt());

		cleanAllApartments(ls);
	}

	public static void cleanAllApartments(List<Apartment> ls) {
		for (int i = 0; i < ls.size(); i++) {
			Apartment temp = ls.get(i);
			if (temp instanceof OneRoomApt) {
				((OneRoomApt) temp).clean1Room();
			} else if (temp instanceof TwoRoomApt) {
				((TwoRoomApt) temp).clean2Rooms();
			} else if (temp instanceof ThreeRoomApt) {
				((ThreeRoomApt) temp).clean3Rooms();
			}
		}
	}

	static interface Apartment {

	}

	static class OneRoomApt implements Apartment {
		void clean1Room() {
			System.out.println("1 room is cleaned");
		}
	}

	static class TwoRoomApt implements Apartment {
		void clean2Rooms() {
			System.out.println("2 rooms are cleaned");
		}
	}

	static class ThreeRoomApt implements Apartment {
		void clean3Rooms() {
			System.out.println("3 rooms are cleaned");
		}
	}
}
