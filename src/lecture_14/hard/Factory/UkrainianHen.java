package lecture_14.hard.Factory;

public class UkrainianHen extends Hen {

	@Override
	int getCountOfEggsPerMonth() {
		return 2;
	}

	@Override
	public String getDescription() {
		return super.getDescription() + " ��� ������ - Ukraine. � ���� " + this.getCountOfEggsPerMonth()
				+ " ��� � �����.";
	}

}
