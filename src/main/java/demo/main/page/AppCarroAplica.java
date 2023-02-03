package demo.main.page;

import java.util.ArrayList;
import java.util.List;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import demo.main.util.PageObjectUtil;
import demo.main.xpath.XpathCarroAplica;

public class AppCarroAplica extends PageObject {

	private List<String> listaCuotas = new ArrayList<String>();

	protected XpathCarroAplica xpathCarroAplica = XpathCarroAplica.getInstancia();

	protected PageObjectUtil pageObjectUtil = PageObjectUtil.getInstancia();
	
	public List<String> getCuotas(){
		System.out.println(pageObjectUtil.seleniumGetTexto(getDriver(), xpathCarroAplica.lbl12Cuotas, 0));
		System.out.println(pageObjectUtil.seleniumGetTexto(getDriver(), xpathCarroAplica.lblCuotaUnica, 0));
		listaCuotas.add(0, pageObjectUtil.seleniumGetTexto(getDriver(), xpathCarroAplica.lbl12Cuotas, 0));
		listaCuotas.add(1, pageObjectUtil.seleniumGetTexto(getDriver(), xpathCarroAplica.lblCuotaUnica, 0));
		
		Serenity.takeScreenshot();
		
		return listaCuotas;
	}
}
