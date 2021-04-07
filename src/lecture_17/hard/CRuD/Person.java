package lecture_17.hard.CRuD;

import java.util.Date;

public class Person {

	private String name;
	private Sex sex;
	private Date birthdate;

	private Person(String name, Sex sex, Date birthdate) {
		this.name = name;
		this.birthdate = birthdate;
		this.sex = sex;
	}

	public static Person createMale(String name, Date birthdate) {
		return new Person(name, Sex.MALE, birthdate);
	}

	public static Person createFemale(String name, Date birthdate) {
		return new Person(name, Sex.FEMALE, birthdate);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getName() {
		return this.name;
	}

	public Date getBirthdate() {
		return this.birthdate;
	}

	public Sex getSex() {
		return this.sex;
	}

}
