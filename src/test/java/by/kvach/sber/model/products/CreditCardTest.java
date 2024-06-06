package by.kvach.sber.model.products;

import static org.testng.Assert.*;

import by.kvach.sber.task1.model.AbstractProduct;
import by.kvach.sber.task1.model.products.CreditCard;

import org.testng.annotations.Test;

public class CreditCardTest {
	CreditCard product = CreditCard.defaultBuilder();

	@Test
	public void testReplenishment() {
		assertEquals(product.replenishment(), "CreditCard replenishment");
	}

	@Test
	public void testBalanceEnquiry() {
		assertEquals(product.balanceEnquiry(), "CreditCard balanceEnquiry");
	}

	@Test
	public void testWriteOff() {
		assertEquals(product.writeOff(), "CreditCard writeOff");
	}

	@Test
	public void testInstance() {
		assertTrue(product instanceof AbstractProduct);
	}
}