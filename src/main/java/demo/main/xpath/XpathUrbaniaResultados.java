package demo.main.xpath;

public class XpathUrbaniaResultados {

	// singleton
	private static XpathUrbaniaResultados obj = null;

	private XpathUrbaniaResultados() {
	}

	public static XpathUrbaniaResultados getInstancia() {
		instanciar();
		return obj;
	}

	private synchronized static void instanciar() {
		if (obj == null) {
			obj = new XpathUrbaniaResultados();
		}
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	
	public final String getLinkInmueble(int index) {
		String linkInmueble="//*[@class='postings-container']/descendant::*[@data-to-posting]["+index+"]";
		return linkInmueble;
	}
	
//	public final String preciosSoles = "//*[@data-qa='POSTING_CARD_GALLERY']//following::*[@data-qa='POSTING_CARD_PRICE'][contains(text(),'S/')]";
////	public final String preciosDolares = "//*[@data-qa='POSTING_CARD_GALLERY']/following::*[@data-qa='POSTING_CARD_PRICE'][contains(text(),'USD')]";
//	public final String lblRefDireccion="//*[@data-qa='POSTING_CARD_GALLERY']//following::div/h2";
//	public final String lblRefUbicacion="//*[@data-qa='POSTING_CARD_GALLERY']//following::*[@data-qa='POSTING_CARD_LOCATION']";
//	public final String lblFeatures(int index) {
//		String features="//*[@class='postings-container']/descendant::*[@data-qa='posting PROPERTY']["+index+"]/descendant::*[@data-qa='POSTING_CARD_FEATURES']/span/span";
//		return features;
//	}
	
	public final String preciosSoles(int index) {
		String preciosSoles="//*[@class='postings-container']/descendant::*[@data-qa='posting PROPERTY']["+(index+1)+"]/descendant::*[@data-qa='POSTING_CARD_PRICE'][1]";
//		System.out.println(preciosSoles);
		return preciosSoles;
	}
	
	public final String lblRefDireccion="//*[@data-qa='POSTING_CARD_GALLERY']//following::div/h2";
	public final String lblRefUbicacion="//*[@data-qa='POSTING_CARD_GALLERY']//following::*[@data-qa='POSTING_CARD_LOCATION']";
	
	public final String lblFeatures(int index) {
		String features="//*[@class='postings-container']/descendant::*[@data-qa='posting PROPERTY']["+index+"]/descendant::*[@data-qa='POSTING_CARD_FEATURES']/span/span";
		return features;
	}
	
	public final String btnNext="//*[@data-qa='PAGING_NEXT']/descendant::*[1]";

}
