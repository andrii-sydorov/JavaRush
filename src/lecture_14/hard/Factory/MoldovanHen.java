package lecture_14.hard.Factory;

public class MoldovanHen extends Hen {

	@Override
	int getCountOfEggsPerMonth() {
		return 3;
	}

	@Override
	public String getDescription() {
		return super.getDescription() + " ��� ������ - Moldova. � ���� " + this.getCountOfEggsPerMonth()
				+ " ��� � �����.";
	}

}
