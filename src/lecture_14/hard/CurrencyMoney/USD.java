package lecture_14.hard.CurrencyMoney;

public class USD extends Money {

	@Override
	public String getCurrencyName() {
		return "USD";
	}

	public USD(double amount) {
		super(amount);
	}

}
