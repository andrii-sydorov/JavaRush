package lecture_15.middle.TemplatePattern;

public class TeaMaker extends DrinkMaker {

	@Override
	void getRightCup() {
		System.out.println("����� ����� ��� ���");
	}

	@Override
	void putIngredient() {
		System.out.println("�������� ���");
	}

	@Override
	void pour() {
		System.out.println("�������� ��������");
	}
}
