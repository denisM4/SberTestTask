package by.kvach.sber.task1.model.products;

import by.kvach.sber.task1.model.CardInterface;
import by.kvach.sber.task1.model.AbstractProduct;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class CreditCard extends AbstractProduct implements CardInterface {

	private double debts;
	private double interestRate;

	public CreditCard(String name, double balance, String currency, double debts, double interestRate) {
		super(name, balance, currency);
		this.debts = debts;
		this.interestRate = interestRate;
	}

	@Override
	public String replenishment() {
		return "CreditCard replenishment";
	}

	@Override
	public String balanceEnquiry() {
		return "CreditCard balanceEnquiry";
	}

	@Override
	public String writeOff() {
		return "CreditCard writeOff";
	}

	public static CreditCard defaultBuilder() {
		return new CreditCard("CreditCard", 45658.45, "BYN", 12.5, 10);
	}
}
