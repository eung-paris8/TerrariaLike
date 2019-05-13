package modele.armes;

public class Armes {
	private String nomArme;
	private int ptsDeVie;
	
	public Armes(String nomArme, int ptsDeVie) {
		this.nomArme = nomArme;
		this.ptsDeVie = ptsDeVie;
	}
	
	public String getNomArme() {
		return this.nomArme;
	}
	
	public int getPtsDeVie() {
		return this.ptsDeVie;
	}
	

}
