package lecture_14.hard.Factory;

public class RussianHen extends Hen {

	@Override
	int getCountOfEggsPerMonth() {
		return 1;
	}

	@Override
	public String getDescription() {
		return super.getDescription() + " Моя страна - Russia. Я несу " + this.getCountOfEggsPerMonth()
				+ " яиц в месяц.";
	}

}
