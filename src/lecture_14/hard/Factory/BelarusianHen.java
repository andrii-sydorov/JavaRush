package lecture_14.hard.Factory;

public class BelarusianHen extends Hen {

	@Override
	int getCountOfEggsPerMonth() {
		return 4;
	}

	@Override
	public String getDescription() {
		return super.getDescription() + " Моя страна - Belarus. Я несу " + this.getCountOfEggsPerMonth()
				+ " яиц в месяц.";
	}

}
