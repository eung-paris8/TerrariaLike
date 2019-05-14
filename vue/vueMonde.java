package vue;

import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import modele.Carte;
import modele.Monde;
import modele.Tiles;

public class vueMonde {
	
	private Monde leMonde;
	
	public vueMonde(Monde monde) {
		this.leMonde = monde;
	}
	
	public void creerVue(Carte map, Pane lePane) {
		map.initiallizeCarte();
		int t[][]=map.getMap();
		for(int i=0;i<15;i++) {
			for(int y=0; y<22;y++) {
				ImageView img = new ImageView(Tiles.selectionTile(t[i][y]));
				img.relocate(y*32, i*32);
				lePane.getChildren().add(img);
			}
		}
	}
}
