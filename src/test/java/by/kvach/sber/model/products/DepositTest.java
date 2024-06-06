package by.kvach.sber.model.products;

import static org.testng.Assert.*;

import by.kvach.sber.task1.model.AbstractProduct;
import by.kvach.sber.task1.model.products.Deposit;

import org.testng.annotations.Test;

public class DepositTest {
	Deposit product = Deposit.defaultBuilder();

	@Test
	public void testReplenishment() {
		assertEquals(product.replenishment(), "Deposit replenishment");
	}

	@Test
	public void testBalanceEnquiry() {
		assertEquals(product.balanceEnquiry(), "Deposit balanceEnquiry");
	}

	@Test
	public void testClose() {
		assertEquals(product.close(), "Deposit close");
	}

	@Test
	public void testInstance() {
		assertTrue(product instanceof AbstractProduct);
	}
}