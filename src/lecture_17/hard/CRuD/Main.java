package lecture_17.hard.CRuD;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;


public class Main {
	
	public static List<Person> allPeople = new ArrayList<>();
	
	static {
		allPeople.add(Person.createMale("Иванов Иван", new Date()));
		allPeople.add(Person.createMale("Петров Петр", new Date()));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
