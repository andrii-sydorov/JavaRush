package lecture_14.hard.Factory;

public class RussianHen extends Hen {

	@Override
	int getCountOfEggsPerMonth() {
		return 1;
	}

	@Override
	public String getDescription() {
		return super.getDescription() + " ћо€ страна - Russia. я несу " + this.getCountOfEggsPerMonth()
				+ " €иц в мес€ц.";
	}

}
