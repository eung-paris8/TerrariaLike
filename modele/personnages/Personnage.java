package modele.personnages;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Personnage {
	
	protected String nom;
	protected int vitesse;
	protected IntegerProperty xProperty;
	protected IntegerProperty yProperty;
	
	
	public Personnage(String nom, int vitesse, int x, int y) {
		this.nom = nom;
		this.vitesse = vitesse;
		this.xProperty= new SimpleIntegerProperty(x);
		this.yProperty= new SimpleIntegerProperty(y);
	}
	
	
	public String getNom() {
		return this.nom;
	}
	
	public int getVitesse() {
		return this.vitesse;
	}
	
	public final int getX() {
		return this.xProperty.getValue();
	}
	
	public final int getY() {
		return this.yProperty.getValue();
	}
	
	public void setXProperty(int x) {
		this.xProperty.set(x);
	}
	
	public void setYProperty(int y) {
		this.yProperty.set(y);
	}
	

	
	
	
	
	
	
}
