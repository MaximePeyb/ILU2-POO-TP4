package produit;

public enum Unite{
	G("g"),KG("kg"),L("l"),CL("cl"),ML("ml"),PIECE("piece"),NONE("");
	
	private final String value;
	
	private Unite(String value) {this.value = value;}
	
	public String getValue() {return this.value;}
}
