package modele;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;



public class Monde {

	public int[][] map;
	private String fichierTerrain;

	public Monde (String nomFich ) {
		this.fichierTerrain = nomFich;
		map = new int[40][40]; //Taille du terrain

	}

	public void initiallizeMap() {
		File fichier = new File(fichierTerrain);
		String ligne="";
		BufferedReader lecteurFicher;

		try {
			lecteurFicher = new BufferedReader(new FileReader(fichier));
			int i =0;
			StringTokenizer st = new StringTokenizer(ligne, ",");
			do {
				int j =0;

				try {
					ligne = lecteurFicher.readLine();

				} catch (IOException e) {
					e.printStackTrace();
				}

				if(ligne !=null) {
					st = new StringTokenizer(ligne, ", ");

					while(st.hasMoreTokens()) {
						map[i][j] = Integer.parseInt(st.nextToken(", "));
						j++;
					}
				} 


			} while(ligne!=null);

			try {
				lecteurFicher.close();

			} catch(IOException e) {
				e.printStackTrace();
			}
		}catch (FileNotFoundException e) {
			
			System.out.println("Erreur initialisation map impossible");
		}

	}
	
	public int[][] getMap(){
		return map;
	}

}
