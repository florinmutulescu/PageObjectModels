package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.BaseTest;
import utils.ScreenShots;

public class Tema23Test extends BaseTest {
	
	@Parameters({"user","pass"})
	@Test(priority = 1)
	public void validLogin(String user,String pass)throws IOException {
		app.click(app.menu.myAccountLink);
		app.myAccount.loginInApp(user,pass);
		
		assertTrue(app.elementIsDisplayed(app.myAccount.successMsg));
		ScreenShots.screenshot(driver);
	}
	@Test(priority =2)
	public void searchProduct() throws IOException {
		app.click(app.sp.searchField);
		app.sendKeys(app.sp.searchField,"pret");
	assertTrue(app.elementIsDisplayed(app.sp.searchField1));
	ScreenShots.screenshot(driver);
	
	}
	@Test(priority =3)
	public void placeAnOrder() throws IOException {
		app.click(app.sp.searchField1);
		app.click(app.pp.buttonAdd);
	assertTrue(app.elementIsDisplayed(app.pp.msgPretzels));
	ScreenShots.screenshot(driver);
	}
	@Test(priority =4)
	public void updateQty() throws IOException {
		app.click(app.pp.viewCart);
		app.cp.updatePlusQty();
	assertEquals(app.returnWebElement(app.cp.subtotal).getText(),
			app.returnWebElement(app.cp.total).getText());
	ScreenShots.screenshot(driver);
	}
	@Test(priority =5)
	public void checkoutPlaceOrder() throws IOException {
		app.click(app.cp.checkoutButtton);
		if(app.returnWebElement(app.chp.checkbox).isSelected()) {
			app.click(app.chp.btnPlaceOrder);
		}else {
			app.click(app.chp.checkbox);
			app.click(app.chp.btnPlaceOrder);
			}
		assertTrue(app.elementIsDisplayed(app.chp.orderNumber));
		ScreenShots.screenshot(driver);
	  
	}
}
