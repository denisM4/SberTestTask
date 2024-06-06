package by.kvach.sber.task1.model.products;

import by.kvach.sber.task1.model.CardInterface;
import by.kvach.sber.task1.model.AbstractProduct;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class DebitCard extends AbstractProduct implements CardInterface {

	public DebitCard(String name, double balance, String currency) {
		super(name, balance, currency);
	}

	@Override
	public String replenishment() {
		return "DebitCard replenishment";
	}

	@Override
	public String balanceEnquiry() {
		return "DebitCard balanceEnquiry";
	}

	@Override
	public String writeOff() {
		return "DebitCard writeOff";
	}

	public static DebitCard defaultBuilder() {
		return new DebitCard("DebitCard", 555658.45, "BYN");
	}
}
