package lecture_13.hard.RepkaTalePackage;

public class Person implements RepkaItem {

	private String name;
	private String namePadezh;

	Person(String name, String namePadezh) {
		this.name = name;
		this.namePadezh = namePadezh;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNamePadezh() {
		return namePadezh;
	}

	public void setNamePadezh(String namePadezh) {
		this.namePadezh = namePadezh;
	}

	public void pull(Person person) {
		System.out.println(this.name + " за " + person.getNamePadezh());
	}
}
