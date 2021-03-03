package lecture_14.hard.Factory;

public class BelarusianHen extends Hen {

	@Override
	int getCountOfEggsPerMonth() {
		return 4;
	}

	@Override
	public String getDescription() {
		return super.getDescription() + " ћо€ страна - Belarus. я несу " + this.getCountOfEggsPerMonth()
				+ " €иц в мес€ц.";
	}

}
