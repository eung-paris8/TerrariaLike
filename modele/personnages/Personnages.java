package modele.personnages;

import java.io.ObjectInputStream.GetField;

import javax.swing.text.SimpleAttributeSet;

public class Personnages {
	
	protected String nom;
	protected int vitesse;
	protected IntegerProperty xProperty;
	protected IntegerProperty yProperty;
	
	
	public Personnages(String nom, int vitesse, int x, int y) {
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
	
	
	
	
	
	
	
}
