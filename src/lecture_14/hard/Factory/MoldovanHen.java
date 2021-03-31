package lecture_14.hard.Factory;

public class MoldovanHen extends Hen {

	@Override
	int getCountOfEggsPerMonth() {
		return 3;
	}

	@Override
	public String getDescription() {
		return super.getDescription() + " Моя страна - Moldova. Я несу " + this.getCountOfEggsPerMonth()
				+ " яиц в месяц.";
	}

}
