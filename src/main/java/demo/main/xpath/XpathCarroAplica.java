package demo.main.xpath;

public class XpathCarroAplica {
	
	private static XpathCarroAplica obj = null;

	private XpathCarroAplica() {
	}

	public static XpathCarroAplica getInstancia() {
		instanciar();
		return obj;
	}

	private synchronized static void instanciar() {
		if (obj == null) {
			obj = new XpathCarroAplica();
		}
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	//*[@id="carroAplica"]/div/div/div/div[1]/div[1]/div[1]/div[2]/div/div/p[1]
	//*[@id="carroAplica"]/div/div/div/div[1]/div[1]/div[1]/div[1]/div/div/p[1]
	
//"(//input[@name='Button'])[2]"  /.//span[@class='moneda']//  //*[@id="carroAplica"]/div/div/div/div[1]/div[1]/div[1]/div[2]/div/div/p[1]/text()
	public final String lbl12Cuotas = "//*[@id='carroAplica']/.//div[2]/div/div/p[@class='valor__cuota monto-d']"; // and text()='US$' //span[@class='moneda']/text()[1]
	public final String lblCuotaUnica = "//*[@id='carroAplica']/.//div[1]/div/div/p[@class='valor__cuota monto-d']";
}
