package by.kvach.sber.model.products;

import static org.testng.Assert.*;

import by.kvach.sber.task1.model.AbstractProduct;
import by.kvach.sber.task1.model.products.DebitCard;

import org.testng.annotations.Test;

public class DebitCardTest {

	DebitCard product = DebitCard.defaultBuilder();

	@Test
	public void testReplenishment() {
		assertEquals(product.replenishment(), "DebitCard replenishment");
	}

	@Test
	public void testBalanceEnquiry() {
		assertEquals(product.balanceEnquiry(), "DebitCard balanceEnquiry");
	}

	@Test
	public void testWriteOff() {
		assertEquals(product.writeOff(), "DebitCard writeOff");
	}

	@Test
	public void testInstance() {
		assertTrue(product instanceof AbstractProduct);
	}
}