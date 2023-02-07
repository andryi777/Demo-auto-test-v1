package demo.main.xpath;

public class XpathUrbaniaHome {

	// singleton
	private static XpathUrbaniaHome obj = null;

	private XpathUrbaniaHome() {
	}

	public static XpathUrbaniaHome getInstancia() {
		instanciar();
		return obj;
	}

	private synchronized static void instanciar() {
		if (obj == null) {
			obj = new XpathUrbaniaHome();
		}
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	public final String tabComprar = "//*[@data-qa='search-option-comprar']";
	public final String cboTipoPropiedad = "//*[@class='property-selector__control css-yk16xz-control']";
	public final String opcCasa= "//*[@data-qa='search-property-selector-item'][contains(text(),'Casa')]";
	public final String txtDatosCasa = "//*[@data-qa='search-input']/descendant::input";
	public final String opcLima = "//*[@aria-label='Lima']";
	public final String btnBuscar="//*[@data-qa='search-button']";
	
}
