package demo.main.page;

import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import demo.main.util.PageObjectUtil;
import demo.main.util.Variables;
import demo.main.xpath.XpathUrbaniaResultados;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;

public class AppUrbaniaResultadosPage extends PageObject {

	private long wdwTimeOut = 300L;
		
	// xpath
	protected XpathUrbaniaResultados xpathUrbaniaResultados = XpathUrbaniaResultados.getInstancia();

	// util
	protected PageObjectUtil pageObjectUtil = PageObjectUtil.getInstancia();

	public long getWdwTimeOut() {
		return wdwTimeOut;
	}

	public void getPrecios() throws IOException {
		FileWriter fileRoute = new FileWriter("/Users/christianmaurysolis/Documents/newFile.txt");
		
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		WebElement elemento;
		int registros = getDriver().findElements(By.xpath(xpathUrbaniaResultados.lblRefDireccion)).size();
		System.out.println(registros);
		String caracteristicas="";
		
		Serenity.takeScreenshot();
//		while(getDriver().findElement(By.xpath(xpathUrbaniaResultados.btnNext)).isDisplayed())
//		{
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			for(int nroFila=0; nroFila<registros; nroFila++) {
//				
//				caracteristicas="";
////					elemento = pageObjectUtil.seleniumWebElement(getDriver(), xpathUrbaniaResultados.preciosSoles, nroFila);
////					jse.executeScript("arguments[0].scrollIntoView();", elemento);
//				
//				List<WebElement> caracteristicasInmueble = getDriver().findElements(By.xpath(xpathUrbaniaResultados.lblFeatures(nroFila+1)));
//				for(WebElement we: caracteristicasInmueble) {
//					caracteristicas=caracteristicas +","+we.getText();
//				}
//				try {
//					System.out.println("registro: "+nroFila
//							+" - link: " +getDriver().findElement(By.xpath("//*[@class='postings-container']/descendant::*[@data-qa='posting PROPERTY']["+(nroFila+1)+"]")).getAttribute("data-to-posting").toString()
////								+" - link: "+pageObjectUtil.seleniumGetTexto(getDriver(), xpathUrbaniaResultados.getLinkInmueble(nroFila+1), nroFila)
//							+" - precio Soles: " +pageObjectUtil.seleniumGetTexto(getDriver(), xpathUrbaniaResultados.preciosSoles(nroFila), 0)
////								+" - precio Dolares: " +pageObjectUtil.seleniumGetTexto(getDriver(), xpathUrbaniaResultados.preciosDolares, nroFila)
//							+" - RefDireccion: " +pageObjectUtil.seleniumGetTexto(getDriver(), xpathUrbaniaResultados.lblRefDireccion, nroFila)
//							+" - RefUbicacion: " +pageObjectUtil.seleniumGetTexto(getDriver(), xpathUrbaniaResultados.lblRefUbicacion, nroFila)
//							+" - Caracteristicas: "+caracteristicas);
//					
//					fileRoute.write("registro=====>" +nroFila
//							+" - link: " +getDriver().findElement(By.xpath("//*[@class='postings-container']/descendant::*[@data-qa='posting PROPERTY']["+(nroFila+1)+"]")).getAttribute("data-to-posting").toString()
////								+" - link: "+pageObjectUtil.seleniumGetTexto(getDriver(), xpathUrbaniaResultados.getLinkInmueble(nroFila+1), nroFila)
//							+" - precio Soles: " +pageObjectUtil.seleniumGetTexto(getDriver(), xpathUrbaniaResultados.preciosSoles(nroFila), 0)
////								+" - precio Dolares: " +pageObjectUtil.seleniumGetTexto(getDriver(), xpathUrbaniaResultados.preciosDolares, nroFila)
//							+" - RefDireccion: " +pageObjectUtil.seleniumGetTexto(getDriver(), xpathUrbaniaResultados.lblRefDireccion, nroFila)
//							+" - RefUbicacion: " +pageObjectUtil.seleniumGetTexto(getDriver(), xpathUrbaniaResultados.lblRefUbicacion, nroFila)
//							+" - Caracteristicas: "+caracteristicas);
//					fileRoute.write("\r\n");					
//				}catch(Exception ex) {
//					JOptionPane.showMessageDialog(null, "error: "+ex.getMessage());
//					System.out.println(ex.getMessage());
//				}
////					JOptionPane.showMessageDialog(null, "sssss");
//			}
//			
//			elemento = pageObjectUtil.seleniumWebElement(getDriver(), xpathUrbaniaResultados.btnNext, 0);
//			jse.executeScript("arguments[0].scrollIntoView();", elemento);
//			pageObjectUtil.seleniumClick(getDriver(), xpathUrbaniaResultados.btnNext, 0);
//		}
	}

}
