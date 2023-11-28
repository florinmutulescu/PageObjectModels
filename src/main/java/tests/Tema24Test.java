package tests;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.BaseTest;
import utils.ScreenShots;

public class Tema24Test extends BaseTest {
	@Parameters({"user","pass"})
	@Test(priority = 1)
	public void validLogin(String user,String pass)throws IOException {
		app.click(app.menu.myAccountLink);
		app.myAccount.loginInApp(user,pass);
		
		assertTrue(app.elementIsDisplayed(app.myAccount.successMsg));
		ScreenShots.screenshot(driver);
	}
	@Test(priority = 2)
	public void adaugareProdus1()throws IOException {
		app.click(app.myAccount.allCategories);
		app.click(app.myAccount.fruitsVegetables);
		app.click(app.fv.melons);
		app.click(app.fpm.addToWishlist);
		assertTrue(app.elementIsDisplayed(app.fpm.viewMelonsWishlist));
		ScreenShots.screenshot(driver);
		app.click(app.fpm.buttonClose);
	}
	@Test(priority = 3)
	public void adaugareProdus2()throws IOException {
		app.click(app.myAccount.allCategories);
		app.click(app.myAccount.breakfastDairy);
		app.click(app.bd.vitalFarms);
		app.click(app.vfp.addToWishlist);
		assertTrue(app.elementIsDisplayed(app.vfp.viewVitalFarmPastureWishlist));
		ScreenShots.screenshot(driver);
		app.click(app.vfp.buttonClose);
	}
	@Test(priority = 4)
	public void adaugareProdus3()throws IOException {
		app.click(app.myAccount.allCategories);
		app.click(app.myAccount.biscuitsSnacks);
		app.click(app.bs.shimmerPastel);
		app.click(app.spa.addToWishlist);
		assertTrue(app.elementIsDisplayed(app.spa.viewShimmerPastelAlmondWishlist));
		ScreenShots.screenshot(driver);
		app.click(app.spa.buttonClose);
	}
	@Test(priority = 5)
	public void adaugareProdus4()throws IOException {
		app.click(app.myAccount.allCategories);
		app.click(app.myAccount.beverages);
		app.click(app.bv.zeviaKidsLemonade);
		app.click(app.zksl.addToWishlist);
		assertTrue(app.elementIsDisplayed(app.zksl.viewZeviaKidzWishlist));
		ScreenShots.screenshot(driver);
		app.click(app.spa.buttonClose);
	}
	@Test(priority=6)
	public void verificareProduseWishlist() throws IOException {
		app.click(app.menu.wishlistLink);
		assertTrue(app.elementIsDisplayed(app.wl.shimmerPastelAlmondLink));
		assertTrue(app.elementIsDisplayed(app.wl.addToCartShimmerLink));
		assertTrue(app.elementIsDisplayed(app.wl.vitalFarmsPastureLink));
		assertTrue(app.elementIsDisplayed(app.wl.addToCartVitalFarmsLink));
		assertTrue(app.elementIsDisplayed(app.wl.melonsLink));
		assertTrue(app.elementIsDisplayed(app.wl.addToCartFreshProduceMelonsLink));
		assertTrue(app.elementIsDisplayed(app.wl.zeviaLink));
		assertTrue(app.elementIsDisplayed(app.wl.addToCartZeviaLink));
		ScreenShots.screenshot(driver);
	}
	@Test(priority=7)
	public void selectareProduseWishList() throws IOException {
		if(app.returnWebElement(app.wl.selectieTotalaProduseLink).isSelected()) {
			app.click(app.wl.actionsDropDown);
		}else {
			app.click(app.wl.selectieTotalaProduseLink);
			app.click(app.wl.actionsDropDown);
			}
		app.wl.filterByIndex(1);
		assertEquals(app.wl.getCurrentSelectedOption(), "Add to Cart");
		ScreenShots.screenshot(driver);
		app.click(app.wl.applyActionButton);
	}
	
	@Test(priority=8)
	public void verificareProduseRamaseWishlist() throws IOException {
		assertTrue(app.elementIsDisplayed(app.wl.eroareProdus));
		assertTrue(app.elementIsDisplayed(app.wl.produsRamasDefaultWishlist));
	    ScreenShots.screenshot(driver);
	}
	
	

}
