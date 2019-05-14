package modele.equipement;


public class Armes extends Equipement{

	private String nomArme;
	private int ptsDeVie;

	public Armes(String nom, int pv) {
		super(nom, pv);
	}

	public String getNomArme() {
		return this.nomArme;
	}

	public int getPtsDeVie() {
		return this.ptsDeVie;
	}

}

