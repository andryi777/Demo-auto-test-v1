package demo.test.definition;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import demo.main.step.CotizaStep;

public class CotizaAuto {

	@Steps
	private CotizaStep cotizacionPolizaStep;
	
	@Given("^accedo a la web de Pakta$")
	public void accedo_a_la_web_de_Pakta() {
		cotizacionPolizaStep.ingresarPakta();
	}
	
	@When("^ingreso los valores iniciales solicitados placa \"([^\"]*)\", dni \"([^\"]*)\", celular \"([^\"]*)\", correo \"([^\"]*)\"$")
	public void ingreso_los_valores_iniciales_solicitados_placa_dni_celular_correo(String placa, String dni, String celular, String correo) {
		cotizacionPolizaStep.ingresoValores(placa, dni, celular, correo);
	}

	@Then("^debe mostrarse los montos para 12 cuotas \"([^\"]*)\" y cuota unica \"([^\"]*)\"$")
	public void debe_mostrarse_los_montos_para_cuotas_y_cuota_unica(String monto12Cuotas, String montoCuotaUnica) {
		assertEquals(monto12Cuotas, cotizacionPolizaStep.listaCuotas().get(0));
		assertEquals(montoCuotaUnica, cotizacionPolizaStep.listaCuotas().get(1));
	}
}
