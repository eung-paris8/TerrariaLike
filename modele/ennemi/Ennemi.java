import javafx.beans.property.IntegerProperty;

public class Ennemi {
	protected String nom;
	protected int ptsDegats;
	IntegerProperty pv;
	
	
	public Ennemi(String nom, int ptsDegats, int pv) {
		this.nom = nom;
		this.ptsDegats;
		this.pv = pv;
	}

	public IntegerProperty getPvProperty() {
		return this.pv;
	}
	
	public int getPv() {
		return this.pv.getValue();
	}
	
	public int getPtsDegats() {
		return this.ptsDegats;
	}
	

	

}
