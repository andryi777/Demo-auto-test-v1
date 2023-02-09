package demo.main.page;

import java.util.concurrent.TimeUnit;

import demo.main.util.PageObjectUtil;
import demo.main.xpath.XpathUrbaniaHome;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.webdriver.RemoteDriver;

public class AppUrbaniaHomePage extends PageObject {

	private long wdwTimeOut = 300L;
		
	// xpath
	protected XpathUrbaniaHome xpathUrbaniaHome = XpathUrbaniaHome.getInstancia();

	// util
	protected PageObjectUtil pageObjectUtil = PageObjectUtil.getInstancia();

	public long getWdwTimeOut() {
		return wdwTimeOut;
	}

	public void inicializar(String url) {
		RemoteDriver.of(getDriver()).navigate().to(url);
		RemoteDriver.of(getDriver()).manage().deleteAllCookies();
		RemoteDriver.of(getDriver()).manage().window().maximize();
		RemoteDriver.of(getDriver()).manage().timeouts().implicitlyWait(1L, TimeUnit.SECONDS);
		
	}
	
	public void filtrarBusqueda() {
		pageObjectUtil.seleniumClick(RemoteDriver.of(getDriver()), xpathUrbaniaHome.tabComprar, 0);
		pageObjectUtil.seleniumClick(RemoteDriver.of(getDriver()), xpathUrbaniaHome.cboTipoPropiedad, 0);
		pageObjectUtil.seleniumClick(RemoteDriver.of(getDriver()), xpathUrbaniaHome.opcCasa, 0);
		pageObjectUtil.seleniumClick(RemoteDriver.of(getDriver()), xpathUrbaniaHome.txtDatosCasa, 0);
		pageObjectUtil.seleniumEscribir(RemoteDriver.of(getDriver()), xpathUrbaniaHome.txtDatosCasa, 0, "Lima", null);
		pageObjectUtil.seleniumClick(RemoteDriver.of(getDriver()), xpathUrbaniaHome.opcLima, 0);
		pageObjectUtil.seleniumClick(RemoteDriver.of(getDriver()), xpathUrbaniaHome.btnBuscar, 0);
		
		Serenity.takeScreenshot();
	}
	
}
