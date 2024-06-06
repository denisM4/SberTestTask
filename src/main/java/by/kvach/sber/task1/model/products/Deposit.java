package by.kvach.sber.task1.model.products;

import by.kvach.sber.task1.model.AbstractProduct;
import by.kvach.sber.task1.model.DepositInterface;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class Deposit extends AbstractProduct implements DepositInterface {

	public Deposit(String name, double balance, String currency) {
		super(name, balance, currency);
	}

	@Override
	public String replenishment() {
		return "Deposit replenishment";
	}

	@Override
	public String balanceEnquiry() {
		return "Deposit balanceEnquiry";
	}

	@Override
	public String close() {
		return "Deposit close";
	}

	public static Deposit defaultBuilder() {
		return new Deposit("deposit", 232304.00, "EUR");
	}
}
