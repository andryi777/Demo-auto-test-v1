package demo.test.definition;

import demo.main.step.BuscarCasasStep;
import demo.main.util.Variables;
import demo.test.inout.LeerDD_Reembolso;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BuscarCasasDefinition {
	
	private LeerDD_Reembolso excel = LeerDD_Reembolso.getInstancia();
	
	@Steps
	private BuscarCasasStep buscarCasasStep;
	
	@Given("accedo a la web de Urbania")
	public void accedo_a_la_web_de_urbania() {
		buscarCasasStep.ingresarUrbania();
	}

	@When("filtro por casas")
	public void filtro_por_casas() {
		buscarCasasStep.filtroCasas();
	}

	@Then("registro los datos de precios de casas")
	public void registro_los_datos_de_precios_de_casas() throws Exception{
		buscarCasasStep.getPrecios();
//		excel.writeReembolsoinExcel(Variables.listaStrings);
	}

}
