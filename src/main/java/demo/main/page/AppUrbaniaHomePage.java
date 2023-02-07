package demo.main.page;

import java.util.concurrent.TimeUnit;

import demo.main.util.PageObjectUtil;
import demo.main.xpath.XpathUrbaniaHome;
import net.serenitybdd.core.pages.PageObject;

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
		getDriver().navigate().to(url);
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(1L, TimeUnit.SECONDS);
		
	}
	
	public void filtrarBusqueda() {
		pageObjectUtil.seleniumClick(getDriver(), xpathUrbaniaHome.tabComprar, 0);
		pageObjectUtil.seleniumClick(getDriver(), xpathUrbaniaHome.cboTipoPropiedad, 0);
		pageObjectUtil.seleniumClick(getDriver(), xpathUrbaniaHome.opcCasa, 0);
		pageObjectUtil.seleniumClick(getDriver(), xpathUrbaniaHome.txtDatosCasa, 0);
		pageObjectUtil.seleniumEscribir(getDriver(), xpathUrbaniaHome.txtDatosCasa, 0, "Lima", null);
		pageObjectUtil.seleniumClick(getDriver(), xpathUrbaniaHome.opcLima, 0);
		pageObjectUtil.seleniumClick(getDriver(), xpathUrbaniaHome.btnBuscar, 0);
	}
	
}
