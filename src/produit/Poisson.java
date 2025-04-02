package produit;

public class Poisson extends Produit{
	private String datePeche;
	
	public Poisson(String datePeche) {
		super("poisson",Unite.NONE);
		this.datePeche = datePeche;
	}
	
	@Override
	public String decrireProduit() {
		return "Poisson pêché "+datePeche;
		
	}

	@Override
	public int calculerPrix(int prix) {
		// TODO Auto-generated method stub
		return prix;
	}
}
