package demo.main.step;

import java.util.List;

import demo.main.page.AppCarroAplica;
import demo.main.page.AppHomepage;

public class CotizaStep {

	private AppHomepage appHomePage;
	private AppCarroAplica appCarroAplica;
	
	public void ingresarPakta() {
		appHomePage.inicializar("https://d1x6s3ign30iot.cloudfront.net/");
	}
	
	public void ingresoValores(String placa, String dni, String celular, String correo) {
		appHomePage.cotizacionInicial(placa, dni, celular, correo);
	}
	
	public List<String> listaCuotas() {
		return appCarroAplica.getCuotas();
	}
}
