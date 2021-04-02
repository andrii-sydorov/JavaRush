package lecture_14.hard.Factory;

public class UkrainianHen extends Hen {

	@Override
	int getCountOfEggsPerMonth() {
		return 2;
	}

	@Override
	public String getDescription() {
		return super.getDescription() + " Моя страна - Ukraine. Я несу " + this.getCountOfEggsPerMonth()
				+ " яиц в месяц.";
	}

}
