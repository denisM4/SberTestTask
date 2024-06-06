package by.kvach.sber.task1.model.products;

import by.kvach.sber.task1.model.AbstractProduct;
import by.kvach.sber.task1.model.CardInterface;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class CurrencyDebitCard extends AbstractProduct implements CardInterface {

	public CurrencyDebitCard(String name, double balance, String currency) {
		super(name, balance, currency);
	}

	@Override
	public String replenishment() {
		return "CurrencyDebitCard replenishment";
	}

	@Override
	public String balanceEnquiry() {
		return "CurrencyDebitCard balanceEnquiry";
	}

	@Override
	public String writeOff() {
		return "CurrencyDebitCard writeOff";
	}

	public static CurrencyDebitCard defaultBuilder() {
		return new CurrencyDebitCard("CurrencyDebitCard", 45658.45, "BYN");
	}
}
