package demo.main.step;

import java.util.List;

import demo.main.page.AppCarroAplica;
import demo.main.page.AppHomepage;

public class CotizaStep {

	private AppHomepage appHomePage;
	private AppCarroAplica appCarroAplica;
	
	public void ingresarPakta() {
		appHomePage.inicializar("https://urbania.pe/buscar/venta-de-casas-en-lima?page=2");
	}
	
	public void ingresoValores(String placa, String dni, String celular, String correo) {
		appHomePage.cotizacionInicial(placa, dni, celular, correo);
	}
	
	public List<String> listaCuotas() {
		return appCarroAplica.getCuotas();
	}
}
