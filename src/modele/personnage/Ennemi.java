package modele.personnage;

import javafx.beans.property.IntegerProperty;

public class Ennemi extends Personnage {
	protected String nom;
	protected int ptsDegats;
	IntegerProperty pv;


	public Ennemi(String nom, int ptsDegats, int x, int y) {
		super(nom, ptsDegats, x, y);
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
