package lecture_14.hard.CurrencyMoney;

public class Ruble extends Money {

	@Override
	public String getCurrencyName() {
		return "RUB";
	}

	public Ruble(double amount) {
		super(amount);
	}

}
