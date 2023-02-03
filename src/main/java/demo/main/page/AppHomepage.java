package demo.main.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import demo.main.util.PageObjectUtil;
import demo.main.xpath.XPathHomePage;

public class AppHomepage extends PageObject {

	private long wdwTimeOut = 300L;
		
	// xpath
	protected XPathHomePage xpathHomePage = XPathHomePage.getInstancia();

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
	
	public void cotizacionInicial(String placa, String dni, String celular, String correo) {
		pageObjectUtil.seleniumClick(getDriver(), xpathHomePage.lnkCotizaAqui, 0);
		
		pageObjectUtil.seleniumEscribir(getDriver(), xpathHomePage.txtPlaca, 0, placa, null);
		pageObjectUtil.seleniumEscribir(getDriver(), xpathHomePage.txtDNI, 0, dni, null);
		pageObjectUtil.seleniumEscribir(getDriver(), xpathHomePage.txtCelular, 0, celular, null);
		
		Serenity.takeScreenshot();
		
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		WebElement elemento = pageObjectUtil.seleniumWebElement(getDriver(), xpathHomePage.btnCotizaAhora, 0);
		jse.executeScript("arguments[0].scrollIntoView();", elemento);
		
		pageObjectUtil.seleniumEscribir(getDriver(), xpathHomePage.txtCorreo, 0, correo, null);
		pageObjectUtil.seleniumClick(getDriver(), xpathHomePage.chkPoliDatosPrsonales, 0);
		pageObjectUtil.seleniumClick(getDriver(), xpathHomePage.chkEnvioComunicComerci, 0);
		
		Serenity.takeScreenshot();
		pageObjectUtil.seleniumClick(getDriver(), xpathHomePage.btnCotizaAhora, 0);

		
	}
}
