package demo.main.xpath;

public class XPathHomePage {
	
	// singleton
	private static XPathHomePage obj = null;

	private XPathHomePage() {
	}

	public static XPathHomePage getInstancia() {
		instanciar();
		return obj;
	}

	private synchronized static void instanciar() {
		if (obj == null) {
			obj = new XPathHomePage();
		}
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	public final String lnkCotizaAqui = "//*[@id='btnCotiza']";
	public final String txtPlaca ="//*[@id='placa']";
	public final String txtDNI="//div[label[contains(., 'Número de DNI o C.E.')]]/input";
	public final String txtCelular="//div[label[contains(., 'Celular')]]/input";
	public final String txtCorreo="//div[label[contains(., 'Correo')]]/input";
	public final String chkPoliDatosPrsonales="//label[@for='chkpolprotdatos']";
	public final String chkEnvioComunicComerci="//label[@for='chkpolCom']";
	public final String btnCotizaAhora="//*[@id='lnkCotizaAqui']";

}
