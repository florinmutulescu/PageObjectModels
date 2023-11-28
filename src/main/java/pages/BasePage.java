package pages;

import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class BasePage extends SeleniumWrappers{

	public BasePage(WebDriver driver) {
		super(driver);
	}
	public MenuPage menu = new MenuPage(driver);
	public MyAccountPage myAccount= new MyAccountPage(driver);
	public SearchProduct sp = new SearchProduct(driver);
	public ProductPretzels pp = new ProductPretzels(driver);
	public CartPretzels cp = new CartPretzels(driver);
	public CheckoutPage chp = new CheckoutPage(driver);
	public FruitsVegetables fv = new FruitsVegetables(driver);
	public FreshProduceMelons fpm = new FreshProduceMelons(driver);
	public BreakfastDairy bd = new BreakfastDairy(driver);
	public VitalFarmPasture vfp = new VitalFarmPasture(driver);
	public BiscuitsSnacks bs= new BiscuitsSnacks(driver);
	public ShimmerPastelAlmond spa= new ShimmerPastelAlmond(driver);
	public Beverages bv= new Beverages(driver);
	public ZeviaKidzStrawberryLemonade zksl = new ZeviaKidzStrawberryLemonade (driver);
	public WishList wl=new WishList(driver);
	
}
