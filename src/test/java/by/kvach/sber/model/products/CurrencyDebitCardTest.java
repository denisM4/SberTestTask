package by.kvach.sber.model.products;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import by.kvach.sber.task1.model.AbstractProduct;
import by.kvach.sber.task1.model.products.CurrencyDebitCard;

import org.testng.annotations.Test;

public class CurrencyDebitCardTest {

	CurrencyDebitCard product = CurrencyDebitCard.defaultBuilder();

	@Test
	public void testReplenishment() {
		assertEquals(product.replenishment(), "CurrencyDebitCard replenishment");
	}

	@Test
	public void testBalanceEnquiry() {
		assertEquals(product.balanceEnquiry(), "CurrencyDebitCard balanceEnquiry");
	}

	@Test
	public void testWriteOff() {
		assertEquals(product.writeOff(), "CurrencyDebitCard writeOff");
	}

	@Test
	public void testInstance() {
		assertTrue(product instanceof AbstractProduct);
	}
}