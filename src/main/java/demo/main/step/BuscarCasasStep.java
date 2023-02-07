package demo.main.step;

import java.io.IOException;
import java.util.ArrayList;

import demo.main.page.AppUrbaniaHomePage;
import demo.main.page.AppUrbaniaResultadosPage;
import demo.main.util.Variables;

public class BuscarCasasStep {

	private AppUrbaniaHomePage appUrbaniaHomePage;
	private AppUrbaniaResultadosPage appUrbaniaResultadosPage;
	
	public void ingresarUrbania() {
		appUrbaniaHomePage.inicializar("https://urbania.pe/");
	}
	
	public void filtroCasas() {
		appUrbaniaHomePage.filtrarBusqueda();
	}

	public void getPrecios() throws IOException {
		Variables.listaStrings = new ArrayList<String>();
		appUrbaniaResultadosPage.getPrecios();		
	}
}
